package com.inovacoes.exame.endPath;

import java.awt.image.BufferedImage;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inovacoes.exame.methodObject.ProductListIDGetter;
import com.inovacoes.exame.methodObject.QRCodeGenerator;
import com.inovacoes.exame.model.Addedproductmodel;
import com.inovacoes.exame.model.Productmodel;
import com.inovacoes.exame.model.Purchasemodel;
import com.inovacoes.exame.model.Unitproductmodel;
import com.inovacoes.exame.repository.PurchaseRepository;

@RestController
@RequestMapping(path = "/v1/inovacoes/purchase")
public class PurchaseController {

	@Autowired
	PurchaseRepository purchaseService;
	
	
	//crud
	//get
	@GetMapping(path = "/list/{id}")
	public ResponseEntity<Optional<Purchasemodel>> getPurchase(@PathVariable Long id){
		return new ResponseEntity<Optional<Purchasemodel>>(purchaseService.findById(id),HttpStatus.OK);
	}
	
	@GetMapping(path="/list")
	public ResponseEntity<List<Purchasemodel>> getPurchase(){
		return new ResponseEntity<List<Purchasemodel>>(purchaseService.findAll(),HttpStatus.OK);
	}
	
	@GetMapping(value = "/list/qr/{id}", produces = MediaType.IMAGE_PNG_VALUE)
	public ResponseEntity<List<BufferedImage>> qrcodeGetPurchase(@PathVariable Long id)
			throws Exception,NoSuchElementException {
		Purchasemodel purchaseBody = purchaseService.findById(id).orElseThrow();
		List<Unitproductmodel> product = purchaseBody.getAddedproduct().getUnitproduct();
		List<String> codes = ProductListIDGetter.IDGetter(product);
		System.out.println(codes);
		return new ResponseEntity<List<BufferedImage>>(QRCodeGenerator.generateListQrcode(codes),HttpStatus.OK);
	}
	
	//purchase
	@PostMapping(path="/buy")
	public ResponseEntity<Purchasemodel> postPurchase(@RequestBody Purchasemodel purchase){
		return new ResponseEntity<Purchasemodel>(purchaseService.save(purchase),HttpStatus.OK);
	}
	//put
	@PutMapping("/update/{id}")
	public ResponseEntity<Purchasemodel> putProduct(@PathVariable Long id, @RequestBody Purchasemodel productBody) 
			throws NoSuchElementException{
		Purchasemodel prodPut = purchaseService.findById(id).orElseThrow();
		
		prodPut.setClient(productBody.getClient());
		prodPut.setAddedproduct(productBody.getAddedproduct());
		
		return new ResponseEntity<Purchasemodel>(purchaseService.save(prodPut),HttpStatus.ACCEPTED);
	}
	//cancel
	@DeleteMapping(value = "/remove/{id}")
	public ResponseEntity<Long> deletePost(@PathVariable Long id) 
			throws NoSuchElementException {
		purchaseService.findById(id).orElseThrow();
		purchaseService.deleteById(id);
		return new ResponseEntity<Long>(id,HttpStatus.ACCEPTED);
	}

	
}

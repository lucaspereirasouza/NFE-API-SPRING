package com.inovacoes.exame.endPath;

import java.util.List;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.hibernate.ResourceClosedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jca.support.ResourceAdapterFactoryBean;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;

import com.inovacoes.exame.model.ProductModel;
import com.inovacoes.exame.repository.ProductRepository;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/v1/inovacoes/product")
public class ProductController {

	@Autowired
	ProductRepository productService;

	// CRUD
	// create
	@PostMapping(path="/create",consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ProductModel> productCreate(@RequestBody ProductModel product) {
		return new ResponseEntity<ProductModel>(productService.save(product),
				HttpStatus.CREATED);
	}
	// get
	@GetMapping(path="/get/{id}")
	public ResponseEntity<Optional<ProductModel>> productGet(@PathVariable Long id) {
		return new ResponseEntity<Optional<ProductModel>>(productService.findById(id),
				HttpStatus.ACCEPTED);
	}
	//getall
	@GetMapping(path="/get")
	public ResponseEntity<List<ProductModel>> productGetAll(){
		return new ResponseEntity<List<ProductModel>>(productService.findAll(),
				HttpStatus.ACCEPTED);
	}
	// update
	// not tested
	@PutMapping("/update/{id}")
	public ResponseEntity<ProductModel> putProduct(@PathVariable Long id, @RequestBody ProductModel productBody) 
			throws NoSuchElementException{
		ProductModel prodPut = productService.findById(id).orElseThrow();
		
		prodPut.setName(productBody.getName());
		prodPut.setDescription(productBody.getDescription());
		prodPut.setPrice(productBody.getPrice());
		
		return new ResponseEntity<ProductModel>(productService.save(prodPut),HttpStatus.ACCEPTED);
	}

	// delete
	@DeleteMapping(value = "/Remove/{id}")
	public ResponseEntity<Long> deletePost(@PathVariable Long id) 
			throws NoSuchElementException {

		productService.findById(id).orElseThrow();
		productService.deleteById(id);
		return new ResponseEntity<Long>(id,HttpStatus.ACCEPTED);
	}
}

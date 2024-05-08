package com.inovacoes.exame.endPath;

import java.awt.PageAttributes.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.inovacoes.exame.model.ProductModel;
import com.inovacoes.exame.repository.ProductRepository;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductRepository productService;

	// CRUD
	// create
	@PostMapping()
	@RequestMapping("/create")
	public ResponseEntity<ProductModel> productCreate(@RequestBody ProductModel product) {
		productService.save(product);
		return new ResponseEntity<ProductModel>(product, HttpStatus.CREATED);
	}

	// get
	@GetMapping("/get/{id}")
	public ProductModel productGet(@PathVariable Long id) {
		return productService.getReferenceById(id);
	}

	// update
	// not tested
	@PutMapping("/product/{id}")
	public ResponseEntity<ProductModel> putProduct(@PathVariable Long id, @RequestBody ProductModel productBody) {
		ResponseEntity<ProductModel> response;
		if (productService.existsById(id)) {
			ProductModel prodPut = new ProductModel(productBody.getId(), productBody.getName(),
					productBody.getDescription(), productBody.getPrice());
			productService.save(prodPut);
			response = new ResponseEntity<ProductModel>(productBody, HttpStatus.ACCEPTED);
		} else {
			response = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return response;
	}

	// delete
	@DeleteMapping(value = "/Remove/{id}")
	public ResponseEntity<Long> deletePost(@PathVariable Long id) {

		if (!productService.existsById(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			productService.deleteById(id);
			return new ResponseEntity<>(id, HttpStatus.OK);
		}
	}
}

package com.inovacoes.exame.endPath;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inovacoes.exame.model.ClientModel;
import com.inovacoes.exame.repository.ClientRepository;

@RestController()
@RequestMapping("/v1/inovacoes/client")
@CrossOrigin("*")
public class ClientController {
	@Autowired
	ClientRepository clientService;
	
	//create
	@PostMapping("/create")
	ResponseEntity<ClientModel> createclient(@RequestBody ClientModel client){
		return new ResponseEntity<ClientModel>(clientService.save(client), HttpStatus.OK);
	}
	
	// get
	
	@GetMapping("/get/{id}")
	ResponseEntity<ClientModel> getclient(@PathVariable Long id) {
		return new ResponseEntity<ClientModel>(clientService.getReferenceById(id),HttpStatus.OK);	
	} 
	// get all
	@GetMapping("/get")
	ResponseEntity<List<ClientModel>> getAllClient(){
		return new ResponseEntity<List<ClientModel>>(clientService.findAll(),HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	ResponseEntity<Long> rmclient(@PathVariable Long id) throws NoSuchElementException{
		clientService.findById(id).orElseThrow();
		clientService.deleteById(id);
		return new ResponseEntity<Long>(id,HttpStatus.ACCEPTED);
	}
}

package com.inovacoes.exame.endPath;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/client")
public class ClientController {
	@Autowired
	ClientRepository cli;
	
	//create
	@PostMapping("/create")
	ResponseEntity<String> createclient(@RequestBody ClientModel client){
		System.out.println(client.getAddress());
		cli.save(client);
		return new ResponseEntity<String>("Sent", HttpStatus.OK);
	}
	
	// get
	@GetMapping("/get/{id}")
	ResponseEntity<ClientModel> getclient(@PathVariable Long id){
		return new ResponseEntity<ClientModel>(cli.getReferenceById(id),HttpStatus.OK);
	} 
	// get all
	@GetMapping("/get")
	ResponseEntity<List<ClientModel>> getAllClient(){
		return new ResponseEntity<List<ClientModel>>(cli.findAll(),HttpStatus.OK);
	}
	
	//update
	
	//delete
	@DeleteMapping("/rm/{id}")
	ResponseEntity<String> rmclient(@PathVariable Long id){
		cli.deleteById(id);
		ResponseEntity<String> response = 
				cli.existsById(id)? 
						new ResponseEntity<String>("Not Deleted",HttpStatus.INTERNAL_SERVER_ERROR)
						:new ResponseEntity<String>("Deleted",HttpStatus.OK);
		return response;
	}
}

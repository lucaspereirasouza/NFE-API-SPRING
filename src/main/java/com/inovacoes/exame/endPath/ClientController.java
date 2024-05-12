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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inovacoes.exame.model.Clientmodel;
import com.inovacoes.exame.model.Productmodel;
import com.inovacoes.exame.repository.ClientRepository;

@RestController()
@RequestMapping("/v1/inovacoes/client")
@CrossOrigin("*")
public class ClientController {
	@Autowired
	ClientRepository clientService;
	
	//create
	@PostMapping("/create")
	ResponseEntity<Clientmodel> createclient(@RequestBody Clientmodel client){
		return new ResponseEntity<Clientmodel>(clientService.save(client), HttpStatus.OK);
	}
	
	// get
	
	@GetMapping("/get/{id}")
	ResponseEntity<Clientmodel> getclient(@PathVariable Long id) {
		return new ResponseEntity<Clientmodel>(clientService.getReferenceById(id),HttpStatus.OK);	
	} 
	// get all
	@GetMapping("/get")
	ResponseEntity<List<Clientmodel>> getAllClient(){
		return new ResponseEntity<List<Clientmodel>>(clientService.findAll(),HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	ResponseEntity<Clientmodel> updateClient(@RequestBody Clientmodel client, @PathVariable Long id){
		Clientmodel _cli = clientService.findById(id).orElseThrow();
		
		_cli.setAddress(client.getAddress());
		_cli.setCNPJ(client.getCNPJ());
		_cli.setCPF(client.getCPF());
		_cli.setEmail(client.getEmail());
		_cli.setName(client.getName());
		
		return new ResponseEntity<Clientmodel>(clientService.save(_cli),HttpStatus.ACCEPTED);
		
	}
	
	
	@DeleteMapping("/delete/{id}")
	ResponseEntity<Long> rmclient(@PathVariable Long id) throws NoSuchElementException{
		clientService.findById(id).orElseThrow();
		clientService.deleteById(id);
		return new ResponseEntity<Long>(id,HttpStatus.ACCEPTED);
	}
}

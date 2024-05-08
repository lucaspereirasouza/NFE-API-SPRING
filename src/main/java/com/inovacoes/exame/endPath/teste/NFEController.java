package com.inovacoes.exame.endPath.teste;

import java.util.List;

import javax.management.modelmbean.XMLParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.inovacoes.exame.model.XMLModel;
import com.inovacoes.exame.model.teste.Nfe;
import com.inovacoes.exame.model.teste.Nfeproc;
import com.inovacoes.exame.repository.ClientRepository;
import com.inovacoes.exame.repository.ProductRepository;
import com.inovacoes.exame.repository.XMLRepository;
import com.inovacoes.exame.repository.teste.NFERepository;

@RestController
@RequestMapping("/v1/inovacoes/nfe")
@CrossOrigin("*")
public class NFEController {
		// CRUD
		// add
		@Autowired
		NFERepository NFeService;
		ProductRepository prodService;
		ClientRepository clientService;

		@ResponseStatus(HttpStatus.CREATED)
		@PostMapping(path = "/post",consumes = MediaType.APPLICATION_XML_VALUE,produces = MediaType.APPLICATION_XML_VALUE)
		public ResponseEntity<Nfeproc> nfeReceiver(@RequestBody Nfeproc xml) throws XMLParseException{
			try {
				Nfeproc _xml = NFeService.save(xml);
				return new ResponseEntity<Nfeproc>(_xml,HttpStatus.ACCEPTED);
			} catch (Exception e) {
				e.printStackTrace();
				return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
			}
		}
		
		// put XML when works
//		@GetMapping(value="/getall", produces=MediaType.APPLICATION_XML_VALUE)
		@GetMapping(value="/getall")
		public ResponseEntity<List<Nfeproc>> nfeGetter (){
			List<Nfeproc> xmlcollection = NFeService.findAll();
			return new ResponseEntity<List<Nfeproc>>(xmlcollection,HttpStatus.OK);
		}
		

	

}

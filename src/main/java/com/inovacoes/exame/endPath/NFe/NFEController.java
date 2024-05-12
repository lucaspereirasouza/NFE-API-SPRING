package com.inovacoes.exame.endPath.NFe;

import java.util.List;

import javax.management.modelmbean.XMLParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.inovacoes.exame.model.NFe.Nfeproc;
import com.inovacoes.exame.repository.Nfe.NFERepository;

@RestController
@RequestMapping("/v1/inovacoes/nfe")
@CrossOrigin("*")
public class NFEController {	
		@Autowired
		NFERepository NFeService;

		@ResponseStatus(HttpStatus.CREATED)
		@PostMapping(path = "/post",consumes = MediaType.APPLICATION_XML_VALUE ,produces = MediaType.APPLICATION_XML_VALUE)
		
		public ResponseEntity<Nfeproc> nfeReceiver(@RequestBody Nfeproc xml) throws XMLParseException{
			try {
				Nfeproc _xml = NFeService.save(xml);
				return new ResponseEntity<Nfeproc>(_xml,HttpStatus.ACCEPTED);
			} catch (Exception e) {
				e.printStackTrace();
				return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
			}
		}
		@GetMapping(value="/getall")
		public ResponseEntity<List<Nfeproc>> nfeGetter (){
			List<Nfeproc> xmlcollection = NFeService.findAll();
			return new ResponseEntity<List<Nfeproc>>(xmlcollection,HttpStatus.OK);
		}
		@DeleteMapping(value = "/delete/{id}")
		public ResponseEntity<Nfeproc> nfeDeleter(@PathVariable Long id){
			NFeService.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
}

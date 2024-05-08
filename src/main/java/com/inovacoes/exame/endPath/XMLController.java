package com.inovacoes.exame.endPath;

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
import com.inovacoes.exame.repository.ClientRepository;
import com.inovacoes.exame.repository.ProductRepository;
import com.inovacoes.exame.repository.XMLRepository;

@RestController
@RequestMapping("/v1/inovacoes/xml")
@CrossOrigin("*")
public class XMLController{
	// CRUD
	// add

	@Autowired
	XMLRepository XMLService;
	ProductRepository prodService;
	ClientRepository clientService;

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(path = "/post",consumes = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<XMLModel> XmlReceiver(@RequestBody XMLModel xml) throws XMLParseException{
		try {
			XMLModel _model = new XMLModel();
			_model.getXnome(
					
					);
			XMLModel _xml = XMLService.save(_model);
			return new ResponseEntity<XMLModel>(_xml,HttpStatus.ACCEPTED);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	// put XML when works
//	@GetMapping(value="/getall", produces=MediaType.APPLICATION_XML_VALUE)
	@GetMapping(value="/getall", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<XMLModel>> XmlGetter (){
		var xmlcollection = XMLService.findAll();
		return new ResponseEntity<List<XMLModel>>(xmlcollection,HttpStatus.OK);
	}
		
//		XmlMapper xmlMap = new XmlMapper();
//		String xmlStr = xmlMap.writeValueAsString(xml);
		
		
//		XMLType<Object> xmlObj = new XMLType<Object>(xmlMap.readValue(xmlStr, Object.class));
		
		
		
//		  ProductModel prodModel = new ProductModel(); ClientModel clientModel = new
//		  ClientModel();
//		  
//		  prodModel.setClient(null); prodModel.setDescription(null);
//		  prodModel.setName(null); prodModel.setPrice(0);
//		 
//		  clientModel.setAddress(null); clientModel.setCPF(null);
//		  clientModel.setName(null);
		 
	

}

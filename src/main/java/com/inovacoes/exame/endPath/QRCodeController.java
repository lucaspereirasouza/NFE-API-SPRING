package com.inovacoes.exame.endPath;

import java.awt.image.BufferedImage;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inovacoes.exame.methodObject.QRCodeGenerator;

@RestController
@RequestMapping(path = "/v1/inovacoes/qrcode/")
public class QRCodeController {

	@GetMapping(value = "/get/{barcode}", produces = MediaType.IMAGE_PNG_VALUE)
	public ResponseEntity<BufferedImage> qrcodeGetter(@PathVariable("barcode") String barcode)
			throws Exception {
		return new ResponseEntity<BufferedImage>(QRCodeGenerator.generateQrcode(barcode),HttpStatus.OK);
	}
}

package com.inovacoes.exame.methodObject;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.nayuki.qrcodegen.QrCode;
import io.nayuki.qrcodegen.QrCode.Ecc;

public class QRCodeGenerator {
	public static BufferedImage generateQrcode(String BarcodeText) throws Exception{
		QrCode qrcode = QrCode.encodeText(BarcodeText, Ecc.MEDIUM);
		BufferedImage img = toImage(qrcode, 5, 1, 0xFFFFFF, 0x000000);
		return img;
	}
	public static List<BufferedImage> generateListQrcode(List<String> barcodeListText) throws Exception{
		int _size = barcodeListText.size();
		QrCode[] Lqrcode = new QrCode[_size];
		List<BufferedImage> images = new ArrayList<BufferedImage>();
		for(int i=0;i<=_size;i++) {
			Lqrcode[i]=(QrCode.encodeText(barcodeListText.get(i), Ecc.MEDIUM));
			images.add(toImage(Lqrcode[i], 5, 1, 0xFFFFFF, 0x000000));
		}
		return images;
	}
	public static BufferedImage toImage(QrCode qr, int scale, int border, int lightColor, int darkColor) {
	    Objects.requireNonNull(qr);
	    if (scale <= 0 || border < 0) {
	        throw new IllegalArgumentException("Value out of range");
	    }
	    if (border > Integer.MAX_VALUE / 2 || qr.size + border * 2L > Integer.MAX_VALUE / scale) {
	        throw new IllegalArgumentException("Scale or border too large");
	    }

	    BufferedImage result = new BufferedImage(
	      (qr.size + border * 2) * scale, 
	      (qr.size + border * 2) * scale, 
	      BufferedImage.TYPE_INT_RGB
	    );
	    for (int y = 0; y < result.getHeight(); y++) {
	        for (int x = 0; x < result.getWidth(); x++) {
	            boolean color = qr.getModule(x / scale - border, y / scale - border);
	            result.setRGB(x, y, color ? darkColor : lightColor);
	        }
	    }
	    return result;
	}
}

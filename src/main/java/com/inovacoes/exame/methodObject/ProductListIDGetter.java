package com.inovacoes.exame.methodObject;

import java.util.ArrayList;
import java.util.List;

import com.inovacoes.exame.model.Unitproductmodel;

public class ProductListIDGetter {
	public static List<String> IDGetter(List<Unitproductmodel> product) {
		int _size = product.size();
		List<String> stringList = new ArrayList<String>();
		for(int i=0;i<=_size;i++) {
			stringList.set(i,(product.get(i).toString()));
		}
		return stringList;
	}
}

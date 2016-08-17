package com.sngular.formacion.products.dto;

import org.springframework.data.annotation.Id;

public class Product {

	@Id
	private String id;
	private String name;
	private String desc;
	private Double price;
	
	public String getId() {
		return id;
	}
	public Product setId(String id) {
		this.id = id;
		return this;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}


}

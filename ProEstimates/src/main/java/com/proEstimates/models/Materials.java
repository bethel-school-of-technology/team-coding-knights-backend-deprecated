package com.ProEstimates.models;


import java.sql.Date;


public class Materials {
	private int material_id;
	private String material_name;
	private int material_price;
	private Date material_set_date;
	
	public int getMaterial_id() {
		return material_id;
	}
	public void setMaterial_id(int material_id) {
		this.material_id = material_id;
	}
	public String getMaterial_name() {
		return material_name;
	}
	public void setMaterial_name(String material_name) {
		this.material_name = material_name;
	}
	public int getMaterial_price() {
		return material_price;
	}
	public void setMaterial_price(int material_price) {
		this.material_price = material_price;
	}
	public Date getMaterial_set_date() {
		return material_set_date;
	}
	public void setMaterial_set_date(Date material_set_date) {
		this.material_set_date = material_set_date;
	}
	


}
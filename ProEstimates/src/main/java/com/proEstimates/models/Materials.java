package com.proEstimates.models;

import java.sql.Timestamp;

public class Materials {
	private int material_id;
	private String material_name;
	private int material_price;
	private Timestamp material_set_time;
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
	public Timestamp getMaterial_set_time() {
		return material_set_time;
	}
	public void setMaterial_set_time(Timestamp material_set_time) {
		this.material_set_time = material_set_time;
	}
	
	
}

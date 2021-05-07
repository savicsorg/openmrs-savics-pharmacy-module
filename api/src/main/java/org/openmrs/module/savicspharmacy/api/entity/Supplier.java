package org.openmrs.module.savicspharmacy.api.entity;

// Generated May 7, 2021 2:32:33 AM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import org.openmrs.BaseOpenmrsData;

/**
 * Supplier generated by hbm2java
 */
public class Supplier extends BaseOpenmrsData implements java.io.Serializable {
	
	private Integer id;
	
	private String uuid;
	
	private String code;
	
	private String name;
	
	private String address;
	
	private String email;
	
	private String tel;
	
	private Set orders = new HashSet(0);
	
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTel() {
		return this.tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public Set getOrders() {
		return this.orders;
	}
	
	public void setOrders(Set orders) {
		this.orders = orders;
	}
	
}

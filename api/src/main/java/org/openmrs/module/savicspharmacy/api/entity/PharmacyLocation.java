package org.openmrs.module.savicspharmacy.api.entity;

// Generated May 7, 2021 3:23:28 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import org.openmrs.BaseOpenmrsData;

/**
 * PharmacyLocation generated by hbm2java
 */
public class PharmacyLocation extends BaseOpenmrsData implements java.io.Serializable {
	
	private Integer id;
	
	private String uuid;
	
	private String code;
	
	private String name;
	
	private Set stocktakes = new HashSet(0);
	
	private Set transactions = new HashSet(0);
	
	private Set itemsLines = new HashSet(0);
	
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
	
	public Set getStocktakes() {
		return this.stocktakes;
	}
	
	public void setStocktakes(Set stocktakes) {
		this.stocktakes = stocktakes;
	}
	
	public Set getTransactions() {
		return this.transactions;
	}
	
	public void setTransactions(Set transactions) {
		this.transactions = transactions;
	}
	
	public Set getItemsLines() {
		return this.itemsLines;
	}
	
	public void setItemsLines(Set itemsLines) {
		this.itemsLines = itemsLines;
	}
	
}

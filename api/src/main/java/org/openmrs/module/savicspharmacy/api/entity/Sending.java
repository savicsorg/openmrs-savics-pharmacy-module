package org.openmrs.module.savicspharmacy.api.entity;

// Generated May 7, 2021 2:32:33 AM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.openmrs.BaseOpenmrsData;
import org.openmrs.Person;

/**
 * Sending generated by hbm2java
 */
public class Sending extends BaseOpenmrsData implements java.io.Serializable {
	
	private Integer id;
	
	private Customer customer;
	
	private Person person;
	
	private Date date;
	
	private Double sendingAmount;
	
	private String uuid;
	
	private Set sendingDetails = new HashSet(0);
	
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Person getPerson() {
		return this.person;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Double getSendingAmount() {
		return this.sendingAmount;
	}
	
	public void setSendingAmount(Double sendingAmount) {
		this.sendingAmount = sendingAmount;
	}
	
	public String getUuid() {
		return this.uuid;
	}
	
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	public Set getSendingDetails() {
		return this.sendingDetails;
	}
	
	public void setSendingDetails(Set sendingDetails) {
		this.sendingDetails = sendingDetails;
	}
	
}

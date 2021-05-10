package org.openmrs.module.savicspharmacy.api.entity;

// Generated May 7, 2021 3:23:28 PM by Hibernate Tools 4.3.1

import java.util.Date;
import org.openmrs.BaseOpenmrsData;

/**
 * ReceptionDetail generated by hbm2java
 */
public class ReceptionDetail extends BaseOpenmrsData implements java.io.Serializable {
	
	private ReceptionDetailId pk;
	
	private Item item;
	
	private Reception reception;
	
	private Integer id;
	
	private Integer orderLineQuantity;
	
	private Integer quantityReceived;
	
	private String itemBatch;
	
	private Date itemExpiryDate;
	
	private String uuid;
	
	public ReceptionDetailId getPk() {
		return this.pk;
	}
	
	public void setPk(ReceptionDetailId pk) {
		this.pk = pk;
	}
	
	public Item getItem() {
		return this.item;
	}
	
	public void setItem(Item item) {
		this.item = item;
	}
	
	public Reception getReception() {
		return this.reception;
	}
	
	public void setReception(Reception reception) {
		this.reception = reception;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getOrderLineQuantity() {
		return this.orderLineQuantity;
	}
	
	public void setOrderLineQuantity(Integer orderLineQuantity) {
		this.orderLineQuantity = orderLineQuantity;
	}
	
	public Integer getQuantityReceived() {
		return this.quantityReceived;
	}
	
	public void setQuantityReceived(Integer quantityReceived) {
		this.quantityReceived = quantityReceived;
	}
	
	public String getItemBatch() {
		return this.itemBatch;
	}
	
	public void setItemBatch(String itemBatch) {
		this.itemBatch = itemBatch;
	}
	
	public Date getItemExpiryDate() {
		return this.itemExpiryDate;
	}
	
	public void setItemExpiryDate(Date itemExpiryDate) {
		this.itemExpiryDate = itemExpiryDate;
	}
	
}

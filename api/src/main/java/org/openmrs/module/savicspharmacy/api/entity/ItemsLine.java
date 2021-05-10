package org.openmrs.module.savicspharmacy.api.entity;

// Generated May 7, 2021 3:23:28 PM by Hibernate Tools 4.3.1

import java.util.Date;
import org.openmrs.BaseOpenmrsData;

/**
 * ItemsLine generated by hbm2java
 */
public class ItemsLine extends BaseOpenmrsData implements java.io.Serializable {
	
	private ItemsLineId pk;
	
	private Item item;
	
	private PharmacyLocation pharmacyLocation;
	
	private Integer id;
	
	private String uuid;
	
	private String itemBatch;
	
	private Date itemExpiryDate;
	
	private Integer itemVirtualstock;
	
	private Integer itemSoh;
	
	public ItemsLineId getPk() {
		return this.pk;
	}
	
	public void setPk(ItemsLineId pk) {
		this.pk = pk;
	}
	
	public Item getItem() {
		return this.item;
	}
	
	public void setItem(Item item) {
		this.item = item;
	}
	
	public PharmacyLocation getPharmacyLocation() {
		return this.pharmacyLocation;
	}
	
	public void setPharmacyLocation(PharmacyLocation pharmacyLocation) {
		this.pharmacyLocation = pharmacyLocation;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
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
	
	public Integer getItemVirtualstock() {
		return this.itemVirtualstock;
	}
	
	public void setItemVirtualstock(Integer itemVirtualstock) {
		this.itemVirtualstock = itemVirtualstock;
	}
	
	public Integer getItemSoh() {
		return this.itemSoh;
	}
	
	public void setItemSoh(Integer itemSoh) {
		this.itemSoh = itemSoh;
	}
	
}

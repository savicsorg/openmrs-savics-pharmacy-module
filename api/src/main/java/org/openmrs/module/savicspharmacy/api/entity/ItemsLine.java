package org.openmrs.module.savicspharmacy.api.entity;

// Generated May 7, 2021 2:32:33 AM by Hibernate Tools 4.3.1

import java.util.Date;
import org.openmrs.BaseOpenmrsData;

/**
 * ItemsLine generated by hbm2java
 */
public class ItemsLine extends BaseOpenmrsData implements java.io.Serializable {
	
	private ItemsLineId pk;
	
	private Item item;
	
	private PharmacyLocation location;
	
	private Integer id;
	
	private String uuid;
	
	private String itemBatch;
	
	private Date itemExpiryDate;
	
	private Integer itemVirtualstock;
	
	private Integer itemSoh;
	
	public ItemsLineId getpk() {
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
	
	public PharmacyLocation getLocation() {
		return this.location;
	}
	
	public void setLocation(PharmacyLocation location) {
		this.location = location;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id_1) {
		this.id = id_1;
	}
	
	public String getUuid() {
		return this.uuid;
	}
	
	public void setUuid(String uuid) {
		this.uuid = uuid;
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

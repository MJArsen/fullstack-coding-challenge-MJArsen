package com.grocery.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name="grocery_items")
public class GroceryItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="grocery_item_id")
	private int item_id;
	
	@ManyToOne
	@JoinColumn(name="grocery_list_id")
	private GroceryList list_id;
	
	@ManyToOne
	@JoinColumn(name="grocery_type_id")
	private GroceryType type_id;
	
	@Column(name="grocery_name")
	private String item_name;
	
	@Column(name="grocery_quantity")
	private int item_quantity;

	public GroceryItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GroceryItem(int item_id, GroceryList list_id, GroceryType type_id, String item_name, int item_quantity) {
		super();
		this.item_id = item_id;
		this.list_id = list_id;
		this.type_id = type_id;
		this.item_name = item_name;
		this.item_quantity = item_quantity;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public GroceryList getList_id() {
		return list_id;
	}

	public void setList_id(GroceryList list_id) {
		this.list_id = list_id;
	}

	public GroceryType getType_id() {
		return type_id;
	}

	public void setType_id(GroceryType type_id) {
		this.type_id = type_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public int getItem_quantity() {
		return item_quantity;
	}

	public void setItem_quantity(int item_quantity) {
		this.item_quantity = item_quantity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + item_id;
		result = prime * result + ((item_name == null) ? 0 : item_name.hashCode());
		result = prime * result + item_quantity;
		result = prime * result + ((list_id == null) ? 0 : list_id.hashCode());
		result = prime * result + ((type_id == null) ? 0 : type_id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroceryItem other = (GroceryItem) obj;
		if (item_id != other.item_id)
			return false;
		if (item_name == null) {
			if (other.item_name != null)
				return false;
		} else if (!item_name.equals(other.item_name))
			return false;
		if (item_quantity != other.item_quantity)
			return false;
		if (list_id == null) {
			if (other.list_id != null)
				return false;
		} else if (!list_id.equals(other.list_id))
			return false;
		if (type_id == null) {
			if (other.type_id != null)
				return false;
		} else if (!type_id.equals(other.type_id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Grocery_Item [item_id=" + item_id + ", list_id=" + list_id + ", type_id=" + type_id + ", item_name="
				+ item_name + ", item_quantity=" + item_quantity + "]";
	}

	
}

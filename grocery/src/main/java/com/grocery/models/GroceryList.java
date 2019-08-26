package com.grocery.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name="grocery_lists")
public class GroceryList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="grocery_list_id")
	private int list_id;
	
	@Column(name="grocery_list_name")
	private String list_name;

	public GroceryList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GroceryList(int list_id, String list_name) {
		super();
		this.list_id = list_id;
		this.list_name = list_name;
	}

	public int getList_id() {
		return list_id;
	}

	public void setList_id(int list_id) {
		this.list_id = list_id;
	}

	public String getGrocery_list_name() {
		return list_name;
	}

	public void setGrocery_list_name(String list_name) {
		this.list_name = list_name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((list_name == null) ? 0 : list_name.hashCode());
		result = prime * result + list_id;
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
		GroceryList other = (GroceryList) obj;
		if (list_name == null) {
			if (other.list_name != null)
				return false;
		} else if (!list_name.equals(other.list_name))
			return false;
		if (list_id != other.list_id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Grocery_List [list_id=" + list_id + ", grocery_list_name=" + list_name + "]";
	}
}


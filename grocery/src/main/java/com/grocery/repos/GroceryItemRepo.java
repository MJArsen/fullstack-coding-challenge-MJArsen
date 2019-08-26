package com.grocery.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.grocery.models.GroceryItem;

public interface GroceryItemRepo extends JpaRepository<GroceryItem, Integer> {

	// List<GroceryItem> findByListId(int listId);


}

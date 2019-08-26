package com.grocery.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grocery.models.GroceryItem;

public interface GroceryItemRepo extends JpaRepository<GroceryItem, Integer> {

}

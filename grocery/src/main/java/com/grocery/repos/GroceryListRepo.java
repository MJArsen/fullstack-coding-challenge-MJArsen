package com.grocery.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grocery.models.GroceryList;

public interface GroceryListRepo extends JpaRepository<GroceryList, Integer> {

}
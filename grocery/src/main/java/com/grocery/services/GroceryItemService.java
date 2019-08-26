package com.grocery.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocery.models.GroceryItem;
import com.grocery.repos.GroceryItemRepo;

@Service
public class GroceryItemService {

	@Autowired
	private GroceryItemRepo groceryItemRepo;
	
	public List<GroceryItem> findAll() {
		return groceryItemRepo.findAll();
	}

	public GroceryItem findById(Integer itemId) {
        return groceryItemRepo.getOne(itemId);
    }
	
	// public List<GroceryItem> findByListId(int listId) {
	// 	return groceryItemRepo.findByListId(listId);
	// }

	public GroceryItem createGroceryItem(GroceryItem newItem) {
		return groceryItemRepo.save(newItem);
	}

	public void deleteGroceryList(int itemId) {
		GroceryItem removable = groceryItemRepo.getOne(itemId);
		groceryItemRepo.delete(removable);
	}


}

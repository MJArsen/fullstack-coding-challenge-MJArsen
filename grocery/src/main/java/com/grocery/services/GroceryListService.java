package com.grocery.services;

import java.util.List;

import javax.transaction.Transactional;

import com.grocery.models.GroceryList;
import com.grocery.repos.GroceryListRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroceryListService {

    @Autowired
    private GroceryListRepo groceryListRepo;

    public List<GroceryList> findAll() {
        // List<
        return groceryListRepo.findAll();
    }

    public GroceryList findById(Integer list_id) {
        return groceryListRepo.getOne(list_id);
    }

    @Transactional
	public GroceryList createGroceryList(GroceryList newList) {
		return groceryListRepo.save(newList);
	}

	public void deleteGroceryList(Integer list_id) {
        GroceryList removable = groceryListRepo.getOne(list_id);
        groceryListRepo.delete(removable);
	}

}
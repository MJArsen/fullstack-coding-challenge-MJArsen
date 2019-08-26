package com.grocery.contollers;

import java.util.List;

import com.grocery.models.GroceryItem;
import com.grocery.services.GroceryItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("grocery-lists/items")
public class GroceryItemController {

	@Autowired
	private GroceryItemService groceryItemService;
	
	@GetMapping
	public List<GroceryItem> findAll(){
		return groceryItemService.findAll();
	}

	@GetMapping("{itemId}")
    public GroceryItem findById(@PathVariable("itemId") int itemId) {
        return groceryItemService.findById(itemId);
	}
	
	// @GetMapping("/list/{listId}")
	// public List<GroceryItem> findByListId(@PathVariable("listId") int listId) {
	// 	return groceryItemService.findByListId(listId);
	// }

	@PostMapping
	public GroceryItem createGroceryItem(@RequestBody GroceryItem newItem) {
		return groceryItemService.createGroceryItem(newItem);
	}

	@DeleteMapping("{itemId}")
    public void deleteGroceryList(@PathVariable("itemId") int itemId) {
        groceryItemService.deleteGroceryList(itemId);
    }
}

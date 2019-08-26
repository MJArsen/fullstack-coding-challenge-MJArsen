package com.grocery.contollers;

import java.util.List;

import com.grocery.models.GroceryList;
import com.grocery.services.GroceryListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("grocery-lists")
public class GroceryListController {

    @Autowired
    private GroceryListService groceryListService;

    @GetMapping
    public List<GroceryList> findAll(){
        return groceryListService.findAll();
    }

    @GetMapping("{listId}")
    public GroceryList findById(@PathVariable("listId") int listId) {
        return groceryListService.findById(listId);
    }

    @PostMapping
    public GroceryList createGroceryList(@RequestBody GroceryList newList) {
        return groceryListService.createGroceryList(newList);
    }

    @PostMapping("/items/{item_id}")
    public GroceryList createGroceryList2(@PathVariable("item_id") int item_id, @RequestBody GroceryList newList) {
        return groceryListService.createGroceryList(newList);         
    }

    @DeleteMapping("{listId}")
    public void deleteGroceryList(@PathVariable("listId") int listId) {
        groceryListService.deleteGroceryList(listId);
    }
}
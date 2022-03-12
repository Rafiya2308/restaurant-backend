package com.restaurant.management.restaurantbackend.controller;

import java.util.List;

import com.restaurant.management.restaurantbackend.exception.ControllerException;
import com.restaurant.management.restaurantbackend.model.Category;
import com.restaurant.management.restaurantbackend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping
	public ResponseEntity<List<Category>> getAllCategory() {
		try {
			List<Category> categories = categoryService.getAllCategories();
			return new ResponseEntity<List<Category>>(categories, HttpStatus.OK);
		} catch (Exception e) {
			throw new ControllerException(e.getMessage());
		}

	}

	@PostMapping
	public ResponseEntity<Category> saveCategory(@RequestBody Category category){
		try {
			Category categoryObject=categoryService.saveCategory(category);
			return new ResponseEntity<Category>(categoryObject, HttpStatus.CREATED);
		}catch (Exception e) {
			throw new ControllerException(e.getMessage());
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Category> updateCategory(@RequestParam("id") long id,@RequestBody Category category){
		try {
			boolean categoryObject=categoryService.updateCategory(category,id);
			return new ResponseEntity<Category>(category, HttpStatus.OK);
		}catch (Exception e) {
			throw new ControllerException(e.getMessage());
		}
	}
}

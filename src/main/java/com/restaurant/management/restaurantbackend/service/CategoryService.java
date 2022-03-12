package com.restaurant.management.restaurantbackend.service;

import java.util.List;

import com.restaurant.management.restaurantbackend.model.Category;

public interface CategoryService {
	List<Category> getAllCategories();

	Category saveCategory(Category category);

	boolean updateCategory(Category category, long id);
}

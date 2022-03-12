package com.restaurant.management.restaurantbackend.service.impl;

import java.util.List;

import com.restaurant.management.restaurantbackend.dao.CategoryDao;
import com.restaurant.management.restaurantbackend.exception.ServiceException;
import com.restaurant.management.restaurantbackend.model.Category;
import com.restaurant.management.restaurantbackend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDao categoryDao;

	@Override
	public List<Category> getAllCategories() {
		try {
			return categoryDao.getAllCategories();
		} catch (Exception e) {
			throw new ServiceException(e.getMessage());
		}
	}

	@Override
	public Category saveCategory(Category category) {
		try {
		return categoryDao.save(category);
		} catch (Exception e) {
			throw new ServiceException(e.getMessage());
		}
	}

	@Override
	public boolean updateCategory(Category category,long id) {
		try {
			return categoryDao.updateCategory(category.getCategoryName(),category.getCategoryDescription(),id);
			} catch (Exception e) {
				throw new ServiceException(e.getMessage());
			}
	}

}

package com.giahuy.springapi.service;

import java.util.HashMap;
import java.util.List;

import com.giahuy.springapi.entity.Category;

public interface CategoryService {
	public List<Category> getAllCategories();
	
	public Category getCategoryById(long categoryID);
	
	public Category saveCategory(Category category);
	
	public Category updateCategory(long categoryID, Category category);
	
	public HashMap<String, String> deleteCategoryById(long categoryID);
	
}

package com.restaurant.management.restaurantbackend.dao;

import java.util.List;

import com.restaurant.management.restaurantbackend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryDao extends JpaRepository<Category, Long> {
	@Query("SELECT category FROM Category category")
	List<Category> getAllCategories();

	@Query(value ="INSERT INTO category_info (category_name,category_description) VALUES(:categoryName,:categoryDescription)",nativeQuery = true)
	int saveCategory(@Param("categoryName") String categoryName,@Param("categoryDescription") String categoryDescription);

	@Query(value = "UPDATE category_info SET category_name=:categoryName AND category_description=:categoryDescription where id =:id",nativeQuery = true)
	boolean updateCategory(@Param("categoryName") String categoryName,@Param("categoryDescription") String categoryDescription,@Param("id") long id);
}

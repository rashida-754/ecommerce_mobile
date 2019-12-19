package com.ecomm.Test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.model.Category;

import com.ecomm.dao.CategoryDAO;

public class CategoryDAOTest 
{
    static CategoryDAO categoryDAO;
    @BeforeClass
    public static void executeFirst()
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    	context.scan("com.ecomm");
    	context.refresh();
    	categoryDAO = (CategoryDAO)context.getBean("categoryDAO"); 
    }
  //  @Ignore
    @Test
    public void addCategoryTest()
    {
    	Category category = new Category();
    	category.setCategoryName("Asus 6Z");
    	category.setCategoryDesc("All mobiles of Asus brand");
    	assertTrue("Problem in adding Category",categoryDAO.addCategory(category));
    }
    @Ignore
    @Test
    public void deleteCategoryTest()
    {
    	Category category = categoryDAO.getCategory(2);
    	assertTrue("Problem in deleting Category",categoryDAO.deleteCategory(category));
    }
    @Ignore
    @Test
    public void updateCategoryTest()
    {
    	Category category = categoryDAO.getCategory(3);
    	category.setCategoryDesc("ALL BASIC MODELS OF MI");
    	assertTrue("Problem in updating Category",categoryDAO.updateCategory(category));
    }
    
    @Test
    public void listCategoriesTest()
    {
    	List<Category> l = categoryDAO.listCategories();
    	assertTrue("Problem in listing Category",l.size()>0);
    	for(Category category : l)
    	{
    		System.out.print(category.getCategoryId()+":::");
    		System.out.print(category.getCategoryName()+":::");
    		System.out.println(category.getCategoryDesc());
    	}
    }
}

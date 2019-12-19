package com.ecomm.Test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.dao.CategoryDAO;
import com.ecomm.dao.ProductDAO;
import com.ecomm.model.Category;
import com.ecomm.model.Product;

public class ProductDAOTest 
{
	static ProductDAO productDAO;
    @BeforeClass
    public static void executeFirst()
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    	context.scan("com.ecomm");
    	context.refresh();
    	productDAO = (ProductDAO)context.getBean("productDAO"); 
    }
    @Ignore
    @Test
    public void addProductTest()
    {
    	Product product = new Product();
    	product.setProductName("Asus 6Z");
    	product.setProductDesc("Mobile with 6GB RAM 64GB  48MP+13MP Dual Front Camera ");
    	product.setPrice(27999);
    	product.setStock(25);
    	product.setCategoryId(6);
    	product.setSupplierId(5);
    	assertTrue("Problem in adding Product",productDAO.addProduct(product));
    }
    @Ignore
    @Test
    public void deleteCategoryTest()
    {
    	Product product = productDAO.getProduct(7);
    	assertTrue("Problem in deleting Category",productDAO.deleteProduct(product));
    }
    @Ignore
    @Test
    public void updateUpdateTest()
    {
    	Product product = productDAO.getProduct(2);
    	product.setProductDesc("Mobile with 4GB RAM 64GB Storage Front Camera : 16MP & Rare Camera : 13MP+5MP+5MP");
    	assertTrue("Problem in updating Category",productDAO.updateProduct(product));
    }
    @Ignore
    @Test
    public void productListTest()
    {
    	List<Product> l = productDAO.productList();
    	assertTrue("Problem in listing Category",l.size()>0);
    	for(Product product : l)
    	{
    		System.out.print(product.getProductId()+":::");
    		System.out.print(product.getProductName()+":::");
    		System.out.print(product.getProductDesc()+":::");
    		System.out.print(product.getStock()+":::");
    		System.out.print(product.getPrice()+":::");
    		System.out.print(product.getCategoryId()+":::");
    		System.out.println(product.getSupplierId()+":::");
    	}
    }
    @Test
    public void listProductCategoriesWiseTest()
    {
    	List<Product> l = productDAO.productListCategoryWise(4);
    	assertTrue("Problem in listing Category",l.size()>0);
    	for(Product product : l)
    	{
    		System.out.print(product.getProductId()+":::");
    		System.out.print(product.getProductName()+":::");
    		System.out.print(product.getProductDesc()+":::");
    		System.out.print(product.getStock()+":::");
    		System.out.print(product.getPrice()+":::");
    		System.out.print(product.getCategoryId()+":::");
    		System.out.println(product.getSupplierId()+":::");
    	}
    }
}

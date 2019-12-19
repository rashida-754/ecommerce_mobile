package com.ecomm.Test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.dao.CartDAO;
import com.ecomm.model.Cart;

public class CartDAOTest 
{
	 static CartDAO cartDAO;
	    @BeforeClass
	    public static void executeFirst()
	    {
	    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	    	context.scan("com.ecomm");
	    	context.refresh();
	    	cartDAO = (CartDAO)context.getBean("cartDAO"); 
	    }
	    @Ignore
	    @Test
	    public void addCartTest()
	    {
	    	Cart cartItem = new Cart();
	    	cartItem.setProductId(17);
	    	cartItem.setPrice(15999);
	    	cartItem.setProductName("Redmi Note 8 Pro");
	    	cartItem.setQuantity(3);
	    	cartItem.setStatus("NP");
	    	cartItem.setUsername("jugu");
	    	assertTrue("Problem in adding to Cart",cartDAO.addToCart(cartItem));
	    }
	    @Ignore
	    @Test
	    public void deleteCartItemTest()
	    {
	    	Cart cartItem=cartDAO.getCartItem(2);
	    	assertTrue("Problem in deleting from Cart",cartDAO.deleteItemFromCart(cartItem));
	    }
}

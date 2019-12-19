package com.ecomm.Test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.dao.CategoryDAO;
import com.ecomm.dao.UserDAO;
import com.ecomm.model.Category;
import com.ecomm.model.UserDetail;

public class UserDAOTest 
{
  static UserDAO userDAO;
  @BeforeClass
  public static void executeFirst()
  {
	  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
  	   context.scan("com.ecomm");
  	   context.refresh();
  	   userDAO = (UserDAO)context.getBean("userDAO");
  }
  @Ignore
  @Test
  public void registerUserTest()
  {
	  UserDetail user = new UserDetail();
	  user.setUsername("jugu");
	  user.setPassword("jugu123");
	  user.setAddress("Chennai");
	  user.setName("Jugnu");
	  user.setEmailId("jugu123@gmail.com");
	  user.setEnabled(true);
	  user.setMobile("9255632139");
	  user.setRole("ROLE_User");
	  assertTrue("Problem in Registering the user",userDAO.registerUser(user));
  }
  @Test
  public void updateUserTest()
  {
  	UserDetail user = userDAO.getUser("rash");
  	user.setPassword("rash");
  	assertTrue("Problem in updating Category",userDAO.updateUserDetail(user));
  }
}

package com.ecomm.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;

@Entity
@Table
public class Category 
{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   int categoryId;
   String categoryName,categoryDesc;
   public int getCategoryId() 
   {
	   return categoryId;
   }
   public void setCategoryId(int categoryId) 
   {
	  this.categoryId = categoryId;
   }
   public String getCategoryName() 
   {
	  return categoryName;
   }
   public void setCategoryName(String categoryName) 
   {
	  this.categoryName = categoryName;
   }
   public String getCategoryDesc() 
   {
	  return categoryDesc;
   }
   public void setCategoryDesc(String categoryDesc) 
   {
	  this.categoryDesc = categoryDesc;
   }
}

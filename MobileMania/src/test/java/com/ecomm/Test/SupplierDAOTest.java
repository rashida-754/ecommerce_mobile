package com.ecomm.Test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.dao.CategoryDAO;
import com.ecomm.dao.SupplierDAO;
import com.ecomm.model.Category;
import com.ecomm.model.Supplier;

public class SupplierDAOTest
{ 
	static SupplierDAO supplierDAO;
    @BeforeClass
    public static void executeFirst()
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    	context.scan("com.ecomm");
    	context.refresh();
    	supplierDAO = (SupplierDAO)context.getBean("supplierDAO"); 
    }
    @Ignore
    @Test
    public void addSupplierTest()
    {
    	Supplier supplier = new Supplier();
    	supplier.setSupplierName("Brand Phones");
    	supplier.setSupplierAddr("In Saltlake");
    	assertTrue("Problem in adding Category",supplierDAO.addSupplier(supplier));
    }
    @Ignore
    @Test
    public void deleteSupplierTest()
    {
    	Supplier supplier = supplierDAO.getSupplier(6);
    	assertTrue("Problem in deleting Category",supplierDAO.deleteSupplier(supplier));
    }
    @Ignore
    @Test
    public void updateSupplierTest()
    {
    	Supplier supplier = supplierDAO.getSupplier(3);
    	supplier.setSupplierName("Flipkart");
    	assertTrue("Problem in updating Category",supplierDAO.updateSupplier(supplier));
    }
    @Test
    public void listSuppliersTest()
    {
    	List<Supplier> l = supplierDAO.listSuppliers();
    	assertTrue("Problem in listing Category",l.size()>0);
    	for(Supplier supplier : l)
    	{
    		System.out.print(supplier.getSupplierId()+":::");
    		System.out.print(supplier.getSupplierName()+":::");
    		System.out.println(supplier.getSupplierAddr());
    	}
    }
}

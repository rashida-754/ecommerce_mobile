package com.ecomm.dao;

import java.util.List;

import com.ecomm.model.Supplier;

public interface SupplierDAO 
{
	   public boolean addSupplier(Supplier category);
	   public boolean deleteSupplier(Supplier category);
	   public boolean updateSupplier(Supplier category);
	   public Supplier getSupplier(int supplierId);
	   public List<Supplier> listSuppliers();
}

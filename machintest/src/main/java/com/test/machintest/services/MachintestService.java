package com.test.machintest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.machintest.CategoryMaster;
import com.test.machintest.ProductMaster;
import com.test.machintest.repository.MachintestRepo;

@Service
public class MachintestService {
	@Autowired
	MachintestRepo repo;

	public void addProductMaster(CategoryMaster categoryMaster) {
		repo.saveproductMaster(categoryMaster);

	}

	public List<CategoryMaster> listMaster() {
		List<CategoryMaster> list =repo.listMaster();
		return list;
	}

	public CategoryMaster find(CategoryMaster master) {
		CategoryMaster master1 =repo.findMaster(master);
		return master1;
	}

	public void delete(int categoryid) {
		repo.deleteMaster(categoryid);
		
	}

	public CategoryMaster update(int categoryid, String newName) {
		CategoryMaster masterUpdated = repo.masterUpdated(categoryid,newName);
		return masterUpdated;
	}

	public void addProduct(ProductMaster productMaster) {
		repo.saveproductMaster(productMaster);
		
	}

	public ProductMaster findProduct(ProductMaster product) {
		ProductMaster findproduct=repo.productfind(product);
		return findproduct;
	}

	public List<ProductMaster> listProduct() {
		List<ProductMaster> listProducts = repo.listProducts();
		return listProducts;
	}

	public void deleteProduct(int productid) {
		repo.productDeleted(productid);
	}
	public ProductMaster updateProduct(int productid, String newName) {
		ProductMaster productUpdated = repo.ProductUpdated(productid, newName);
		return productUpdated;		
		
	}

}

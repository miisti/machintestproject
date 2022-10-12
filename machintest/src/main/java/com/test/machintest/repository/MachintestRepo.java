package com.test.machintest.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.test.machintest.CategoryMaster;
import com.test.machintest.ProductMaster;

@Repository
public class MachintestRepo {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("machintest");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();

	public void saveproductMaster(CategoryMaster categoryMaster) {
		manager.persist(categoryMaster);
		transaction.begin();
		transaction.commit();

	}

	public List<CategoryMaster> listMaster() {
		javax.persistence.Query query = (javax.persistence.Query) manager.createQuery("from CategoryMaster");
		List<CategoryMaster> resultList = query.getResultList();
		return resultList;
	}

	public CategoryMaster findMaster(CategoryMaster categoryid) {
		CategoryMaster find = manager.find(CategoryMaster.class, categoryid.getCategoryid());
		return find;
	}

	public boolean deleteMaster(int categoryid) {
		CategoryMaster find = manager.find(CategoryMaster.class, categoryid);
		if (find != null) {
			manager.remove(find);
			transaction.begin();
			transaction.commit();
			return true;
		}
		return false;
	}

	public CategoryMaster masterUpdated(int categoryid, String newName) {
		CategoryMaster find = manager.find(CategoryMaster.class, categoryid);
		find.setCategoryname(newName);
		manager.persist(find);
		transaction.begin();
		transaction.commit();
		return find;
	}

	public void saveproductMaster(ProductMaster productMaster) {
		manager.persist(productMaster);
		transaction.begin();
		transaction.commit();

	}

	public ProductMaster productfind(ProductMaster productid) {
		ProductMaster find = manager.find(ProductMaster.class, productid.getProductid());
		return find;
	}

	public List<ProductMaster> listProducts() {
		
		Query createQuery = manager.createQuery("from ProductMaster");
		List<ProductMaster> resultList = createQuery.getResultList();
		return resultList;
	}

	public boolean productDeleted(int productid) {
		ProductMaster find = manager.find(ProductMaster.class, productid);
		if (find!=null) {
			manager.remove(find);
			transaction.begin();
			transaction.commit();
		}
		return false;
	}
	
	public ProductMaster ProductUpdated(int productid, String newName) {
		ProductMaster find = manager.find(ProductMaster.class, productid);
		find.setProductname(newName);
		manager.persist(find);
		transaction.begin();
		transaction.commit();
		return find;
	}

}

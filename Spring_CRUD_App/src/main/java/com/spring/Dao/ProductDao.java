package com.spring.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.Model.Product;

@Component
public class ProductDao {
	
	
	private HibernateTemplate hibernateTemplate;
	
	
	/**
	 * @return the hibernateTemplate
	 */
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	/**
	 * @param hibernateTemplate the hibernateTemplate to set
	 */
	@Autowired
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	@Transactional("TM")
	public void Createproduct(Product product)
	{
		this.hibernateTemplate.saveOrUpdate(product);
	}
	@Transactional("TM")
	public List<Product> getAllProduct()
	{
		List<Product> all = this.hibernateTemplate.loadAll(Product.class);
		return all;
	}
	
	@Transactional("TM")
	public void DeleteProduct(int pid)
	{
		Product p = this.hibernateTemplate.load(Product.class,pid);
		this.hibernateTemplate.delete(p);
	}
	
	@Transactional("TM")
	public Product getProduct(int pid)
	{
		return this.hibernateTemplate.get(Product.class,pid);
	}

}

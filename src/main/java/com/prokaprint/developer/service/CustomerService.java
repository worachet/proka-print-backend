package com.prokaprint.developer.service;

import java.util.List;
import com.prokaprint.developer.model.Customer;

public interface CustomerService {
	
	public void insert(Customer cus);
	
	public void insertBatch(List<Customer> customers);
	
	public void loadAllCustomer();
	
	public void getCustomerById(long cust_id);
	
	public void getCustomerNameById(long cust_id);
	
	public void getTotalNumerCustomer();
	
}

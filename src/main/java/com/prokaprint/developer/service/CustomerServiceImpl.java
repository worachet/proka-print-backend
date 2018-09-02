package com.prokaprint.developer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prokaprint.developer.dao.CustomerDao;
import com.prokaprint.developer.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public void insert(Customer cus) {
		// TODO Auto-generated method stub
		customerDao.insert(cus);
	}

	@Override
	public void insertBatch(List<Customer> customers) {
		// TODO Auto-generated method stub
		customerDao.inserBatch(customers);
	}

	@Override
	public void loadAllCustomer() {
		// TODO Auto-generated method stub
		List<Customer> listCust = customerDao.loadAllCustomer();
		for(Customer cus: listCust){
			System.out.println(cus.toString());
		}
	}

	@Override
	public void getCustomerById(long cust_id) {
		// TODO Auto-generated method stub
		Customer cust = customerDao.findCustomerById(cust_id);
		System.out.println(cust);
	}

	@Override
	public void getCustomerNameById(long cust_id) {
		// TODO Auto-generated method stub
		String name = customerDao.findNameById(cust_id);
		System.out.println("Customer's name = " + name);
	}

	@Override
	public void getTotalNumerCustomer() {
		// TODO Auto-generated method stub
		int totalNumberCustomer = customerDao.getTotalNumberCustomer();
		System.out.println("Total Number Customer is: " + totalNumberCustomer);
	}

}

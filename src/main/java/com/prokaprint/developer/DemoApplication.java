package com.prokaprint.developer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.prokaprint.developer.model.Customer;
import com.prokaprint.developer.service.CustomerService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	CustomerService customerService;
	
	@Bean
	CommandLineRunner runner(){
		return args -> {
			System.out.println("CommandLineRunner running in the UnsplashApplication class...");
		};
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		 Random r = new Random();
		 
		 // Customer 1
		 Customer cus_1 = new Customer();
		 Long cus_1_id = r.nextLong();
		 cus_1.setCustId(cus_1_id);
		 cus_1.setName("demoCustomer_1");
		 cus_1.setAge(30);
		 
		 // Customer 2
		 Customer cus_2 = new Customer();
		 Long cus_2_id = r.nextLong();
		 cus_2.setCustId(cus_2_id);
		 cus_2.setName("demoCustomer_2");
		 cus_2.setAge(30);
		 
		 // Customer 3
		 Customer cus_3 = new Customer();
		 Long cus_3_id = r.nextLong();
		 cus_3.setCustId(cus_3_id);
		 cus_3.setName("demoCustomer_2");
		 cus_3.setAge(30);
		 
		 customerService.insert(cus_1);
		 
		 List<Customer> customers = new ArrayList<Customer>();
		 customers.add(cus_2);
		 customers.add(cus_3);
		 
		 customerService.insertBatch(customers); 
			
		 customerService.loadAllCustomer();
		 
		 customerService.getCustomerById(Long.valueOf(cus_1_id));
		 
		 customerService.getCustomerNameById(cus_2_id);
		 
		 customerService.getTotalNumerCustomer();
	}
	
	
}

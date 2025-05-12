package com.ltimindtree.restcontroller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ltimindtree.entity.Customer;

@RestController

public class CustomerRestController {

	@GetMapping(value = "/get/{customerId}", consumes = MediaType.APPLICATION_JSON_VALUE, 
			  produces = MediaType.APPLICATION_JSON_VALUE)
	//@ResponseBody
	public ResponseEntity<?> getCustomerById(@PathVariable("customerId") Integer customerId) {

		System.out.println("Fetching data ..................");
		if(customerId != null) {
		Customer customer = new Customer(1001, "Pavan", "utpallikarpavan@gmail.com");
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
		}
		// System.out.println("Fetched customer data" + customer);

		return new ResponseEntity<>("Customer id not exists", HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@GetMapping("/getAll")
	public List<Customer> getAllCustomers() {

		System.out.println("Fetch data ..................");

		/*
		 * Customer customer1 = new Customer(1001, "Pavan",
		 * "utpallikarpavan@gmail.com"); Customer customer2 = new Customer(1002,
		 * "Pavan k", "abc@gmail.com"); Customer customer3 = new Customer(1003,
		 * "Pavan u", "pavan@gmail.com"); Customer customer4 = new Customer(1004,
		 * "Pavan utpallikar", "pavan.01111989@gmail.com"); List<Customer> customers =
		 * List.of(customer1, customer2, customer3, customer4);
		 */

		List<Customer> customers = Arrays.asList(
				new Customer(1001, "Pavan", "utpallikarpavan@gmail.com"),
				new Customer(1002, "Pavan k", "abc@gmail.com"),
				new Customer(1003, "Pavan u", "pavan@gmail.com"),
				new Customer(1004, "Pavan utpallikar", "pavan.01111989@gmail.com"));

		// System.out.println("Fetched customer data" + customers);

		return customers;
	}

	@PostMapping( value = "/test", 
			  consumes = MediaType.APPLICATION_JSON_VALUE, 
			  produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {

		// db logic

		//System.out.println(customer);

		return new ResponseEntity<Customer>(customer, HttpStatus.CREATED);

	}

	@PutMapping("/update")
	public String updateCustomer(@RequestBody Customer customer) {

		// db logic

		System.out.println(customer);

		return "Updated customer dB";

	}

	@DeleteMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable("id") Integer id) {
		// db logic

		return "Customer data deleted";

	}
}

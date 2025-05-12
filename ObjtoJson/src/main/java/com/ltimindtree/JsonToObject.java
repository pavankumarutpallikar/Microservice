package com.ltimindtree;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToObject {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		File file = new File("customer.json");
		
		ObjectMapper objectMapper = new ObjectMapper();
	    Customer customer = objectMapper.readValue(file, Customer.class);
		
	 System.out.println(" Completed........"+ customer);
	}
}

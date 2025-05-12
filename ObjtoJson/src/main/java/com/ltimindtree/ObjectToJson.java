package com.ltimindtree;


import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJson {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		Customer customer = new Customer(1001, "Pavan Utpallikar", "Utpallikarpavan@Gmail.come", "Bidar Karnataka", "MAle" );
	
	    ObjectMapper objectMapper = new ObjectMapper();
	    objectMapper.writeValue(new File("customer.json"), customer);
	}
}

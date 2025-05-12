package com.ltimindtree.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicateString {
	
	/*
	 * public void duplicateCount(String s) {
	 * 
	 * Map<Character, Integer> map = new HashMap<>();
	 * 
	 * for(char crr : s.toCharArray()) if(map.containsKey(crr)) { map.put(crr,
	 * map.get(crr) +1); }else { map.put(crr, 0); } map.forEach((key, value)-> {
	 * System.out.println(" " +key + " value " + value); }); }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * String s = "communication is the key and is important";
	 * 
	 * CountDuplicateString obj = new CountDuplicateString(); obj.duplicateCount(" "
	 * + s); }
	 */
	public static void main(String[] args) {
		
	
	List<String> list = List.of( "communication", "communication", "communication", "is", "the", "key", "and", "is", "important");
	
	
List<String> newList =	list.stream()
		.filter(n-> n.startsWith("communication"))
		.collect(Collectors.toList());

System.out.println(newList);
	   
	}
}
	  
	


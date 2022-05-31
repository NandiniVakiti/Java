package lab6;

import java.util.Map;
import java.util.*; 
public class Ex2 {

	public static void main(String[] args) {
	
		        String Input = "aaaabbbccccdddeeefffggg"; 
		        Map<Character,Integer> counterMap = new HashMap<Character,Integer>(); 
		        for(char current : Input.toCharArray()){ 
		            if(!counterMap.containsKey(current)){ 
		                counterMap.put(current, 1); 
		            } 
		            else{ 
		                counterMap.put(current, counterMap.get(current)+1); 
		            } 
		        } 
		         
		        System.out.println(counterMap); 
		    } 
		} 
	



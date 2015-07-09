package com.rajiv.org;

import java.util.HashMap;
import java.util.Map;

public class Data {
	public String id,name;
	public int i=0,count=0;
	HashMap<String,String> hm = new HashMap<String,String>();
	
	
	public String[] display(){
		String detail[] =  new String[6];
	
		for(Map.Entry itr:hm.entrySet()){
			
			id = (String) itr.getKey();
			name = (String) itr.getValue();
			detail[i++] = id;
			detail[i++] = name;
		}
		return detail;
		
		
	}

}

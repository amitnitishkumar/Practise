package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachTest {
	public static void main(String[] args) {
		String str = "amit,nitish";
		final ArrayList ar = new ArrayList(Arrays.asList(str.split(",")));	
		ar.add("test");
		String str1 = "DDCF;Txt;Deci;Bool;Tim;Num;Percent;Dat";
		/*List<String> list1 = Arrays.asList(str.split(","));
		list1.forEach(new Consumer<String>(){
			public void accept(String i){
				System.out.println(i);
			}
		}
			);
		list1.forEach((String i) ->{if(i.equals("amit"))
			System.out.println(true);
		}  );*/
		
		Arrays.asList(str1.split(";")).forEach((String customFieldName) -> ar.add(customFieldName));	
		System.out.println(ar);
		}		
		
	}



package com.practise;

import com.runtime.TestCalling;

public class Practise {
	static String str = "Hello";
	private class Inner{
		public void print(){
			System.out.println(str);
		}
	}
	static void m1(){
		
	}
	
	void m2(){
		m1();
	}
	public static void main(String[] args) {
		TestCalling obj = new TestCalling();
		obj.example();
		
	}
	public void m4(){
		TestCalling obj = new TestCalling();
		obj.example();
	}

}

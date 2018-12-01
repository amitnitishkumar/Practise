package com.methodgetscallingclassname;

import com.practise.Practise;

class Prut {    
    public static void example() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();                
        StackTraceElement element = stackTrace[stackTrace.length-1];
        System.out.println("I was called by a method named: " + element.getMethodName());
        System.out.println("That method is in class: " + element.getClassName().split(".")[element.getClassName().split(".").length-1]);
    }
}
public class MethodGetsCallingClassName {
	public static void main(String[] args) {
		Practise obj = new 	Practise();
		obj.m4();
	}

}

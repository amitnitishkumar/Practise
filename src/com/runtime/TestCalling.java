package com.runtime;

public class TestCalling {
	public void example() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTrace[2];
        System.out.println("I was called by a method named: " + element.getMethodName());
        System.out.println("That method is in class: " + element.getClassName().split("\\.")[element.getClassName().split("\\.").length-1]);
    }

}

package com.lambda;

public class LambdaTest {
	
	public static void main(String[] args) {		
		Runnable runnable = () -> System.out.println("Run called");
		runnable.run();
		Runnable runnable1 = () -> System.out.println("Run1 called");
		runnable1.run();		
		System.out.println(runnable);
	}
	
	public Runnable test(){
		Runnable runnable = () -> System.out.println("Run called");
		runnable.run();
		return runnable;
	}
}
class Test implements Runnable{

	@Override
	public void run() {		
		System.out.println("Test Run");
	}
	
}

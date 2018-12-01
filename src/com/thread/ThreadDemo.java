package com.thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo implements Runnable {
    int k = 100;
	@Override
	public void run() {
		for(int i = 0 ; i<=10; i++){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t1");
		}
		
	}
	public static void main(String[] args) {
		List<Boolean> isPass = new ArrayList<Boolean>(1);
		isPass.add(false);
		System.out.println(isPass.size());
		System.out.println(isPass.get(0));
		ThreadDemo myThread = new ThreadDemo();
		Thread t1 = new Thread(myThread);
		t1.start();
		Thread t2 = new Thread(new Runnable(){			
			ThreadDemo ob = new ThreadDemo();
			@Override
			public void run() {	
				isPass.add(0, true);
				for(int i = 0 ; i<=ob.k; i++){
					System.out.println("t2");
				}
				
			}
		});
		t2.start();
		System.out.println(isPass.get(0));
	}
}

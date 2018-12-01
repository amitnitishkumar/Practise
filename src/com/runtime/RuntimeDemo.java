package com.runtime;

import java.io.IOException;

public class RuntimeDemo {
	public static void main(String[] args) throws IOException {
		/*String script = "C:\\Users\\nitkumar\\Desktop\\send.vbs";
		// search for real path:
		String executable = "wscript.exe";
		String cmdArr [] = {executable, script,"hii"};
		
		Runtime.getRuntime().exec (cmdArr);
		
		System.out.println(System.getProperty("user.dir"));		
		*/
		System.out.println(System.getProperty("user.home"));
	}

}


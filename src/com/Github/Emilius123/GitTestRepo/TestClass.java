/**
  TestClass
  Can be cool
 */
package com.Github.Emilius123.GitTestRepo;

public class TestClass {
	private boolean isACoolTest;
	
	public TestClass(boolean cool) {
		this.isACoolTest = cool;
	}
	
	public void doSomething() {
		if(this.isACoolTest == true) {
			//This is a cool test
			System.out.println("I'm a cool test!");
		}else {
			//This is a not cool test
			System.out.println("I'm a test!");
		}
	}
	
}

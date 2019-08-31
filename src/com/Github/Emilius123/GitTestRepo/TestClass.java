/**
  TestClass
  Has a coolness Enum
 */
package com.Github.Emilius123.GitTestRepo;

public class TestClass {
	private Coolness Coolness;
	
	public TestClass(Coolness cool) {
		this.Coolness = cool;
	}
	
	public void doSomething() {
		if(this.Coolness == Coolness.COOL) {
			//Cool
			System.out.println("WOWOOWOWOW I'M COOL!");
		}else if(this.Coolness == Coolness.KINDA_COOL) {
			//Kinda cool
			System.out.println("yo im kinda cool");
		}else if(this.Coolness == Coolness.NOT_COOL) {
			//Not cool
			System.out.println("im not cool, :*(");
		}
	}
	
}

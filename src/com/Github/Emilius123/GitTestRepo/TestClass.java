/**
  TestClass
  Has a coolness Enum
  Years of research showed that this is completely useless
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
		}else if(this.Coolness == Coolness.OMG_SO_ULTRA_HYDRA_MUCH_COOL) {
			//OMG SO ULTRA HYDRA MUCH COOL
			System.out.println("NO WAY IM SO OMG SO ULTRA HYDRA MUCH COOL OMG SO AWSEOME ");
		}
	}
	
	
}

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
	
	public Feeling doSomething() {
		if(this.Coolness == Coolness.COOL) {
			//Cool
			System.out.println("WOWOOWOWOW I'M COOL!");
			return Feeling.Awseome;
		}else if(this.Coolness == Coolness.KINDA_COOL) {
			//Kinda cool
			System.out.println("yo im kinda cool");
			return Feeling.Kinda_Good;
		}else if(this.Coolness == Coolness.NOT_COOL) {
			//Not cool
			System.out.println("im not cool, :*(");
			return Feeling.Me_cri;
		}else if(this.Coolness == Coolness.OMG_SO_ULTRA_HYDRA_MUCH_COOL) {
			//OMG SO ULTRA HYDRA MUCH COOL
			System.out.println("NO WAY IM SO OMG SO ULTRA HYDRA MUCH COOL OMG SO AWSEOME ");
			return Feeling.OMG_SO_SUPER_ULTRA_HYDRA_COOL;
		}
		return null;
	}
	
	
}

/**
  TestClass
  Has a coolness Enum
  Years of research showed that this is completely useless
 */
package com.Github.Emilius123.GitTestRepo;

public class TestClass {
	private Coolness Coolness;
	private Feeling Feeling;
	private Uselessness Uselessness;

	public TestClass(Coolness cool) {
		this.Coolness = cool;
	}
	
	public Feeling doSomething() {
		if(this.Coolness == com.Github.Emilius123.GitTestRepo.Coolness.COOL) {
			//Cool
			System.out.println("WOWOOWOWOW I'M COOL!");
			this.setFeeling(com.Github.Emilius123.GitTestRepo.Feeling.Awseome);
			return com.Github.Emilius123.GitTestRepo.Feeling.Awseome;
		}else if(this.Coolness == com.Github.Emilius123.GitTestRepo.Coolness.KINDA_COOL) {
			//Kinda cool
			System.out.println("yo im kinda cool");
			this.setFeeling(com.Github.Emilius123.GitTestRepo.Feeling.Kinda_Good);
			return com.Github.Emilius123.GitTestRepo.Feeling.Kinda_Good;
		}else if(this.Coolness == com.Github.Emilius123.GitTestRepo.Coolness.NOT_COOL) {
			//Not cool
			System.out.println("im not cool, :*(");
			this.setFeeling(com.Github.Emilius123.GitTestRepo.Feeling.Me_cri);
			return com.Github.Emilius123.GitTestRepo.Feeling.Me_cri;
		}else if(this.Coolness == com.Github.Emilius123.GitTestRepo.Coolness.OMG_SO_ULTRA_HYDRA_MUCH_COOL) {
			//OMG SO ULTRA HYDRA MUCH COOL
			System.out.println("NO WAY IM SO OMG SO ULTRA HYDRA MUCH COOL OMG SO AWSEOME ");
			this.setFeeling(com.Github.Emilius123.GitTestRepo.Feeling.OMG_SO_SUPER_ULTRA_HYDRA_COOL);
			return com.Github.Emilius123.GitTestRepo.Feeling.OMG_SO_SUPER_ULTRA_HYDRA_COOL;
		}
		return null;
	}
	
	public void TestIt() {
		if(this.Uselessness == Uselessness.Useless) {
		System.out.println("I'm useless and lazy but ima still do that");
		if(this.Feeling == com.Github.Emilius123.GitTestRepo.Feeling.Awseome){
			System.out.println("Test YAY :))))) ;) ");
		}else if(this.Feeling == com.Github.Emilius123.GitTestRepo.Feeling.OMG_SO_SUPER_ULTRA_HYDRA_COOL) {
			System.out.println("DHhidsuhdfhigfuhduhTESTTESTSTSTdsgfAYAYyOMG");
		}else if(this.Feeling == com.Github.Emilius123.GitTestRepo.Feeling.Kinda_Good) {
			System.out.println("kinda nice test");
		}else {
			System.out.println("test :(");
		}
		}else {
			System.out.println("No way ima do that, im too useless and lazy");
		}
			
	}
	
	/*
	  Getters and Setters are important.
	  Lots of classes need them.
	  That's why we created these
	 */
	
	public Feeling getFeeling() {
		return Feeling;
	}

	public Coolness getCoolness() {
		return Coolness;
	}

	public void setCoolness(Coolness coolness) {
		Coolness = coolness;
	}

	public void setFeeling(Feeling feeling) {
		Feeling = feeling;
	}
	
	public Uselessness getUselessness() {
		return Uselessness;
	}

	public void setUselessness(Uselessness uselessness) {
		Uselessness = uselessness;
	}
	
	
}

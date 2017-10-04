package com.luv2code.springdemo;

public class BoxingCoach implements Coach {
	
	private StrongRandomFortune fortuneService;
	private String emailAddress;
    private String team;

	// create a no arg constructor
	public BoxingCoach() {
		System.out.println("BoxingCoach: inside no-arg constructor");
	}

	public void setFortuneService(StrongRandomFortune fortuneService) {
		System.out.println("BoxingCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("BoxingCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("BoxingCoach: inside setter method - setTeam");
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		
		return "15 min shadow boxing then 30 min jumprope GET CRACKING!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	

}

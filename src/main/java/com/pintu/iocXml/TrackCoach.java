package com.pintu.iocXml;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	public  TrackCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Run hard for 10k\n"+fortuneService.getFortune();
	}

}

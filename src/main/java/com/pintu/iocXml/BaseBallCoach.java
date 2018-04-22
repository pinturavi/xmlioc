package com.pintu.iocXml;

public class BaseBallCoach implements Coach{
	private FortuneService fortuneService;
	
	public  BaseBallCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}
	public String getDailyWorkOut(){
		return "Practice batting for 1 hour\n"+fortuneService.getFortune();
	}
}

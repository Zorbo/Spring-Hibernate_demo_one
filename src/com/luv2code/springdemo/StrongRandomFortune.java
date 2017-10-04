package com.luv2code.springdemo;

import java.util.Random;

public class StrongRandomFortune implements FortuneService {

	@Override
	public String getFortune() {
		
		String[] fortune = {"Yeah hit it with all your fate!", "Belive in your self, and the moon will shine!", "Do it like a champ!"};		
		int x = new Random().nextInt(fortune.length);
		String result = fortune[x];
	
	return "Random fortune: " + result;
	}

}

package logic;

import java.util.Random;

public class Damage {
	Random rand = new Random();
	
	public int calcDamage(int power, int defense, int attackPower){
		int Critical = getCritical();
		
		double Damage = 7 * power * attackPower;
		double finalDamage = Damage / defense;
		
		
//		double Damage = (Math.sqrt(power * attackPower * 75));
//		double Defense = (Math.sqrt(10 * defense) + (2 * defense)) / 5;
//		double finalDamage = (int)((Damage - Defense) * Critical);
		if (finalDamage <= 1)
			finalDamage = 1;
		
		System.out.println(finalDamage);
		return (int)finalDamage;
	}
	
	private int getCritical(){
		int random = rand.nextInt(10);
		if(random == 0)
			return 2;
		else
			return 1;
	}
}

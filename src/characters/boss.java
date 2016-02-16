package characters;

import attacks.Attacks;
import java.util.*;

public class boss extends character{
	
	public String[] getAttacks(){
		return Attacks;
	}
	
	public int[] getAttackPower(){
		return AttackPower;
	}
	
	public int[] getAttackIndex(){
		return AttackIndex;
	}
	
	public void setName(String Name){
		this.name = Name;
	}
	
	public boss(){
		attacks = new Attacks();
		attacks.assignCharacterAttacks(8, 11, 17, 18);
		
		Attacks = attacks.attackChoice;
		AttackPower = attacks.attackPowerList;
		AttackIndex = attacks.attackIndex;
		
		this.type = "BOSS";
		this.lifePoints = new Random().nextInt(2000) + 10000;
		this.Power = new Random().nextInt(100) + 150;
		this.Defense = new Random().nextInt(100) + 300;
		this.Speed = 500;
		attacks = null;
	}
}

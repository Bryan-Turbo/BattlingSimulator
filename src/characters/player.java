package characters;

import attacks.Attacks;
import java.util.*;

public class player extends character{
	
	public String[] getAttacks(){
		return Attacks;
	}
	
	public int[] getAttackPower(){
		return AttackPower;
	}
	
	public int[] getAttackIndex(){
		return AttackIndex;
	}
	
	public player(){
		attacks = new Attacks();
		
		attacks.assignCharacterAttacks(3);
		
		Attacks = attacks.attackChoice;
		AttackPower = attacks.attackPowerList;
		AttackIndex = attacks.attackIndex;

		this.type = "PLAYER";
		this.lifePoints = new Random().nextInt(500) + 1000;
		this.Power = new Random().nextInt(50) + 100;
		this.Defense = new Random().nextInt(100) + 200;
		this.Speed = 500;
	}
	
	public void setName(String Name){
		this.name = Name;
	}
}

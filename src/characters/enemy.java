package characters;

import attacks.Attacks;
import java.util.*;

public class enemy extends character{
	
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
	
	public enemy(){
		attacks = new Attacks();
		
		Attacks = attacks.attackChoice;
		AttackPower = attacks.attackPowerList;
		AttackIndex = attacks.attackIndex;

		this.type = "ENEMY";
		this.lifePoints = new Random().nextInt(500) + 750;
		this.Power = new Random().nextInt(100) + 50;
		this.Defense = new Random().nextInt(100) + 100;
		this.Speed = 500;
	}
}

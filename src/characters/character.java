package characters;

import attacks.Attacks;

public abstract class character {
	
	Attacks attacks;
	public abstract String[] getAttacks();
	public abstract int[] getAttackPower();
	public abstract int[] getAttackIndex();
	public abstract void setName(String Name);
	
	public int lifePoints;
	public int Power;
	public int Defense;
	public int Speed;
	
	public String type;
	public String name;
	
	public String Attacks[];
	public int AttackPower[];
	public int AttackIndex[];
}

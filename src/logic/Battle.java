package logic;

import attacks.*;
import characters.*;
import data.*;
import globals.*;
import java.util.*;

public class Battle extends BattleMethodsReuse{
	Damage damg = new Damage();
	
	Attacks attack = new Attacks();
	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	
	boolean canAttack = true;
	boolean Battling = true;
	
	public void startBattle(character Player, character Enemy){
		getNames(Player, Enemy);
		printCharacterBasicStats(Player, Enemy);
		battle(Player, Enemy);
	}

	private void battle(character Player, character Enemy){
		int attackInt;
		while(Battling){
			if(canAttack){
				attackInt = chooseAttack(Player, Enemy);
				processDamageValues(Player, Enemy, attackInt);
				canAttack = false;
			}else{
				attackInt = chooseAttack(Enemy, Player);
				processDamageValues(Enemy, Player, attackInt);
				canAttack = true;
			}
			
		}
	}
	
	private int chooseAttack(character Attacker, character Defender){
		int attackIndex = 0;
		if(Attacker.type.equals("PLAYER")){
			System.out.println("Choose your attack by entering the visible indexes.\n");
			showMoves(Attacker);
			attackIndex = getAttack(Attacker);
		}else{
			attackIndex = Attacker.AttackIndex[rand.nextInt(4)];
		}
		printAttackDialog(Attacker, Defender, attack.getAttackDialog(Attacker.name, Defender.name, attackIndex));
		return attackIndex;
	}
	
	private int getAttack(character Attacker){
		int attackInput = 0;
		while(true){
			if(canAttack){
				try{
					attackInput = input.nextInt();
					for(int AI : Attacker.AttackIndex){
						if(attackInput == AI){
							canAttack = false;
							return attackInput;
						}
					}
					System.out.println("That number is not in your attacklist");
				}catch(Exception e){
					System.out.println("Please choose a number");
					input.next();
				}
			}
		}
	}
	
	private void printAttackDialog(character Attacker, character Defender, String attackDialog){
		for(char letter : attackDialog.toCharArray()){
			System.out.print(letter);
			sleep(0.05);
		}
		canAttack = true;
		System.out.println();
	}
	
	private void processDamageValues(character Attacker, character Defender, int attackNumber){
		int Damage = damg.calcDamage(Attacker.Power, Defender.Defense, attack.getAttackPower(attackNumber));
		Defender.lifePoints = Defender.lifePoints - Damage;
	}
	
	private void printCharacterBasicStats(character Attacker, character Defender) {
		character chars[] = {Attacker, Defender};
	}
	
	private void getNames(character Attacker, character Defender){
		Defender.setName(new names().bossNames[0]);
		System.out.println("Please enter the name you want to use");
		Attacker.setName(input.nextLine());
	}
}

package logic;

import attacks.*;
import characters.*;
import data.*;
import java.util.*;

public class Battle extends Base{
	Damage damg = new Damage();
	
	Attacks attack = new Attacks();
	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	
	boolean canAttack = true;
	boolean Battling = false;
	
	public void startBattle(character Attacker, character Defender){
		getNames(Attacker, Defender);
		printCharacterBasicStats(Attacker, Defender);
		battle(Attacker, Defender);
	}

	private void battle(character Attacker, character Defender){
		chooseAttack(Attacker, Defender);
	}
	
	private void chooseAttack(character Attacker, character Defender){
		System.out.println("Choose your attack by entering the visible indexes.\n");
		showAttackerMoves(Attacker);
		while(true){
			System.out.println(Defender.lifePoints);
			int attackIndex = getAttack(Attacker);
			printAttackDialog(Attacker, Defender, attackIndex);
			int Damage = damg.calcDamage(Attacker.Power, Defender.Defense, attack.getAttackPower(attackIndex));
			Defender.lifePoints -= Damage;
		}
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
	
	private void showAttackerMoves(character Attacker){
		String attacks = "";
		for(int i = 0; i < Attacker.Attacks.length; i++){
			attacks += "INDEX: "+Attacker.AttackIndex[i]+"\tPOWER: "+Attacker.AttackPower[i]+"\t"+Attacker.Attacks[i]+"\n";
		}
		System.out.println(attacks);
	}
	
	private void printAttackDialog(character Attacker, character Defender, int AttackIndex){
		String attackDialog = attack.getAttackDialog(Attacker.name, Defender.name, AttackIndex);
		
		for(char letter : attackDialog.toCharArray()){
			System.out.print(letter);
			sleep(0.05);
		}
		canAttack = true;
		System.out.println();
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

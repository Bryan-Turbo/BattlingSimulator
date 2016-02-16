package logic;

import java.util.*;
import characters.*;
import attacks.Attacks;

public class Start extends Base{
	public static void main(String[] args){
		new Start().run();
	}
	boolean running = true;
	boolean makeNewSelection = false;
	
	Attacks attacks = new Attacks();
	Battle battle = new Battle();
	Random rand = new Random();
	Scanner scan = new Scanner(System.in);
	
	character Char[] = new character[3];
	
	private void run(){
		do{
			sleep(0.5);
			makeCharacterSelection();
			battle.startBattle(Char[0], Char[2]);
		}while(running);
	}
	
	private void makeCharacterSelection(){
		if(!makeNewSelection){
			Char[0] = new player();
			Char[1] = new enemy();
			Char[2] = new boss();
		}
	}
}

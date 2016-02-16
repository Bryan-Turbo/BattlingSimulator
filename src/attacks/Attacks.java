package attacks;

import java.util.*;

public class Attacks {
	String Attacks[] = {		"Earthquake", "Bounding Pressure", "LAZERGUN", "WATERBAZOOKAAAAAA", "RELEASE THE KRAKEN", 
								"KAMEHAMEHA", "FINALFLASH", "Dog treat throw", "METEORIC BURST", "FLAME CANNON",
								"N60 Hurricane", "Hell Blitz", "Lightning Strike", "HIROSHIMA", "ALLAHU AKBAR",
								"360 NOSCOPE GET REKT", "CHOCOLATEBEAM", "Killer Move: Serious Series, Serious Punch", 
								"Collapsing Star, Roaring Cannon"};
	
	int AttackPower[] = {		100, 120, 110, 120, 130, 
								120, 130, 80, 250, 90, 
								70, 210, 80, 100, 120, 
								140, 100, 500, 400};
	
	String choice[] = new String[4];
	public String attackChoice[] = new String[4];
	public int attackPowerList[] = new int[4];
	public int attackIndex[] = new int[4];
	
	Random rand = new Random();
	int randomChoice;
	
	public Attacks(){
		for(int i = 0; i < 4; i++){
			do{
				randomChoice = rand.nextInt(19);
			}while(Arrays.asList(choice).contains("" + randomChoice));

			this.choice[i] = "" + randomChoice;
			this.attackChoice[i] = Attacks[randomChoice];
			this.attackPowerList[i] = AttackPower[randomChoice];
			this.attackIndex[i] = randomChoice;
		}
	}
	
	/**
	 * assign a certain moveset to a character
	 */
	public void assignCharacterAttacks(int...attackChoices){
		int i[] = attackChoices;
		int counter = 0;
		
		for(int j : i){
			if(counter < 4){
				attackChoice[counter] = Attacks[j];
				attackPowerList[counter] = AttackPower[j];
				attackIndex[counter] = j;
				counter++;
			}
		}
	}
	
	/**
	 * Generate an attackdialog
	 * 
	 * @param Attackername
	 * @param Defendername
	 * @param AttackIndex
	 * @return AttackDialog
	 */
	public String getAttackDialog(String Attackername, String Defendername, int AttackIndex){
		String AttackDialog = "";
		switch (AttackIndex){
			case 0:
				AttackDialog = (Attackername + " started stomping around causing a massive earthquake");
				break;
			case 1:
				AttackDialog = (Attackername + " released a maasive wave which made the air pressure 100x as high");
				break;
			case 2:
				AttackDialog = (Attackername + " shot his LAZERGUN at " + Defendername);
				break;
			case 3:
				AttackDialog = ("Apparently " + Attackername + " got a "+Attacks[3]+" and shot it at " + Defendername + ".....................weird");
				break;
			case 4:
				AttackDialog = (Attackername + " released the kraken");
				break;
			case 5:
				AttackDialog = (Attackername + ": KA...ME...HA...ME......HAAAAAAAAAAAAAAA");
				break;
			case 6:
				AttackDialog = ("\"" + Defendername.toUpperCase() + "!! ONCE AGAIN YOU HAVE TAKEN FOR GRANTED, \nTHE POWER OF A TRUE SAIYAN WARRIOR!! \nNOW IF YOU REALLY WANT TO TEST YOUR STRENGTH, \nSTAY RIGHT WHERE YOU ARE!! \nFINAL FLAAAASHHH HAAAAAA!!!!!!!!!\"");
				break;
			case 7:
				AttackDialog = (Attackername + " threw a dog treat at " + Defendername); 
				break;
			case 8:
				AttackDialog = (Defendername + ": Are you done.....with this?\n" + Attackername + ": .....\n"
						+ Attackername +": NOT YET!\n"
						+ "*intense powerup*\n"
						+ Attackername + ": METEORIC BURST!");
				break;
			case 9:
				AttackDialog = (Attackername + " grabbed its FLAMECANNON, pointed it at " + Defendername + ", and shot it right in his @%*$&!# FACE");
				break;
			case 10:
				AttackDialog = (Attackername + " called Ratchet to fire his N90 Hurricane at " + Defendername);
				break;
			case 11:
				AttackDialog = (Attackername + " let all hell go loose on " + Defendername);
				break;
			case 12:
				AttackDialog = (Attackername + " charged its fist with elektricity and struck " + Defendername + " with full power \nwhich also showed some cool lightning effects");
				break;
			case 13:
				AttackDialog = (Attackername + " wants to try out its new bomb on " + Defendername + "s face");
				break;
			case 14:
				AttackDialog = (Attackername + " reveales its bomb belt, and screamed ALLAHU AKBAR!!!!!!!!!!!!!");
				break;
			case 15:
				AttackDialog = (Attackername + " grabbed a balista out of a hidden pocket, jumped up in the air turned 360° and....\n....OMG OMG OMG NO WAY HE JUST HIT THAT OMG OMG GET REKT M8 \nU ARE A FOOKIN SHIT GET NOSCOPED YOU NOOB OMFG");
				break;
			case 16:
				AttackDialog = (Attackername + ": YEAAAAAAHHHHHH, LET'S THROW A SHITLOAD OF CHOCOLATE IN THAT FACE OF YOURS!!! MUHHAHAHAH");
				break;
			case 17:
				AttackDialog = (": Looks like i'll be using my final move \n"
						+ "Killer Move: Serious Series.....\n.....Serious Punch");
				break;
			case 18:
				AttackDialog = ("\"I WILL DEFEAT YOU!!!!! \nALL OF MY ENERGY WILL BE RELEASED, BLASTING YOU AND THIS PLANET TO HELL!!!!!!!!!!!\n"
						+ "COLLAPSING STAR: ROARING CANNON!!!!!!!!!!\"");
				break;
			default:
				AttackDialog = ("");
				break;
		}
		
		return AttackDialog;
	}

	public int getAttackPower(int index){
		return AttackPower[index];
	}
}
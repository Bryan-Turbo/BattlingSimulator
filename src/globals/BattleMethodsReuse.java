package globals;

import characters.character;
import logic.Base;

public class BattleMethodsReuse extends Base{
	public void showMoves(character Attacker){
		String attacks = "";
		for(int i = 0; i < Attacker.Attacks.length; i++){
			attacks += "INDEX: "+Attacker.AttackIndex[i]+"\tPOWER: "+Attacker.AttackPower[i]+"\t"+Attacker.Attacks[i]+"\n";
		}
		System.out.println(attacks);
	}
}

package game.cards.combatable.minions;

import game.cards.BeAbleToPutASpell;
import game.cards.Card;
import game.cards.GradesOfCard;
import game.cards.JobsOfCard;

public class ShatteredSunCleric extends MinionCard implements BeAbleToPutASpell {

	public ShatteredSunCleric(String name, int costOfMana, GradesOfCard gradeOfCard, JobsOfCard jobOfCard, int damage,
			int life) {
		super(name, costOfMana, gradeOfCard, jobOfCard, damage, life);
	}

	@Override
	public void spell() {
		//아군 하수인 하나에게 +1/+1을 부여합니다.
	}
	
	public static Card getCard() {
		ShatteredSunCleric shat = new ShatteredSunCleric("Shattered Sun Cleric", 3, GradesOfCard.FREE,
				JobsOfCard.NEUTRALITY, 3, 2);
		return shat;
	}
}

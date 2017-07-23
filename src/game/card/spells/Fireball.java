package game.card.spells;

import game.card.Card;
import game.card.GradesOfCard;
import game.card.JobsOfCard;

public class Fireball extends SpellCard{

	@Override
	public void spell() {
		//피해를 6 줍니다.
	}

	@Override
	public Card getCard() {
		Card fireball = new Fireball();
		fireball.setCostOfMana(4);
		fireball.setGradeOfCard(GradesOfCard.FREE);
		fireball.setJobOfCard(JobsOfCard.WIZARD);
		fireball.setName("Fireball");
		return fireball;
	}

}

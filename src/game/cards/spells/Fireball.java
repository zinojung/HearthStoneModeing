package game.cards.spells;

import game.cards.Card;
import game.cards.GradesOfCard;
import game.cards.JobsOfCard;

public class Fireball extends SpellCard{

	public Fireball(String name, int costOfMana, GradesOfCard gradeOfCard, JobsOfCard jobOfCard) {
		super(name, costOfMana, gradeOfCard, jobOfCard);
	}

	@Override
	public void spell() {
		//피해를 6 줍니다.
	}

	public static Card getCard() {
		Card fireball = new Fireball("Fireball", 4, GradesOfCard.FREE, JobsOfCard.WIZARD);
		return fireball;
	}

}

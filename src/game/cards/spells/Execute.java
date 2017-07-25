package game.cards.spells;

import game.cards.Card;
import game.cards.GradesOfCard;
import game.cards.JobsOfCard;

public class Execute extends SpellCard{

	public Execute(String name, int costOfMana, GradesOfCard gradeOfCard, JobsOfCard jobOfCard) {
		super(name, costOfMana, gradeOfCard, jobOfCard);
	}

	@Override
	public void spell() {
		//피해를 입은 적 하수인을 하나 처치합니다.
	}

	public static Card getCard() {
		Execute execute = new Execute("Execute", 2, GradesOfCard.FREE, JobsOfCard.WARRIOR);
		return execute;
	}

}

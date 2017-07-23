package game.card.spells;

import game.card.Card;
import game.card.GradesOfCard;
import game.card.JobsOfCard;

public class Execute extends SpellCard{

	@Override
	public void spell() {
		//피해를 입은 적 하수인을 하나 처치합니다.
	}

	@Override
	public Card getCard() {
		Execute execute = new Execute();
		execute.setCostOfMana(2);
		execute.setGradeOfCard(GradesOfCard.FREE);
		execute.setJobOfCard(JobsOfCard.WARRIOR);
		execute.setName("Execute");
		return execute;
	}

}

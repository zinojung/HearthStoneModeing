package game.card.combatable.minions;

import game.card.Card;
import game.card.GradesOfCard;
import game.card.JobsOfCard;
import game.card.StatesOfCard;

public class MurlocRaider extends MinionCard{

	@Override
	public Card getCard() {
		MurlocRaider murlocRaider = new MurlocRaider();
		murlocRaider.setCostOfMana(1);
		murlocRaider.setDamage(2);
		murlocRaider.setDeadOrLive(StatesOfCard.LIVE);
		murlocRaider.setGradeOfCard(GradesOfCard.FREE);
		murlocRaider.setJobOfCard(JobsOfCard.NEUTRALITY);
		murlocRaider.setLife(1);
		murlocRaider.setName("멀록 약탈꾼");
		return murlocRaider;
	}

}

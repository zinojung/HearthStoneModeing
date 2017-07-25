package game.cards.combatable.minions;

import game.cards.Card;
import game.cards.GradesOfCard;
import game.cards.JobsOfCard;

public class MurlocRaider extends MinionCard{

	public MurlocRaider(String name, int costOfMana, GradesOfCard gradeOfCard, JobsOfCard jobOfCard, int damage,
			int life) {
		super(name, costOfMana, gradeOfCard, jobOfCard, damage, life);
	}

	public static Card getCard() {
		MurlocRaider murlocRaider = new MurlocRaider("MurlocRaider", 1, GradesOfCard.FREE,
				JobsOfCard.NEUTRALITY, 2, 1);
		return murlocRaider;
	}
}

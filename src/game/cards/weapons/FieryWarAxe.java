package game.cards.weapons;

import game.cards.Card;
import game.cards.GradesOfCard;
import game.cards.JobsOfCard;

public class FieryWarAxe extends WeaponCard {

	public FieryWarAxe(String name, int costOfMana, GradesOfCard gradeOfCard, JobsOfCard jobOfCard, int damage,
			int durability) {
		super(name, costOfMana, gradeOfCard, jobOfCard, damage, durability);
	}

	public static Card getCard() {
		FieryWarAxe fie = new FieryWarAxe("Fiery War Axe", 2, GradesOfCard.FREE,
				JobsOfCard.WARRIOR, 3, 2);
		return fie;
	}

}

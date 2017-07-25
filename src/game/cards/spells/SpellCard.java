package game.cards.spells;

import game.cards.BeAbleToPutASpell;
import game.cards.Card;
import game.cards.GradesOfCard;
import game.cards.JobsOfCard;

public abstract class SpellCard extends Card implements BeAbleToPutASpell{

	public SpellCard(String name, int costOfMana, GradesOfCard gradeOfCard, JobsOfCard jobOfCard) {
		super(name, costOfMana, gradeOfCard, jobOfCard);
	}
}

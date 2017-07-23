package game.card.weapons;

import game.card.Card;
import game.card.GradesOfCard;
import game.card.JobsOfCard;
import game.card.StatesOfCard;

public class FieryWarAxe extends WeaponCard {

	@Override
	public Card getCard() {
		FieryWarAxe fie = new FieryWarAxe();
		fie.setCostOfMana(2);
		fie.setDamage(3);
		fie.setDurability(2);
		fie.setGradeOfCard(GradesOfCard.FREE);
		fie.setJobOfCard(JobsOfCard.WARRIOR);
		fie.setName("이글거리는 전쟁 도끼");
		return fie;
	}

}

package game.cards.weapons;

import game.cards.BeAbleToPutASpell;
import game.cards.Card;
import game.cards.GradesOfCard;
import game.cards.JobsOfCard;

public class TruesilverChampion extends WeaponCard implements BeAbleToPutASpell{

	public TruesilverChampion(String name, int costOfMana, GradesOfCard gradeOfCard, JobsOfCard jobOfCard, int damage,
			int durability) {
		super(name, costOfMana, gradeOfCard, jobOfCard, damage, durability);
	}

	@Override
	public void spell() {
		//내 영웅이 공격할 때마다 생명력 2 회복합니다.
	}

	public static Card getCard() {
		TruesilverChampion tru = new TruesilverChampion("Turesilver Champion", 4, GradesOfCard.FREE, 
				JobsOfCard.PRIESTS, 4, 2);
		return tru;
	}


}

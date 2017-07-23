package game.card.weapons;

import game.card.BeAbleToPutASpell;
import game.card.Card;
import game.card.GradesOfCard;
import game.card.JobsOfCard;

public class TruesilverChampion extends WeaponCard implements BeAbleToPutASpell{

	@Override
	public void spell() {
		//내 영웅이 공격할 때마다 생명력 2 회복합니다.
	}

	@Override
	public Card getCard() {
		TruesilverChampion tru = new TruesilverChampion();
		tru.setCostOfMana(4);
		tru.setDamage(4);
		tru.setDurability(2);
		tru.setGradeOfCard(GradesOfCard.FREE);
		tru.setJobOfCard(JobsOfCard.PRIESTS);
		tru.setName("용사의 진은검");
		return tru;
	}


}

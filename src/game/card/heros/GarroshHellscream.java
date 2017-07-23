package game.card.heros;

import game.card.Card;
import game.card.GradesOfCard;
import game.card.JobsOfCard;
import game.card.StatesOfCard;

public class GarroshHellscream extends HeroCard{

	private int armor = 0;
	

	@Override
	public void spell() {
		//방어도 2를 얻습니다.
	}

	@Override
	public Card getCard() {
		GarroshHellscream garrosh = new GarroshHellscream();
		garrosh.setDamage(0);
		garrosh.setDeadOrLive(StatesOfCard.LIVE);
		garrosh.setLife(30);
		garrosh.setCostOfMana(2);
		garrosh.setGradeOfCard(GradesOfCard.FREE);
		garrosh.setJobOfCard(JobsOfCard.WARRIOR);
		garrosh.setName("가로쉬 헬스크림");
		return (Card) garrosh;
	}

}

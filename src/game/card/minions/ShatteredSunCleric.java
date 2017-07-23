package game.card.minions;

import game.card.BeAbleToPutASpell;
import game.card.Card;
import game.card.GradesOfCard;
import game.card.JobsOfCard;
import game.card.StatesOfCard;

public class ShatteredSunCleric extends MinionCard implements BeAbleToPutASpell {

	@Override
	public void spell() {
		//아군 하수인 하나에게 +1/+1을 부여합니다.
	}
	
	@Override
	public Card getCard() {
		ShatteredSunCleric shat = new ShatteredSunCleric();
		shat.setCostOfMana(3);
		shat.setDamage(3);
		shat.setDeadOrLive(StatesOfCard.LIVE);
		shat.setGradeOfCard(GradesOfCard.FREE);
		shat.setJobOfCard(JobsOfCard.NEUTRALITY);
		shat.setLife(2);
		shat.setName("무너진 태양 성직자");
		return null;
	}

}

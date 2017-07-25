package game.card.combatable.heros;

import game.card.Card;
import game.card.GradesOfCard;
import game.card.JobsOfCard;
import game.card.StatesOfCard;

public class JainaProudmoore extends HeroCard {

	@Override
	public void spell() {
		//영웅 및 하수인에게 데미지 1의 화염 공격
	}

	@Override
	public Card getCard() {
		JainaProudmoore jaina = new JainaProudmoore();
		jaina.setDamage(1);
		jaina.setDeadOrLive(StatesOfCard.LIVE);
		jaina.setLife(30);
		jaina.setGradeOfCard(GradesOfCard.FREE);
		jaina.setJobOfCard(JobsOfCard.WIZARD);
		jaina.setName("제이나 프라우드무어");
		return (Card) jaina;
	}

}

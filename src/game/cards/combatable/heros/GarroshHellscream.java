package game.cards.combatable.heros;

import game.cards.GradesOfCard;
import game.cards.JobsOfCard;

public class GarroshHellscream extends HeroCard{

	public GarroshHellscream(String name, GradesOfCard gradeOfCard, JobsOfCard jobOfCard, int damage,
			int life) {
		super(name, gradeOfCard, jobOfCard, damage, life);
	}

	@Override
	public void spell() {
		//방어도 2를 얻습니다.
	}

	public static HeroCard getCard() {
		GarroshHellscream garrosh = new GarroshHellscream("Garrosh Hellscream", GradesOfCard.FREE,
				JobsOfCard.WARRIOR, 0, 30); 
		return garrosh;
	}
}

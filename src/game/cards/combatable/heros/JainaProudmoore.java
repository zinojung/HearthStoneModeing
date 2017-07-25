package game.cards.combatable.heros;

import game.cards.GradesOfCard;
import game.cards.JobsOfCard;

public class JainaProudmoore extends HeroCard {

	public JainaProudmoore(String name, GradesOfCard gradeOfCard, JobsOfCard jobOfCard, int damage,
			int life) {
		super(name, gradeOfCard, jobOfCard, damage, life);
	}

	@Override
	public void spell() {
		//영웅 및 하수인에게 데미지 1의 화염 공격
	}

	//객체를 만들어 반환합니다.
	public static HeroCard getCard() {
		JainaProudmoore jaina = new JainaProudmoore("Jaina Proudmoore", GradesOfCard.FREE,
				JobsOfCard.WIZARD, 0, 30);
		return jaina;
	}
}

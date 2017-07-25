package game.cards.combatable.minions;

import game.cards.GradesOfCard;
import game.cards.JobsOfCard;
import game.cards.combatable.CombatableCard;

//getCard 메서드를 가장 하위 클래스에서 구현해야 하므로 추상 클래스입니다.
public abstract class MinionCard extends CombatableCard{

	public MinionCard(String name, int costOfMana, GradesOfCard gradeOfCard, JobsOfCard jobOfCard, int damage,
			int life) {
		super(name, costOfMana, gradeOfCard, jobOfCard, damage, life);
	}

}

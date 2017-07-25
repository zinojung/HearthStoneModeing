package game.cards.combatable;

import game.cards.Card;
import game.cards.GradesOfCard;
import game.cards.JobsOfCard;
import game.cards.combatable.heros.HeroCard;

public class CombatableCard extends Card {

	private int damage;
	private int life;
	private StatesOfCard deadOrLive;
	private int armor;
	
	public CombatableCard (String name, int costOfMana, GradesOfCard gradeOfCard,
			JobsOfCard jobOfCard, int damage, int life) {
		super(name, costOfMana, gradeOfCard, jobOfCard);
		this.deadOrLive = StatesOfCard.LIVE;
		this.armor = 0;
		this.damage = damage;
		this.life = life;
	}
	
	public void isAttacked(int damage) {
		if(armor > 0) {
			if(armor >= damage) {
				armor -= damage;
				damage = 0;
			} else {
				damage -= armor;
			}
		}
		this.life -= damage;
		
		if(this.life <= 0) {
			setDeadOrLive(StatesOfCard.DEAD);
		}
	}
	
	public void attack(CombatableCard enemy) {
		enemy.isAttacked(damage);
		//영웅에게는 반격을 받지 않는다.
		if(!(enemy instanceof HeroCard)) {
			this.isAttacked(enemy.getDamage());
		}
	}
	
	public StatesOfCard isDeadOrLive() {
		return deadOrLive;
	}
	private void setDeadOrLive(StatesOfCard deadOrLive) {
		this.deadOrLive = deadOrLive;
	}
	public int getLife() {
		return this.life;
	}
	public void heal(int heal) {
		this.life += heal;
	}
	public int getDamage() {
		return this.damage;
	}
	public void addDamage(int damage) {
		this.damage += damage;
	}
	public void minDamage(int damage) {
		this.damage -= damage;
	}
	public void addArmor(int armor) {
		this.armor += armor;
	}
}

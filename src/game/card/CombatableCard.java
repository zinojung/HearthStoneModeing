package game.card;

import game.card.heros.HeroCard;

public abstract class CombatableCard extends Card {

	private int damage;
	private int life;
	private StatesOfCard deadOrLive;
	private int armor = 0;
	
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
	public void setDeadOrLive(StatesOfCard deadOrLive) {
		this.deadOrLive = deadOrLive;
	}
	public int getLife() {
		return this.life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public void heal(int heal) {
		this.life += heal;
	}
	public void setDamage(int damage) {
		this.damage = damage;
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

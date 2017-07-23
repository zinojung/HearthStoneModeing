package game.card.weapons;

import game.card.Card;
import game.card.StatesOfCard;

public abstract class WeaponCard extends Card {
	
	private int damage;
	private int durability;
	
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getDurability() {
		return durability;
	}
	public void setDurability(int durability) {
		this.durability = durability;
	}

}

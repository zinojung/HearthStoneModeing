package game.cards.weapons;

import game.cards.Card;
import game.cards.GradesOfCard;
import game.cards.JobsOfCard;

public class WeaponCard extends Card {
	
	private int damage;
	private int durability;
	
	public WeaponCard(String name, int costOfMana, GradesOfCard gradeOfCard,
			JobsOfCard jobOfCard, int damage, int durability) {
		super(name, costOfMana, gradeOfCard, jobOfCard);
		this.damage = damage;
		this.durability = durability;
	}
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

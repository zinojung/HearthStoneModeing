package game.cards.combatable.heros;

import game.cards.BeAbleToPutASpell;
import game.cards.GradesOfCard;
import game.cards.JobsOfCard;
import game.cards.combatable.CombatableCard;
import game.cards.weapons.WeaponCard;

public abstract class HeroCard extends CombatableCard implements BeAbleToPutASpell{
	
	private WeaponCard weaponCard;
	private int weaponDurability;
	
	public HeroCard(String name, GradesOfCard gradeOfCard, JobsOfCard jobOfCard, int damage, int life) {
		//영웅 특수 주문시 항상 마나 사용량은 2
		super(name, 2, gradeOfCard, jobOfCard, damage, life);
		this.weaponCard = null;
		this.weaponDurability = 0;
	}
	
	public void setWeaponCard(WeaponCard weaponCard) {
		this.weaponCard = weaponCard;
		this.weaponDurability = weaponCard.getDurability();
		this.addDamage(weaponCard.getDamage());
	}

	private void destroyWeaponCard() {
		this.addDamage(0);
		this.weaponCard = null;
	}
	//영웅은 무기를 장착했을때 공격합니다. 무기와 관련된 동작을 추가했습니다.
	@Override
	public void attack(CombatableCard enemy) {
		super.attack(enemy);
		if(weaponCard != null) {
			weaponDurability -= 1;
			if(weaponDurability <= 0) destroyWeaponCard();
		}
	}
}

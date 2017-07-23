package game.card.heros;

import game.card.BeAbleToPutASpell;
import game.card.CombatableCard;
import game.card.StatesOfCard;
import game.card.weapons.WeaponCard;

public abstract class HeroCard extends CombatableCard implements BeAbleToPutASpell{
	
	private WeaponCard weaponCard;
	private int weaponDurability;
	
	public void setWeaponCard(WeaponCard weaponCard) {
		this.weaponCard = weaponCard;
		this.weaponDurability = weaponCard.getDurability();
		this.setDamage(weaponCard.getDamage());
	}

	private void destroyWeaponCard() {
		this.setDamage(0);
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

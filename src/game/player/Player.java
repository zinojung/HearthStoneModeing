package game.player;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import game.card.BeAbleToPutASpell;
import game.card.Card;
import game.card.CombatableCard;
import game.card.heros.HeroCard;
import game.card.minions.MinionCard;
import game.card.spells.SpellCard;
import game.card.weapons.WeaponCard;

public class Player {
	private String name;
	private int maxMana;
	private int hasMana;
	private ArrayList<Card> deck = new ArrayList<Card>();
	private ArrayList<Card> cardsOnHand = new ArrayList<Card>();
	private HeroCard hero;

	public void pickARandomCardFromDeck() {
		//덱에서 카드 한장을 랜덤으로 뽑은  후 cardsOnHand로 보낸다. 
		//뽑은 카드는 deck에서 삭제한다.
		int randomNum = ThreadLocalRandom.current().nextInt(0, deck.size() - 1);
		cardsOnHand.add(deck.get(randomNum));
		deck.remove(randomNum);
	}

	public void putACardInBattleField(Card card) {
		if(hasMana >= card.getCostOfMana()) {
			hasMana -= card.getCostOfMana();
		} else {
			return;
		}
		
		if (card instanceof MinionCard) {
			if(card instanceof BeAbleToPutASpell) {
				((BeAbleToPutASpell) card).spell();
			}
			//배틀필드에 넣자
		} else if (card instanceof SpellCard) {
			((SpellCard) card).spell();
		} else if (card instanceof WeaponCard) {
			hero.setWeaponCard((WeaponCard) card);
		} 
		
	}
	
	public void putACardIntoDeck(Card card) { 
		if(card instanceof HeroCard) {
			System.out.println("영웅 카드는 덱에 넣을 수 없습니다.");
			return ;
		}
		if(deck.size() > 30) {
			System.out.println("덱에는 30장 까지 넣을 수 있습니다.");
			return ;
		}
		deck.add(card);
		System.out.println("총 " + deck.size() + "개의 카드가 덱에 있습니다.");
	}
	
	public void attack(Card myCard, Card enemyCard) {
		((CombatableCard)myCard).attack((CombatableCard)enemyCard);
	}
	
	//setter, getter
	public ArrayList<Card> getDeck() {
		return deck;
	}
	
	public ArrayList<Card> getCardsOnHand() {
		return cardsOnHand;
	}

	public int getMaxMana() {
		return maxMana;
	}
	public void setMaxMana(int maxMana) {
		this.maxMana = maxMana;
	}
	public int getHasMana() {
		return hasMana;
	}
	public void setHasMana(int hasMana) {
		this.hasMana = hasMana;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

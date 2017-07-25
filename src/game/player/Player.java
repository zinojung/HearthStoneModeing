package game.player;

import java.util.LinkedList;
import java.util.List;

import game.cards.BeAbleToPutASpell;
import game.cards.Card;
import game.cards.Deck;
import game.cards.combatable.CombatableCard;
import game.cards.combatable.StatesOfCard;
import game.cards.combatable.heros.HeroCard;
import game.cards.combatable.minions.MinionCard;
import game.cards.spells.SpellCard;
import game.cards.weapons.WeaponCard;

public class Player {
	private String name;
	private Deck deck; 
	private HeroCard hero;
	private int maxMana;
	private int hasMana;
	private List<Card> cardsOnHand = new LinkedList<Card>();
	private List<Card> battleField = new LinkedList<Card>();
	
	public Player(String name, Deck deck) {
		this.name = name;
		this.deck = deck;
        this.hero = deck.getHeroCard();
	}

	public void pickARandomCardFromDeck() {
		//덱에서 카드 한장을 랜덤으로 뽑은  후 cardsOnHand로 보낸다. 
		cardsOnHand.add(deck.returnARandomCard());
	}

	/*	카드를 발동시키는 메서드
	 	낼려는 카드가 어떤 종류인지에 따라 다르게 동작.
		미니언 카드는 battleField 리스트에 넣기
		마법 카드는 주문 발동.
		무기카드는 영웅에게 장착.*/
	public void putACardInBattleField(Card card) {
		if(hasMana < card.getCostOfMana()){
			return;
		} else {
			if (card instanceof MinionCard) {
				if(card instanceof BeAbleToPutASpell) {
					((BeAbleToPutASpell) card).spell();
				}
				battleField.add(card);
			} else if (card instanceof SpellCard) {
				((SpellCard) card).spell();
			} else if (card instanceof WeaponCard) {
				hero.setWeaponCard((WeaponCard) card);
			} 
			this.hasMana -= card.getCostOfMana();
		}
	}

	//영웅이나 하수인을 이용해 적을 공격하는 메서드
	public void attackEnemyCard() {
		//영웅 또는 배틀필드에 있는 하수인 카드를 선택 하여 적의 영웅이나 하수인을 공격
		//하수인이 죽으면 배틀필드에서 빼기
		//영웅이 죽으면 게임끝
	}
	
	//setter, getter
	public Deck getDeck() {
		return deck;
	}
	
	public List<Card> getCardsOnHand() {
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
	public HeroCard getHero() {
		return hero;
	}
}

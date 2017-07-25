package game.cards;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import game.cards.Card;
import game.cards.JobsOfCard;
import game.cards.combatable.heros.HeroCard;

public class Deck {
	private String name;
	private int numberOfCardsInDeck;
	private HeroCard heroCard;
	private JobsOfCard jobOfCard;
	//삭제 및 추가가 잦으므로 LinkedList를 사용합니다.
	private List<Card> cards = new LinkedList<Card>();
	
	public Deck(String name, HeroCard heroCard) {
		this.name = name;
		this.heroCard = heroCard;
		this.jobOfCard = heroCard.getJobOfCard();
	}
	
	public Deck putACardIntoDeck(Card card) {
		if(!isPossiblePuttingACard(card)) {
			cards.add(card);
			numberOfCardsInDeck++;	
		}
		return this;
	}
	
	private boolean isPossiblePuttingACard(Card card) {
		//deck 카드 갯수 검사
		if(numberOfCardsInDeck >= 30) return false;
		//카드 직업검사
		if(card.getJobOfCard() != jobOfCard) return false;
		return true;
	}
	
	public Card returnARandomCard() {
		if(!cards.isEmpty()) {
			int randomNum = ThreadLocalRandom.current().nextInt(0, cards.size() - 1);
			Card card = cards.get(randomNum);
			cards.remove(randomNum);
			return card;
		} else {
			System.out.println("덱에 카드가 없습니다.");
			return null;
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public JobsOfCard getJobOfCard() {
		return jobOfCard;
	}
	public void setJobOfCard(JobsOfCard jobOfCard) {
		this.jobOfCard = jobOfCard;
	}
	public HeroCard getHeroCard() {
		return heroCard;
	}
}

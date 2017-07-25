package game;

import game.cards.Deck;
import game.cards.combatable.heros.GarroshHellscream;
import game.cards.combatable.heros.JainaProudmoore;
import game.cards.combatable.minions.MurlocRaider;
import game.cards.combatable.minions.ShatteredSunCleric;
import game.cards.spells.Execute;
import game.cards.weapons.FieryWarAxe;
import game.matches.Match;
import game.player.Player;

public class Application {
	public static void main(String[] args) {
		//PlayerA 준비
		Deck deckForA = new Deck("마법사댁", JainaProudmoore.getCard());
		deckForA.putACardIntoDeck(MurlocRaider.getCard())
			.putACardIntoDeck(ShatteredSunCleric.getCard())
			.putACardIntoDeck(Execute.getCard())
			.putACardIntoDeck(FieryWarAxe.getCard())
			.putACardIntoDeck(MurlocRaider.getCard())
			.putACardIntoDeck(ShatteredSunCleric.getCard())
			.putACardIntoDeck(Execute.getCard())
			.putACardIntoDeck(FieryWarAxe.getCard())
			.putACardIntoDeck(MurlocRaider.getCard())
			.putACardIntoDeck(ShatteredSunCleric.getCard())
			.putACardIntoDeck(Execute.getCard())
			.putACardIntoDeck(FieryWarAxe.getCard())
			.putACardIntoDeck(MurlocRaider.getCard())
			.putACardIntoDeck(ShatteredSunCleric.getCard())
			.putACardIntoDeck(Execute.getCard())
			.putACardIntoDeck(FieryWarAxe.getCard())
			.putACardIntoDeck(MurlocRaider.getCard())
			.putACardIntoDeck(ShatteredSunCleric.getCard())
			.putACardIntoDeck(Execute.getCard())
			.putACardIntoDeck(FieryWarAxe.getCard())
			.putACardIntoDeck(MurlocRaider.getCard())
			.putACardIntoDeck(ShatteredSunCleric.getCard())
			.putACardIntoDeck(Execute.getCard())
			.putACardIntoDeck(FieryWarAxe.getCard())
			.putACardIntoDeck(MurlocRaider.getCard())
			.putACardIntoDeck(ShatteredSunCleric.getCard())
			.putACardIntoDeck(Execute.getCard())
			.putACardIntoDeck(FieryWarAxe.getCard())
			.putACardIntoDeck(MurlocRaider.getCard())
			.putACardIntoDeck(ShatteredSunCleric.getCard());
		Player playerA = new Player("진호", deckForA);
		
		//PlayerB 준비
		Deck deckForB = new Deck("전사댁", GarroshHellscream.getCard());
		deckForA.putACardIntoDeck(MurlocRaider.getCard())
			.putACardIntoDeck(ShatteredSunCleric.getCard())
			.putACardIntoDeck(Execute.getCard())
			.putACardIntoDeck(FieryWarAxe.getCard())
			.putACardIntoDeck(MurlocRaider.getCard())
			.putACardIntoDeck(ShatteredSunCleric.getCard())
			.putACardIntoDeck(Execute.getCard())
			.putACardIntoDeck(FieryWarAxe.getCard())
			.putACardIntoDeck(MurlocRaider.getCard())
			.putACardIntoDeck(ShatteredSunCleric.getCard())
			.putACardIntoDeck(Execute.getCard())
			.putACardIntoDeck(FieryWarAxe.getCard())
			.putACardIntoDeck(MurlocRaider.getCard())
			.putACardIntoDeck(ShatteredSunCleric.getCard())
			.putACardIntoDeck(Execute.getCard())
			.putACardIntoDeck(FieryWarAxe.getCard())
			.putACardIntoDeck(MurlocRaider.getCard())
			.putACardIntoDeck(ShatteredSunCleric.getCard())
			.putACardIntoDeck(Execute.getCard())
			.putACardIntoDeck(FieryWarAxe.getCard())
			.putACardIntoDeck(MurlocRaider.getCard())
			.putACardIntoDeck(ShatteredSunCleric.getCard())
			.putACardIntoDeck(Execute.getCard())
			.putACardIntoDeck(FieryWarAxe.getCard())
			.putACardIntoDeck(MurlocRaider.getCard())
			.putACardIntoDeck(ShatteredSunCleric.getCard())
			.putACardIntoDeck(Execute.getCard())
			.putACardIntoDeck(FieryWarAxe.getCard())
			.putACardIntoDeck(MurlocRaider.getCard())
			.putACardIntoDeck(ShatteredSunCleric.getCard());
		Player playerB = new Player("하나", deckForB);
	
		Match match = new Match(playerA, playerB);
		//MaxMana, hasMana를 1로 설정
		match.readyToMatch();
		System.out.println("게임을 시작합니다.");
		
		while(true) {
			match.turn(match.getPlayerA());
			if(match.isAnyHeroDead()) return;
			match.turn(match.getPlayerB());
			if(match.isAnyHeroDead()) return;
		}
	}
}

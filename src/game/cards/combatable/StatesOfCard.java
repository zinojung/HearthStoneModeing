package game.cards.combatable;

public enum StatesOfCard {
	LIVE(true), DEAD(false);
	
	boolean deadOrLive;
	StatesOfCard(boolean deadOrLive) {
		this.deadOrLive = deadOrLive;
	}
}

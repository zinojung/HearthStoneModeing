package game.card;

public enum StatesOfCard {
	LIVE(true), DEAD(false);
	
	boolean deadOrLive;
	StatesOfCard(boolean deadOrLive) {
		this.deadOrLive = deadOrLive;
	}
}
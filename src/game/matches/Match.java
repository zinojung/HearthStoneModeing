package game.matches;

import game.player.Player;

public class Match {
	private Player playerA;
	private Player playerB;
	private int round;
	private int maxMana;

	public Match (Player playerA, Player playerB) {
		this.playerA = playerA;
		this.playerB = playerB;
	}
	
	public void readyToMatch() {
		setInitMana();
	}
	
	private void setInitMana() {
		playerA.setHasMana(1);
		playerA.setMaxMana(1);
		playerB.setHasMana(1);
		playerB.setMaxMana(1);
	}
	
	public void turn(Player player) {
		//마나 최대치 증가 시키고, 마나 초기화
		nextRound();
		//카드 한장 뽑기
		player.pickARandomCardFromDeck();
		while(true) {
			//플레이어가 행동, 영웅 주문 또는 카드내기 또는 배틀필드에 있는 하수인 카드로 공격하기
			//턴종료를 누를때까지 반복
		}
	}
	
	private void nextRound() {
		round ++;
		playerA.setMaxMana(getMaxMana() + 1); 
		playerA.setHasMana(getMaxMana());
		playerB.setMaxMana(getMaxMana() + 1);
		playerB.setHasMana(getMaxMana());
	}

	//영웅이 죽었으면 게임 끝내기
	public boolean isAnyHeroDead() {
		if(playerA.getHero().getLife() == 0) {
			System.out.println("승자는 " + playerA.getName() + "입니다.");
			return true;
		} else if (playerB.getHero().getLife() == 0) {
			System.out.println("승자는 " + playerA.getName() + "입니다.");
			return true;
		} else {
			return false;
		}
	}

	//setter, getter
	public Player getPlayerA() {
		return playerA;
	}
	public Player getPlayerB() {
		return playerB;
	}
	public int getRound() {
		return round;
	}
	public void setRound(int round) {
		this.round = round;
	}
	public int getMaxMana() {
		return maxMana;
	}
	public void setMaxMana(int maxMana) {
		this.maxMana = maxMana;
	}
}

package game.card;

//영웅, 하수인, 마법, 무기 카드의 최상위 카드 입니다.
abstract public class Card {
	
	private String name;
	private int costOfMana;
	private	GradesOfCard gradeOfCard;
	private JobsOfCard jobOfCard;
	
	//상속받은 클래스에서 스스로 객체를 만들어 반환합니다.
	abstract public Card getCard();
	
	//Setter, Getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCostOfMana() {
		return costOfMana;
	}
	public void setCostOfMana(int costOfMana) {
		this.costOfMana = costOfMana;
	}
	public GradesOfCard getGradeOfCard() {
		return gradeOfCard;
	}
	public void setGradeOfCard(GradesOfCard gradeOfCard) {
		this.gradeOfCard = gradeOfCard;
	}
	public JobsOfCard getJobOfCard() {
		return jobOfCard;
	}
	public void setJobOfCard(JobsOfCard jobOfCard) {
		this.jobOfCard = jobOfCard;
	}
}

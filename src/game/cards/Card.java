package game.cards;

public class Card {
	
	private String name;
	private int costOfMana; //영웅은 능력 사용시 필요한 마나, 미니언은 가드 사용시 필요한 마나로 사용
	private	GradesOfCard gradeOfCard;
	private JobsOfCard jobOfCard;

	//객체가 반드시 가지고 있어야 하는 속성은 생성자를 통해 받습니다.
	public Card(String name, int costOfMana, GradesOfCard gradeOfCard, JobsOfCard jobOfCard) {
		this.name = name;
		this.costOfMana = costOfMana;
		this.gradeOfCard = gradeOfCard;
		this.jobOfCard = jobOfCard;
	}

	public String getName() {
		return name;
	}
	public int getCostOfMana() {
		return costOfMana;
	}
	public GradesOfCard getGradeOfCard() {
		return gradeOfCard;
	}
	public JobsOfCard getJobOfCard() {
		return jobOfCard;
	}
}

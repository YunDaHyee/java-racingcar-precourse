package racingcar;

public class Car {
	private final int ADVANCE_NUMBER = 4;

	private String name;
	private int position;

	public Car(String name) {
		this.name = name;
		this.position = 0;
	}

	public String getName() {
		return name;
	}

	public int getPosition() {
		return position;
	}

	public ProgressTable go(int value) {
		if (ADVANCE_NUMBER <= value) {
			this.position++;
			return ProgressTable.GO;
		}
		return ProgressTable.STOP;
	}

	public boolean isWinner(int goal) {
		return goal == position;
	}

}

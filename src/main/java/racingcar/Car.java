package racingcar;

public class Car {
	private final int ADVANCE_NUMBER = 4;
	private String name;
	private int position;
	private StringBuilder bar;

	public Car(String name) {
		this.name = name;
		this.position = 0;
		this.bar = new StringBuilder();
	}

	public void setBar(String bar) {
		this.bar.append(bar);
	}

	public String getName() {
		return name;
	}

	public int getPosition() {
		return position;
	}

	public String getBar() {
		return bar.toString();
	}

	public ProgressTable go(int value) {
		if (ADVANCE_NUMBER <= value) {
			this.position++;
			return ProgressTable.GO;
		}
		return ProgressTable.STOP;
	}

	public boolean isWinner(int maxPosition) {
		return maxPosition == position;
	}

}

package racingcar;

import util.ValidationUtil;

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
	
	// public boolean go(int value) { // 객체지향적인 측면을 위해서 이 방법 대신 아래와 같이 구현
	public ProgressTable go(int value) {
		if( ADVANCE_NUMBER<=value ) {
			this.position++;
			return ProgressTable.GO;
		}
		return ProgressTable.STOP;
	}
	
	public boolean isWinner(int goal) {
		return goal == position;
	}
	
}

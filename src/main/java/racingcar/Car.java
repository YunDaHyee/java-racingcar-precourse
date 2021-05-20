package racingcar;

import java.util.function.IntPredicate;

public class Car {
	private final int ADVANCE_NUMBER = 4;
	
	private String carName;
	private int position;
	
	public Car(String carName) {
		this.carName = carName;
		this.position = 0;
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
		//if( this.position == this.goal ) { 
		if( matchPosition(goal) ) { // 리팩토링
			return true;
		}
		return false;
	}

	private boolean matchPosition(int goal) {
		return goal == position;
	}
	
	
}

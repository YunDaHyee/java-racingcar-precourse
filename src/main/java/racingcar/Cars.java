package racingcar;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import util.ValidationUtil;

public class Cars {
	private int maxPosition;
	private final List<Car> cars;
	
	public Cars(String[] names) {	
		cars = new LinkedList<Car>();
		for (int i = 0; i < names.length; i++) {
			this.cars.add(new Car(names[i]));
		}
	}

	private void setMaxPosition() {
		this.maxPosition++;
	}

	private int getRandomValue() {
		return new Random().nextInt(8) + 1;
	}

	private String makeResult(Car thisCar) {
		StringBuilder result = new StringBuilder();
		result.append(thisCar.getName());
		result.append(" : ");
		roulette(thisCar);
		result.append(thisCar.getBar());
		result.append("\n");
		return result.toString();
	}

	private void roulette(Car car) {
		if (car.isGoOrStop(getRandomValue()).isGo()) {
			if (car.isMaxPosition(maxPosition)) {
				setMaxPosition();
			}
			car.setBar("-");
		}
	}

	public String play() {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < cars.size(); i++) {
			result.append(makeResult(cars.get(i)));
		}
		result.append("\n");
		return result.toString();
	}
	
	public String getWinner() {
		StringBuilder winners = new StringBuilder();
		for (int i = 0; i < cars.size(); i++) {
			if (cars.get(i).isWinner(maxPosition)) {
				if( winners.length()!=0 ) {
					winners.append(", ");
				}
				winners.append(cars.get(i).getName());
			}
		}
		return winners.append( "가 최종 우승 했습니다." ).toString();
	}
}

package racingcar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import util.ValidationUtil;

import java.util.List;

public class Cars {
	private int count;
	private int maxPosition;
	private final List<Car> cars;
	
	public Cars(int count, String names) {
		this.count = count;
		this.maxPosition = 0;
		cars =  new LinkedList<Car>();
		String[] splitNames = ValidationUtil.validName(names);
		for( int i=0;i<splitNames.length;i++ ) {
			this.cars.add(new Car(splitNames[i]));
		}
	}
	
	private void setMaxPosition() {
		this.maxPosition++;
	}
	
	private int getRandomValue() {
		return new Random().nextInt(8) + 1;
	}
	
	private boolean isGoal() {
		return maxPosition!=count;
	}
	
	private boolean isMaxPosition(int position) {
		return maxPosition<position;
	}
	
	private String getWinner() {
		//List<String> winners = new ArrayList<String>();
		StringBuilder winners = new StringBuilder();
		for( int i=0;i<cars.size();i++ ) {
			if( cars.get(i).isWinner(count) ){
				winners.append(cars.get(i).getName());
			}
		}

		return winners.toString();
	}
	
	public String play() {
		while(isGoal()){
			for( int j=0;j<cars.size();j++ ) {
				if( cars.get(j).go(getRandomValue()).isGo() ) {
					if( isMaxPosition(cars.get(j).getPosition()) ) {
						setMaxPosition();
					}
				}
			}
		}
		return getWinner();
	}
}


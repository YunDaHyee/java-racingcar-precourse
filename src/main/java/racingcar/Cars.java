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
	private final List<Car> cars;
	
	public Cars(int count, String names) {
		this.count = count;
		cars =  new LinkedList<Car>();
		String[] splitNames = ValidationUtil.validName(names);
		for( int i=0;i<splitNames.length;i++ ) {
			this.cars.add(new Car(splitNames[i]));
		}
		
	}
	
	public List<String> play() {
		//for( int i=0;i<count;i++ ) {
			for( int j=0;j<cars.size();j++ ) {
				cars.get(j).go(randomValue());
			}
		//}
		return getWinner();
	}
	
	private List<String> getWinner() {
		List<String> winners = new ArrayList<String>();
		for( int i=0;i<cars.size();i++ ) {
			if( cars.get(i).isWinner(count) ){
				winners.add(cars.get(i).getName());
			}
		}
		if( winners.isEmpty() ){
			play();
		}
		return winners;
	}
	
	private int randomValue() {
		return new Random().nextInt(8) + 1;
	}
}

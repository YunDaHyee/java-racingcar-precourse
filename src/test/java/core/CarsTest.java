package core;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import racingcar.Cars;

public class CarsTest {
	private Cars cars;

	@BeforeEach
	void setUp() {
		String[] names = {"car1","car2","car3"};
		cars = new Cars(/*5,*/names);
	}

	@Test
	public void name_test() {
		assertThat(cars.play()).contains("car1");
	}
	
	@Test
	public void bar_test() {
		int count = 0;
		StringBuilder sb = new StringBuilder();
		while (count++ < 5) {
			for (int i = 0; i < cars.cars.size(); i++) {
				//sb.append(cars.getBar(cars.cars.get(i)));
			}
		}
		assertThat(sb.toString()).contains("---");
	}
}

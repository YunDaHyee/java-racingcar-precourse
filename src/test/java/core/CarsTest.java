package core;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import racingcar.Cars;

public class CarsTest {
	private Cars cars;
	
	@BeforeEach
	void setUp() {
		cars = new Cars(5,"car1,car2,car3");
	}
	
	@Test
	public void name_test() {
		assertThat(cars.play()).contains("car1");
	}
}


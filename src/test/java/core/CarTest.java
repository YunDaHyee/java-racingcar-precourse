package core;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import racingcar.Car;

public class CarTest {
	private Car car1,car2,car3;
	private int goal;
	
	@BeforeEach
	void setCar() {
		goal = 3;
		car1 = new Car("car1");
		car2 = new Car("car2");
		car3 = new Car("car3");
		for( int i=1;i<=goal;i++ ) {
			car1.go(1);
			car2.go(5);
			car3.go(6);
		}
	}
	
	@Test
	public void go_test() {
		for( int i=1;i<=goal;i++ ) {
			assertThat( car1.go(1).isGo() ).isFalse();
			assertThat( car2.go(5).isGo() ).isTrue();
			assertThat( car3.go(6).isGo() ).isTrue();
		}
	}
	
	@Test
	public void who_is_winner_test() {
		assertThat( car1.isWinner(goal) ).isFalse();
		assertThat( car2.isWinner(goal) ).isTrue();
		assertThat( car3.isWinner(goal) ).isTrue();
	}
	
	
	
	
}

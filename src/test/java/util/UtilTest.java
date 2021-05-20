package util;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 	- 차 이름
		. 5자 이하인가
		. 이름은 쉼표 기준으로 구분
	
	- 횟수
		. 1~N 사이 숫자인가
 */
public class UtilTest {
	@Test
	public void valid_name_length_test() {
		/* ▣ */
		assertThat(ValidationUtil.validName("car1"));
		assertThat(ValidationUtil.validName(" "));
		assertThat(ValidationUtil.validName(""));
		assertThat(ValidationUtil.validName("car22222222222"));
	}
	
	@Test
	public void split_name_test() {
		/* ▣ */
		assertThat(ValidationUtil.validName("car1,car2,car3"));
		
		assertThatThrownBy( () -> {
			ValidationUtil.validName(" ");
			ValidationUtil.validName("");
		}).isInstanceOf(IllegalArgumentException.class).hasMessage("자동차의 이름을 입력해야 합니다.");
		
		
		assertThatThrownBy( () -> {
			ValidationUtil.validName("car1,car2,car32222222222222");
		}).isInstanceOf(IllegalArgumentException.class).hasMessage("자동차의 이름은 1자 이상, 5자 이하여야 합니다.");
	}
	
	@Test
	public void valid_count_test() {
		assertThat(ValidationUtil.validCount(1));
		assertThatThrownBy( () -> {
			ValidationUtil.validCount(0); // TDD C - 1
		}).isInstanceOf(IllegalArgumentException.class).hasMessage("시도할 횟수는 1회 이상이어야 합니다.");
	}

}

package util;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 	- 차 이름
		. 5자 이하인가
		. 이름은 쉼표 기준으로 구분
	
	- 횟수
		. 숫자 아닐 때 NumberFormatException
		. 0~9 사이 숫자인가
 */
public class UtilTest {
	@Test
	public void valid_name_length_test() {
		/*		
		 	assertThat(ValidationUtil.validName("car1")).isTrue(); // TDD 싸이클 2단계 - 성공
			assertThat(ValidationUtil.validName(" ")).isFalse(); // TDD 싸이클 1단계 - 실패 - 공백에 대한 예외처리가 필요하다.
			assertThat(ValidationUtil.validName("")).isFalse(); // TDD 싸이클 1단계
			assertThat(ValidationUtil.validName("car22222222222")).isFalse(); // TDD 싸이클 2단계 - 성공
		*/
		// 공백에 대한 예외를 생성자에서 원시값 포장에 의한 방법으로 처리하기 위해 validName() 삭제
		assertThat(new ValidationUtil("car1"));
		assertThat(new ValidationUtil(" "));
		assertThat(new ValidationUtil(""));
		assertThat(new ValidationUtil("car22222222222"));
	}
	
	@Test
	public void split_name_test() {
		//assertThat(new ValidationUtil("car1,car2,car3")); // TDD 싸이클 1 - 실패
		assertThat(new ValidationUtil("car1,car2,car3")); // TDD 싸이클 2 - 성공 - NameRules.java 로직 수정
		
		assertThatThrownBy( () -> {
			new ValidationUtil(" ");
			new ValidationUtil("");
		}).isInstanceOf(IllegalArgumentException.class).hasMessage("자동차의 이름을 입력해야 합니다.");
		
		
		assertThatThrownBy( () -> {
			assertThat(new ValidationUtil("car1,car2,car32222222222222"));
		}).isInstanceOf(IllegalArgumentException.class).hasMessage("자동차의 이름은 1자 이상, 5자 이하여야 합니다.");
	}
}

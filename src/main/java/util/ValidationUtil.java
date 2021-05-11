package util;

public class ValidationUtil {
	private final static int MAX_LENGTH_COUNT = 9;
	private final static int MIN_LENGTH_COUNT = 0;
	
	private NameRules name; // split_name_test에서의 리팩토링 - 앞서 구현한 name length 뿐만 아니라 split의 규칙도 추가하기 위해 변경
	
	public ValidationUtil(String name) {
		/*
		// 생성자에서 공백일 때의 예외처리하고자 한다면, 이렇게 하지말고 객체지향생활체조 원칙의 원시값 포장을 사용함.
		if(name.isBlank()) {
			throw new Exception("zz");
		}
		*/
		
		this.name = new NameRules(name);
	}
	
	/*
	TDD 싸이클 3단계 - 리팩토링 : 원시값 포장에 의한 예외처리로 생성자에서 처리하도록 하기 위해 validName() 삭제
	public static boolean validName(String name) {
		// return false; // TDD 싸이클 1단계 - 실패	
		//if( name.length()>0 && name.length()<=5 ){ // TDD 싸이클 2단계 - 성공	
//		if( name.length()>MIN_LENGTH_NAME && name.length()<=MAX_LENGTH_NAME ){ // TDD 싸이클 3단계 - 리팩토링 : 상수로 변경
//			return true;
//		}
//		return false;
		
		return name; // TDD 싸이클 3단계 - 리팩토링
	}
	 */
}

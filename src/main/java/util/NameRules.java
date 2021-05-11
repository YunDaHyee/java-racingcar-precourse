package util;

//split_name_test에서의 리팩토링 - 앞서 구현한 name length 뿐만 아니라 split의 규칙도 추가하기 위해 클래스명 변경
public class NameRules {
	private String[] names;
	
	private final static int MIN_LENGTH_NAME = 0;
	private final static int MAX_LENGTH_NAME = 5;
	
	public NameRules(String rawName) {
		if( rawName.isBlank() ) {
			throw new IllegalArgumentException("자동차의 이름을 입력해야 합니다.");
		}
		
		for( String name : rawName.split(",") ) {
			if(name.length() <= MIN_LENGTH_NAME || name.length() > MAX_LENGTH_NAME) {
				throw new IllegalArgumentException("자동차의 이름은 1자 이상, 5자 이하여야 합니다.");
			}
		}
		
		this.names = rawName.split(",");
	}
}

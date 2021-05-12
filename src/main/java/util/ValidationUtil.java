package util;

public class ValidationUtil {
	private final static int MAX_LENGTH_COUNT = 9;
	private final static int MIN_LENGTH_COUNT = 0;
	
	// TDD 싸이클 3단계 - 리팩토링 : ▣
	public static String[] validName(String name) {
		return new NameRules(name).names;
	}
}

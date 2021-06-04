package util;

public class ValidationUtil {

	// TDD 싸이클 3단계 - 리팩토링 : ▣
	public static String[] validName(String name) {
		return new NameRules(name).names;
	}

	public static int validCount(String count) {
		return new CountRules(count).count;
	}
}

package util;

public class CountRules {
	private final static int MIN_LENGTH_COUNT = 1;

	public int count;

	public CountRules(String rawCount) {
		
		if (!Character.isDigit(rawCount.charAt(0))) {
			throw new NumberFormatException("숫자만 입력해야합니다.");
		}

		int count = Integer.parseInt(rawCount);
		
		if (count < MIN_LENGTH_COUNT) {
			throw new IllegalArgumentException("시도할 횟수는 1회 이상이어야 합니다.");
		}
		this.count = count;
	}
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import racingcar.Cars;

public class StartingLine {
	public static void main(String args[]) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));

		print.write("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분\n");
		String names = input.readLine();
		print.write("시도할 회수는 몇 회인가요?");
		int count = Integer.parseInt(input.readLine());
		Cars cars = new Cars(count, names);
		print.write("실행 결과");

	}
}

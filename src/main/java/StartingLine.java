import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import racingcar.Cars;
import util.ValidationUtil;

public class StartingLine {
	private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));

	private static void printContent(String content) throws IOException {
		print.write(content);
		print.flush();
	}
	
	public static void main(String args[]) throws IOException {
		printContent("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분\n");
		String[] names = ValidationUtil.validName(input.readLine());
		
		printContent("시도할 회수는 몇 회인가요?\n");
		int count = ValidationUtil.validCount(input.readLine());
		
		Cars cars = new Cars(names);
		
		for( int i=0;i<count;i++ ) {
			printContent(cars.play());
		}
		
		printContent( cars.getWinner() );
		
		print.close();
		input.close();
	}
	
}

package java_chobo2.ch14.stream;

import java.util.Arrays;
import java.util.stream.Stream;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class StreamFlatMapEx {

	public static void main(String[] args) {
		String[][] strArrs = {
				{"abc", "def", "jkl"},
				{"ABC", "GHI", "JKL"}
		};

		Stream<String[]> strArrStream = Stream.of(strArrs);
		Stream<Stream<String>> strStreamStream = strArrStream.map(Arrays::stream);

		strArrStream = Stream.of(strArrs);
		Stream<String> strStream = strArrStream.flatMap(Arrays::stream);
		strStream.map(String::toLowerCase)
		.distinct()
		.sorted()
		.forEach(System.out::println);
		System.out.println();
		
	}

}

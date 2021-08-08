package com.obydul.stream;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class StreamCount {
	public static void main(String[] args) {
		Stream<Integer> inStream = Stream.of(1, 2, 3, 4, 5);
		long quantity = inStream.count();
		System.out.println(quantity);

		try {
			List<String> lines = Files.readAllLines(Paths.get("word.txt"));
			long wordCount = lines.stream().map(line -> line.split("(?<=[,.])|(?=[,.])|\\s+")).flatMap(Stream::of)
					.count();
			System.out.println(wordCount);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

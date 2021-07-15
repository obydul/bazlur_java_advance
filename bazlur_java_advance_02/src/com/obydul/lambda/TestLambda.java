package com.obydul.lambda;

public class TestLambda {
	public static void main(String[] args) {
		Converter upperCaseConverter = (String s) -> s.toUpperCase();
		String name = upperCaseConverter.apply("Abdullah");
		System.out.println(name);

		Converter lowerCaseConverter = (String s) -> s.toLowerCase();
		Converter trimmer = (String s) -> s.trim();

		String name2 = lowerCaseConverter.apply("Obydul");
		String name3 = trimmer.apply("  Md Obydul islam   ");
		System.out.println(name2);
		System.out.println(name3);

		Converter titleCaseConverter = (String s) -> {
			StringBuilder sb = new StringBuilder();
			boolean nextTitleCase = true;

			for (char c : s.toCharArray()) {
				if (Character.isSpaceChar(c)) {
					nextTitleCase = true;
				} else if (nextTitleCase) {
					c = Character.toTitleCase(c);
					nextTitleCase = false;
				}
				sb.append(c);
			}
			return sb.toString();
		};

		String name4 = titleCaseConverter.apply("Abdullah al basit");
		System.out.println(name4);

	}
}

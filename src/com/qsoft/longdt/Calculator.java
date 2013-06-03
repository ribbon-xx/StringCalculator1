package com.qsoft.longdt;

import static ch.lambdaj.Lambda.convert;
import static ch.lambdaj.Lambda.sum;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ch.lambdaj.function.convert.Converter;

public class Calculator {
	public static int add(String input) {
		if (input.isEmpty()) {
			return 0;
		} else {
			String[] tokens = tokenize(input);
			List<Integer> numbers = convert(tokens, toInt());
			return sum(numbers).intValue();
		}
	}

	private static String[] tokenize(String input) {
		if (useCustomDelimiter(input)) {
			return splitUsingCustomDelimiter(input);
		} else {
			return splitUsingNewLineAndComma(input);
		}
	}

	private static boolean useCustomDelimiter(String input) {
		return input.startsWith("//");
	}

	private static String[] splitUsingNewLineAndComma(String input) {
		String[] tokens = input.split(",|\n");
		return tokens;
	}

	private static String[] splitUsingCustomDelimiter(String input) {
		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(input);
		m.matches();
		String customDelimiter = m.group(1);
		String numbers = m.group(2);
		return numbers.split(Pattern.quote(customDelimiter));
	}

	private static Converter<String, Integer> toInt() {
		return new Converter<String, Integer>() {

			@Override
			public Integer convert(String arg0) {
				return toInt(arg0);
			}
		};
	}

	private static int toInt(String input) {
		return Integer.parseInt(String.valueOf(input));
	}

	public static void main(String[] args) {
		add("//;\n1;2");
	}
}

package com.qsoft.longdt;

import static ch.lambdaj.Lambda.*;

import java.util.List;

import ch.lambdaj.function.convert.Converter;

public class Calculator {
	public static int add(String input) {
		if (input.isEmpty()) {
			return 0;
		} else if (input.contains(",")) {
			String[] tokens = tokenize(input);
			List<Integer> numbers = convert(tokens, toInt());
			return sum(numbers).intValue();
		} else {
			return Integer.parseInt(input);
		}
	}

	private static String[] tokenize(String input) {
		String[] tokens = input.split(",|\n");
		return tokens;
	}

	private static Converter<String, Integer> toInt() {
		return new Converter<String, Integer>() {

			@Override
			public Integer convert(String arg0) {
				// TODO Auto-generated method stub
				return toInt(arg0);
			}
		};
	}

	private static int toInt(String input) {
		return Integer.parseInt(String.valueOf(input));
	}
}

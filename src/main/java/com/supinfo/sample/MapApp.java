package com.supinfo.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapApp {

	public static void main(String[] args) {

		java8();
	}

	public static void java7() {

		List<String> alpha = Arrays.asList("a", "b", "c", "d");

		List<String> alphaUpper = new ArrayList<>();
		for (String s : alpha) {
			alphaUpper.add(s.toUpperCase());
		}

		System.out.println(alpha);
		System.out.println(alphaUpper);

	}


	public static void java8() {

		List<String> alpha = Arrays.asList("a", "b", "c", "d");

		List<String> alphaMajuscule = alpha.stream()
									.map(String::toUpperCase)
									.collect(Collectors.toList());

		alphaMajuscule.forEach(System.out::println);

	}



}

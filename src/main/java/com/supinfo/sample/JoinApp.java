package com.supinfo.sample;

import com.supinfo.sample.entities.Game;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinApp {

	public static void main(String[] args) {
		test();
	}

	static void test() {

		List<Game> list = Arrays.asList(
			Game.builder()
				.name("Dragon Blaze")
				.ranking(5)
				.build(),
			Game.builder()
				.name("Angry Bird")
				.ranking(5)
				.build(),
			Game.builder()
				.name("Candy Crush")
				.ranking(5)
				.build()
		);

		//{Dragon Blaze, Angry Bird, Candy Crush}
		String result = list.stream()
							.map(Game::getName)
							.collect(Collectors.joining(", ", "{", "}"));


		System.out.println(result);

	}
}

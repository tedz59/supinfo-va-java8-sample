package com.supinfo.sample;

import com.supinfo.sample.entities.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public class SortingApp {

	public static void main(String[] args) {
		sortJava8();
	}

	public static void sortJava7() {

		List<Person> persons = getPersons();

		System.out.println("Before Sort");
		for (Person developer : persons) {
			System.out.println(developer);
		}

		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getBirthdate()
						 .compareTo(o2.getBirthdate());
			}
		});

		System.out.println("After Sort");
		for (Person person : persons) {
			System.out.println(person);
		}

	}

	public static void sortJava8() {
		List<Person> persons = getPersons();

		System.out.println("Before Sort");
		persons.forEach(System.out::println);

		List<Person> sortedList = persons.stream()
										 .sorted(Comparator.comparing(Person::getBirthdate))
										 .collect(Collectors.toList());

		System.out.println("After Sort");
		sortedList.forEach(System.out::println);

	}

	private static List<Person> getPersons() {

		List<Person> result = new ArrayList<>();

		result.add(Person.builder()
						 .firstname("Jean")
						 .lastname("Bonneau")
						 .birthdate(LocalDate.of(2001, 1, 5))
						 .build());

		result.add(Person.builder()
						 .firstname("Alain")
						 .lastname("Cruste")
						 .birthdate(LocalDate.of(1990, 1, 5))
						 .build());

		result.add(Person.builder()
						 .firstname("Mika")
						 .lastname("Doe")
						 .birthdate(LocalDate.of(1996, 1, 5))
						 .build());

		result.add(Person.builder()
						 .firstname("Alex")
						 .lastname("Terrieur")
						 .birthdate(LocalDate.of(2003, 1, 5))
						 .build());

		return result;

	}

}

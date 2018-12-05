package com.supinfo.sample.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@ToString
public class Person {

	private String firstname;
	private String lastname;
	private LocalDate birthdate;

}

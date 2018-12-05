package com.supinfo.sample.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Game {
	String name;
	int ranking;
}

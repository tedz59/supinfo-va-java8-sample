package com.supinfo.sample.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Portal {

	private String univers;
	private String sousUnivers;
	private String famille;
	private String portalId;

}

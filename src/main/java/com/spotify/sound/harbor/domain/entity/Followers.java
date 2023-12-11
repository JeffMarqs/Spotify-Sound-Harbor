package com.spotify.sound.harbor.domain.entity;

import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Followers {

	@Nullable
	private String href;
	private Integer total;
}

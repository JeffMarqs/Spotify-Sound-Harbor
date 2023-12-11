package com.spotify.sound.harbor.domain.entity;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Images {
	
	@NonNull
	private String url;
	@NonNull
	@Nullable
	private Integer height;
	@NonNull
	@Nullable
	private Integer width;

}

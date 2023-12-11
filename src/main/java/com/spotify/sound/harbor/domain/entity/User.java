package com.spotify.sound.harbor.domain.entity;

import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class User {
	
	private String country;
	private String displayName;
	private String email;
	private ExplicitContent explicitContent;
	private ExternalUrls externalUrls;
	private Followers followers;
	private String href;
	private String id;
	private List<Images> images;
	private String product;
	private String type;
	private String url;

}

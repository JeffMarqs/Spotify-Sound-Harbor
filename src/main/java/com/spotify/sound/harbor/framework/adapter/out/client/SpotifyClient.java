package com.spotify.sound.harbor.framework.adapter.out.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.spotify.sound.harbor.domain.entity.User;

@FeignClient(name = "SpotifyClient", url = "https://api.spotify.com")
public interface SpotifyClient {
	
	@GetMapping(value = "/v1/me")
	public User getUser(@RequestHeader("Authorization") String authorization);

}

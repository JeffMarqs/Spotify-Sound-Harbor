package com.spotify.sound.harbor.framework.adapter.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spotify.sound.harbor.application.port.out.SpotifyPortOut;
import com.spotify.sound.harbor.domain.entity.User;
import com.spotify.sound.harbor.framework.adapter.out.client.SpotifyClient;

@Service
public class SpotifyOut implements SpotifyPortOut {
	
	@Autowired
	SpotifyClient spotifyClient;

	@Override
	public User getUser(String authorization) {
		
		var user = spotifyClient.getUser(authorization);
		return user;
	}

}

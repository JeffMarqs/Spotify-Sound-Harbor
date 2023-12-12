package com.spotify.sound.harbor.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spotify.sound.harbor.application.port.in.SpotifyUserCase;
import com.spotify.sound.harbor.application.port.out.SpotifyPortOut;
import com.spotify.sound.harbor.domain.entity.dto.UserDTO;

@Service
public class SpotifyUserCaseImpl implements SpotifyUserCase {
	
	@Autowired
	SpotifyPortOut spotifyPortOut;

	@Override
	public UserDTO getUser(String authorization) {
		var user = spotifyPortOut.getUser(authorization);
		var userDTO = new UserDTO(user.getDisplayName(), user.getCountry(), user.getEmail(), user.getType(), user.getId(), user.getUrl());
		return userDTO;
	}

}

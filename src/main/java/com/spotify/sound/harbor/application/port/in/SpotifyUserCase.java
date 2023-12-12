package com.spotify.sound.harbor.application.port.in;

import com.spotify.sound.harbor.domain.entity.dto.UserDTO;

public interface SpotifyUserCase {

	UserDTO getUser(String authorization, String userId);

}

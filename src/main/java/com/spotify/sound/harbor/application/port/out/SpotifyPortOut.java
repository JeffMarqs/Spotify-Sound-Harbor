package com.spotify.sound.harbor.application.port.out;

import com.spotify.sound.harbor.domain.entity.User;

public interface SpotifyPortOut {

	User getUser(String authorization);

}

package com.spotify.sound.harbor.framework.adapter.in;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spotify.sound.harbor.application.port.in.SpotifyUserCase;
import com.spotify.sound.harbor.domain.entity.dto.UserDTO;

@RestController
@RequestMapping("/spotify")
public class SoundHarborController {
	
	@Autowired
	SpotifyUserCase spotifyUserCase;
	
	@GetMapping("/user/{userId}")
	ResponseEntity<UserDTO> getUser(@RequestHeader ("Authorization") String authorization, @PathVariable("userId") String userId){
		
		UserDTO userDTO = spotifyUserCase.getUser(authorization, userId);
		
		return ResponseEntity.ok().body(userDTO);
	}

}

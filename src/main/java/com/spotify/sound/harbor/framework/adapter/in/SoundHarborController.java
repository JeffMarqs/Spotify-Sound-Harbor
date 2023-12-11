package com.spotify.sound.harbor.framework.adapter.in;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spotify.sound.harbor.domain.entity.dto.UserDTO;

@RestController
@RequestMapping("/spotify")
public class SoundHarborController {
	
	@GetMapping("/user")
	ResponseEntity<UserDTO> getUser(){
		
		return null;
	}

}

package com.yongbum.board.service;

import org.springframework.stereotype.Service;

import com.yongbum.board.dto.auth.AuthPostDto;
import com.yongbum.board.dto.auth.LoginDto;
import com.yongbum.board.dto.response.ResponseDto;


@Service
public class AuthService {
	
	public ResponseDto<LoginDto> login(AuthPostDto dto) {
		LoginDto result = new LoginDto("jwt", 3600000);
		return ResponseDto.setSuccess("", result);
	}

}

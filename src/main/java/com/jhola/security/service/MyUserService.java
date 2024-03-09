package com.jhola.security.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhola.security.dto.DTO;
import com.jhola.security.model.Model;
import com.jhola.security.repository.UserRepository;


@Service
public class MyUserService {
	

@Autowired
private UserRepository repo;
	@Autowired
	private ModelMapper modelMapper;

	public boolean registerUser(DTO dto) {
		
		Model map = modelMapper.map(dto, Model.class);
		
//		repo.save(map);
		
		return true;
		
	}
	
}

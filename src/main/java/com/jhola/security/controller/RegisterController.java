//package com.jhola.security.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.qtechlabs.employeemanagement.dto.DTO;
//import com.qtechlabs.employeemanagement.service.MyUserService;
//
//@RestController
//@RequestMapping("api/v1")
//public class RegisterController {
//
//	@Autowired
//	private MyUserService service;
//	
//    @CrossOrigin
//    @PostMapping("/register")
//    public ResponseEntity<String> registerUser( @RequestBody DTO dto) {
//      
//         service.registerUser(dto);
//      
//
//        return new ResponseEntity<>("created", HttpStatus.CREATED);
//    }
//	
//}

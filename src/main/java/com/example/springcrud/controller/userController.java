package com.example.springcrud.controller;

import com.example.springcrud.dto.userDto;
import com.example.springcrud.entity.user;
import com.example.springcrud.service.userService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.modelmapper.ModelMapper;

@RestController()
@RequestMapping("api")
public class userController {
    @Autowired
    private userService userSV;

    @PostMapping("user")
    public ResponseEntity<Object> createUser(@RequestBody userDto userDto) throws JsonProcessingException {
        ModelMapper modelMapper = new ModelMapper();
        user userEntity=modelMapper.map(userDto, user.class);
        return new ResponseEntity<Object>(userSV.save(userEntity), HttpStatus.OK);
    }

    @GetMapping("user")
    public ResponseEntity<Object> listUser() throws JsonProcessingException {
        return new ResponseEntity<Object>(userSV.findAll(), HttpStatus.OK);
    }

    @PutMapping("user")
    public ResponseEntity<Object> updateUser(@RequestBody user userEntity) throws JsonProcessingException {
        return new ResponseEntity<Object>(userSV.save(userEntity), HttpStatus.OK);
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Object> remove(@PathVariable("id") Long id) {
        this.userSV.deleteById(id);
        return new ResponseEntity<Object>(null, HttpStatus.OK);
    }

}

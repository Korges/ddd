package com.korges.banksystem.controller;

import com.korges.banksystem.user.UserInputDto;
import com.korges.banksystem.jpa.adapter.UserFacade;
import com.korges.banksystem.user.UserOutputDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/user")
@RestController
public class UserController {

    private final UserFacade userFacade;

    @PostMapping
    public ResponseEntity<UserOutputDto> createNewUser(@RequestBody UserInputDto userInputDTO) {
        UserOutputDto response = userFacade.createNewUser(userInputDTO);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserOutputDto> findUserAccountById(@PathVariable long id) {
        UserOutputDto response = userFacade.findUserById(id);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/{id}/suspend")
    public void suspendUserAccount() {

    }

    @PostMapping("/{id}/activate")
    public void activateUserAccount() {

    }
}

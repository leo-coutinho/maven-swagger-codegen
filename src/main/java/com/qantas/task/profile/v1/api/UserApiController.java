package com.qantas.task.profile.v1.api;

import com.qantas.task.profile.v1.model.UserRequest;
import com.qantas.task.profile.v1.model.UserResponse;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-17T11:50:16.623+10:00")

@RestController
public class UserApiController implements UserApi {



    public ResponseEntity<UserResponse> addUserProfile(@ApiParam(value = "Profile object that needs to be added" ,required=true )  @Valid @RequestBody UserRequest body) {
        // do some magic!

        return new ResponseEntity<UserResponse>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteUserProfile(@ApiParam(value = "ID of user to delete",required=true ) @PathVariable("userId") String userId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updateUserProfile(@ApiParam(value = "ID of user to return",required=true ) @PathVariable("userId") String userId,
        @ApiParam(value = "Profile object that needs to be updated" ,required=true )  @Valid @RequestBody UserRequest body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}

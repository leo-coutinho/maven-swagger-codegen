package com.qantas.task.profile.v1.api;

import com.qantas.task.profile.v1.model.UserRequest;
import com.qantas.task.profile.v1.model.UserResponse;

import com.qantas.task.profile.v1.service.UserProfileServices;
import io.swagger.annotations.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-17T11:50:16.623+10:00")

@RestController
public class UserApiController implements UserApi {

    @Autowired
    private UserProfileServices userProfileServices;
    private UserResponse userResponse;

    public UserApiController() {
        userProfileServices = new UserProfileServices();
    }


    public ResponseEntity<UserResponse> addUserProfile(@ApiParam(value = "Profile object that needs to be added" ,required=true )  @Valid @RequestBody UserRequest body) {

        // Call a Service to handle database transactions or other API calls.

        userResponse = userProfileServices.addUserProfile(body);

        return ResponseEntity.ok(userResponse);
    }

    public ResponseEntity<Void> deleteUserProfile(@ApiParam(value = "ID of user to delete",required=true ) @PathVariable("userId") String userId) {

        userProfileServices.deleteUserProfile(userId);

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updateUserProfile(@ApiParam(value = "ID of user to return",required=true ) @PathVariable("userId") String userId,
        @ApiParam(value = "Profile object that needs to be updated" ,required=true )  @Valid @RequestBody UserRequest body) {

        userProfileServices.updateUserProfile(userId,body);

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}

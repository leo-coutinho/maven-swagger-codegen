package com.qantas.task.profile.v1.service;


import com.qantas.task.profile.v1.model.Address;
import com.qantas.task.profile.v1.model.UserRequest;
import com.qantas.task.profile.v1.model.UserResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

// This service could be use to make calls to local repositories or calls to an external API.


@Component
public class UserProfileServices {

    private final Logger log = LoggerFactory.getLogger(getClass());

    private UserResponse response;

    public UserProfileServices() {

        response = new UserResponse();
    }

    public UserResponse addUserProfile(UserRequest userRequest) {

        response.setId("1");
        response.setFirstName(userRequest.getFirstName());
        response.setLastName(userRequest.getLastName());
        response.setDateOfBirth(userRequest.getDateOfBirth());
        response.setEmailAddress(userRequest.getEmailAddress());
        response.setBusinessAddress(userRequest.getBusinessAddress());
        response.setHomeAddress(userRequest.getHomeAddress());


        return response;


    }

    public void deleteUserProfile( String userId) {

        log.trace("User profile for Id = " + userId + "will be deleted!");

    }

    public void updateUserProfile( String userId, UserRequest userRequest) {

        log.trace("Updating User profile for Id = " + userId + " and UserName " + userRequest.getFirstName());

    }

}

package service;

import com.qantas.task.profile.v1.model.Address;
import com.qantas.task.profile.v1.model.UserRequest;
import com.qantas.task.profile.v1.model.UserResponse;
import com.qantas.task.profile.v1.service.UserProfileServices;
import org.joda.time.LocalDate;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class UserProfileServiceTest {

    @Autowired
    private UserRequest userRequest;
    private UserResponse userResponse;
    private Address address;
    private UserProfileServices userProfileServices;


    @Before
    public void setUp()  {

        address = new Address();
        userRequest = new UserRequest();
        userResponse = new UserResponse();
        userProfileServices = new UserProfileServices();

    }

    @Test
    public void testAddUserProfile() {

        LocalDate dateOfBirthday = LocalDate.parse("1970-12-20");
        Address populatedAddress =  populateAddress(address);

        userRequest.setBusinessAddress(populatedAddress);
        userRequest.setHomeAddress(populatedAddress);
        userRequest.setDateOfBirth(dateOfBirthday);
        userRequest.setEmailAddress("theonly@hotmail.com");
        userRequest.setFirstName("Leo");
        userRequest.setLastName("Coutinho");

        userResponse = userProfileServices.addUserProfile(userRequest);
        assertEquals("Coutinho", userResponse.getLastName());
        assertEquals("1", userResponse.getId());


    }


    private Address populateAddress(Address address) {

        address.setFloorNumber("2");
        address.setFloorType("Business floor");
        address.setPostcode("2032");
        address.setState("NSW");
        address.setStreetName("Jellicoe");
        address.setStreetNumber("15");
        address.setStreetType("Avenue");
        address.setSuburb("Kingsford");
        address.setUnitNumber("Not applicable");
        address.setUnitType("House");

        return address;


    }

}

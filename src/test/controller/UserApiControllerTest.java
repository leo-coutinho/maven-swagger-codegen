package controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import com.qantas.task.profile.v1.api.UserApiController;
import com.qantas.task.profile.v1.model.Address;
import com.qantas.task.profile.v1.model.UserRequest;
import com.qantas.task.profile.v1.model.UserResponse;
import org.joda.time.LocalDate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.http.server.reactive.MockServerHttpRequest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.validation.Valid;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertTrue;


@RunWith(SpringJUnit4ClassRunner.class)

@WebAppConfiguration

public class UserApiControllerTest {

    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;

    private UserApiController userApiController;
    private UserRequest userRequest;
    private UserResponse userResponse;
    private Address address;

    private static final String URL_PREFIX = "http://localhost:8080/";

    private RequestSpecification givenAuth() {
        return RestAssured.given()
                .auth()
                .basic("user", "userPass");
    }


    @Before
    public void setUp()  {

        DefaultMockMvcBuilder builder = MockMvcBuilders.webAppContextSetup(this.wac);
        this.mockMvc = builder.build();

        address = new Address();
        userRequest = new UserRequest();
        userResponse = new UserResponse();

    }

    @After
    public void tearDown() {
    }


    @Test
    public void whenTry_thenOK() {

        final Response response = givenAuth().get(URL_PREFIX );
        assertEquals(200, response.statusCode());
        System.out.println(response.asString());

    }

    @Test
    public void testAddUserProfile() throws Exception {

        MockMvc mvc = MockMvcBuilders.webAppContextSetup(wac).build(); // was is a web application context.
        LocalDate dateOfBirthday = LocalDate.parse("1970-12-20");
        Address populatedAddress =  populateAddress(address);

        userRequest.setBusinessAddress(populatedAddress);
        userRequest.setDateOfBirth(dateOfBirthday);
        userRequest.setEmailAddress("theonly@hotmail.com");
        userRequest.setFirstName("Leo");
        userRequest.setLastName("Coutinho");

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(userRequest);

        MockHttpServletRequestBuilder builder =
                MockMvcRequestBuilders.post(URL_PREFIX + "user")
                        .header("Body",
                                jsonString)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(jsonString);


        this.mockMvc.perform(builder)
                .andExpect(MockMvcResultMatchers.status()
                        .is4xxClientError())
                .andDo(MockMvcResultHandlers.print());



    }

    @Test
    public void testDeleteUserProfile() throws Exception {

        String userId = "1";

        MockHttpServletRequestBuilder builder =
                MockMvcRequestBuilders.delete(URL_PREFIX + "user/")
                        .header("testHeader",
                                "headerValue")
                        .contentType(MediaType.APPLICATION_JSON)
                        .param("userId", userId);


        this.mockMvc.perform(builder)
                .andExpect(MockMvcResultMatchers.status()
                        .is4xxClientError())
                .andDo(MockMvcResultHandlers.print());



    }

    @Test
    public void testUpdateUserProfile() throws Exception {

        String userId = "2";
        MockMvc mvc = MockMvcBuilders.webAppContextSetup(wac).build(); // was is a web application context.
        LocalDate dateOfBirthday = LocalDate.parse("1970-12-20");
        Address populatedAddress =  populateAddress(address);

        userRequest.setBusinessAddress(populatedAddress);
        userRequest.setDateOfBirth(dateOfBirthday);
        userRequest.setEmailAddress("theonly@hotmail.com");
        userRequest.setFirstName("Leo");
        userRequest.setLastName("Coutinho");

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(userRequest);

        MockHttpServletRequestBuilder builder =
                MockMvcRequestBuilders.put(URL_PREFIX + "user/")
                        .header("Body",
                                jsonString)
                        .contentType(MediaType.APPLICATION_JSON)
                        .param("userId", userId)
                        .content(jsonString);



        this.mockMvc.perform(builder)
                .andExpect(MockMvcResultMatchers.status()
                        .is4xxClientError())
                .andDo(MockMvcResultHandlers.print());








    }

    public Address populateAddress(Address address) {

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
//    @Override
//    public ResponseEntity<UserResponse> addUserProfile(@Valid UserRequest body) {
//        return null;
//    }
//

    public ResponseEntity<Void> deleteUserProfile(String userId) {
        return null;
    }


    public ResponseEntity<Void> updateUserProfile(String userId, @Valid UserRequest body) {
        return null;
    }
}
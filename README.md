# Swagger generated server

Spring Boot Server 


## Overview  
This server was generated by an API Swagger contract definition.     
The server stub was generated by the Swagger CodeGen.  
Documentation is automatically created during the creation of the REST API.   
This is an example of building a swagger-enabled server in Java using the SpringBoot framework.    
The UserApiController was auto-generated, it extends Interface UserApi.
A UserProfileServices has been created for the purpose of making calls to a CRM API or   
to implement a local database.   
  
Bellow are the API's handled by the generated controller:    
       
```$xslt
   
   * POST /user   
     * user Schema UserRequest:   
        {
          "businessAddress": {
            "floorNumber": "string",
            "floorType": "string",
            "postcode": "string",
            "state": "string",
            "streetName": "string",
            "streetNumber": "string",
            "streetType": "string",
            "suburb": "string",
            "unitNumber": "string",
            "unitType": "string"
          },
          "dateOfBirth": "1970-12-20",
          "emailAddress": "theonlyleo@hotmail.com",
          "firstName": "Leo",
          "homeAddress": {
            "floorNumber": "string",
            "floorType": "string",
            "postcode": "string",
            "state": "string",
            "streetName": "string",
            "streetNumber": "string",
            "streetType": "string",
            "suburb": "string",
            "unitNumber": "string",
            "unitType": "string"
          },
          "id": "string",
          "lastName": "Coutinho"
        }   
           
       * UserResponse   
          *  201 successful operation   
             Schema:   
                {
                  "businessAddress": {
                    "floorNumber": "string",
                    "floorType": "string",
                    "postcode": "string",
                    "state": "string",
                    "streetName": "string",
                    "streetNumber": "string",
                    "streetType": "string",
                    "suburb": "string",
                    "unitNumber": "string",
                    "unitType": "string"
                  },
                  "dateOfBirth": "1970-12-20",
                  "emailAddress": "theonlyleo@hotmail.com",
                  "firstName": "Leo",
                  "homeAddress": {
                    "floorNumber": "string",
                    "floorType": "string",
                    "postcode": "string",
                    "state": "string",
                    "streetName": "string",
                    "streetNumber": "string",
                    "streetType": "string",
                    "suburb": "string",
                    "unitNumber": "string",
                    "unitType": "string"
                  },
                  "id": "string",
                  "lastName": "Coutinho"
                }   
                   
             *  400 Invalid input.   
                
             *  401 Unauthorized.   
                
             *  404 Not Found.   
                
             *  500 Internal Server error.   
                            
                  
              
   * DELETE /user/{userID}    
     * Request Parameter ID of user to Delete.   
        
     * Response Message :   
       * 200  OK   
          
       * 204  No Content   
          
       * 400  Invalid ID supplied   
          
       * 401  Unauthorized   
          
       * 403  Forbidden   
          
       * 404  User not found              
       
   * PUT /user/{userID}  
     * Request Parameter ID of user to be Updated.   
         * user Schema UserRequest:   
               {
                 "businessAddress": {
                     "floorNumber": "string",
                     "floorType": "string",
                     "postcode": "string",
                     "state": "string",
                     "streetName": "string",
                     "streetNumber": "string",
                     "streetType": "string",
                     "suburb": "string",
                     "unitNumber": "string",
                     "unitType": "string"
                   },
                   "dateOfBirth": "1970-12-20",
                   "emailAddress": "theonlyleo@hotmail.com",
                   "firstName": "Leo",
                   "homeAddress": {
                     "floorNumber": "string",
                     "floorType": "string",
                     "postcode": "string",
                     "state": "string",
                     "streetName": "string",
                     "streetNumber": "string",
                     "streetType": "string",
                     "suburb": "string",
                     "unitNumber": "string",
                     "unitType": "string"
                   },
                   "id": "string",
                   "lastName": "Coutinho"
                 }   
                    
              * Response Message :   
                * 200  OK    
                   
                * 201  Created        
                   
                * 400  Invalid input     
                   
                * 401  Unauthorized   
                   
                * 403  Forbidden   
                   
                * 404  User not found   
                   
                * 405  Validation exception   
                                   
                  
```   
 


Start your server as a simple java application.  

You can view the api documentation in swagger-ui by pointing to  
http://localhost:8080/    

Change default port value in application.properties.   
   
## Scenario   
   
A new project is initiating within the organisation.   
The objective of the project is to enable the customers of the organisation    
to manage their profile (end to end i.e. create, update and delete) through   
web channel and mobile (app) channel.   
Being a senior member within the API team, you have been tasked to deliver:   

* APIs that can be consumed by mobile apps   

* APIs that can be consumed by web channel   

The backend system is an enterprise CRM and is not yet ready to expose REST APIs.   
The CRM team is in the process of designing their REST APIs.   
   
## Design Considerations   
   
   The user request model includes first name, last name, date of birth,      
   email address and address.   
   The address model can be used as a home/office address.   
   One of the major benefits of running an API first contract is that,   
   new data fields can be added/changed over a period.   
    
         
   
## Assumptions   
   
   * Redis could have been used as an in-memory data structure store.      
        
   * As the purpose of these API's are for users from other teams to continue with their   
     development while the CRM Team finalize their API's development, I did not think a    
     database or an in-memory cache was necessary.   
                    
   
## Security Mechanism     
   
Spring Basic Auth is the preferred security for this exercise.      
The process of creating the Authorization header is relatively straightforward for Basic   
Authentication, so it can be done manually with a few lines of code.   
More time is needed for full on application process authentication, such as OAuth with access token.   
Swagger can be configure to access an OAuth-secure API using the SecurityScheme and SecurityContext.   
The SecurityScheme is use to describe how our API is secured(Basic Authentication, OAuth2,...).   
   
    
     
   
## Getting Started   
   
These instructions will generate a spring boot server project up and running on a      
local machine for development and testing purposes.   
A top-down approach is being used - first API specification and then code generation.   
   
## Prerequisites   
   
```$xslt
   
   Java8   
   Swagger Editor   
   Swagger CodeGen   
   Spring boot   
   Spring Rest   
   Maven   
   
```                  
   
Online Swagger Editor can be downloaded, installed and used to create API contract.      
The API Contract (swagger.yaml) can be found under resources/swagger folder.   
In the left pane of the Swagger Editor, write down the specification or just copy/paste any existing   
API contract in a .yaml or .json format.   
Based on the specification outcome, right pane will show the UI documentation of Swagger.   
   
## Generating API Code   
   
To further generate source code, this swagger.yaml file will be the source of input.   
To facilitate it, Swagger Code Gen tool is used.      
Swagger provides utility jar to generate client REST clients for different programming languages and    
framework.   
The latest stable version jar can be downloaded from Swagger Codegen.      
   
To generate client, execute below command.   
   
```$xslt
    java -jar swagger-codegen-cli-2.2.3.jar generate   
          -i swagger.yaml    
          --api-package com.qantas.task.profile.v1.api   
          --model-package com.qantas.task.profile.v1.model   
          --group-id com.qantas.task    
          --artifact-id spring-swagger-codegen-profile   
          --artifact-version 0.0.1-SNAPSHOT    
          -l spring     
          -o spring-swagger-codegen-profile
```                  
   
Description of arguments:   
   
   * i: Swagger specification source file   
   * api-package: Package information for generated API class   
   * model-package: Package information for generated model class   
   * group-id: Maven properties   
   * artifact-id: Maven properties   
   * artifact-version: Maven properties   
   * l: Implementation framework, here Spring is used, which by default provides spring-boot   
   * o: Output directory   
   
## Executing API Code   
   
Import the generated maven project into your favourite IDE and build the project.   
Swagger configuration classes have been automatically created.      
Next run the project and open Swagger UI accessible at http://localhost:8080/v1/swagger-ui.html.   
You can check all API details in Swagger UI.   
You can also test your project by using Postman client.   
   
## Running the application   
   
```$xslt
   java -jar spring-swagger-codegen-profile-0.0.1-SNAPSHOT.jar   
   
```          
      
## Author   
   
   * Leo Coutinho   
      
            
      
                  
 
      
      
package com.bennychan.roomwebapp.endpoints;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
// The id let us know where in the actuator endpoint list to display this endpoint
@Endpoint(id = "greeting")
public class GreetingEndpoint {
    @ReadOperation
    public String getGreeting() {
        return "Hello from Actuator!";
    }
}

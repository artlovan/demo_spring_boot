package org.javadriven.boot.restController;

import org.javadriven.boot.model.MyMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class MessageController {

    @Autowired
    private MyMessage myMessage;

    @RequestMapping(value = "/api/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> hello() {

        return new HashMap<String, String>(){
            {
                put("secret_key", myMessage.getMessageValue());
            }
        };
    }
}

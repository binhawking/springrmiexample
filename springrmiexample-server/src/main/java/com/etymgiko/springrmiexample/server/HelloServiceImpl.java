package com.etymgiko.springrmiexample.server;

import com.etymgiko.springrmiexample.shared.HelloMessage;
import com.etymgiko.springrmiexample.shared.HelloResponse;
import com.etymgiko.springrmiexample.shared.HelloService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author Ivan Holub
 */
public class HelloServiceImpl implements HelloService {

    private Log log = LogFactory.getLog(getClass());

    public HelloResponse sayHello(HelloMessage message) {
        String messageText = message.getText();
        log.debug("sayHello() is called, message text: " + messageText);
        HelloResponse response = new HelloResponse();
        String text = "Hello from server, your message:  " + messageText;
        response.setText(text);
        return response;
    }

}
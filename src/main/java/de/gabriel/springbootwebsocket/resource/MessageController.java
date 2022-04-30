package de.gabriel.springbootwebsocket.resource;

import de.gabriel.springbootwebsocket.model.Message;
import de.gabriel.springbootwebsocket.model.MessageResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;

@Controller
public class MessageController {

    @MessageMapping("/message")
    @SendTo("/topic/message")
    public MessageResponse getMessage(Message message){
        return new MessageResponse("[Message] " + message.getMessage());
    }

}

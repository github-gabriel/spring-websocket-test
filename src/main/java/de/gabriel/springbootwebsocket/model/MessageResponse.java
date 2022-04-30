package de.gabriel.springbootwebsocket.model;

public class MessageResponse {

    private String content;

    public MessageResponse(){
    }

    public MessageResponse(String content){
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}

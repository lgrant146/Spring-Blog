package com.codeup.springblog.models;

public class Post {
    private String title;
    private String body;
    private long id;

    public Post(){}

    public Post(long id, String title, String body){
        this.id = id;
        this.title =title;
        this.body = body;
    }

    public Post(String title, String body, long id) {
        this.title = title;
        this.body = body;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String newBody) {
        this.body = newBody;
    }
}

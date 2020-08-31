package com.guestbook.GuestBook.comment;


import com.guestbook.GuestBook.visitor.Visitor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comment {

    @Id
//    @GeneratedValue
    private String id;
    private String content;

    @ManyToOne
    private Visitor visitor;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Comment() {
    }

    public Comment(String id, String content, String visitorName) {
        this.id = id;
        this.content = content;
        this.visitor = new Visitor(visitorName, "");
    }

}

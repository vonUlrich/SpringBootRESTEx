package com.guestbook.GuestBook.visitor;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;

@Entity
public class Visitor {

    @Id
    private String name;
    @Email(message = "Email should be valid")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Visitor() {
    }

    public Visitor(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

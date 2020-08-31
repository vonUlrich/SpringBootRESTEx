package com.guestbook.GuestBook.comment;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommentRepository extends CrudRepository<Comment, String> {
    public List<Comment> findByVisitorName(String visitorName);
}

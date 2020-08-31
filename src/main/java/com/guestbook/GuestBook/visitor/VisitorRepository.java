package com.guestbook.GuestBook.visitor;

import org.springframework.data.repository.CrudRepository;

public interface VisitorRepository extends CrudRepository<Visitor, String> {
}

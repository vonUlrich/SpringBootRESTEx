package com.guestbook.GuestBook.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getAllComments(String visitorName){
//       return visitors;
        List<Comment> comments = new ArrayList<>();
        commentRepository.findByVisitorName(visitorName).forEach(comments::add);
        return comments;
    }

    public Comment getComment(String  name){
//       return visitors.stream().filter(t -> t.getName().equals(name)).findFirst().get();
        return commentRepository.findById(name).orElse(null);
    }

    public void addComment(Comment comment){
//       visitors.add(visitor);
        commentRepository.save(comment);
    }

    public void updateComment(Comment comment) {
//        for (int i=0; i < visitor.getName().length(); i++){
//            Visitor v = visitors.get(i);
//            if (v.getName().equals(name)){
//                visitors.set(i, visitor);
//                return;
//            }
//        }
        commentRepository.save(comment);
    }

    public void deleteComment(String id) {
//       visitors.removeIf(t -> t.getName().equals(name));
        commentRepository.deleteById(id);
    }

}

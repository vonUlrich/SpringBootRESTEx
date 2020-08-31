package com.guestbook.GuestBook.comment;

import com.guestbook.GuestBook.visitor.Visitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping("/visitors/{name}/comments")
    public List<Comment> getAllComments(@PathVariable String name){
        return commentService.getAllComments(name);
    }

    @RequestMapping("/visitors/{visitorName}/comments/{name}")
    public Comment getComment(@PathVariable String name){
        return commentService.getComment(name);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/visitors/{visitorName}/comments")
    public void addComment(@RequestBody Comment comment, @PathVariable String visitorName){
        comment.setVisitor(new Visitor(visitorName, ""));
        commentService.addComment(comment);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/visitors/{visitorName}/comments")
    public void updateComment(@RequestBody Comment comment, @PathVariable String visitorName){
        comment.setVisitor(new Visitor(visitorName, ""));
        commentService.updateComment(comment);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/visitors/{visitorName}/comments/{id}")
    public void deleteVisitor(@PathVariable String id){
        commentService.deleteComment(id);
    }

}

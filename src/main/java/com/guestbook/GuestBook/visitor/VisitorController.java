package com.guestbook.GuestBook.visitor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VisitorController {

    @Autowired
    private VisitorService visitorService;

    @RequestMapping("/visitors")
    public List<Visitor> getAllVisitors(){
        return visitorService.getAllVisitors();
    }

    @RequestMapping("/visitors/{name}")
    public Visitor getVisitor(@PathVariable String name){
        return visitorService.getVisitor(name);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/visitors")
    public void addVisitor(@RequestBody Visitor visitor){
        visitorService.addVisitor(visitor);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/visitors/{name}")
    public void updateVisitor(@RequestBody Visitor visitor, @PathVariable String name){
        visitorService.updateVisitor(visitor, name);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/visitors/{name}")
    public void deleteVisitor(@PathVariable String name){
        visitorService.deleteVisitor(name);
    }

}

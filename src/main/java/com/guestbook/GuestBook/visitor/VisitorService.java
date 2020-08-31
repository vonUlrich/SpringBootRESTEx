package com.guestbook.GuestBook.visitor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VisitorService {

    @Autowired
    private VisitorRepository visitorRepository;

//   private List<Visitor> visitors = new ArrayList<>(Arrays.asList(
//            new Visitor("Sten", "stenulrich@hotmail.com" ),
//            new Visitor("Timo", "timo@hotmail.com" ),
//            new Visitor("Peeter", "peeter@hotmail.com" )
//    ));

    public List<Visitor> getAllVisitors(){
//       return visitors;
        List<Visitor> visitors = new ArrayList<>();
        visitorRepository.findAll().forEach(visitors::add);
        return visitors;
    }

    public Visitor getVisitor(String name){
//       return visitors.stream().filter(t -> t.getName().equals(name)).findFirst().get();
        return visitorRepository.findById(name).orElse(null);
    }

    public void addVisitor(Visitor visitor){
//       visitors.add(visitor);
        visitorRepository.save(visitor);
    }

    public void updateVisitor(Visitor visitor, String name) {
//        for (int i=0; i < visitor.getName().length(); i++){
//            Visitor v = visitors.get(i);
//            if (v.getName().equals(name)){
//                visitors.set(i, visitor);
//                return;
//            }
//        }
        visitorRepository.save(visitor);
    }

    public void deleteVisitor(String name) {
//       visitors.removeIf(t -> t.getName().equals(name));
        visitorRepository.deleteById(name);
    }

}

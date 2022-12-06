package main.services;

import main.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;



/*
* Changing Field Injection by Constructor Injection
* */

@Service
public class CommentService {
    public CommentService(){
        System.out.println("Comment service created");
    }
    public CommentService(CommentRepository commentRepository){
        this.commentRepository = commentRepository;
    }
    private CommentRepository commentRepository;
    public  CommentRepository getCommentRepository(){
        return commentRepository;
    }

}

package main.services;

import main.model.Comment;
import main.model.CommentProcessor;
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
    @Autowired
    private CommentRepository commentRepository;
    public  CommentRepository getCommentRepository(){
        return commentRepository;
    }

    public void sendComment(Comment comment){
        CommentProcessor commentProcessor =  new CommentProcessor();
        commentProcessor.setComment(comment);
        commentProcessor.processComment(comment);
        commentProcessor.valideComment(comment);
        Comment comment1 = commentProcessor.getComment();
    }

}

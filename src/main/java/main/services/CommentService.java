package main.services;

import main.model.Comment;
import main.model.CommentProcessor;
import main.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;



/*
* Changing Field Injection by Constructor Injection
* */

@Service
public class CommentService {
        private Logger logger = Logger.getLogger(CommentService.class.getName());
        public void publishComment(Comment comment){
            logger.info(" Published Comment : "+comment.getText());
        }
}

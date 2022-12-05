package main.services;

import main.model.Comment;
import main.proxies.CommentNotificationProxy;
import main.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public  CommentRepository getCommentRepository(){
        return commentRepository;
    }

}

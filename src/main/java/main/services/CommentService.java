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
    private  CommentNotificationProxy commentNotificationProxy;
    private  CommentRepository commentRepository;


    @Autowired   // This Annotation is Optional because the Class contains only one Constructor
    public CommentService( CommentRepository commentRepository,@Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy) {
        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepository = commentRepository;
    }

    public CommentService(){

    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}

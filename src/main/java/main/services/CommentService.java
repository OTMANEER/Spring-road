package main.services;

import main.model.Comment;
import main.proxies.CommentNotificationProxy;
import main.repositories.CommentRepository;

public class CommentService {
    private final CommentNotificationProxy commentNotificationProxy;
    private final CommentRepository commentRepository;


    public CommentService(CommentNotificationProxy commentNotificationProxy, CommentRepository commentRepository) {
        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepository = commentRepository;
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}

package main;

import main.model.Comment;
import main.proxies.EmailCommentNotificationProxy;
import main.repositories.DBCommentRepository;
import main.services.CommentService;

public class Main {

    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("OTMANE ERRAGRAGUI");
        comment.setText(" Work in progress");

        DBCommentRepository dbCommentRepository = new DBCommentRepository();
        EmailCommentNotificationProxy emailCommentNotificationProxy = new EmailCommentNotificationProxy();
        CommentService commentService =  new CommentService(emailCommentNotificationProxy,dbCommentRepository);
        commentService.publishComment(comment);
    }
}

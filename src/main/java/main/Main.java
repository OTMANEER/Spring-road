package main;

import config.ProjectConfig;
import main.model.Comment;
import main.proxies.EmailCommentNotificationProxy;
import main.repositories.DBCommentRepository;
import main.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        /*Comment comment = new Comment();
        comment.setAuthor("OTMANE ERRAGRAGUI");
        comment.setText(" Work in progress");

        DBCommentRepository dbCommentRepository = new DBCommentRepository();
        EmailCommentNotificationProxy emailCommentNotificationProxy = new EmailCommentNotificationProxy();
        CommentService commentService =  new CommentService(dbCommentRepository,emailCommentNotificationProxy);
        commentService.publishComment(comment);*/

                AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(ProjectConfig.class);
                CommentService cs1 = c.getBean("commentService", CommentService.class);
                CommentService cs2 = c.getBean("commentService", CommentService.class);
                boolean b1 = cs1 == cs2;
                System.out.println(b1);
            }

    }

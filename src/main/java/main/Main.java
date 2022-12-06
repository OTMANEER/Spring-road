package main;

import config.ProjectConfig;
import main.services.CommentService;
import main.services.UserService;
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

                AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(ProjectConfig.class);
                /*CommentService cs1 = c.getBean(CommentService.class);
                UserService cs2 = c.getBean(UserService.class);
                boolean b1 = cs1.getCommentRepository() == cs2.getCommentRepository();
                // Same Comment repo in both of them.
                System.out.println(b1);
*/
        System.out.println("Now lets call the instance of CommentService");
        CommentService c = context.getBean(CommentService.class);

    }
}

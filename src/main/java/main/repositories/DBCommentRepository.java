package main.repositories;

import main.model.Comment;
import org.springframework.stereotype.Component;


@Component
public class DBCommentRepository implements CommentRepository{

    public DBCommentRepository() {
        System.out.println("DBCR instance created");
    }

    @Override
    public void storeComment(Comment comment){
        System.out.println("Storing Comment: "+comment.getText());
    }

}

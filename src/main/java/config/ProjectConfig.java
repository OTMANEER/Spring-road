package config;
import main.services.CommentService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = {"main.services","main.repositories"})
public class ProjectConfig{
    @Bean
    //@Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public CommentService commentService(){
        return  new CommentService();
    }
}

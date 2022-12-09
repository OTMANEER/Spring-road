package config;
import main.services.CommentService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"main.services"})
@EnableAspectJAutoProxy
public class ProjectConfig{
}

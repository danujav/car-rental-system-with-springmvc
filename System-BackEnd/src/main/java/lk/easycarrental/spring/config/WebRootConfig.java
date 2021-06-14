package lk.easycarrental.spring.config;

/**
 * @author : Danuja 6/14/21 8:09 PM
 * @version : 1.0
 */
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({JPAConfig.class})
public class WebRootConfig {
}

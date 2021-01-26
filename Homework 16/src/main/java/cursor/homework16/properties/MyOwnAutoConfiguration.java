package cursor.homework16.properties;


import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnMissingClass("cursor.homework16.configuration.AutoConfiguration")
public class MyOwnAutoConfiguration {
}

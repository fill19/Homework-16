package cursor.homework16.configuration;

import cursor.homework16.service.AutoConfService;
import cursor.homework16.service.AutoConfServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(AutoConfService.class)
public class AutoConfiguration {
    public AutoConfiguration (){
        System.out.println("It`s enabled configuration");
    }


    @Bean
    @ConditionalOnMissingBean
    public AutoConfService chicks() {
        System.out.println("It`s common bean created from class AutoConfiguration ");
        return new AutoConfServiceImpl();
    }
}

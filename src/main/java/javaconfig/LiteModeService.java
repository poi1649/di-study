package javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Service
public class LiteModeService {

    // 이 메서드는 범용 팩터리 메서드로 작동합니다.
    @Bean(name = "viewResolver")
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Bean(name = "anotherViewResolver")
    public ViewResolver anotherViewResolver() {
        return viewResolver();
    }
}

package com.example.flowable;

import com.example.flowable.config.ApplicationConfiguration;
import org.flowable.ui.common.service.idm.RemoteIdmService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication(exclude = {
        SecurityAutoConfiguration.class
})
@Import({ApplicationConfiguration.class, ApplicationConfiguration.class})
public class FlowableDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlowableDemoApplication.class, args);
    }

}

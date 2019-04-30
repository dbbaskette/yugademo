package org.dbbaskette.yugademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackageClasses = User.class)

public class YugademoApplication {

    public static void main(String[] args) {
        SpringApplication.run(YugademoApplication.class, args);
    }

}

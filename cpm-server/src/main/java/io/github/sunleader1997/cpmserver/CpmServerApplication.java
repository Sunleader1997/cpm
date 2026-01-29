package io.github.sunleader1997.cpmserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class CpmServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CpmServerApplication.class, args);
    }

}

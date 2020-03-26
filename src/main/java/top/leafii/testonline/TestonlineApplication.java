package top.leafii.testonline;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan({"top.leafii.testonline.mapper"})
@ServletComponentScan
public class TestonlineApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestonlineApplication.class, args);
    }

}

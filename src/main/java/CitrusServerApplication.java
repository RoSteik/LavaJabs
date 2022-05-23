/**
 * Created by RoSteik (Telegram: @RoSteik)
 * Project name: Laboratorna_2_3_Java
 * Package name: main.java
 * Class: CitrusServerApplication
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication(scanBasePackages = {"iot.lviv.ua.controller",
        "iot.lviv.ua.logic"})
public class CitrusServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CitrusServerApplication.class, args);
    }
}

package pt.figtreestudios;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@ComponentScan("pt.figtreestudios.springpokeapi.service")
@EnableFeignClients("pt.figtreestudios.springpokeapi.proxy")
@EnableAutoConfiguration
public class TestConfig {
}

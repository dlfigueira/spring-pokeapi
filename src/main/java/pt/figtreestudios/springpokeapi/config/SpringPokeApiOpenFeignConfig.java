package pt.figtreestudios.springpokeapi.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@EnableFeignClients("pt.figtreestudios.springpokeapi.proxy")
@Configuration
public class SpringPokeApiOpenFeignConfig {
}

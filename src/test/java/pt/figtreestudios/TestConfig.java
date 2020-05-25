package pt.figtreestudios;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;
import pt.figtreestudios.springpokeapi.config.SpringPokeApiConfig;

@SpringBootConfiguration
@EnableAutoConfiguration
@Import(SpringPokeApiConfig.class)
public class TestConfig {
}

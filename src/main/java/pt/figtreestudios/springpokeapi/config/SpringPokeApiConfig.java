package pt.figtreestudios.springpokeapi.config;

import org.springframework.context.annotation.Import;

@Import(value = {
        SpringPokeApiOpenFeignConfig.class,
        SpringPokeApiCacheConfig.class
})
public class SpringPokeApiConfig {
}

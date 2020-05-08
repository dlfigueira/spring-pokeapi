package pt.figtreestudios.springpokeapi.proxy.pokeapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiGenerationApi;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNamedResourceList;

@FeignClient(name = "pokeapi-games", url = "https://pokeapi.co/api/v2/" +
        "")
@RequestMapping
public interface PokeApiGames {
    @GetMapping("/generation")
    PokeApiNamedResourceList getGenerations();

    @GetMapping("/generation/{id}")
    PokeApiGenerationApi getGenerationById(@PathVariable("id") Integer id);

    @GetMapping("/generation/{name}")
    PokeApiGenerationApi getGenerationByName(@PathVariable("name") String name);
}

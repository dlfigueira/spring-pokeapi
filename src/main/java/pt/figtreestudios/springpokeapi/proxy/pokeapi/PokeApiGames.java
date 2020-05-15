package pt.figtreestudios.springpokeapi.proxy.pokeapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiGeneration;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNamedResourceList;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiPokedex;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiVersion;

@FeignClient(name = "pokeapi-games", url = "https://pokeapi.co/api/v2/")
@RequestMapping
public interface PokeApiGames {
    @GetMapping("/generation")
    PokeApiNamedResourceList getGenerations();

    @GetMapping("/generation/{id}")
    PokeApiGeneration getGenerationById(@PathVariable("id") Integer id);

    @GetMapping("/generation/{name}")
    PokeApiGeneration getGenerationByName(@PathVariable("name") String name);

    @GetMapping("/pokedex")
    PokeApiNamedResourceList getPokedex();

    @GetMapping("/pokedex/{id}")
    PokeApiPokedex getPokedexById(@PathVariable("id") Integer id);

    @GetMapping("/pokedex/{name}")
    PokeApiPokedex getPokedexByName(@PathVariable("name") String name);

    @GetMapping("/version")
    PokeApiNamedResourceList getVersions();

    @GetMapping("/version/{id}")
    PokeApiVersion getVersionById(@PathVariable("id") Integer id);

    @GetMapping("/version/{name}")
    PokeApiVersion getVersionByName(@PathVariable("name") String name);
}

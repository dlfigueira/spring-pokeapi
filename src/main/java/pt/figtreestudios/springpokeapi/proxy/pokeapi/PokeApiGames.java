package pt.figtreestudios.springpokeapi.proxy.pokeapi;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiGeneration;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNamedResourceList;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiPokedex;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiVersion;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiVersionGroup;

@FeignClient(name = "pokeapi-games", url = "https://pokeapi.co/api/v2/")
@RequestMapping
public interface PokeApiGames {
    @GetMapping("/generation")
    PokeApiNamedResourceList getGenerations();

    @GetMapping("/generation/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiGeneration getGenerationById(@PathVariable Integer id);

    @GetMapping("/generation/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiGeneration getGenerationByName(@PathVariable String name);

    @GetMapping("/pokedex")
    PokeApiNamedResourceList getPokedex();

    @GetMapping("/pokedex/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiPokedex getPokedexById(@PathVariable Integer id);

    @GetMapping("/pokedex/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiPokedex getPokedexByName(@PathVariable String name);

    @GetMapping("/version")
    PokeApiNamedResourceList getVersions();

    @GetMapping("/version/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiVersion getVersionById(@PathVariable Integer id);

    @GetMapping("/version/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiVersion getVersionByName(@PathVariable String name);

    @GetMapping("/version-group")
    PokeApiNamedResourceList getVersionGroups();

    @GetMapping("/version-group/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiVersionGroup getVersionGroupById(@PathVariable Integer id);

    @GetMapping("/version-group/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiVersionGroup getVersionGroupByName(@PathVariable String name);
}

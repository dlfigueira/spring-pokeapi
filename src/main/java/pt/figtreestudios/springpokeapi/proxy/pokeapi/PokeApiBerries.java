package pt.figtreestudios.springpokeapi.proxy.pokeapi;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiBerry;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiBerryFirmness;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiBerryFlavor;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNamedResourceList;

@FeignClient(name = "pokeapi-berries", url = "https://pokeapi.co/api/v2/")
@RequestMapping
public interface PokeApiBerries {
    @GetMapping("/berry")
    PokeApiNamedResourceList getBerries();

    @GetMapping("/berry/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiBerry getBerryById(@PathVariable Integer id);

    @GetMapping("/berry/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiBerry getBerryByName(@PathVariable String name);

    @GetMapping("/berry")
    PokeApiNamedResourceList getBerryFirmnesses();

    @GetMapping("/berry/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiBerryFirmness getBerryFirmnessById(@PathVariable Integer id);

    @GetMapping("/berry/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiBerryFirmness getBerryFirmnessByName(@PathVariable String name);

    @GetMapping("/berry")
    PokeApiNamedResourceList getBerryFlavors();

    @GetMapping("/berry/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiBerryFlavor getBerryFlavorById(@PathVariable Integer id);

    @GetMapping("/berry/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiBerryFlavor getBerryFlavorByName(@PathVariable String name);
}

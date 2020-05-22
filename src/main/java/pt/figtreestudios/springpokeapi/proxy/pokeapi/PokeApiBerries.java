package pt.figtreestudios.springpokeapi.proxy.pokeapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiBerry;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiBerryFirmness;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiBerryFlavor;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiMachine;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNamedResourceList;

@FeignClient(name = "pokeapi-games", url = "https://pokeapi.co/api/v2/")
@RequestMapping
public interface PokeApiBerries {
    @GetMapping("/berry")
    PokeApiNamedResourceList getBerries();

    @GetMapping("/berry/{id}")
    PokeApiBerry getBerryById(@PathVariable("id") Integer id);

    @GetMapping("/berry/{name}")
    PokeApiBerry getBerryByName(@PathVariable("name") String name);

    @GetMapping("/berry")
    PokeApiNamedResourceList getBerryFirmnesses();

    @GetMapping("/berry/{id}")
    PokeApiBerryFirmness getBerryFirmnessById(@PathVariable("id") Integer id);

    @GetMapping("/berry/{name}")
    PokeApiBerryFirmness getBerryFirmnessByName(@PathVariable("name") String name);

    @GetMapping("/berry")
    PokeApiNamedResourceList getBerryFlavors();

    @GetMapping("/berry/{id}")
    PokeApiBerryFlavor getBerryFlavorById(@PathVariable("id") Integer id);

    @GetMapping("/berry/{name}")
    PokeApiBerryFlavor getBerryFlavorByName(@PathVariable("name") String name);
}

package pt.figtreestudios.springpokeapi.proxy.pokeapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiAbility;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiCharacteristic;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiEggGroup;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiGender;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiGeneration;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiGrowthRate;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNamedResourceList;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNature;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiPokeathlonStat;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiPokedex;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiVersion;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiVersionGroup;

@FeignClient(name = "pokeapi-games", url = "https://pokeapi.co/api/v2/")
@RequestMapping
public interface PokeApiPokemon {
    @GetMapping("/ability")
    PokeApiNamedResourceList getAbilities();

    @GetMapping("/ability/{id}")
    PokeApiAbility getAbilityById(@PathVariable("id") Integer id);

    @GetMapping("/ability/{name}")
    PokeApiAbility getAbilityByName(@PathVariable("name") String name);

    @GetMapping("/characteristic/{id}")
    PokeApiCharacteristic getCharacteristicById(@PathVariable("id") Integer id);

    @GetMapping("/egg-group")
    PokeApiNamedResourceList getEggGroups();

    @GetMapping("/egg-group/{id}")
    PokeApiEggGroup getEggGroupById(@PathVariable("id") Integer id);

    @GetMapping("/egg-group/{name}")
    PokeApiEggGroup getEggGroupByName(@PathVariable("name") String name);

    @GetMapping("/gender")
    PokeApiNamedResourceList getGenders();

    @GetMapping("/gender/{id}")
    PokeApiGender getGenderById(@PathVariable("id") Integer id);

    @GetMapping("/gender/{name}")
    PokeApiGender getGenderByName(@PathVariable("name") String name);

    @GetMapping("/growth-rate")
    PokeApiNamedResourceList getGrowthRates();

    @GetMapping("/growth-rate/{id}")
    PokeApiGrowthRate getGrowthRateById(@PathVariable("id") Integer id);

    @GetMapping("/growth-rate/{name}")
    PokeApiGrowthRate getGrowthRateByName(@PathVariable("name") String name);

    @GetMapping("/nature")
    PokeApiNamedResourceList getNatures();

    @GetMapping("/nature/{id}")
    PokeApiNature getNatureById(@PathVariable("id") Integer id);

    @GetMapping("/nature/{name}")
    PokeApiNature getNatureByName(@PathVariable("name") String name);

    @GetMapping("/pokeathlon-stat")
    PokeApiNamedResourceList getPokeathlonStats();

    @GetMapping("/pokeathlon-stat/{id}")
    PokeApiPokeathlonStat getPokeathlonStatById(@PathVariable("id") Integer id);

    @GetMapping("/pokeathlon-stat/{name}")
    PokeApiPokeathlonStat getPokeathlonStatByName(@PathVariable("name") String name);
}

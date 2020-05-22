package pt.figtreestudios.springpokeapi.proxy.pokeapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiAbility;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiCharacteristic;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiEggGroup;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiGender;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiGrowthRate;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNamedResourceList;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNature;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiPokeathlonStat;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiPokedex;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiPokemonColor;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiPokemonForm;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiPokemonHabitat;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiPokemonShape;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiPokemonSpecies;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiStat;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiType;

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

    @GetMapping("/pokemon")
    PokeApiNamedResourceList getPokemons();

    @GetMapping("/pokemon/{id}")
    PokeApiPokedex getPokemonById(@PathVariable("id") Integer id);

    @GetMapping("/pokemon/{name}")
    PokeApiPokedex getPokemonByName(@PathVariable("name") String name);

    @GetMapping("/pokemon-color")
    PokeApiNamedResourceList getPokemonColors();

    @GetMapping("/pokemon-color/{id}")
    PokeApiPokemonColor getPokemonColorById(@PathVariable("id") Integer id);

    @GetMapping("/pokemon-color/{name}")
    PokeApiPokemonColor getPokemonColorByName(@PathVariable("name") String name);

    @GetMapping("/pokemon-form")
    PokeApiNamedResourceList getPokemonForms();

    @GetMapping("/pokemon-form/{id}")
    PokeApiPokemonForm getPokemonFormById(@PathVariable("id") Integer id);

    @GetMapping("/pokemon-form/{name}")
    PokeApiPokemonForm getPokemonFormByName(@PathVariable("name") String name);

    @GetMapping("/pokemon-habitat")
    PokeApiNamedResourceList getPokemonHabitats();

    @GetMapping("/pokemon-habitat/{id}")
    PokeApiPokemonHabitat getPokemonHabitatById(@PathVariable("id") Integer id);

    @GetMapping("/pokemon-habitat/{name}")
    PokeApiPokemonHabitat getPokemonHabitatByName(@PathVariable("name") String name);

    @GetMapping("/pokemon-shape")
    PokeApiNamedResourceList getPokemonShapes();

    @GetMapping("/pokemon-shape/{id}")
    PokeApiPokemonShape getPokemonShapeById(@PathVariable("id") Integer id);

    @GetMapping("/pokemon-shape/{name}")
    PokeApiPokemonShape getPokemonShapeByName(@PathVariable("name") String name);

    @GetMapping("/pokemon-species")
    PokeApiNamedResourceList getPokemonSpecies();

    @GetMapping("/pokemon-species/{id}")
    PokeApiPokemonSpecies getPokemonSpeciesById(@PathVariable("id") Integer id);

    @GetMapping("/pokemon-species/{name}")
    PokeApiPokemonSpecies getPokemonSpeciesByName(@PathVariable("name") String name);

    @GetMapping("/stat")
    PokeApiNamedResourceList getStats();

    @GetMapping("/stat/{id}")
    PokeApiStat getStatById(@PathVariable("id") Integer id);

    @GetMapping("/stat/{name}")
    PokeApiStat getStatByName(@PathVariable("name") String name);

    @GetMapping("/type")
    PokeApiNamedResourceList getTypes();

    @GetMapping("/type/{id}")
    PokeApiType getTypeById(@PathVariable("id") Integer id);

    @GetMapping("/type/{name}")
    PokeApiType getTypeByName(@PathVariable("name") String name);
}

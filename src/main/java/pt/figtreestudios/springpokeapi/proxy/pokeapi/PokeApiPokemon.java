package pt.figtreestudios.springpokeapi.proxy.pokeapi;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

@FeignClient(name = "pokeapi-pokemon", url = "https://pokeapi.co/api/v2/")
@RequestMapping
public interface PokeApiPokemon {
    @GetMapping("/ability")
    PokeApiNamedResourceList getAbilities(@RequestParam Integer limit,
                                          @RequestParam Integer offset);

    @GetMapping("/ability/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiAbility getAbilityById(@PathVariable Integer id);

    @GetMapping("/ability/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiAbility getAbilityByName(@PathVariable String name);

    @GetMapping("/characteristic")
    PokeApiNamedResourceList getCharacteristics(@RequestParam Integer limit,
                                                @RequestParam Integer offset);

    @GetMapping("/characteristic/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiCharacteristic getCharacteristicById(@PathVariable Integer id);

    @GetMapping("/egg-group")
    PokeApiNamedResourceList getEggGroups(@RequestParam Integer limit,
                                          @RequestParam Integer offset);

    @GetMapping("/egg-group/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiEggGroup getEggGroupById(@PathVariable Integer id);

    @GetMapping("/egg-group/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiEggGroup getEggGroupByName(@PathVariable String name);

    @GetMapping("/gender")
    PokeApiNamedResourceList getGenders(@RequestParam Integer limit,
                                        @RequestParam Integer offset);

    @GetMapping("/gender/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiGender getGenderById(@PathVariable Integer id);

    @GetMapping("/gender/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiGender getGenderByName(@PathVariable String name);

    @GetMapping("/growth-rate")
    PokeApiNamedResourceList getGrowthRates(@RequestParam Integer limit,
                                            @RequestParam Integer offset);

    @GetMapping("/growth-rate/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiGrowthRate getGrowthRateById(@PathVariable Integer id);

    @GetMapping("/growth-rate/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiGrowthRate getGrowthRateByName(@PathVariable String name);

    @GetMapping("/nature")
    PokeApiNamedResourceList getNatures(@RequestParam Integer limit,
                                        @RequestParam Integer offset);

    @GetMapping("/nature/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiNature getNatureById(@PathVariable Integer id);

    @GetMapping("/nature/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiNature getNatureByName(@PathVariable String name);

    @GetMapping("/pokeathlon-stat")
    PokeApiNamedResourceList getPokeathlonStats(@RequestParam Integer limit,
                                                @RequestParam Integer offset);

    @GetMapping("/pokeathlon-stat/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiPokeathlonStat getPokeathlonStatById(@PathVariable Integer id);

    @GetMapping("/pokeathlon-stat/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiPokeathlonStat getPokeathlonStatByName(@PathVariable String name);

    @GetMapping("/pokemon")
    PokeApiNamedResourceList getPokemons(@RequestParam Integer limit,
                                         @RequestParam Integer offset);

    @GetMapping("/pokemon/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiPokedex getPokemonById(@PathVariable Integer id);

    @GetMapping("/pokemon/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiPokedex getPokemonByName(@PathVariable String name);

    @GetMapping("/pokemon-color")
    PokeApiNamedResourceList getPokemonColors(@RequestParam Integer limit,
                                              @RequestParam Integer offset);

    @GetMapping("/pokemon-color/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiPokemonColor getPokemonColorById(@PathVariable Integer id);

    @GetMapping("/pokemon-color/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiPokemonColor getPokemonColorByName(@PathVariable String name);

    @GetMapping("/pokemon-form")
    PokeApiNamedResourceList getPokemonForms(@RequestParam Integer limit,
                                             @RequestParam Integer offset);

    @GetMapping("/pokemon-form/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiPokemonForm getPokemonFormById(@PathVariable Integer id);

    @GetMapping("/pokemon-form/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiPokemonForm getPokemonFormByName(@PathVariable String name);

    @GetMapping("/pokemon-habitat")
    PokeApiNamedResourceList getPokemonHabitats(@RequestParam Integer limit,
                                                @RequestParam Integer offset);

    @GetMapping("/pokemon-habitat/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiPokemonHabitat getPokemonHabitatById(@PathVariable Integer id);

    @GetMapping("/pokemon-habitat/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiPokemonHabitat getPokemonHabitatByName(@PathVariable String name);

    @GetMapping("/pokemon-shape")
    PokeApiNamedResourceList getPokemonShapes(@RequestParam Integer limit,
                                              @RequestParam Integer offset);

    @GetMapping("/pokemon-shape/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiPokemonShape getPokemonShapeById(@PathVariable Integer id);

    @GetMapping("/pokemon-shape/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiPokemonShape getPokemonShapeByName(@PathVariable String name);

    @GetMapping("/pokemon-species")
    PokeApiNamedResourceList getPokemonSpecies(@RequestParam Integer limit,
                                               @RequestParam Integer offset);

    @GetMapping("/pokemon-species/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiPokemonSpecies getPokemonSpeciesById(@PathVariable Integer id);

    @GetMapping("/pokemon-species/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiPokemonSpecies getPokemonSpeciesByName(@PathVariable String name);

    @GetMapping("/stat")
    PokeApiNamedResourceList getStats(@RequestParam Integer limit,
                                      @RequestParam Integer offset);

    @GetMapping("/stat/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiStat getStatById(@PathVariable Integer id);

    @GetMapping("/stat/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiStat getStatByName(@PathVariable String name);

    @GetMapping("/type")
    PokeApiNamedResourceList getTypes(@RequestParam Integer limit,
                                      @RequestParam Integer offset);

    @GetMapping("/type/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiType getTypeById(@PathVariable Integer id);

    @GetMapping("/type/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiType getTypeByName(@PathVariable String name);
}

package pt.figtreestudios.springpokeapi.proxy.pokeapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiEncounterCondition;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiEncounterConditionValue;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiEncounterMethod;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNamedResourceList;

@FeignClient(name = "pokeapi-encounters", url = "https://pokeapi.co/api/v2/")
@RequestMapping
public interface PokeApiEncounters {
    @GetMapping("/encounter-method")
    PokeApiNamedResourceList getEncounterMethods();

    @GetMapping("/encounter-method/{id}")
    PokeApiEncounterMethod getEncounterMethodById(@PathVariable("id") Integer id);

    @GetMapping("/encounter-method/{name}")
    PokeApiEncounterMethod getEncounterMethodByName(@PathVariable("name") String name);

    @GetMapping("/encounter-condition")
    PokeApiNamedResourceList getEncounterConditions();

    @GetMapping("/encounter-condition/{id}")
    PokeApiEncounterCondition getEncounterConditionById(@PathVariable("id") Integer id);

    @GetMapping("/encounter-condition/{name}")
    PokeApiEncounterCondition getEncounterConditionByName(@PathVariable("name") String name);

    @GetMapping("/encounter-condition-value")
    PokeApiNamedResourceList getEncounterConditionValues();

    @GetMapping("/encounter-condition-value/{id}")
    PokeApiEncounterConditionValue getEncounterConditionValueById(@PathVariable("id") Integer id);

    @GetMapping("/encounter-condition-value/{name}")
    PokeApiEncounterConditionValue getEncounterConditionValueByName(@PathVariable("name") String name);
}

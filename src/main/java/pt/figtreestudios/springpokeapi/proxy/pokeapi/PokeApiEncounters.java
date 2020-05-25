package pt.figtreestudios.springpokeapi.proxy.pokeapi;

import org.springframework.cache.annotation.Cacheable;
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
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiEncounterMethod getEncounterMethodById(@PathVariable Integer id);

    @GetMapping("/encounter-method/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiEncounterMethod getEncounterMethodByName(@PathVariable String name);

    @GetMapping("/encounter-condition")
    PokeApiNamedResourceList getEncounterConditions();

    @GetMapping("/encounter-condition/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiEncounterCondition getEncounterConditionById(@PathVariable Integer id);

    @GetMapping("/encounter-condition/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiEncounterCondition getEncounterConditionByName(@PathVariable String name);

    @GetMapping("/encounter-condition-value")
    PokeApiNamedResourceList getEncounterConditionValues();

    @GetMapping("/encounter-condition-value/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiEncounterConditionValue getEncounterConditionValueById(@PathVariable Integer id);

    @GetMapping("/encounter-condition-value/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiEncounterConditionValue getEncounterConditionValueByName(@PathVariable String name);
}

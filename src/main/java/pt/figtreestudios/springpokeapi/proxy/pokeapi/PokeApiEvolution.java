package pt.figtreestudios.springpokeapi.proxy.pokeapi;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiEvolutionChain;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiEvolutionTrigger;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNamedResourceList;

@FeignClient(name = "pokeapi-evolution", url = "https://pokeapi.co/api/v2/")
@RequestMapping
public interface PokeApiEvolution {
    @GetMapping("/evolution-chain")
    PokeApiNamedResourceList getEvolutionChains();

    @GetMapping("/evolution-chain/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiEvolutionChain getEvolutionChainById(@PathVariable Integer id);

    @GetMapping("/evolution-trigger")
    PokeApiNamedResourceList getEvolutionTriggers();

    @GetMapping("/evolution-trigger/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiEvolutionTrigger getEvolutionTriggerById(@PathVariable Integer id);

    @GetMapping("/evolution-trigger/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiEvolutionTrigger getEvolutionTriggerByName(@PathVariable String name);
}

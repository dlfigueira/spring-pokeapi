package pt.figtreestudios.springpokeapi.proxy.pokeapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiBerry;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiBerryFirmness;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiBerryFlavor;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiEvolutionChain;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiEvolutionTrigger;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNamedResourceList;

@FeignClient(name = "pokeapi-evolution", url = "https://pokeapi.co/api/v2/")
@RequestMapping
public interface PokeApiEvolution {
    @GetMapping("/evolution-chain")
    PokeApiNamedResourceList getEvolutionChains();

    @GetMapping("/evolution-chain/{id}")
    PokeApiEvolutionChain getEvolutionChainById(@PathVariable("id") Integer id);

    @GetMapping("/evolution-trigger")
    PokeApiNamedResourceList getEvolutionTriggers();

    @GetMapping("/evolution-trigger/{id}")
    PokeApiEvolutionTrigger getEvolutionTriggerById(@PathVariable("id") Integer id);

    @GetMapping("/evolution-trigger/{name}")
    PokeApiEvolutionTrigger getEvolutionTriggerByName(@PathVariable("name") String name);
}

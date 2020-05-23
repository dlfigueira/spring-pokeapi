package pt.figtreestudios.springpokeapi.proxy.pokeapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiContestEffect;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiContestType;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNamedResourceList;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiSuperContestEffect;

@FeignClient(name = "pokeapi-contests", url = "https://pokeapi.co/api/v2/")
@RequestMapping
public interface PokeApiContests {
    @GetMapping("/contest-type")
    PokeApiNamedResourceList getContestTypes();

    @GetMapping("/contest-type/{id}")
    PokeApiContestType getContestTypeById(@PathVariable("id") Integer id);

    @GetMapping("/contest-type/{name}")
    PokeApiContestType getContestTypeByName(@PathVariable("name") String name);

    @GetMapping("/contest-effect")
    PokeApiNamedResourceList getContestEffects();

    @GetMapping("/contest-effect/{id}")
    PokeApiContestEffect getContestEffectById(@PathVariable("id") Integer id);

    @GetMapping("/super-contest-effect")
    PokeApiNamedResourceList getSuperContestEffects();

    @GetMapping("/super-contest-effect/{id}")
    PokeApiSuperContestEffect getSuperContestEffectById(@PathVariable("id") Integer id);
}

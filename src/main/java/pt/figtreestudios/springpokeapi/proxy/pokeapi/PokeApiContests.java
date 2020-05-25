package pt.figtreestudios.springpokeapi.proxy.pokeapi;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiContestEffect;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiContestType;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNamedResourceList;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiSuperContestEffect;

@FeignClient(name = "pokeapi-contests", url = "https://pokeapi.co/api/v2/")
@RequestMapping
public interface PokeApiContests {
    @GetMapping("/contest-type")
    PokeApiNamedResourceList getContestTypes(@RequestParam Integer limit,
                                             @RequestParam Integer offset);

    @GetMapping("/contest-type/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiContestType getContestTypeById(@PathVariable Integer id);

    @GetMapping("/contest-type/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiContestType getContestTypeByName(@PathVariable String name);

    @GetMapping("/contest-effect")
    PokeApiNamedResourceList getContestEffects(@RequestParam Integer limit,
                                               @RequestParam Integer offset);

    @GetMapping("/contest-effect/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiContestEffect getContestEffectById(@PathVariable Integer id);

    @GetMapping("/super-contest-effect")
    PokeApiNamedResourceList getSuperContestEffects(@RequestParam Integer limit,
                                                    @RequestParam Integer offset);

    @GetMapping("/super-contest-effect/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiSuperContestEffect getSuperContestEffectById(@PathVariable Integer id);
}

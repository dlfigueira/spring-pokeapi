package pt.figtreestudios.springpokeapi.proxy.pokeapi;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiMachine;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNamedResourceList;

@FeignClient(name = "pokeapi-machines", url = "https://pokeapi.co/api/v2/")
@RequestMapping
public interface PokeApiMachines {
    @GetMapping("/machine")
    PokeApiNamedResourceList getMachines(@RequestParam Integer limit,
                                         @RequestParam Integer offset);

    @GetMapping("/machine/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiMachine getMachineById(@PathVariable Integer id);

    @GetMapping("/machine/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiMachine getMachineByName(@PathVariable String name);
}

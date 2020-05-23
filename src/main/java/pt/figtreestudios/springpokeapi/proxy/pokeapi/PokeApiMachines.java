package pt.figtreestudios.springpokeapi.proxy.pokeapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiMachine;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNamedResourceList;

@FeignClient(name = "pokeapi-machines", url = "https://pokeapi.co/api/v2/")
@RequestMapping
public interface PokeApiMachines {
    @GetMapping("/machine")
    PokeApiNamedResourceList getMachines();

    @GetMapping("/machine/{id}")
    PokeApiMachine getMachineById(@PathVariable("id") Integer id);

    @GetMapping("/machine/{name}")
    PokeApiMachine getMachineByName(@PathVariable("name") String name);
}

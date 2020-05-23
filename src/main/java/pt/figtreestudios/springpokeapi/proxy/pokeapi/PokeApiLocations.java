package pt.figtreestudios.springpokeapi.proxy.pokeapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiLocation;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiLocationArea;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNamedResourceList;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiPalParkArea;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiRegion;

@FeignClient(name = "pokeapi-locations", url = "https://pokeapi.co/api/v2/")
@RequestMapping
public interface PokeApiLocations {
    @GetMapping("/location")
    PokeApiNamedResourceList getLocations();

    @GetMapping("/location/{id}")
    PokeApiLocation getLocationById(@PathVariable("id") Integer id);

    @GetMapping("/location/{name}")
    PokeApiLocation getLocationByName(@PathVariable("name") String name);

    @GetMapping("/location-area")
    PokeApiNamedResourceList getLocationAreas();

    @GetMapping("/location-area/{id}")
    PokeApiLocationArea getLocationAreaById(@PathVariable("id") Integer id);

    @GetMapping("/location-area/{name}")
    PokeApiLocationArea getLocationAreaByName(@PathVariable("name") String name);

    @GetMapping("/pal-park-area")
    PokeApiNamedResourceList getPalParkAreas();

    @GetMapping("/pal-park-area/{id}")
    PokeApiPalParkArea getPalParkAreaById(@PathVariable("id") Integer id);

    @GetMapping("/pal-park-area/{name}")
    PokeApiPalParkArea getPalParkAreaByName(@PathVariable("name") String name);

    @GetMapping("/region")
    PokeApiNamedResourceList getRegions();

    @GetMapping("/region/{id}")
    PokeApiRegion getRegionById(@PathVariable("id") Integer id);

    @GetMapping("/region/{name}")
    PokeApiRegion getRegionByName(@PathVariable("name") String name);
}

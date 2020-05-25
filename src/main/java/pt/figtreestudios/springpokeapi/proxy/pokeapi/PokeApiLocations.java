package pt.figtreestudios.springpokeapi.proxy.pokeapi;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiLocation;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiLocationArea;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNamedResourceList;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiPalParkArea;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiRegion;

@FeignClient(name = "pokeapi-locations", url = "https://pokeapi.co/api/v2/")
@RequestMapping
public interface PokeApiLocations {
    @GetMapping("/location")
    PokeApiNamedResourceList getLocations(@RequestParam Integer limit,
                                          @RequestParam Integer offset);

    @GetMapping("/location/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiLocation getLocationById(@PathVariable Integer id);

    @GetMapping("/location/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiLocation getLocationByName(@PathVariable String name);

    @GetMapping("/location-area")
    PokeApiNamedResourceList getLocationAreas(@RequestParam Integer limit,
                                              @RequestParam Integer offset);

    @GetMapping("/location-area/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiLocationArea getLocationAreaById(@PathVariable Integer id);

    @GetMapping("/location-area/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiLocationArea getLocationAreaByName(@PathVariable String name);

    @GetMapping("/pal-park-area")
    PokeApiNamedResourceList getPalParkAreas(@RequestParam Integer limit,
                                             @RequestParam Integer offset);

    @GetMapping("/pal-park-area/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiPalParkArea getPalParkAreaById(@PathVariable Integer id);

    @GetMapping("/pal-park-area/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiPalParkArea getPalParkAreaByName(@PathVariable String name);

    @GetMapping("/region")
    PokeApiNamedResourceList getRegions(@RequestParam Integer limit,
                                        @RequestParam Integer offset);

    @GetMapping("/region/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiRegion getRegionById(@PathVariable Integer id);

    @GetMapping("/region/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiRegion getRegionByName(@PathVariable String name);
}

package pt.figtreestudios.springpokeapi.proxy.pokeapi;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiItem;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiItemAttribute;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiItemCategory;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiItemFlingEffect;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiItemPocket;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNamedResourceList;

@FeignClient(name = "pokeapi-items", url = "https://pokeapi.co/api/v2/")
@RequestMapping
public interface PokeApiItems {
    @GetMapping("/item")
    PokeApiNamedResourceList getItems(@RequestParam Integer limit,
                                      @RequestParam Integer offset);

    @GetMapping("/item/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiItem getItemById(@PathVariable Integer id);

    @GetMapping("/item/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiItem getItemByName(@PathVariable String name);

    @GetMapping("/item-attribute")
    PokeApiNamedResourceList getItemAttributes(@RequestParam Integer limit,
                                               @RequestParam Integer offset);

    @GetMapping("/item-attribute/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiItemAttribute getItemAttributeById(@PathVariable Integer id);

    @GetMapping("/item-attribute/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiItemAttribute getItemAttributeByName(@PathVariable String name);

    @GetMapping("/item-category")
    PokeApiNamedResourceList getItemCategories(@RequestParam Integer limit,
                                               @RequestParam Integer offset);

    @GetMapping("/item-category/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiItemCategory getItemCategoryById(@PathVariable Integer id);

    @GetMapping("/item-category/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiItemCategory getItemCategoryByName(@PathVariable String name);

    @GetMapping("/item-fling-effect")
    PokeApiNamedResourceList getItemFlingEffects(@RequestParam Integer limit,
                                                 @RequestParam Integer offset);

    @GetMapping("/item-fling-effect/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiItemFlingEffect getItemFlingEffectById(@PathVariable Integer id);

    @GetMapping("/item-fling-effect/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiItemFlingEffect getItemFlingEffectByName(@PathVariable String name);

    @GetMapping("/item-pocket")
    PokeApiNamedResourceList getItemPockets(@RequestParam Integer limit,
                                            @RequestParam Integer offset);

    @GetMapping("/item-pocket/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiItemPocket getItemPocketById(@PathVariable Integer id);

    @GetMapping("/item-pocket/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiItemFlingEffect getItemPocketByName(@PathVariable String name);
}

package pt.figtreestudios.springpokeapi.proxy.pokeapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
    PokeApiNamedResourceList getItems();

    @GetMapping("/item/{id}")
    PokeApiItem getItemById(@PathVariable("id") Integer id);

    @GetMapping("/item/{name}")
    PokeApiItem getItemByName(@PathVariable("name") String name);

    @GetMapping("/item-attribute")
    PokeApiNamedResourceList getItemAttributes();

    @GetMapping("/item-attribute/{id}")
    PokeApiItemAttribute getItemAttributeById(@PathVariable("id") Integer id);

    @GetMapping("/item-attribute/{name}")
    PokeApiItemAttribute getItemAttributeByName(@PathVariable("name") String name);

    @GetMapping("/item-category")
    PokeApiNamedResourceList getItemCategories();

    @GetMapping("/item-category/{id}")
    PokeApiItemCategory getItemCategoryById(@PathVariable("id") Integer id);

    @GetMapping("/item-category/{name}")
    PokeApiItemCategory getItemCategoryByName(@PathVariable("name") String name);

    @GetMapping("/item-fling-effect")
    PokeApiNamedResourceList getItemFlingEffects();

    @GetMapping("/item-fling-effect/{id}")
    PokeApiItemFlingEffect getItemFlingEffectById(@PathVariable("id") Integer id);

    @GetMapping("/item-fling-effect/{name}")
    PokeApiItemFlingEffect getItemFlingEffectByName(@PathVariable("name") String name);

    @GetMapping("/item-fling-effect")
    PokeApiNamedResourceList getItemPockets();

    @GetMapping("/item-pocket/{id}")
    PokeApiItemPocket getItemPocketById(@PathVariable("id") Integer id);

    @GetMapping("/item-pocket/{name}")
    PokeApiItemFlingEffect getItemPocketByName(@PathVariable("name") String name);
}

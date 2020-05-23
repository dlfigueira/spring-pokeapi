package pt.figtreestudios.springpokeapi.proxy.pokeapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiModelName;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiMove;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiMoveAilment;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiMoveBattleStyle;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiMoveDamageClass;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiMoveLearnMethod;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiMoveTarget;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNamedResourceList;

@FeignClient(name = "pokeapi-moves", url = "https://pokeapi.co/api/v2/")
@RequestMapping
public interface PokeApiMoves {
    @GetMapping("/move")
    PokeApiNamedResourceList getMoves();

    @GetMapping("/move/{id}")
    PokeApiMove getMoveById(@PathVariable("id") Integer id);

    @GetMapping("/move/{name}")
    PokeApiMove getMoveByName(@PathVariable("name") String name);

    @GetMapping("/move-ailment")
    PokeApiNamedResourceList getMoveAilments();

    @GetMapping("/move-ailment/{id}")
    PokeApiMoveAilment getMoveAilmentById(@PathVariable("id") Integer id);

    @GetMapping("/move-ailment/{name}")
    PokeApiMoveAilment getMoveAilmentByName(@PathVariable("name") String name);

    @GetMapping("/move-battle-style")
    PokeApiNamedResourceList getMoveBattleStyles();

    @GetMapping("/move-battle-style/{id}")
    PokeApiMoveBattleStyle getMoveBattleStyleById(@PathVariable("id") Integer id);

    @GetMapping("/move-battle-style/{name}")
    PokeApiMoveBattleStyle getMoveBattleStyleByName(@PathVariable("name") String name);

    @GetMapping("/move-category")
    PokeApiNamedResourceList getMoveCategories();

    @GetMapping("/move-category/{id}")
    PokeApiModelName getMoveCategoryById(@PathVariable("id") Integer id);

    @GetMapping("/move-category/{name}")
    PokeApiModelName getMoveCategoryByName(@PathVariable("name") String name);

    @GetMapping("/move-damage-class")
    PokeApiNamedResourceList getMoveDamageClasses();

    @GetMapping("/move-damage-class/{id}")
    PokeApiMoveDamageClass getMoveDamageClassById(@PathVariable("id") Integer id);

    @GetMapping("/move-damage-class/{name}")
    PokeApiMoveDamageClass getMoveDamageClassByName(@PathVariable("name") String name);

    @GetMapping("/move-learn-method")
    PokeApiNamedResourceList getMoveLearnMethods();

    @GetMapping("/move-learn-method/{id}")
    PokeApiMoveLearnMethod getMoveLearnMethodById(@PathVariable("id") Integer id);

    @GetMapping("/move-learn-method/{name}")
    PokeApiMoveLearnMethod getMoveLearnMethodByName(@PathVariable("name") String name);

    @GetMapping("/move-learn-method")
    PokeApiNamedResourceList getMoveTargets();

    @GetMapping("/move-target/{id}")
    PokeApiMoveTarget getMoveTargetById(@PathVariable("id") Integer id);

    @GetMapping("/move-target/{name}")
    PokeApiMoveTarget getMoveTargetByName(@PathVariable("name") String name);
}

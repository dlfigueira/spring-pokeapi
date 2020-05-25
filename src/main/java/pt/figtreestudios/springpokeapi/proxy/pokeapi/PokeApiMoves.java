package pt.figtreestudios.springpokeapi.proxy.pokeapi;

import org.springframework.cache.annotation.Cacheable;
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
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiMove getMoveById(@PathVariable Integer id);

    @GetMapping("/move/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiMove getMoveByName(@PathVariable String name);

    @GetMapping("/move-ailment")
    PokeApiNamedResourceList getMoveAilments();

    @GetMapping("/move-ailment/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiMoveAilment getMoveAilmentById(@PathVariable Integer id);

    @GetMapping("/move-ailment/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiMoveAilment getMoveAilmentByName(@PathVariable String name);

    @GetMapping("/move-battle-style")
    PokeApiNamedResourceList getMoveBattleStyles();

    @GetMapping("/move-battle-style/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiMoveBattleStyle getMoveBattleStyleById(@PathVariable Integer id);

    @GetMapping("/move-battle-style/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiMoveBattleStyle getMoveBattleStyleByName(@PathVariable String name);

    @GetMapping("/move-category")
    PokeApiNamedResourceList getMoveCategories();

    @GetMapping("/move-category/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiModelName getMoveCategoryById(@PathVariable Integer id);

    @GetMapping("/move-category/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiModelName getMoveCategoryByName(@PathVariable String name);

    @GetMapping("/move-damage-class")
    PokeApiNamedResourceList getMoveDamageClasses();

    @GetMapping("/move-damage-class/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiMoveDamageClass getMoveDamageClassById(@PathVariable Integer id);

    @GetMapping("/move-damage-class/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiMoveDamageClass getMoveDamageClassByName(@PathVariable String name);

    @GetMapping("/move-learn-method")
    PokeApiNamedResourceList getMoveLearnMethods();

    @GetMapping("/move-learn-method/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiMoveLearnMethod getMoveLearnMethodById(@PathVariable Integer id);

    @GetMapping("/move-learn-method/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiMoveLearnMethod getMoveLearnMethodByName(@PathVariable String name);

    @GetMapping("/move-target")
    PokeApiNamedResourceList getMoveTargets();

    @GetMapping("/move-target/{id}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiMoveTarget getMoveTargetById(@PathVariable Integer id);

    @GetMapping("/move-target/{name}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    PokeApiMoveTarget getMoveTargetByName(@PathVariable String name);
}

package pt.figtreestudios.springpokeapi.proxy.pokeapi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pt.figtreestudios.TestConfig;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNamedApiResource;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Import(TestConfig.class)
class PokeApiMovesTest {
    @Autowired
    private PokeApiMoves pokeApiMoves;

    @Test
    public void whenGetMoves_success() {
        pokeApiMoves.getMoves(1, 1);
    }

    @Test
    public void whenGetMoveById_success() {
        pokeApiMoves.getMoveById(1);
    }

    @Test
    public void whenGetMoveByName_success() {
        pokeApiMoves.getMoves(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiMoves::getMoveByName);
    }

    @Test
    public void whenGetMoveAilments_success() {
        pokeApiMoves.getMoveAilments(1, 1);
    }

    @Test
    public void whenGetMoveAilmentById_success() {
        pokeApiMoves.getMoveAilmentById(1);
    }

    @Test
    public void whenGetMoveAilmentByName_success() {
        pokeApiMoves.getMoveAilments(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiMoves::getMoveAilmentByName);
    }

    @Test
    public void whenGetMoveBattleStyles_success() {
        pokeApiMoves.getMoveBattleStyles(1, 1);
    }

    @Test
    public void whenGetMoveBattleStyleById_success() {
        pokeApiMoves.getMoveBattleStyleById(1);
    }

    @Test
    public void whenGetMoveBattleStyleByName_success() {
        pokeApiMoves.getMoveBattleStyles(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiMoves::getMoveBattleStyleByName);
    }

    @Test
    public void whenGetMoveCategories_success() {
        pokeApiMoves.getMoveCategories(1, 1);
    }

    @Test
    public void whenGetMoveCategoryById_success() {
        pokeApiMoves.getMoveCategoryById(1);
    }

    @Test
    public void whenGetMoveCategoryByName_success() {
        pokeApiMoves.getMoveCategories(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiMoves::getMoveCategoryByName);
    }

    @Test
    public void whenGetMoveDamageClasses_success() {
        pokeApiMoves.getMoveDamageClasses(1, 1);
    }

    @Test
    public void whenGetMoveDamageClassById_success() {
        pokeApiMoves.getMoveDamageClassById(1);
    }

    @Test
    public void whenGetMoveDamageClassByName_success() {
        pokeApiMoves.getMoveDamageClasses(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiMoves::getMoveDamageClassByName);
    }

    @Test
    public void whenGetMoveLearnMethods_success() {
        pokeApiMoves.getMoveLearnMethods(1, 1);
    }

    @Test
    public void whenGetMoveLearnMethodById_success() {
        pokeApiMoves.getMoveLearnMethodById(1);
    }

    @Test
    public void whenGetMoveLearnMethodByName_success() {
        pokeApiMoves.getMoveLearnMethods(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiMoves::getMoveLearnMethodByName);
    }

    @Test
    public void whenGetMoveTargets_success() {
        pokeApiMoves.getMoveTargets(1, 1);
    }

    @Test
    public void whenGetMoveTargetById_success() {
        pokeApiMoves.getMoveTargetById(1);
    }

    @Test
    public void whenGetMoveTargetByName_success() {
        pokeApiMoves.getMoveTargets(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiMoves::getMoveTargetByName);
    }
}

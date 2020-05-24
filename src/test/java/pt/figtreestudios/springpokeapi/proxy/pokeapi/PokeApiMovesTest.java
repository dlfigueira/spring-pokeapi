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
        pokeApiMoves.getMoves();
    }

    @Test
    public void whenGetMoveById_success() {
        pokeApiMoves.getMoveById(1);
    }

    @Test
    public void whenGetMoveByName_success() {
        pokeApiMoves.getMoves().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiMoves::getMoveByName);
    }

    @Test
    public void whenGetMoveAilments_success() {
        pokeApiMoves.getMoveAilments();
    }

    @Test
    public void whenGetMoveAilmentById_success() {
        pokeApiMoves.getMoveAilmentById(1);
    }

    @Test
    public void whenGetMoveAilmentByName_success() {
        pokeApiMoves.getMoveAilments().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiMoves::getMoveAilmentByName);
    }

    @Test
    public void whenGetMoveBattleStyles_success() {
        pokeApiMoves.getMoveBattleStyles();
    }

    @Test
    public void whenGetMoveBattleStyleById_success() {
        pokeApiMoves.getMoveBattleStyleById(1);
    }

    @Test
    public void whenGetMoveBattleStyleByName_success() {
        pokeApiMoves.getMoveBattleStyles().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiMoves::getMoveBattleStyleByName);
    }

    @Test
    public void whenGetMoveCategories_success() {
        pokeApiMoves.getMoveCategories();
    }

    @Test
    public void whenGetMoveCategoryById_success() {
        pokeApiMoves.getMoveCategoryById(1);
    }

    @Test
    public void whenGetMoveCategoryByName_success() {
        pokeApiMoves.getMoveCategories().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiMoves::getMoveCategoryByName);
    }

    @Test
    public void whenGetMoveDamageClasses_success() {
        pokeApiMoves.getMoveDamageClasses();
    }

    @Test
    public void whenGetMoveDamageClassById_success() {
        pokeApiMoves.getMoveDamageClassById(1);
    }

    @Test
    public void whenGetMoveDamageClassByName_success() {
        pokeApiMoves.getMoveDamageClasses().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiMoves::getMoveDamageClassByName);
    }

    @Test
    public void whenGetMoveLearnMethods_success() {
        pokeApiMoves.getMoveLearnMethods();
    }

    @Test
    public void whenGetMoveLearnMethodById_success() {
        pokeApiMoves.getMoveLearnMethodById(1);
    }

    @Test
    public void whenGetMoveLearnMethodByName_success() {
        pokeApiMoves.getMoveLearnMethods().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiMoves::getMoveLearnMethodByName);
    }

    @Test
    public void whenGetMoveTargets_success() {
        pokeApiMoves.getMoveTargets();
    }

    @Test
    public void whenGetMoveTargetById_success() {
        pokeApiMoves.getMoveTargetById(1);
    }

    @Test
    public void whenGetMoveTargetByName_success() {
        pokeApiMoves.getMoveTargets().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiMoves::getMoveTargetByName);
    }
}

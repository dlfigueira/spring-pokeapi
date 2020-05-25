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
class PokeApiContestsTest {
    @Autowired
    private PokeApiContests pokeApiContests;

    @Test
    public void whenGetContestTypes_success() {
        pokeApiContests.getContestTypes(1, 1);
    }

    @Test
    public void whenGetContestTypeById_success() {
        pokeApiContests.getContestTypeById(1);
    }

    @Test
    public void whenGetContestTypeByName_success() {
        pokeApiContests.getContestTypes(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiContests::getContestTypeByName);
    }

    @Test
    public void whenGetContestEffects_success() {
        pokeApiContests.getContestEffects(1, 1);
    }

    @Test
    public void whenGetContestEffectById_success() {
        pokeApiContests.getContestEffectById(1);
    }

    @Test
    public void whenGetSuperContestEffects_success() {
        pokeApiContests.getSuperContestEffects(1, 1);
    }

    @Test
    public void whenGetSuperContestEffectById_success() {
        pokeApiContests.getSuperContestEffectById(1);
    }
}

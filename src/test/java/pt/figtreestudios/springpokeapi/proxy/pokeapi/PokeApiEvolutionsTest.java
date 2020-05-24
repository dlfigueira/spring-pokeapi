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
class PokeApiEvolutionsTest {
    @Autowired
    private PokeApiEvolution pokeApiEvolution;

    @Test
    public void whenGetEvolutionChains_success() {
        pokeApiEvolution.getEvolutionChains();
    }

    @Test
    public void whenGetEvolutionChainById_success() {
        pokeApiEvolution.getEvolutionChainById(1);
    }

    @Test
    public void whenGetEvolutionTriggers_success() {
        pokeApiEvolution.getEvolutionTriggers();
    }

    @Test
    public void whenGetEvolutionTriggerById_success() {
        pokeApiEvolution.getEvolutionTriggerById(1);
    }

    @Test
    public void whenGetEvolutionTriggerByName_success() {
        pokeApiEvolution.getEvolutionTriggers().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiEvolution::getEvolutionTriggerByName);
    }
}

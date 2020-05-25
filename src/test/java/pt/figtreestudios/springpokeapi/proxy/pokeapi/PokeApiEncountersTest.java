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
class PokeApiEncountersTest {
    @Autowired
    private PokeApiEncounters pokeApiEncounters;

    @Test
    public void whenGetEncounterMethods_success() {
        pokeApiEncounters.getEncounterMethods(1, 1);
    }

    @Test
    public void whenGetEncounterMethodById_success() {
        pokeApiEncounters.getEncounterMethodById(1);
    }

    @Test
    public void whenGetEncounterMethodByName_success() {
        pokeApiEncounters.getEncounterMethods(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiEncounters::getEncounterMethodByName);
    }

    @Test
    public void whenGetEncounterConditions_success() {
        pokeApiEncounters.getEncounterConditions(1, 1);
    }

    @Test
    public void whenGetEncounterConditionById_success() {
        pokeApiEncounters.getEncounterConditionById(1);
    }

    @Test
    public void whenGetEncounterConditionByName_success() {
        pokeApiEncounters.getEncounterConditions(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiEncounters::getEncounterConditionByName);
    }

    @Test
    public void whenGetEncounterConditionValues_success() {
        pokeApiEncounters.getEncounterConditionValues(1, 1);
    }

    @Test
    public void whenGetEncounterConditionValueById_success() {
        pokeApiEncounters.getEncounterConditionValueById(1);
    }

    @Test
    public void whenGetEncounterConditionValueByName_success() {
        pokeApiEncounters.getEncounterConditionValues(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiEncounters::getEncounterConditionValueByName);
    }
}

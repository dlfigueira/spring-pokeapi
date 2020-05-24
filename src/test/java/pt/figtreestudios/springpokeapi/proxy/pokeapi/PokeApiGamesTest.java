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
class PokeApiGamesTest {
    @Autowired
    private PokeApiGames pokeApiGames;

    @Test
    public void whenGetGenerations_success() {
        pokeApiGames.getGenerations();
    }

    @Test
    public void whenGetGenerationById_success() {
        pokeApiGames.getGenerationById(1);
    }

    @Test
    public void whenGetGenerationByName_success() {
        pokeApiGames.getGenerations().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiGames::getGenerationByName);
    }

    @Test
    public void whenGetPokedex_success() {
        pokeApiGames.getPokedex();
    }

    @Test
    public void whenGetPokedexById_success() {
        pokeApiGames.getPokedexById(1);
    }

    @Test
    public void whenGetPokedexByName_success() {
        pokeApiGames.getPokedex().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiGames::getPokedexByName);
    }

    @Test
    public void whenGetVersions_success() {
        pokeApiGames.getVersions();
    }

    @Test
    public void whenGetVersionById_success() {
        pokeApiGames.getVersionById(1);
    }

    @Test
    public void whenGetVersionByName_success() {
        pokeApiGames.getVersions().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiGames::getVersionByName);
    }

    @Test
    public void whenGetVersionGroups_success() {
        pokeApiGames.getVersionGroups();
    }

    @Test
    public void whenGetVersionGroupById_success() {
        pokeApiGames.getVersionGroupById(1);
    }

    @Test
    public void whenGetVersionGroupByName_success() {
        pokeApiGames.getVersionGroups().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiGames::getVersionGroupByName);
    }
}

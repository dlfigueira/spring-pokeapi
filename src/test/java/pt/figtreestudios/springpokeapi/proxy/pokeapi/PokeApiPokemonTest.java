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
class PokeApiPokemonTest {
    @Autowired
    private PokeApiPokemon pokeApiPokemon;

    @Test
    public void whenGetAbilities_success() {
        pokeApiPokemon.getAbilities(1, 1);
    }

    @Test
    public void whenGetAbilityById_success() {
        pokeApiPokemon.getAbilityById(1);
    }

    @Test
    public void whenGetAbilityByName_success() {
        pokeApiPokemon.getAbilities(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiPokemon::getAbilityByName);
    }

    @Test
    public void whenGetCharacteristics_success() {
        pokeApiPokemon.getCharacteristics(1, 1);
    }

    @Test
    public void whenGetCharacteristicById_success() {
        pokeApiPokemon.getCharacteristicById(1);
    }

    @Test
    public void whenGetEggGroups_success() {
        pokeApiPokemon.getEggGroups(1, 1);
    }

    @Test
    public void whenGetEggGroupById_success() {
        pokeApiPokemon.getEggGroupById(1);
    }

    @Test
    public void whenGetEggGroupByName_success() {
        pokeApiPokemon.getEggGroups(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiPokemon::getEggGroupByName);
    }

    @Test
    public void whenGetGenders_success() {
        pokeApiPokemon.getGenders(1, 1);
    }

    @Test
    public void whenGetGenderById_success() {
        pokeApiPokemon.getGenderById(1);
    }

    @Test
    public void whenGetGenderByName_success() {
        pokeApiPokemon.getGenders(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiPokemon::getGenderByName);
    }

    @Test
    public void whenGetGrowthRates_success() {
        pokeApiPokemon.getGrowthRates(1, 1);
    }

    @Test
    public void whenGetGrowthRateById_success() {
        pokeApiPokemon.getGrowthRateById(1);
    }

    @Test
    public void whenGetGrowthRateByName_success() {
        pokeApiPokemon.getGrowthRates(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiPokemon::getGrowthRateByName);
    }

    @Test
    public void whenGetNatures_success() {
        pokeApiPokemon.getNatures(1, 1);
    }

    @Test
    public void whenGetNatureById_success() {
        pokeApiPokemon.getNatureById(1);
    }

    @Test
    public void whenGetNatureByName_success() {
        pokeApiPokemon.getNatures(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiPokemon::getNatureByName);
    }

    @Test
    public void whenGetPokeathlonStats_success() {
        pokeApiPokemon.getPokeathlonStats(1, 1);
    }

    @Test
    public void whenGetPokeathlonStatById_success() {
        pokeApiPokemon.getPokeathlonStatById(1);
    }

    @Test
    public void whenGetPokeathlonStatByName_success() {
        pokeApiPokemon.getPokeathlonStats(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiPokemon::getPokeathlonStatByName);
    }

    @Test
    public void whenGetPokemons_success() {
        pokeApiPokemon.getPokemons(1, 1);
    }

    @Test
    public void whenGetPokemonById_success() {
        pokeApiPokemon.getPokemonById(1);
    }

    @Test
    public void whenGetPokemonByName_success() {
        pokeApiPokemon.getPokemons(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiPokemon::getPokemonByName);
    }

    @Test
    public void whenGetPokemonColors_success() {
        pokeApiPokemon.getPokemonColors(1, 1);
    }

    @Test
    public void whenGetPokemonColorById_success() {
        pokeApiPokemon.getPokemonColorById(1);
    }

    @Test
    public void whenGetPokemonColorByName_success() {
        pokeApiPokemon.getPokemonColors(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiPokemon::getPokemonColorByName);
    }

    @Test
    public void whenGetPokemonForms_success() {
        pokeApiPokemon.getPokemonForms(1, 1);
    }

    @Test
    public void whenGetPokemonFormById_success() {
        pokeApiPokemon.getPokemonFormById(1);
    }

    @Test
    public void whenGetPokemonFormByName_success() {
        pokeApiPokemon.getPokemonForms(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiPokemon::getPokemonFormByName);
    }

    @Test
    public void whenGetPokemonHabitats_success() {
        pokeApiPokemon.getPokemonHabitats(1, 1);
    }

    @Test
    public void whenGetPokemonHabitatById_success() {
        pokeApiPokemon.getPokemonHabitatById(1);
    }

    @Test
    public void whenGetPokemonHabitatByName_success() {
        pokeApiPokemon.getPokemonHabitats(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiPokemon::getPokemonHabitatByName);
    }

    @Test
    public void whenGetPokemonShapes_success() {
        pokeApiPokemon.getPokemonShapes(1, 1);
    }

    @Test
    public void whenGetPokemonShapeById_success() {
        pokeApiPokemon.getPokemonShapeById(1);
    }

    @Test
    public void whenGetPokemonShapeByName_success() {
        pokeApiPokemon.getPokemonShapes(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiPokemon::getPokemonShapeByName);
    }

    @Test
    public void whenGetPokemonSpecies_success() {
        pokeApiPokemon.getPokemonSpecies(1, 1);
    }

    @Test
    public void whenGetPokemonSpeciesById_success() {
        pokeApiPokemon.getPokemonSpeciesById(1);
    }

    @Test
    public void whenGetPokemonSpeciesByName_success() {
        pokeApiPokemon.getPokemonSpecies(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiPokemon::getPokemonSpeciesByName);
    }

    @Test
    public void whenGetStats_success() {
        pokeApiPokemon.getStats(1, 1);
    }

    @Test
    public void whenGetStatById_success() {
        pokeApiPokemon.getStatById(1);
    }

    @Test
    public void whenGetStatByName_success() {
        pokeApiPokemon.getStats(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiPokemon::getStatByName);
    }

    @Test
    public void whenGetTypes_success() {
        pokeApiPokemon.getTypes(1, 1);
    }

    @Test
    public void whenGetTypeById_success() {
        pokeApiPokemon.getTypeById(1);
    }

    @Test
    public void whenGetTypeByName_success() {
        pokeApiPokemon.getTypes(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiPokemon::getTypeByName);
    }
}

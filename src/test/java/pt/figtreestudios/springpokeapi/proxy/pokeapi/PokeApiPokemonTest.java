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
        pokeApiPokemon.getAbilities();
    }

    @Test
    public void whenGetAbilityById_success() {
        pokeApiPokemon.getAbilityById(1);
    }

    @Test
    public void whenGetAbilityByName_success() {
        pokeApiPokemon.getAbilities().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiPokemon::getAbilityByName);
    }

    @Test
    public void whenGetCharacteristics_success() {
        pokeApiPokemon.getCharacteristics();
    }

    @Test
    public void whenGetCharacteristicById_success() {
        pokeApiPokemon.getCharacteristicById(1);
    }

    @Test
    public void whenGetEggGroups_success() {
        pokeApiPokemon.getEggGroups();
    }

    @Test
    public void whenGetEggGroupById_success() {
        pokeApiPokemon.getEggGroupById(1);
    }

    @Test
    public void whenGetEggGroupByName_success() {
        pokeApiPokemon.getEggGroups().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiPokemon::getEggGroupByName);
    }

    @Test
    public void whenGetGenders_success() {
        pokeApiPokemon.getGenders();
    }

    @Test
    public void whenGetGenderById_success() {
        pokeApiPokemon.getGenderById(1);
    }

    @Test
    public void whenGetGenderByName_success() {
        pokeApiPokemon.getGenders().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiPokemon::getGenderByName);
    }

    @Test
    public void whenGetGrowthRates_success() {
        pokeApiPokemon.getGrowthRates();
    }

    @Test
    public void whenGetGrowthRateById_success() {
        pokeApiPokemon.getGrowthRateById(1);
    }

    @Test
    public void whenGetGrowthRateByName_success() {
        pokeApiPokemon.getGrowthRates().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiPokemon::getGrowthRateByName);
    }

    @Test
    public void whenGetNatures_success() {
        pokeApiPokemon.getNatures();
    }

    @Test
    public void whenGetNatureById_success() {
        pokeApiPokemon.getNatureById(1);
    }

    @Test
    public void whenGetNatureByName_success() {
        pokeApiPokemon.getNatures().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiPokemon::getNatureByName);
    }

    @Test
    public void whenGetPokeathlonStats_success() {
        pokeApiPokemon.getPokeathlonStats();
    }

    @Test
    public void whenGetPokeathlonStatById_success() {
        pokeApiPokemon.getPokeathlonStatById(1);
    }

    @Test
    public void whenGetPokeathlonStatByName_success() {
        pokeApiPokemon.getPokeathlonStats().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiPokemon::getPokeathlonStatByName);
    }

    @Test
    public void whenGetPokemons_success() {
        pokeApiPokemon.getPokemons();
    }

    @Test
    public void whenGetPokemonById_success() {
        pokeApiPokemon.getPokemonById(1);
    }

    @Test
    public void whenGetPokemonByName_success() {
        pokeApiPokemon.getPokemons().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiPokemon::getPokemonByName);
    }

    @Test
    public void whenGetPokemonColors_success() {
        pokeApiPokemon.getPokemonColors();
    }

    @Test
    public void whenGetPokemonColorById_success() {
        pokeApiPokemon.getPokemonColorById(1);
    }

    @Test
    public void whenGetPokemonColorByName_success() {
        pokeApiPokemon.getPokemonColors().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiPokemon::getPokemonColorByName);
    }

    @Test
    public void whenGetPokemonForms_success() {
        pokeApiPokemon.getPokemonForms();
    }

    @Test
    public void whenGetPokemonFormById_success() {
        pokeApiPokemon.getPokemonFormById(1);
    }

    @Test
    public void whenGetPokemonFormByName_success() {
        pokeApiPokemon.getPokemonForms().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiPokemon::getPokemonFormByName);
    }

    @Test
    public void whenGetPokemonHabitats_success() {
        pokeApiPokemon.getPokemonHabitats();
    }

    @Test
    public void whenGetPokemonHabitatById_success() {
        pokeApiPokemon.getPokemonHabitatById(1);
    }

    @Test
    public void whenGetPokemonHabitatByName_success() {
        pokeApiPokemon.getPokemonHabitats().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiPokemon::getPokemonHabitatByName);
    }

    @Test
    public void whenGetPokemonShapes_success() {
        pokeApiPokemon.getPokemonShapes();
    }

    @Test
    public void whenGetPokemonShapeById_success() {
        pokeApiPokemon.getPokemonShapeById(1);
    }

    @Test
    public void whenGetPokemonShapeByName_success() {
        pokeApiPokemon.getPokemonShapes().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiPokemon::getPokemonShapeByName);
    }

    @Test
    public void whenGetPokemonSpecies_success() {
        pokeApiPokemon.getPokemonSpecies();
    }

    @Test
    public void whenGetPokemonSpeciesById_success() {
        pokeApiPokemon.getPokemonSpeciesById(1);
    }

    @Test
    public void whenGetPokemonSpeciesByName_success() {
        pokeApiPokemon.getPokemonSpecies().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiPokemon::getPokemonSpeciesByName);
    }

    @Test
    public void whenGetStats_success() {
        pokeApiPokemon.getStats();
    }

    @Test
    public void whenGetStatById_success() {
        pokeApiPokemon.getStatById(1);
    }

    @Test
    public void whenGetStatByName_success() {
        pokeApiPokemon.getStats().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiPokemon::getStatByName);
    }

    @Test
    public void whenGetTypes_success() {
        pokeApiPokemon.getTypes();
    }

    @Test
    public void whenGetTypeById_success() {
        pokeApiPokemon.getTypeById(1);
    }

    @Test
    public void whenGetTypeByName_success() {
        pokeApiPokemon.getTypes().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiPokemon::getTypeByName);
    }
}

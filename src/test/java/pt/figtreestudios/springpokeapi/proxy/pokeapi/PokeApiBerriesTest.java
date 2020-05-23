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
class PokeApiBerriesTest {
    @Autowired
    private PokeApiBerries pokeApiBerries;

    @Test
    public void whenGetBerries_success() {
        pokeApiBerries.getBerries();
    }

    @Test
    public void whenGetBerryById_success() {
        pokeApiBerries.getBerryById(1);
    }

    @Test
    public void whenGetBerryByName_success() {
        pokeApiBerries.getBerries().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiBerries::getBerryByName);
    }

    @Test
    public void whenGetBerryFirmnesses_success() {
        pokeApiBerries.getBerryFirmnesses();
    }

    @Test
    public void whenGetBerryFirmnessById_success() {
        pokeApiBerries.getBerryFirmnessById(1);
    }

    @Test
    public void whenGetBerryFirmnessByName_success() {
        pokeApiBerries.getBerryFirmnesses().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiBerries::getBerryFirmnessByName);
    }

    @Test
    public void whenGetBerryFlavors_success() {
        pokeApiBerries.getBerryFlavors();
    }

    @Test
    public void whenGetBerryFlavorById_success() {
        pokeApiBerries.getBerryFlavorById(1);
    }

    @Test
    public void whenGetBerryFlavorByName_success() {
        pokeApiBerries.getBerryFlavors().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiBerries::getBerryFlavorByName);
    }
}

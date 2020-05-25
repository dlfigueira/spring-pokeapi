package pt.figtreestudios.springpokeapi.proxy.pokeapi;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pt.figtreestudios.TestConfig;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNamedApiResource;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNamedResourceList;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Import(TestConfig.class)
class PokeApiBerriesTest {
    @Autowired
    private PokeApiBerries pokeApiBerries;

    @Test
    public void whenGetBerries_success() {
        pokeApiBerries.getBerries(1, 1);
    }

    @Test
    public void givenPagination_whenGetBerries_success() {
        PokeApiNamedResourceList berriesFirstPage = pokeApiBerries.getBerries(1, 0);
        PokeApiNamedResourceList berriesSecondPage = pokeApiBerries.getBerries(1, 1);

        Assertions.assertThat(berriesFirstPage.getResults().size()).isEqualTo(1);
        Assertions.assertThat(berriesSecondPage.getResults().size()).isEqualTo(1);
        Assertions.assertThat(berriesFirstPage.getResults().get(0)).isNotEqualTo(berriesSecondPage.getResults().get(0));
    }

    @Test
    public void whenGetBerryById_success() {
        pokeApiBerries.getBerryById(1);
    }

    @Test
    public void whenGetBerryByName_success() {
        pokeApiBerries.getBerries(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiBerries::getBerryByName);
    }

    @Test
    public void whenGetBerryFirmnesses_success() {
        pokeApiBerries.getBerryFirmnesses(1, 1);
    }

    @Test
    public void whenGetBerryFirmnessById_success() {
        pokeApiBerries.getBerryFirmnessById(1);
    }

    @Test
    public void whenGetBerryFirmnessByName_success() {
        pokeApiBerries.getBerryFirmnesses(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiBerries::getBerryFirmnessByName);
    }

    @Test
    public void whenGetBerryFlavors_success() {
        pokeApiBerries.getBerryFlavors(1, 1);
    }

    @Test
    public void whenGetBerryFlavorById_success() {
        pokeApiBerries.getBerryFlavorById(1);
    }

    @Test
    public void whenGetBerryFlavorByName_success() {
        pokeApiBerries.getBerryFlavors(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiBerries::getBerryFlavorByName);
    }
}

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
class PokeApiLocationsTest {
    @Autowired
    private PokeApiLocations pokeApiLocations;

    @Test
    public void whenGetLocations_success() {
        pokeApiLocations.getLocations();
    }

    @Test
    public void whenGetLocationById_success() {
        pokeApiLocations.getLocationById(1);
    }

    @Test
    public void whenGetLocationByName_success() {
        pokeApiLocations.getLocations().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiLocations::getLocationByName);
    }

    @Test
    public void whenGetLocationAreas_success() {
        pokeApiLocations.getLocationAreas();
    }

    @Test
    public void whenGetLocationAreaById_success() {
        pokeApiLocations.getLocationAreaById(1);
    }

    @Test
    public void whenGetLocationAreaByName_success() {
        pokeApiLocations.getLocationAreas().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiLocations::getLocationAreaByName);
    }

    @Test
    public void whenGetPalParkAreas_success() {
        pokeApiLocations.getPalParkAreas();
    }

    @Test
    public void whenGetPalParkAreaById_success() {
        pokeApiLocations.getPalParkAreaById(1);
    }

    @Test
    public void whenGetPalParkAreaByName_success() {
        pokeApiLocations.getPalParkAreas().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiLocations::getPalParkAreaByName);
    }

    @Test
    public void whenGetRegions_success() {
        pokeApiLocations.getRegions();
    }

    @Test
    public void whenGetRegionById_success() {
        pokeApiLocations.getRegionById(1);
    }

    @Test
    public void whenGetRegionByName_success() {
        pokeApiLocations.getRegions().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiLocations::getRegionByName);
    }
}

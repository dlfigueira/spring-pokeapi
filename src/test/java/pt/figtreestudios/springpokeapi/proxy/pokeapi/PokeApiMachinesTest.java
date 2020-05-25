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
class PokeApiMachinesTest {
    @Autowired
    private PokeApiMachines pokeApiMachines;

    @Test
    public void whenGetMachines_success() {
        pokeApiMachines.getMachines(1, 1);
    }

    @Test
    public void whenGetMachineById_success() {
        pokeApiMachines.getMachineById(1);
    }

    @Test
    public void whenGetMachineByName_success() {
        pokeApiMachines.getMachines(1, 1).getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiMachines::getMachineByName);
    }
}

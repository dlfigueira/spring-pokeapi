package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiMachineVersionDetail {
    private PokeApiApiResource machine;
    private PokeApiNamedApiResource version_group;
}

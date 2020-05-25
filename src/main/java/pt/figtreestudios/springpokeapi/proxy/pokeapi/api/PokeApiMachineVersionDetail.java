package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiMachineVersionDetail implements Serializable {
    private PokeApiApiResource machine;
    private PokeApiNamedApiResource version_group;
}

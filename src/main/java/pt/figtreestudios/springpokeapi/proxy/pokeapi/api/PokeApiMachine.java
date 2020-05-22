package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiMachine {
    private Integer id;
    private PokeApiNamedApiResource item;
    private PokeApiNamedApiResource move;
    private PokeApiNamedApiResource version_group;
}

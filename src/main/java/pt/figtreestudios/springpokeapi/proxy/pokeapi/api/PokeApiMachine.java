package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiMachine {
    private Integer id;
    private PokeApiNamedResource item;
    private PokeApiNamedResource move;
    private PokeApiNamedResource version_group;
}

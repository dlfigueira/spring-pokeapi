package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiTypePokemon {
    private Integer slot;
    private PokeApiNamedResource pokemon;
}

package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiPastMoveStatChange {
    private Integer change;
    private PokeApiNamedApiResource stat;
}

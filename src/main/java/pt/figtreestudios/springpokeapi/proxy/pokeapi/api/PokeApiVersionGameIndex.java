package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiVersionGameIndex {
    private Integer game_index;
    private PokeApiNamedApiResource version;
}

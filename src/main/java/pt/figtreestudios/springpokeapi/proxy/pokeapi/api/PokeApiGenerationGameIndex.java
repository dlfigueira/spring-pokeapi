package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiGenerationGameIndex {
    private Integer game_index;
    private PokeApiNamedApiResource generation;
}

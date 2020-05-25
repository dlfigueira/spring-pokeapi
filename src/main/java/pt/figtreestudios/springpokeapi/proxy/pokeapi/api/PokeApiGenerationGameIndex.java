package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiGenerationGameIndex implements Serializable {
    private Integer game_index;
    private PokeApiNamedApiResource generation;
}

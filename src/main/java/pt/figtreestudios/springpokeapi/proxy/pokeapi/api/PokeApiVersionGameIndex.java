package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiVersionGameIndex implements Serializable {
    private Integer game_index;
    private PokeApiNamedApiResource version;
}

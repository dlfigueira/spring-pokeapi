package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiPastMoveStatChange {
    private Integer change;
    private PokeApiNamedApiResource stat;
}

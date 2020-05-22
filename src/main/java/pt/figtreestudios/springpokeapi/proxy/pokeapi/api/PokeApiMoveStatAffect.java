package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiMoveStatAffect {
    private Integer change;
    private PokeApiNamedApiResource move;
}

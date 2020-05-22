package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiMoveStatAffectSets {
    private List<PokeApiMoveStatAffect> increase;
    private List<PokeApiMoveStatAffect> decrease;
}

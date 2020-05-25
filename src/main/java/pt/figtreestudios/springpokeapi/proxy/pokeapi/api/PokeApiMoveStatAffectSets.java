package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiMoveStatAffectSets implements Serializable {
    private List<PokeApiMoveStatAffect> increase;
    private List<PokeApiMoveStatAffect> decrease;
}

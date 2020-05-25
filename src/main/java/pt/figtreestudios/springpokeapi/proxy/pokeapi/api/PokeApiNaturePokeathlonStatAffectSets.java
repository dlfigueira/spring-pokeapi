package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiNaturePokeathlonStatAffectSets implements Serializable {
    private List<PokeApiNaturePokeathlonStatAffect> increase;
    private List<PokeApiNaturePokeathlonStatAffect> decrease;
}

package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiNaturePokeathlonStatAffectSets {
    private List<PokeApiNaturePokeathlonStatAffect> increase;
    private List<PokeApiNaturePokeathlonStatAffect> decrease;
}

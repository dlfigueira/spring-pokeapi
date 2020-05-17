package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiNaturePokeathlonStatAffectSets {
    private PokeApiNaturePokeathlonStatAffect increase;
    private PokeApiNaturePokeathlonStatAffect decrease;
}

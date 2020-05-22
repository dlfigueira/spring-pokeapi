package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiNatureStatAffectSets {
    private PokeApiNamedResource increase;
    private PokeApiNamedResource decrease;
}

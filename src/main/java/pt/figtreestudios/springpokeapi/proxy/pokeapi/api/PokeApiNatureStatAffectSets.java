package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiNatureStatAffectSets {
    private PokeApiNamedApiResource increase;
    private PokeApiNamedApiResource decrease;
}

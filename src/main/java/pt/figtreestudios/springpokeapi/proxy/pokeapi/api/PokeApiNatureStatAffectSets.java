package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiNatureStatAffectSets {
    private List<PokeApiNamedApiResource> increase;
    private List<PokeApiNamedApiResource> decrease;
}

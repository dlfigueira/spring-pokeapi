package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiBerryFlavorMap {
    private Integer potency;
    private PokeApiNamedApiResource flavor;
}

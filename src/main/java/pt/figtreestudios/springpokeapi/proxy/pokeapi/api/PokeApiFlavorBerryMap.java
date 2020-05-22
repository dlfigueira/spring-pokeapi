package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiFlavorBerryMap {
    private Integer potency;
    private PokeApiNamedApiResource berry;
}

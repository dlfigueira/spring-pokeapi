package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiFlavorBerryMap implements Serializable {
    private Integer potency;
    private PokeApiNamedApiResource berry;
}

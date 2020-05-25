package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiBerryFlavorMap implements Serializable {
    private Integer potency;
    private PokeApiNamedApiResource flavor;
}

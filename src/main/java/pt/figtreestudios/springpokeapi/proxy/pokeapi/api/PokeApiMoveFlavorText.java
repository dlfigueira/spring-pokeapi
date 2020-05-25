package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiMoveFlavorText implements Serializable {
    private String flavor_text;
    private PokeApiNamedApiResource language;
    private PokeApiNamedApiResource version_group;
}

package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiVersionGroupFlavorText implements Serializable {
    private String text;
    private PokeApiNamedApiResource language;
    private PokeApiNamedApiResource version_group;
}

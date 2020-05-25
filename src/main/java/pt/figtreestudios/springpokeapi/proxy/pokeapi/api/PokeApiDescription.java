package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiDescription implements Serializable {
    private String description;
    private PokeApiNamedApiResource language;
}

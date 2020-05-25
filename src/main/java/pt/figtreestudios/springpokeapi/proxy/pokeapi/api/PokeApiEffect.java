package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiEffect implements Serializable {
    private String effect;
    private PokeApiNamedApiResource language;
}

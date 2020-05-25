package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiNamedApiResource implements Serializable {
    private String name;
    private String url;
}

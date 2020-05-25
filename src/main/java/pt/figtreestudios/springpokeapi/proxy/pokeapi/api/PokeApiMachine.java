package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiMachine implements Serializable {
    private Integer id;
    private PokeApiNamedApiResource item;
    private PokeApiNamedApiResource move;
    private PokeApiNamedApiResource version_group;
}

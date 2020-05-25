package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiItemCategory implements Serializable {
    private Integer id;
    private String name;
    private List<PokeApiNamedApiResource> items;
    private List<PokeApiName> names;
    private PokeApiNamedApiResource pocket;
}

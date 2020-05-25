package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiNamedResourceList implements Serializable {
    private Integer count;
    private String next;
    private String previous;
    private List<PokeApiNamedApiResource> results;
}

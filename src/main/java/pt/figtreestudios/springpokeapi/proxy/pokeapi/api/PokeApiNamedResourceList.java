package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiNamedResourceList {
    private Integer count;
    private String next;
    private String previous;
    private List<PokeApiNamedResource> results;
}

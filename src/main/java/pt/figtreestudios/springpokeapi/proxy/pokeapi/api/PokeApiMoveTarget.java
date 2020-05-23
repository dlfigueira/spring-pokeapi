package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiMoveTarget {
    private Integer id;
    private String name;
    private List<PokeApiDescription> descriptions;
    private List<PokeApiNamedApiResource> moves;
    private List<PokeApiName> names;
}

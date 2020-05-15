package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiVersion {
    private Integer id;
    private String name;
    private List<PokeApiName> names;
    private PokeApiNamedResource version_group;
}

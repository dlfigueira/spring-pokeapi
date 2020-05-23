package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiRegion {
    private Integer id;
    private List<PokeApiNamedApiResource> locations;
    private String name;
    private List<PokeApiName> names;
    private PokeApiNamedApiResource main_generation;
    private List<PokeApiNamedApiResource> pokedexes;
    private List<PokeApiNamedApiResource> version_groups;
}

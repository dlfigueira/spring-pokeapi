package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiGeneration implements Serializable {
    private Integer id;
    private String name;
    private List<PokeApiNamedApiResource> abilities;
    private List<PokeApiName> names;
    private PokeApiNamedApiResource main_region;
    private List<PokeApiNamedApiResource> moves;
    private List<PokeApiNamedApiResource> pokemon_species;
    private List<PokeApiNamedApiResource> types;
    private List<PokeApiNamedApiResource> version_groups;
}

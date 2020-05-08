package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiGenerationApi {
    private Integer id;
    private String name;
    private List<PokeApiNamedResource> abilities;
    private List<PokeApiName> names;
    private PokeApiNamedResource main_region;
    private List<PokeApiNamedResource> moves;
    private List<PokeApiNamedResource> pokemon_species;
    private List<PokeApiNamedResource> types;
    private List<PokeApiNamedResource> version_groups;
}

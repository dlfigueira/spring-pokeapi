package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiVersionGroup {
    private Integer id;
    private String name;
    private Integer order;
    private PokeApiNamedResource generation;
    private List<PokeApiNamedResource> move_learn_methods;
    private List<PokeApiNamedResource> pokedexes;
    private List<PokeApiNamedResource> regions;
    private List<PokeApiNamedResource> versions;
}

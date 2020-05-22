package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiVersionGroup {
    private Integer id;
    private String name;
    private Integer order;
    private PokeApiNamedApiResource generation;
    private List<PokeApiNamedApiResource> move_learn_methods;
    private List<PokeApiNamedApiResource> pokedexes;
    private List<PokeApiNamedApiResource> regions;
    private List<PokeApiNamedApiResource> versions;
}

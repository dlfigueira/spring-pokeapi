package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiEggGroup {
    private Integer id;
    private String name;
    private List<PokeApiName> names;
    private List<PokeApiNamedResource> pokemon_species;
}

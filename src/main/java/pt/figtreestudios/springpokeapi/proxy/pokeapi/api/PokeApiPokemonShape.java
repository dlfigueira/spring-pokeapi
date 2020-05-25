package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiPokemonShape implements Serializable {
    private Integer id;
    private String name;
    private List<PokeApiAwesomeName> awesome_names;
    private List<PokeApiName> names;
    private List<PokeApiNamedApiResource> pokemon_species;
}

package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiGender {
    private Integer id;
    private String name;
    private List<PokeApiSpeciesGender> pokemon_species_details;
    private List<PokeApiNamedResource> required_for_evolution;
}

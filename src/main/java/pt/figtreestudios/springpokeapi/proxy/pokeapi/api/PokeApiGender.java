package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiGender implements Serializable {
    private Integer id;
    private String name;
    private List<PokeApiSpeciesGender> pokemon_species_details;
    private List<PokeApiNamedApiResource> required_for_evolution;
}

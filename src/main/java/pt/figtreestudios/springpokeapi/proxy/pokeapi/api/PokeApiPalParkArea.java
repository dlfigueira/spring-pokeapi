package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiPalParkArea implements Serializable {
    private Integer id;
    private String name;
    private List<PokeApiName> names;
    private List<PokeApiPalParkEncounterSpecies> pokemon_encounters;
}

package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiLocationArea implements Serializable {
    private Integer id;
    private String name;
    private Integer game_index;
    private List<PokeApiEncounterMethodRate> encounter_method_rates;
    private PokeApiNamedApiResource location;
    private List<PokeApiName> names;
    private List<PokeApiPokemonEncounter> pokemon_encounters;
}

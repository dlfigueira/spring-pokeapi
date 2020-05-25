package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiPokemonEncounter implements Serializable {
    private PokeApiNamedApiResource pokemon;
    private List<PokeApiEncounterVersionDetails> version_details;
}

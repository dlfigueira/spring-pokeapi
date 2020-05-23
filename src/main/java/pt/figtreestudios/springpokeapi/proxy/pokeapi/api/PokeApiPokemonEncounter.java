package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiPokemonEncounter {
    private PokeApiNamedApiResource pokemon;
    private List<PokeApiEncounterVersionDetails> version_details;
}

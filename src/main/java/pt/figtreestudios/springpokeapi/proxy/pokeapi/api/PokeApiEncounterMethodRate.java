package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiEncounterMethodRate {
    private PokeApiNamedApiResource encounter_method;
    private List<PokeApiEncounterVersionDetails> version_details;
}

package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiEncounterMethodRate implements Serializable {
    private PokeApiNamedApiResource encounter_method;
    private List<PokeApiEncounterVersionDetails> version_details;
}

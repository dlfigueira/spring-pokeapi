package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiLocationAreaEncounter {
    private PokeApiNamedApiResource location_area;
    private List<PokeApiVersionEncounterDetail> version_details;
}

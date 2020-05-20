package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiVersionEncounterDetail {
    private PokeApiNamedResource version;
    private Integer max_chance;
    private List<PokeApiVersionEncounter> encounter_details;
}

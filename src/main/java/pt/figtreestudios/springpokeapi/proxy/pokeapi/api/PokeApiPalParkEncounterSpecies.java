package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiPalParkEncounterSpecies {
    private Integer base_score;
    private Integer rate;
    private PokeApiNamedApiResource pokemon_species;
}

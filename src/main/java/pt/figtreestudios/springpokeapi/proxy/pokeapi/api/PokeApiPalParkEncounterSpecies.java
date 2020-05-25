package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiPalParkEncounterSpecies implements Serializable {
    private Integer base_score;
    private Integer rate;
    private PokeApiNamedApiResource pokemon_species;
}

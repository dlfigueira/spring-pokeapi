package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiSpeciesGender {
    private Integer rate;
    private PokeApiNamedApiResource pokemon_species;
}

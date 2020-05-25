package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiSpeciesGender implements Serializable {
    private Integer rate;
    private PokeApiNamedApiResource pokemon_species;
}

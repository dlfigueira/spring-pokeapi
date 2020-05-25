package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiPokemonSprites implements Serializable {
    private String front_default;
    private String front_shiny;
    private String front_female;
    private String front_shiny_female;
    private String back_default;
    private String back_shiny;
    private String back_female;
    private String back_shiny_female;
}

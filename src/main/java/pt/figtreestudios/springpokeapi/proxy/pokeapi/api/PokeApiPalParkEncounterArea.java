package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiPalParkEncounterArea {
    private Integer base_score;
    private Integer rate;
    private PokeApiNamedResource area;
}

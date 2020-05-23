package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiEncounterVersionDetails {
    private Integer rate;
    private PokeApiNamedApiResource version;
}

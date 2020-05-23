package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiEncounterVersionDetails {
    private Integer rate;
    private PokeApiNamedApiResource version;
}

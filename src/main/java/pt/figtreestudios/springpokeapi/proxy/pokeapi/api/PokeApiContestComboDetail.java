package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiContestComboDetail {
    private List<PokeApiNamedApiResource> use_before;
    private List<PokeApiNamedApiResource> use_after;
}

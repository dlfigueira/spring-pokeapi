package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiContestComboDetail implements Serializable {
    private List<PokeApiNamedApiResource> use_before;
    private List<PokeApiNamedApiResource> use_after;
}

package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiSuperContestEffect {
    private Integer id;
    private Integer appeal;
    private List<PokeApiFlavorText> flavor_text_entries;
    private List<PokeApiNamedApiResource> moves;
}

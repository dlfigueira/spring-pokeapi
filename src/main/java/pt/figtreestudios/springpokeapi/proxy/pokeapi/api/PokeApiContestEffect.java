package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiContestEffect implements Serializable {
    private Integer id;
    private Integer appeal;
    private Integer jam;
    private List<PokeApiEffect> effect_entries;
    private List<PokeApiFlavorText> flavor_text_entries;
}

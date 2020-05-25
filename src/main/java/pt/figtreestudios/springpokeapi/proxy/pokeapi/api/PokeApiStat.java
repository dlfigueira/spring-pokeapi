package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiStat implements Serializable {
    private Integer id;
    private String name;
    private Integer game_index;
    private boolean is_battle_only;
    private PokeApiMoveStatAffectSets affecting_moves;
    private PokeApiNatureStatAffectSets affecting_natures;
    private List<PokeApiApiResource> characteristics;
    private PokeApiNamedApiResource move_damage_class;
    private List<PokeApiName> names;
}

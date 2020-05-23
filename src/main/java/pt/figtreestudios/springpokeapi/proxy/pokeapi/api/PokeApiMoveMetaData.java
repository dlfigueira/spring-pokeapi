package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiMoveMetaData {
    private PokeApiNamedApiResource ailment;
    private PokeApiNamedApiResource category;
    private Integer min_hits;
    private Integer max_hits;
    private Integer min_turns;
    private Integer max_turns;
    private Integer drain;
    private Integer healing;
    private Integer crit_rate;
    private Integer ailment_chance;
    private Integer flinch_chance;
    private Integer stat_chance;
}

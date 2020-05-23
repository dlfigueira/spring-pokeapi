package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiEvolutionDetail {
    private PokeApiNamedApiResource item;
    private PokeApiNamedApiResource trigger;
    private Integer gender;
    private PokeApiNamedApiResource held_item;
    private PokeApiNamedApiResource known_move;
    private PokeApiNamedApiResource known_move_type;
    private PokeApiNamedApiResource location;
    private Integer min_level;
    private Integer min_happiness;
    private Integer min_beauty;
    private Integer min_affection;
    private boolean needs_overworld_rain;
    private PokeApiNamedApiResource party_species;
    private PokeApiNamedApiResource party_type;
    private Integer relative_physical_stats;
    private String time_of_day;
    private PokeApiNamedApiResource trade_species;
    private boolean turn_upside_down;
}

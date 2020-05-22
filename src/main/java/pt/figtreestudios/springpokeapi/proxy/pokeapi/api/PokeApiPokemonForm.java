package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiPokemonForm {
    private Integer id;
    private String name;
    private Integer order;
    private Integer form_order;
    private boolean is_default;
    private boolean is_battle_only;
    private boolean is_mega;
    private String form_name;
    private PokeApiNamedApiResource pokemon;
    private PokeApiPokemonFormSprites sprites;
    private PokeApiNamedApiResource version_group;
    private List<PokeApiName> names;
    private List<PokeApiName> form_names;
}

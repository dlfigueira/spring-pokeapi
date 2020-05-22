package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiBerry {
    private Integer id;
    private String name;
    private Integer growth_time;
    private Integer max_harvest;
    private Integer natural_gift_power;
    private Integer size;
    private Integer smoothness;
    private Integer soil_dryness;
    private PokeApiNamedApiResource firmness;
    private List<PokeApiBerryFlavorMap> flavors;
    private PokeApiNamedApiResource item;
    private PokeApiNamedApiResource natural_gift_type;
}

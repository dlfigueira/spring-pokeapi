package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiCharacteristic {
    private Integer id;
    private Integer gene_modulo;
    private List<Integer> possible_values;
}

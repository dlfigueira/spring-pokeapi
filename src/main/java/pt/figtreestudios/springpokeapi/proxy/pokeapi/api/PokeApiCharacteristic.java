package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiCharacteristic implements Serializable {
    private Integer id;
    private Integer gene_modulo;
    private List<Integer> possible_values;
}

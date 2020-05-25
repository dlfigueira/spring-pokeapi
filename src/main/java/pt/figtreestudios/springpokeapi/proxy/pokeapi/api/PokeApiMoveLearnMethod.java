package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiMoveLearnMethod implements Serializable {
    private Integer id;
    private String name;
    private List<PokeApiDescription> descriptions;
    private List<PokeApiName> names;
    private List<PokeApiNamedApiResource> version_groups;
}

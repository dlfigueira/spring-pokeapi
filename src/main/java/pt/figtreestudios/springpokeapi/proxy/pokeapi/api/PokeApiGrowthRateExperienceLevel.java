package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiGrowthRateExperienceLevel implements Serializable {
    private Integer level;
    private Integer experience;
}

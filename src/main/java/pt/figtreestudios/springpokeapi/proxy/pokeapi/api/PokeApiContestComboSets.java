package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import java.io.Serializable;

public class PokeApiContestComboSets implements Serializable {
    private PokeApiContestComboDetail normal;
    private PokeApiContestComboDetail super_;

    public PokeApiContestComboDetail getNormal()  {
        return normal;
    }

    public void setNormal(PokeApiContestComboDetail normal) {
        this.normal = normal;
    }

    public PokeApiContestComboDetail getSuper() {
        return super_;
    }

    public void setSuper(PokeApiContestComboDetail super_) {
        this.super_ = super_;
    }
}

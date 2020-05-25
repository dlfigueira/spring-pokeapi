package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import java.io.Serializable;

public class PokeApiItemSprites implements Serializable {
    private String default_;

    public String getDefault() {
        return default_;
    }

    public void setDefault(String default_) {
        this.default_ = default_;
    }
}

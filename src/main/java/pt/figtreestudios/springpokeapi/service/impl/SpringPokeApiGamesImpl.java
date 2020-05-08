package pt.figtreestudios.springpokeapi.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.PokeApiGames;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiGenerationApi;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNamedResourceList;
import pt.figtreestudios.springpokeapi.service.SpringPokeApiGames;

@Slf4j
@Service
@RequiredArgsConstructor
public class SpringPokeApiGamesImpl implements SpringPokeApiGames {
    private final PokeApiGames pokeApiGames;

    @Override
    public PokeApiNamedResourceList getGenerations() {
        return pokeApiGames.getGenerations();
    }

    @Override
    public PokeApiGenerationApi getGenerationById(Integer id) {
        return pokeApiGames.getGenerationById(id);
    }

    @Override
    public PokeApiGenerationApi getGenerationByName(String name) {
        return pokeApiGames.getGenerationByName(name);
    }
}

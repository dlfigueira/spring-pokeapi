package pt.figtreestudios.springpokeapi.proxy.pokeapi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pt.figtreestudios.TestConfig;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNamedApiResource;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Import(TestConfig.class)
class PokeApiItemsTest {
    @Autowired
    private PokeApiItems pokeApiItems;

    @Test
    public void whenGetItems_success() {
        pokeApiItems.getItems();
    }

    @Test
    public void whenGetItemById_success() {
        pokeApiItems.getItemById(1);
    }

    @Test
    public void whenGetItemByName_success() {
        pokeApiItems.getItems().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiItems::getItemByName);
    }

    @Test
    public void whenGetItemAttributes_success() {
        pokeApiItems.getItemAttributes();
    }

    @Test
    public void whenGetItemAttributeById_success() {
        pokeApiItems.getItemAttributeById(1);
    }

    @Test
    public void whenGetItemAttributeByName_success() {
        pokeApiItems.getItemAttributes().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiItems::getItemAttributeByName);
    }

    @Test
    public void whenGetItemCategories_success() {
        pokeApiItems.getItemCategories();
    }

    @Test
    public void whenGetItemCategoryById_success() {
        pokeApiItems.getItemCategoryById(1);
    }

    @Test
    public void whenGetItemCategoryByName_success() {
        pokeApiItems.getItemCategories().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiItems::getItemCategoryByName);
    }

    @Test
    public void whenGetItemFlingEffects_success() {
        pokeApiItems.getItemFlingEffects();
    }

    @Test
    public void whenGetItemFlingEffectById_success() {
        pokeApiItems.getItemFlingEffectById(1);
    }

    @Test
    public void whenGetItemFlingEffectByName_success() {
        pokeApiItems.getItemFlingEffects().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiItems::getItemFlingEffectByName);
    }

    @Test
    public void whenGetItemPockets_success() {
        pokeApiItems.getItemPockets();
    }

    @Test
    public void whenGetItemPocketById_success() {
        pokeApiItems.getItemPocketById(1);
    }

    @Test
    public void whenGetItemPocketByName_success() {
        pokeApiItems.getItemPockets().getResults().stream()
                .limit(1)
                .map(PokeApiNamedApiResource::getName)
                .forEach(pokeApiItems::getItemPocketByName);
    }
}

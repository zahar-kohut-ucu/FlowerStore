package flower.store;
import flower.filters.SearchFilter;
import flower.item.Item;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Store {
    @Getter
    private List<Item> items;
    public List<Item> search(SearchFilter searchFilter) {
        List<Item> foundItems = new ArrayList<>();
        for (Item item: items) {
            if (searchFilter.match(item)) {
                items.add(item);
            }
        }
        return foundItems;
    }
}

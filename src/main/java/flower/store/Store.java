package flower.store;
import flower.filters.SearchFilter;
import flower.item.Item;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public List<Item> items;
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

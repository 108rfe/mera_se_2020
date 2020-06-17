package com.mera.training.task12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Shop {
    private ArrayList<ShopItem> shopItemList = new ArrayList<>();
    private List<Comparator<ShopItem>> comparators = new ArrayList<>();

    public Shop() {
        ItemSorters itemSorters = new ItemSorters();

        comparators.add(itemSorters::sortByCategory);
        comparators.add(itemSorters::sortByTitle);
        comparators.add(itemSorters::sortByPrice);
        comparators.add(itemSorters::sortByQuantity);
    }

    public void addItem(ShopItem item) {
        shopItemList.add(item);
    }

    public void showAllSortedItems() {
        int comparatorIndex = new Random().nextInt(comparators.size());
        System.out.println("Comparator index: " + comparatorIndex);

        shopItemList.sort(comparators.get(comparatorIndex));
        shopItemList.forEach(o -> System.out.println(o.toString()));
    }
}

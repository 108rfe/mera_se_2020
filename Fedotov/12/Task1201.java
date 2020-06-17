package com.mera.training.task12;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Task1201 {
    private final static int ITEM_COUNT = 10;
    private final static int MIN_QUANTITY_RANGE = 15;
    private final static int MAX_QUANTITY_RANGE = 30;
    private final static int MIN_PRICE_RANGE = 25;
    private final static int MAX_PRICE_RANGE = 50;

    public static void main(String[] args) {
        Shop shop = new Shop();

        addItems(shop);
        shop.showAllSortedItems();
    }

    private static void addItems(Shop shop) {
        for (int i = 0; i < ITEM_COUNT; ++i) {
            String category = RandomStringUtils.randomAlphabetic(ITEM_COUNT);
            double price = new Random().nextInt(MAX_PRICE_RANGE - MIN_PRICE_RANGE) + MIN_PRICE_RANGE;
            String name = RandomStringUtils.randomAlphabetic(ITEM_COUNT);
            int quantity = new Random().nextInt(MAX_QUANTITY_RANGE - MIN_QUANTITY_RANGE) + MIN_QUANTITY_RANGE;
            String id = RandomStringUtils.randomAlphanumeric(25);

            shop.addItem(new ShopItem(category, price, name, quantity, id));
        }
    }

}

package com.mera.training.task12;

public class ItemSorters {

    public int sortByCategory(ShopItem initialItem, ShopItem nextItem) {
        return initialItem.category.compareTo(nextItem.category);
    }

    public int sortByTitle(ShopItem initialItem, ShopItem nextItem) {
        return initialItem.category.compareTo(nextItem.category);
    }

    public int sortByPrice(ShopItem initialItem, ShopItem nextItem) {
        return (int) (initialItem.price - nextItem.price);
    }

    public int sortByQuantity(ShopItem initialItem, ShopItem nextItem) {
        return (int) (initialItem.quantity - nextItem.price);
    }

}

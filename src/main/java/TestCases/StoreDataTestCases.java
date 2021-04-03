package TestCases;

import StoreData.*;
import models.PurchaseItem;

import java.util.ArrayList;
import java.util.List;

public class StoreDataTestCases {
    public static void main(String[] args){
        StoreData testStoreData = new StoreData(123);
        // Add a bunch of items that have been purchased 5 times
        List<PurchaseItem> lowFrequencyPurchaseItems = new ArrayList<>();
        for (int i=100; i<150; i++){
            PurchaseItem purchaseItem = new PurchaseItem();
            purchaseItem.setItemID(i);
            purchaseItem.setNumberOfItems(5);
            lowFrequencyPurchaseItems.add(purchaseItem);
        }
        testStoreData.addData(lowFrequencyPurchaseItems);

        //Add 6 things that have been purchased 60 times
        List<PurchaseItem> midFrequencyPurchaseItems = new ArrayList<>();
        for (int i=200; i<206; i++){
            PurchaseItem purchaseItem = new PurchaseItem();
            purchaseItem.setItemID(i);
            purchaseItem.setNumberOfItems(60);
            midFrequencyPurchaseItems.add(purchaseItem);
        }
        testStoreData.addData(midFrequencyPurchaseItems);
        //Add 6 things that have been purchased 100 times
        List<PurchaseItem> highFrequencyPurchaseItems = new ArrayList<>();
        for (int i=300; i<306; i++){
            PurchaseItem purchaseItem = new PurchaseItem();
            purchaseItem.setItemID(i);
            purchaseItem.setNumberOfItems(100);
            highFrequencyPurchaseItems.add(purchaseItem);
        }
        testStoreData.addData(highFrequencyPurchaseItems);

        List<ItemData> result = testStoreData.getMostPopular();

        // Expect the 6 items purchased 100 times followed by 4 items purchased 60 times
        for (ItemData data: result){
            System.out.println("Item " + data.getItemId() + " purchased " + data.getNumPurchases() + " times");
        }

    }
}

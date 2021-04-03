package StoreData;

import models.Purchase;
import models.PurchaseItem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StoreData {
    /**
     * One StoreData is instantiated for each Store.
     * Goal: To answer what are the top 10 items purchased at this store
     */
    private int storeId;
    private List<ItemData> items;

    public StoreData(int storeId){
        this.storeId = storeId;
        this.items = new ArrayList<>();
    }

    public void addData(List<PurchaseItem> purchaseItems){
        for (PurchaseItem item: purchaseItems){
            int itemId = item.getItemID();
            int numItems = item.getNumberOfItems();
            ItemData itemData = this.getItemData(itemId);
            if (itemData == null){
                itemData = new ItemData(itemId);
                this.items.add(itemData);
            }
            itemData.addPurchase(numItems);
        }
    }

    public ItemData getItemData(int itemId){
        for (ItemData itemData: this.items){
            if(itemData.getItemId() == itemId){
                return itemData;
            }
        }
        return null;
    }

    public List<ItemData> getMostPopular(){
        // Return the 10 most purchased items
        Collections.sort(this.items);
        List<ItemData> results = new ArrayList<>();
        try{
            for (int i=0; i<10; i++){
                results.add(this.items.get(i));
            }
        } catch (IndexOutOfBoundsException e){
            System.out.println("There were fewer than 10 items purchased at store " + this.storeId);
        }
        return results;
    }
}

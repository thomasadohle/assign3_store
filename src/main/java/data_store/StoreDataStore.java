package data_store;

import models.ItemData;
import models.Purchase;
import models.PurchaseItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoreDataStore {
    // Not currently in use
    // To answer which are the 10 most popular items


    private HashMap<Integer, ArrayList<ItemData>> storeDataMap;
    private static StoreDataStore instance;

    private StoreDataStore(){
        instance = new StoreDataStore();
        this.storeDataMap = new HashMap<>();
    }

    public static StoreDataStore getInstance(){return instance;}

//    public void addRecord(Purchase p){
//        int storeId = p.getStoreId();
//        if(this.storeDataMap.containsKey(storeId)){
//            List<ItemData> storeData = this.storeDataMap.get(storeId);
//            if (storeData.contains())
//        }
//        for (PurchaseItem item: p.getItems()){
//            int itemId = item.getItemID();
//            int numItems = item.getNumberOfItems();
//            int[] record = new int[2];
//            //record[0] = ;
//
//        }
//    }

}

package messages;

import models.Purchase;
import DataManager.DataManager;
import StoreData.*;
import models.PurchaseItem;

import java.util.List;

public class MessageProcessor {

    private final static DataManager manager = DataManager.getInstance();

    private MessageProcessor(){}

    public static void processPurchase(Purchase purchase){
        // Add PurchaseItems to StoreData for the Store.
        // If there isn't already a StoreData for the Store, create one.
        StoreData storeData = manager.getStoreData(purchase.getStoreId());
        if (storeData == null){
            storeData = new StoreData(purchase.getStoreId());
            manager.addStoreData(storeData);
        }
        storeData.addData(purchase.getItems());

        //ToDo Need to figure out what to do about this from the Items side
    }


}

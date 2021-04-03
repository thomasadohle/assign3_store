package DataManager;

import StoreData.*;

public class DataManager {

    private static DataManager instance = new DataManager();
    private StoreData[] storeData;

    private DataManager(){
        storeData = new StoreData[1000];
    }

    public static DataManager getInstance(){return instance;}

    public StoreData getStoreData(int storeId){
        return this.storeData[storeId];
    }

    public void addStoreData(StoreData storeData){
        this.storeData[storeData.getStoreId()] = storeData;
    }
}

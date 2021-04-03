package StoreData;

public class ItemData implements Comparable<ItemData> {
    /**
     * This is a data structure used to store information about Purchases made at a given store
     */
    private int itemId;
    private int numPurchases;

    public ItemData(int itemId){
        this.itemId = itemId;
        this.numPurchases = 0;
    }

    public int getItemId(){return this.itemId;}
    public int getNumPurchases(){return this.numPurchases;}

    public void addPurchase(int numPurchases){
        this.numPurchases += numPurchases;
    }

    @Override
    public int compareTo(ItemData other) {
        if (this.itemId == other.getItemId()){
            throw new IllegalStateException("There should not be more than one ItemData object with  given itemID");
        }
        if (this.itemId > other.itemId){
            return -1;
        }
        return 1;
    }



}

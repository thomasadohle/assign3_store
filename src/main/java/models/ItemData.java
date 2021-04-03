package models;

public class ItemData implements Comparable<ItemData>{

    private int itemID;
    private int numItemPurchases;

    public void setItemId(int itemID){this.itemID = itemID;}

    public void setNumItemPurchases(int numItemPurchases){this.numItemPurchases = numItemPurchases;}




    @Override
    public int compareTo(ItemData other) {
        if (this.itemID == other.itemID){
            throw new IllegalStateException("There should not be more than one ItemData object with  given itemID");
        }
        if (this.itemID > other.itemID){
            return 1;
        }
        return -1;
    }
}

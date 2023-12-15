package org.example.entity;

public class UserItems {
    private long id;
    private int userId;
    private String itemName;
    private int quantity;

    public UserItems(int userId, String itemName, int quantity) {
        this.userId = userId;
        this.itemName= itemName;
        this.quantity = quantity;
    }

    public UserItems() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "UserItems{" +
                "id=" + id +
                ", userId=" + userId +
                ", itemName='" + itemName + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public long setUserId() {
        return id;
    }
}

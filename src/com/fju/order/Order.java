package com.fju.order;

public class Order {
    int amount;
    Delivery delivery;
    int shipFeed;

    public Order(int amount, Delivery delivery) {
        this.amount = amount;
        this.delivery = delivery;
        shipFeed=shipfeed();
    }
    public int total(){
        return (amount+ delivery.price);
    }
    public int shipfeed() {
        if (delivery.name == "shopee" && delivery.price > 199){
            return (0);
        }else{
           return (shipFeed=delivery.price);
        }
    }

}

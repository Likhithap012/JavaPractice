package com.gevernova.inheritance.multilevelinheritance;

// Base class: Order
class Order {
    String orderId;
    String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}

// First subclass: ShippedOrder
class ShippedOrder extends Order {
    String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order shipped with tracking number: " + trackingNumber;
    }
}

// Second subclass: DeliveredOrder
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
}

public class OnlineRetailSystem {
    public static void main(String[] args) {
        Order order = new Order("ORD101", "2025-04-10");
        ShippedOrder shipped = new ShippedOrder("ORD102", "2025-04-09", "TRK123456");
        DeliveredOrder delivered = new DeliveredOrder("ORD103", "2025-04-08", "TRK987654", "2025-04-11");

        System.out.println(order.getOrderStatus());
        System.out.println(shipped.getOrderStatus());
        System.out.println(delivered.getOrderStatus());
    }
}


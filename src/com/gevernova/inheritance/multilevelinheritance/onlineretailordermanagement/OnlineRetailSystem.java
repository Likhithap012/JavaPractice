package com.gevernova.inheritance.multilevelinheritance.onlineretailordermanagement;

class OnlineRetailSystem {
    public static void main(String[] args) {
        Order order = new Order("ORD101", "2025-04-10");
        ShippedOrder shipped = new ShippedOrder("ORD102", "2025-04-09", "TRK123456");
        DeliveredOrder delivered = new DeliveredOrder("ORD103", "2025-04-08", "TRK987654", "2025-04-11");

        System.out.println(order.getOrderStatus());
        System.out.println(shipped.getOrderStatus());
        System.out.println(delivered.getOrderStatus());
    }
}

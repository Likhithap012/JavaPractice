package com.gevernova.dsa.linkedlist.singlelinkedlist.inventorymanagement;


public class LinkedListInventory {
    private InventoryNode head;

    // Add at beginning
    public void addAtBeginning(String name, int id, int quantity, double price) {
        InventoryNode newNode = new InventoryNode(name, id, quantity, price);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addAtEnd(String name, int id, int quantity, double price) {
        InventoryNode newNode = new InventoryNode(name, id, quantity, price);
        if (head == null) {
            head = newNode;
            return;
        }
        InventoryNode current = head;
        while (current.next != null)
            current = current.next;
        current.next = newNode;
    }

    // Add at specific position
    public void addAtPosition(String name, int id, int quantity, double price, int position) {
        if (position == 0) {
            addAtBeginning(name, id, quantity, price);
            return;
        }
        InventoryNode newNode = new InventoryNode(name, id, quantity, price);
        InventoryNode current = head;
        for (int i = 0; current != null && i < position - 1; i++)
            current = current.next;
        if (current == null) return;
        newNode.next = current.next;
        current.next = newNode;
    }

    // Remove item by ID
    public void removeById(int id) {
        if (head == null) return;
        if (head.itemId == id) {
            head = head.next;
            return;
        }
        InventoryNode current = head;
        while (current.next != null && current.next.itemId != id)
            current = current.next;
        if (current.next != null)
            current.next = current.next.next;
    }

    // Update quantity by ID
    public void updateQuantityById(int id, int newQty) {
        InventoryNode current = head;
        while (current != null) {
            if (current.itemId == id) {
                current.quantity = newQty;
                return;
            }
            current = current.next;
        }
    }

    // Search by ID
    public void searchById(int id) {
        InventoryNode current = head;
        while (current != null) {
            if (current.itemId == id) {
                printItem(current);
                return;
            }
            current = current.next;
        }
        System.out.println("Item with ID " + id + " not found.");
    }

    // Search by name
    public void searchByName(String name) {
        InventoryNode current = head;
        while (current != null) {
            if (current.itemName.equalsIgnoreCase(name)) {
                printItem(current);
                return;
            }
            current = current.next;
        }
        System.out.println("Item with name " + name + " not found.");
    }

    // Calculate total value
    public double calculateTotalValue() {
        double total = 0;
        InventoryNode current = head;
        while (current != null) {
            total += current.price * current.quantity;
            current = current.next;
        }
        return total;
    }

    // Sort by Item Name (ascending or descending)
    public void sortByName(boolean ascending) {
        head = mergeSort(head, (first, second) ->
                ascending ? first.itemName.compareToIgnoreCase(second.itemName) : second.itemName.compareToIgnoreCase(first.itemName));
    }

    // Sort by Price
    public void sortByPrice(boolean ascending) {
        head = mergeSort(head, (a, b) ->
                ascending ? Double.compare(a.price, b.price) : Double.compare(b.price, a.price));
    }

    // Merge Sort Helper
    private InventoryNode mergeSort(InventoryNode node, java.util.Comparator<InventoryNode> comp) {
        if (node == null || node.next == null) return node;
        InventoryNode middle = getMiddle(node);
        InventoryNode nextToMiddle = middle.next;
        middle.next = null;

        InventoryNode left = mergeSort(node, comp);
        InventoryNode right = mergeSort(nextToMiddle, comp);

        return sortedMerge(left, right, comp);
    }

    private InventoryNode sortedMerge(InventoryNode a, InventoryNode b, java.util.Comparator<InventoryNode> comp) {
        if (a == null) return b;
        if (b == null) return a;

        InventoryNode result;
        if (comp.compare(a, b) <= 0) {
            result = a;
            result.next = sortedMerge(a.next, b, comp);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next, comp);
        }
        return result;
    }

    private InventoryNode getMiddle(InventoryNode head) {
        if (head == null) return head;
        InventoryNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void displayAllItems() {
        InventoryNode current = head;
        if (current == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        while (current != null) {
            printItem(current);
            current = current.next;
        }
    }

    private void printItem(InventoryNode node) {
        System.out.println("Item Name: " + node.itemName +
                ", Item ID: " + node.itemId +
                ", Quantity: " + node.quantity +
                ", Price: $" + node.price);
    }
}

package com.sh.inventory.controller;

import com.sh.inventory.service.InventoryService;

public class InventoryController {
    InventoryService inventoryService = new InventoryService();
    public void findInventory() {
        inventoryService.findInventory();
    }

    public void inboundInventory() {
        inventoryService.inboundInventory();
    }

    public void outboundInventory() {
        inventoryService.outboundInventory();
    }

    public void moveInventory() {
        inventoryService.moveInventory();
    }
}

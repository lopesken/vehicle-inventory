package main.kotlin.database

import main.kotlin.controller.AddVehicle

object VehicleInventory {
    private val vehicles = mutableListOf<AddVehicle>()

    fun add(vehicle: AddVehicle) {
        vehicles.add(vehicle)
    }
}
package main.kotlin.controller

import main.kotlin.database.VehicleInventory
import main.kotlin.enums.VehicleBrand

class Car(
    brand: VehicleBrand,
    name: String,
    wheel: Int
) : Vehicle(
    brand,
    name,
    wheel
) {
    override fun addVehicle() {
        try {
            if (wheel < 4){
                throw IllegalArgumentException("Wheels invalid")
            }
            VehicleInventory.add(this)
            println("Adding a Car: $brand $name with $wheel wheels")

        } catch (e: Exception){
            println("Exception:${e.message}")
        }

    }
}
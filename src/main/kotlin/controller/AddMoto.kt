package main.kotlin.controller

import main.kotlin.database.VehicleInventory
import main.kotlin.enums.VehicleBrand

class Moto(
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
            if (wheel < 2){
                throw IllegalArgumentException("Wheels invalid")
            }
            VehicleInventory.add(this)
            println("Adding a Motocycle: $brand $name with $wheel wheels")

        } catch (e: Exception){
            println("Exception:${e.message}")
        }

    }
}
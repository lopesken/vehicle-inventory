package main.kotlin.controller

import main.kotlin.enums.VehicleBrand

abstract class Vehicle(
    val brand: VehicleBrand,
    val name: String,
    val wheel: Int
) : AddVehicle
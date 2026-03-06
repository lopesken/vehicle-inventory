package main.kotlin

import main.kotlin.controller.Car
import main.kotlin.controller.Moto
import main.kotlin.enums.VehicleBrand

fun main() {
   val car = Car(VehicleBrand.FIAT, "Fastback", 4)
   car.addVehicle()
   val moto = Moto(VehicleBrand.YAMAHA, "Fazer",2)
   moto.addVehicle()
}
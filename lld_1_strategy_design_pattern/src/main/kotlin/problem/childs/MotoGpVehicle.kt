package problem.childs

import problem.Vehicle1

class MotoGpVehicle() : Vehicle1() {
    override fun drive() {
        println("this is Sports drive strategy")
    }
}
package Solution

open class MainVehicle(val mainDriveStrategy: MainDriveStrategy) {
    public fun drive(){
        mainDriveStrategy.drive()
    }
}
import Solution.MainDriveStrategy
import Solution.driveStrategies.MountainDriveStrategy
import Solution.driveStrategies.NormalDriveStrategy
import Solution.vehicles.OffRoadVehicle
import Solution.vehicles.SedanVehicle
import problem.childs.FormulaRaceVehicle1
import problem.childs.MotoGpVehicle
import problem.childs.SedanVehicle1

// there are two things : is-A relationship and has-A relationship


fun main(args: Array<String>) {

 // problem package calling : there is a duplication in child code methods of formula race vehicle and motogp
 FormulaRaceVehicle1().drive()
 MotoGpVehicle().drive()
 SedanVehicle1().drive()

    // solution package calling
 SedanVehicle(NormalDriveStrategy()).drive()
 OffRoadVehicle(MountainDriveStrategy()).drive()

}
package factorypattern

import factorypattern.shapes.Circle
import factorypattern.shapes.Rect
import factorypattern.shapes.Square
import java.awt.Shape

class ShapeFactory {

    fun getShape(input: String): ShapeInterface? {
        when(input){
            "Circle" -> {
                return Circle();
            }
            "Square" -> {
                return Square();
            }
            "Rectangle" -> {
                return Rect();
            }
            else -> {return null}
        }
    }
}
package factorypattern.shapes

import factorypattern.ShapeInterface

class Rect : ShapeInterface {
    override fun draw(): String {
        return "hi, this is rectangle"
    }
}
package factorypattern.shapes

import factorypattern.ShapeInterface

class Square : ShapeInterface {
    override fun draw(): String {
        return "I am a Square"
    }
}
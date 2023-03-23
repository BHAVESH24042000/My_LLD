package factorypattern.shapes

import factorypattern.ShapeInterface

class Circle : ShapeInterface{
    override fun draw(): String {
        return "I am a Circle"
    }
}
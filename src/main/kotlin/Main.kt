import factorypattern.ShapeFactory

fun main(args: Array<String>) {
    var shape = ShapeFactory().getShape("Circle")
    println(shape?.draw())

    shape = ShapeFactory().getShape("Rectangle")
    println(shape?.draw())

    shape = ShapeFactory().getShape("n")
    println(shape?.draw())


}
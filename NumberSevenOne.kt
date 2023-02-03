import kotlin.math.pow

fun main() = try{
    println("Введите x ")
    var x = readLine()!!.toDouble()
    println("Введите y ")
    var y = readLine()!!.toDouble()
    println("Введите z ")
    var z = readLine()!!.toDouble()

    var a: Double = Math.sqrt( Math.abs( x - 1 ) ) - Math.cbrt( Math.abs( y ) ) / 1 + x.pow( 2 ) / 2 + y.pow( 2 ) / 4
    var b: Double = x * Math.abs( Math.atan( z ) + Math.E.pow( -1 * ( x + 3 ) ) )

    println( a )
    println( b )

}
catch (e: NumberFormatException) { println("Введено недопустимое значение") }
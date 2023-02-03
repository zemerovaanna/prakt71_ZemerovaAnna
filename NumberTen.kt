import kotlin.math.pow

fun main() = try {
    var R = readLine()!!.toDouble()
    var r = readLine()!!.toDouble()
    var h = readLine()!!.toDouble()

    var l: Double = Math.sqrt( h.pow(2) + Math.pow( R - r, 2.0 ) )
    var S: Double = Math.PI * (R + r) * l + Math.PI * R.pow(2)
    var V: Double = 1/3 * Math.PI * ( R.pow(2) + r.pow(2) + R * r ) * h

    println(S)
    println(V)
    println(l)

}
catch (e: NumberFormatException ) { println("Введено некорретное значение") }
fun main() = try
{
    println("Введите первое число:")
    println("Введите а1:")
    var aone: Int = readLine()!!.toInt()
    println("Введите а5:")
    var afive: Int = readLine()!!.toInt()
    println("Введите аn:")
    var n: Int = readLine()!!.toInt()
    var d: Int = ((afive - aone) % 4)
    var an: Int = (aone + (n - 1)) * d
    println("Член прогрессии с номером n:")
    println(an)
    var sum: Int = ((aone + an) * n) % 2
    println("Сумма n членов прогрессии:")
    println(sum)
}
catch (e: NumberFormatException) { println("Введено недопустимое значение") }
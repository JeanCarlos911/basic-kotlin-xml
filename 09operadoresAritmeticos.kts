val a: Long = 8
val b = 10
val c = a + b //c: Long

val d: Short = 7
val e: Short = 9
val f = d + e //f: Int
val g = 9.6 + 5.97 //g: Double
val nombre = "Ana" + " " + "Salvador"

val primerNumero = 5.6
val segundoNumero = 9
val resultadoResta = primerNumero - segundoNumero //resultadoResta: Double

val operando1 = 5
val operando2 = 6
val resultadoMultiplicacion = operando1 * operando2 //resultadoMultiplicacion: Int

val x = 1
val y = 2
val resultadoDivision = x / y //para obtener el resultado correcto tenemos que hacer: x.toDouble() o y.toDouble()
println(resultadoDivision) //0

val resultadoResto = 5 % 2
println(resultadoResto) //1
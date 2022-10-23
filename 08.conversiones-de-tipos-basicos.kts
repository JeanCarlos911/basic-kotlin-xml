val miShort: Short = 5
val miInt: Int = miShort.toInt()
val miLong: Long = 3_000_000_000
val miOtroInt: Int = miLong.toInt()
println(miOtroInt) //desbordamiento
val miDouble = 5.8
val miOtroShort: Short = miDouble.toShort()
println(miOtroShort)
val edad = "65"
val edadNumerica = edad.toInt()
println(edadNumerica)
var miArray = arrayOf(25, "perro", 'a', 22.2, true)
var miArrayDeInt = intArrayOf(7, 6, 25)
miArrayDeInt[2] //25
miArrayDeInt.get(2) //25
miArrayDeInt[2] = 96
miArrayDeInt[2] //96
miArrayDeInt.set(2, 88)
miArrayDeInt[2] //88
miArrayDeInt.size //3
miArrayDeInt.contains(88) //true
miArrayDeInt.indexOf(87) //-1
var nombre = "Manuel"
var apellido = "Garcia"
var nombreCompleto = nombre + " " + apellido
println(nombreCompleto) //Manuel Garcia
nombre[3] //u
nombre.length //6
var nombreEnMayusculas = nombre.toUpperCase()
println(nombreEnMayusculas) //MANUEL
nombreCompleto.contains(nombre) //true
println("Mi nombre es " + nombre + " " + apellido)
println("Mi nombre es $nombre $apellido")
var edad = 25

println("${if (edad>=18) "Si" else "No"} soy mayor de edad") //Si soy mayor de edad

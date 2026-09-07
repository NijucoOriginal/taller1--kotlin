package Ejercicio1
fun main() {
    Ejercicio1.puntoA()
    puntoBCorregido()
    print("Ingrese su nota")
    val nota: Double=readLine()!!.toDouble()
    clasificarNota(nota)
    puntoC(nota)
}
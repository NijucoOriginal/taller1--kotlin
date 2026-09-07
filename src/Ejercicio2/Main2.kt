package Ejercicio2

fun main() {
    val datos: List<Any?> = listOf(15, "42", 3.5, "hola", true, null, -8, "7.5", 100)

    println("Función pata determinar el tipo de dato de los valores")

    datos.forEach {
        valor ->
        println(Ejercicio2.clasificar(valor))
    }

    println("Función de conversión de valores a double a continuación")

    datos.forEach {
        valor ->
        println(Ejercicio2.aNumero(valor))
    }

    println("Función de rango de números")

    datos.forEach {
        valor ->
        if(valor is Int||valor is Double)
        {
            println(Ejercicio2.rangoDe(valor.toInt()))
        }
        else if(valor is String)
        {
            try
            {
                val valorConvertido=valor.toDouble()
                println(Ejercicio2.rangoDe(valorConvertido.toInt()))
            }
            catch (e: NumberFormatException)
            {

            }
        }
    }

    println("A partir de aca se mostrara toda la información en conjunto")

    for((indice, valor) in datos.withIndex())
    {
        val clasificado: String=Ejercicio2.clasificar(valor)
        val numerico: Double?=Ejercicio2.aNumero(valor)
        val rango: String=
            if(valor is Int||valor is Double)
            {
                Ejercicio2.rangoDe(valor.toInt())
            }
            else if(valor is String)
            {
                try
                {
                    val valorConvertido: Double=valor.toDouble()
                    Ejercicio2.rangoDe(valorConvertido.toInt())
                }
                catch (e: NumberFormatException)
                {
                    "No aplica"
                }
            }
            else
            {
                "No aplica"
            }
        val mostrar: String=
            if(numerico!=null)
            {
                numerico.toString()
            }
            else
            {
                "No aplica"
            }
        println("[$indice] $valor--> $clasificado | númerico: $mostrar | rango: $rango")
    }

    println("A partir de aquí se realiza la sumatoria de los valores númericos del arreglo")

    println(Ejercicio2.sumarValores(datos))

    println("Punto B del ejercicio 2")

    Ejercicio2.puntoB()

}
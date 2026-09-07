package Ejercicio2

fun clasificar(valor: Any?): String {
    return when(valor) {
        is Int -> "Entero"
        is Double -> "Decimal"
        is String -> "Texto"
        is Boolean -> "Boolean"
        else -> "Nulo"
    }
}

fun aNumero(valor: Any?): Double? {
    return when(valor) {
        is Int -> valor.toDouble()
        is Double -> valor
        is String ->try {
            valor.toDouble()
        }
        catch (e: NumberFormatException) {
            null
        }
        else -> null
    }
}

fun rangoDe(numero: Int): String {
    return when(numero) {
        !in 0..100-> "Negativo"
        in 0..9 -> "Digito"
        in 10..99 -> "Decena"
        else -> "Grande"
    }
}

fun sumarValores(datos:List<Any?>):Double {
    var suma: Double =0.0
    datos.forEach {
        valor->
        if(clasificar(valor)=="Entero")
        {
            val valorConvertido: Int = valor.toString().toInt()
            suma += valorConvertido
        }
        else if(clasificar(valor)=="Decimal")
        {
            val valorConvertido: Double = valor.toString().toDouble()
            suma += valorConvertido
        }
        else if(clasificar(valor)=="Texto")
        {
            try
            {
                val valorConvertido: Double = valor.toString().toDouble()
                suma += valorConvertido
            }
            catch(e:Exception)
            {

            }
        }
    }
    return suma
}

fun puntoB() {
    val numeros = arrayOfNulls<Int>(10)
    var contador: Int=0

    for(numero in 2..20 step 2)
    {
        numeros[contador] = numero
        contador++
    }

    println("Posiciones")

    for(posicion in numeros.indices)
    {
        if(posicion%2 != 0)
        {
            println(numeros[posicion])
        }
    }

    println("Cuenta regresiva")

    for(i in 20 downTo 0 step 5)
    {
        println(i)
    }

    /*La diferencia entre for (i in 0..numeros.size) y for (i in 0 until numeros.size) radica en que el primero tiene un rango desde 0 hasta el tamaño del arreglo
      y el segundo tiene un rango desde 0 hasta un valor antes del tamaño del arreglo. El primer ciclo falla porque kotlin empieza a contar las posiciones de los arreglos
      desde 0 y no desde 1, por ende,lo que nosotros percibimos como el tamaño de un arreglo empezando a contar desde 1 kotlin lo
      interpreta como el tamaño de un arreglo empezando a contar desde 0, esta tomando una posición extra que no existe en el arreglo.
      En cambio, el segundo ciclo solo cuenta hasta un valor anterior al tamaño del arreglo y como empieza a contar desde 0, no agrega ningún
      valor extra que no existe, por este motivo no llega a desbordarse.
     */

    println("Diferencia entre dos ciclos for")
    println("Primero")

    for (i in 0 until numeros.size) {
        println(numeros[i])
    }

    println("Segundo")

    for (i in 0..numeros.size) {
        println(numeros[i])
    }
}


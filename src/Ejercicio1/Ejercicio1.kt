package Ejercicio1

public fun puntoA() {
    val a: Int? = 127
    val b: Int? = 127
    println(a == b) //Devuelve true porque esta comparando los valores de las variables
    println(a === b) //Devuelve false porque no apuntan a la misma referencia de objeto

    val c: Int? = 128
    val d: Int? = 128
    println(c == d) //Devuelve true porque esta comparando los valores de las variables
    println(c === d) //Devuelve false porque no apuntan a la misma referencia de objeto

    val texto1 = "Kotlin"
    val texto2 = StringBuilder("Kot").append("lin").toString()
    println(texto1 == texto2) //Devuelve true porque esta comparando si el valos de los dos String es igual
    println(texto1 === texto2) //devuelve false porque esta si poseen la misma referencia hacía el mismo objeto
                               //pero como no la tienen entonces devuelve false. Para que el resultado sea true
                               //es necesario que val texto2=texto1

    val nombres: List<String?> = listOf("Ana", null, "Beatriz")
    for (nombre in nombres) {
        println(nombre?.length ?: -1) //Imprime la cantidad de caracteres que tiene cada elemento del arreglo,
                                      //si el elemento llega a ser null imprimer por defecto -1
    }

    //Al ejecutar el código nos dimos cuenta que cometimos un error con el primer print, el que compara a===b de esta forma.
    //El problema que tuvismo se debió a que no tuvimos en que cuenta que kotlin almacenan en memoria los valores de -128 hasta
    //127 y por ende los trata como un número mientras que nosotros supusimos que lo trataba como un objeto.
    //Algo que no pasa con c === d, porque en ese caso excede el valor que kotlin almacena en memoria y para ese caso
    //Debe crear un objeto diferente para cada uno.


    //Si llegaramos a reemplazar nombre?.length ?: -1 por nombre!!.length el programa lanzaria una nullpointerexception en la segunda iteración,
    //esto es debido a que el operador de aserción (!!) lo que hace es decirle a kotlin que confíe que este valor no es nulo y por ende, cuando
    //este se da cuenta que ese valor si es nulo no tiene forma de responder a el de la misma manera cuando se utiliza el operador elvis elvis (?)
}

/*public fun puntoBIncorrecto() {
    val contador = 0
    for (i in 1..5) {
        contador = contador + i //No es posible reemplazar una constante.
    }
    println("Suma: $contador")

    var apellido: String = null //No se utiliza el operador elvis para especificarle a kotlin que el valor de la variable puede ser null
    println(apellido.length) //No puede obtener la longitud de un String que tiene un null como valor

    val numeros  = listOf(1, 2, 3) //En ningún momento especifica el tipo de dato
    numeros.add(4) //No es posible agregar más valores a una lista inmutable

    val texto = "42"
    val total: Int = texto + 8 //No es posible sumar un String con un número entero
    println(total)
}

 */

public fun puntoBCorregido() {
    var contador = 0 //Transformamos la constante contador a una variable
    for (i in 1..5) {
        contador = contador + i
    }
    println("Suma: $contador")

    var apellido: String = "Hola" //Le establecemos un valor a la variable apellido
    println(apellido.length) //Al darle un valor a la variable apellido, ya no se produce ningún problema al utilizar la funcion lengt

    val numeros = mutableListOf(1, 2, 3) //Cambiamos la lista inmutable por una lista mutable
    numeros.add(4) //Ya nos permite agregar más valores a la lista porque ahora es mutable

    val texto = 42
    val total: Int = texto + 8 //Cambiamos el valor de la variable texto por un número para que pueda operarse con la variable total
    println(total)
}

//Función que nos piden modificar en el punto c
fun clasificarNota(nota: Double): String {
    var resultado: String
    if (nota >= 4.5) {
        resultado = "Excelente"
    } else if (nota >= 3.0) {
        resultado = "Aprobado"
    } else {
        resultado = "Reprobado"
    }
    return resultado
}

//Función modificada
fun puntoC(nota: Double): String {
    return if(nota>=4.5)
            {
                "Excelente"
            }
            else if(nota>=3.0)
            {
                "Aprobado"
            }
            else
            {
                "Reprobado"
            }
}


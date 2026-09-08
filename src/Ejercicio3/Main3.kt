package Ejercicio3

fun main() {

    val descuento: Double=0.10
    val producto: Producto= Producto("Teclado",80000.0,2)
    val producto1: Producto=Producto("Mouse",45000.0,5)
    val producto2: Producto=Producto("Monitor",750000.0,1)
    val producto3: Producto=Producto("Tarjeta gráfica",1500000.0,1)
    val producto4: Producto= Producto("Impresora",600000.0,3)
    val listaProductos: List<Producto> = listOf(producto,producto1,producto2,producto3,producto4)
    println(Ejercicio3.sacarResumen(listaProductos))

    val productoDescuentoAplicado: Producto= Ejercicio3.aplicarDescuento(producto,descuento)
    val productoDescuentoAplicado1: Producto= Ejercicio3.aplicarDescuento(producto1,descuento)

    println("El producto de nombre ${producto.nombre} posee este precio: ${producto.precio}")
    println("El producto de nombre ${productoDescuentoAplicado.nombre} posee este precio: ${productoDescuentoAplicado.precio}")
    println("El producto de nombre ${producto1.nombre} posee este precio: ${producto1.precio}")
    println("El producto de nombre ${productoDescuentoAplicado1.nombre} posee este precio: ${productoDescuentoAplicado1.precio}")


    /*Porque el metodo de aplicarDescuento(producto,descuento) lo que hace es crear un objeto producto nuevo a partir de los datos del antiguo
      no modifica el objeto original.
     */

    for((nombre,precio) in listaProductos)
    {
       println("Se llama: $nombre y cuesta: $precio")
    }

    val productoClonico: Producto=producto.copy()
    var sonIguales: Boolean = false

    if(producto==productoClonico)
    {
        sonIguales=true
    }

    println("Son iguales: $sonIguales")

    if(producto===productoClonico)
    {
        sonIguales=true
    }
    else
    {
        sonIguales=false
    }

    println("Son iguales: $sonIguales")

    /*
        Al comparar dos objetos de la misma clase y con los mismos usando ==, el resultado es true porque compara los valores de cada uno
        de los atributos que poseen, mientras que, al hacer lo mismo con === nos dara como resultado false porque esta comparando las referencias
        en memoria de esos mismos objetos y no si tienen los mismos valores en los atributos.

        Cabe aclarar que la comparación con == funciona en una data class porque esta genera el metodo .equals(), el cual se encarga de comparar los valores de
        cada uno de los atributos de los dos objetos entre sí.
     */

}
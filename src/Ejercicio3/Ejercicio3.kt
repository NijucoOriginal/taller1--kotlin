package Ejercicio3



fun aplicarDescuento(producto: Producto,porcentaje: Double): Producto {
    val productoDescuentoAplicado: Producto = producto.copy(precio =producto.precio - (producto.precio*porcentaje))
    return productoDescuentoAplicado
}

fun sacarResumen(listaProductos:List<Producto>): String {
    var resumen: String="Inventario (${listaProductos.size} producto/s):\n"
    var sumaTotal: Double=0.0
    listaProductos.forEach {
        valor->
        resumen+="-${valor.nombre}: ${valor.precio} x ${valor.cantidad}=${valor.precioXcantidad()}\n"
        sumaTotal += valor.precio
    }
    resumen+="Total inventario: $sumaTotal "
    return resumen
}
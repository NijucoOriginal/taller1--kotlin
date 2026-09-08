package Ejercicio3

data class Producto(var nombre: String, var precio: Double, var cantidad: Int) {

    fun precioXcantidad(): Double {
        return cantidad*precio
    }

    fun estaAgotado(): Boolean {
        return if(cantidad == 0)
                {
                    true
                }
                else
                {
                    false
                }
    }
}
def integracion(f: Double => Double, a: Double, b: Double): Double = {
  val x: Double = (a + b)/2
  (b - a ) * (f(a) + 4 * f(x) + f(b))/6
}

// Ejemplo de aproximación
val p = (x: Double) => -Math.pow(x, 2) + (8 * x) -12
integracion(p, 3, 5)

// Resolución de los ejercicios planteados
val p1 = (x: Double) => -Math.pow(x,2) + (8 * x) -12
integracion(p1, 3, 5)

val p2 = (x: Double) => 3 * (Math.pow(x, 2))
integracion(p2, 0, 2)

val p3 = (x: Double) => (x + 2 * (Math.pow(x, 2)) -Math.pow(x, 3) + 5 * (Math.pow(x, 4)))
integracion(p3, -1, 1)

val p4 = (x: Double) => (2 * x + 1) / (math.pow(x, 2) + x)
integracion(p4, 1, 2)

val p5 = (x: Double) => math.exp(x)
integracion(p5, 0, 1)

val p6 = (x: Double) => 1 / math.sqrt(x - 1)
integracion(p6, 2, 3)

val p7 = (x: Double) => 1 / (1 + math.pow(x, 2))
integracion(p7, 0, 1)

//Funcion para calcular el error
def calcularError(vE: Double, Vo: Double): Double = {
  Math.abs(vE - Vo)
}

calcularError(7.33, integracion(p1, 3, 5))
calcularError(8, integracion(p2, 0, 2))
calcularError(3.333, integracion(p3, -1, 1))
calcularError(1.09861, integracion(p4, 1, 2))
calcularError(1.71828, integracion(p5, 0, 1))
calcularError(0.828427, integracion(p6, 2, 3))
calcularError(0.785398, integracion(p7, 0, 1))

fun main(args: Array<String>) {
    println("Número 1: ")
    var n1 = readln().toDouble()
    do {
        println("Operador (+, -, *, /) ")
        var operador = readln().toString()
        while (operador != "+" && operador != "-" && operador != "*" && operador != "/") {
            println("Por favor, digite um operador válido (+, -, * ou /)")
            operador = readln().toString()
        }
        println("Número 2: ")
        var n2 = readln().toDouble()
        var res: Double
        when (operador) {
            "+" -> res = n1 + n2
            "-" -> res = n1 - n2
            "*" -> res = n1 * n2
            else -> res = n1 / n2
        }
        println(res)
        println("Continuar? S/N")
        var confirmacao = readln().toString()
        if (confirmacao.equals("N") || confirmacao.equals("n")) {
            println("Até logo!")
        } else {
            n1 = res
        }
    } while (confirmacao.equals("S") || confirmacao.equals("s"))
}

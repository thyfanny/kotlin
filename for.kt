fun main() {
    //de 1 a 50
    for (n in 1..50) {
        print("$n ")
    }
    println()
    //de 50 a 1
    for (n in 50 downTo 1) {
        print("$n ")
    }
    println()
    //de 1 a 50 sem múltiplos de 5
    for (n in 1..50) {
        if (n%5 != 0) {
            print("$n ")
        }
    }
    println()
    //somar de 1 a 500
    var count = 0
    for (n in 1..500){
        count+=n
    }
    println(count)
    //recebe um int e imprime uma escada tamanho n de #
    val tamanho = readln().toInt()
    for(n in 1..tamanho) {
        var tamanhoLinha = n
        for (n in 1..tamanhoLinha) {
            print("#")
        }
        if (n == tamanho) {break}
        println()
    }
}
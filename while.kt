fun main() {
    //encher uma caixa d'água de 2kL com balões de 7L, quantos balões cabem, sem exceder?
    val balao = 7
    var caixa = 2000
    var count = 0

    while (caixa >= balao){
        caixa-=balao
        count++
    }
    println(count)

    //de 1 a 50, quando for divisivel por 3 - Buzz, por 5 - Fizz, pelos dois FizzBuzz
    var num = 1
    while (num<=50) {
        if (num%3 == 0 && num%5 == 0){
            print("FizzBuzz ")
        } else if (num%3 == 0){
            print("Buzz ")
        } else if (num%5 == 0){
            print("Fizz ")
        } else  print("$num ")
                ++num
    }
    println()

    //inverter texto
    val str = "Can't you see it?"
    var countInverso = str.length-1
    var strInversa = buildString {  }
    while (countInverso >= 0) {
        strInversa += str[countInverso]
        --countInverso
    }
    println(strInversa)

    //verifica se tem a mesma quantidade de x e o
    println(contaXO(str))
}

fun contaXO (str: String): Boolean {
    var countx = 0
    var counto = 0
    var count = 0
    while (true) {
        if (count == str.length-1) break
        else if(str[count] == 'x') {
            ++countx
        } else if(str[count] == 'o'){
            ++counto
        }
        ++count
    }
    return if (countx == 0 && counto == 0) {
        false
    } else if (countx == counto){
        true
    } else false
}
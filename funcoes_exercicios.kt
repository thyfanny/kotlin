fun main() {

    val anos = 2.also {
        println(transformaAnos(it))
    }
    val str = "Call it what you want"
    println(tamanhoStr(str))
    println(tamanhoStr2(str))
    println(cubo(3))
    println("${milhaKm(3)}km")
    aPorx(str)
    println(aPorx2(str))
}

fun aPorx(str: String){
    var nova_string = buildString {}
    for (letra in str.lowercase()){
        nova_string += if (letra == 'a'){
            'x'
        } else {
            letra
        }
    }
    println(nova_string)
}

fun aPorx2(str: String) = str.lowercase().replace('a', 'x')

fun milhaKm(milhas: Int) = (milhas*1.6f)

fun tamanhoStr(str: String) = str.length

fun tamanhoStr2(str: String): Int{
    var count = 0
    for (letra in str) {
        ++count
    }
    return count
}

fun cubo(num: Int) = num*num*num

fun transformaAnos(anos :Int): String {
    val meses = anos*12
    var dias = anos*365
    if (anos >= 4){
        dias += (anos/4)
    }
    val horas = dias*24
    val minutos = horas*60
    val segundos = minutos*60

    return("$anos anos equivalem a \n$meses meses\n$dias dias\n$horas horas\n$minutos minutos\n$segundos segundos")
}
fun main() {
    print("Cargo: ")
    val cargo = readln()
    print("Tempo de experiência: ")
    val tempo = readln()
    println("Bônus: R$${bonus(cargo.lowercase())}")
    println("Bônus por tempo: R$${bonusTempo(cargo.lowercase(), tempo.toByte())}")
}

fun bonus(cargo: String): Int {
    if (cargo == "gerente"){
        return 2000
    } else if (cargo == "coordenador"){
        return 1500
    } else if (cargo == "engenheiro de software") {
        return 1000
    }
    else if (cargo == "estagiário") {
        return 500
    } else return 0
}

fun bonusTempo(cargo: String, tempo: Byte): Int{
    if (cargo == "gerente"){
        return if (tempo >= 2){
            3000
        } else {
            2000
        }
    } else if (cargo == "coordenador"){
        return if (tempo >= 1) {
            1800
        } else {
            1500
        }
    } else if (cargo == "engenheiro de software") {
        return 1000
    }
    else if (cargo == "estagiário") {
        return 500
    } else return 0
}
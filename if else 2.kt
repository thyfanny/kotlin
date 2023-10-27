fun main() {
    println("Retângulo")
    val num1q = readln().toInt()
    val num2q = readln().toInt()
    println(retangulo(num1q, num2q))
    if (num1q== num2q){ println("É um quadrado") }

    println("Triângulo")
    val num1t = readln().toInt()
    val num2t = readln().toInt()
    val num3t = readln().toInt()
    triangulo(num1t,num2t,num3t)

    print("Idade: ")
    val idade = readln().toInt()
    print(("Tipo de convite: "))
    val tipoConvite = readln().lowercase()
    print("Código do convite: ")
    val codigo = readln().lowercase()

    if (idade < 18){
        println("Negado. Menores de idade não são permitidos.")
    } else if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo"){
        println("Negado. Convite inválido.")
    } else if ((tipoConvite == "luxo" || tipoConvite == "premium") && !codigo.startsWith("xl")){
        println("Negado. Convite inválido.")
    } else if (tipoConvite == "comum" && !codigo.startsWith("xt")){
        println("Negado. Convite inválido.")
    } else {
        println("Welcome :)")
    }

}

fun retangulo(x: Int, y: Int) = x * y

fun triangulo(x: Int, y: Int, z: Int){
    if (x==y && y==z){
        println("É um triangulo equilátero")
    }
}
fun main() {
    val salario = 10000
    val investimentoAna = (salario*0.05)*2
    val investimentoPaula = salario*0.05
    var meses = 1
    var patrimonioAna = investimentoAna
    var patrimonioPaula = investimentoPaula

    while (true) {
        if (patrimonioPaula > patrimonioAna) break
        patrimonioAna+=(investimentoAna+(patrimonioAna*0.002))
        patrimonioPaula+=(investimentoPaula+(patrimonioPaula*0.008))
        meses++
    }
    println(meses)
}
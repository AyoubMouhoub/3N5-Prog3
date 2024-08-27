fun main() {

    println(triangle(4))
    println(triangle(8))
    println(triangle(10))
    println(triangle(100))
    println(triangle(4))
}

fun triangle(hauteur: Int): String {
    val builder = StringBuilder()

    for (i in 1..hauteur) {
        builder.append("*".repeat(i)).append("\n")
    }

    return builder.toString()
}

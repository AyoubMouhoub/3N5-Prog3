fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        val hauteur = args[0].toIntOrNull()

        if (hauteur != null && hauteur > 0) {
            dessinerTriangle(hauteur)
        } else {
            println("SVP veuillez fournir une hauteur valide (un nombre entier positif).")
        }
    } else {
        println("SVP veuillez fournir une hauteur en argument de ligne de commande.")
    }
}

fun dessinerTriangle(hauteur: Int) {
    for (i in 1..hauteur) {
        repeat(i) {
            print("*")
        }
        println() // Passe à la ligne suivante après chaque rangée
    }
}

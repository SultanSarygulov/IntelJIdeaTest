fun main(){
    val age = 15
    val layer = 5
    printCandles(age)
    printTopping(age)
    printCake(age, layer)
}

fun printCandles(age: Int){
    print(" ")
    repeat(age){
        print(",")
    }
    println()

    print(" ")
    repeat(age){
        print("|")
    }
    println()
}

fun printTopping(age: Int){
    repeat(age+2){
        print("=")
    }
    println()
}

fun printCake(age: Int, layer: Int){
    repeat(layer){
        repeat(age+2){
            print("@")
        }
        println()
    }
}
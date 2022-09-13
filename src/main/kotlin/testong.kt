import java.util.Scanner
fun main(){
    val reader = Scanner(System.`in`)
    var secs: Int = reader.nextInt()
    repeat(secs){
        secs -= 1
        println("I have $secs seconds to live")
    }
}
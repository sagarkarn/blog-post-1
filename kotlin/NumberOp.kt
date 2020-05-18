import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Enter four digit number: ")
    var num : Int = scanner.nextInt()
    if(num >999 && num < 10000){
        val first : Int= num / 1000
        num = num % 1000
        val second : Int= num / 100
        num = num % 100
        val third : Int= num / 10
        num =  num % 10
        val fourth : Int = num
        if(first + fourth == second + third){
            println("Sum of first and fourth and sum of second and third is same")
        }
        else{
            println("Sum of first and fourth and sum of second and third is not same")
        }
    }else{
        println("Enter number greather than 999 and less than 10000")
    }       
}
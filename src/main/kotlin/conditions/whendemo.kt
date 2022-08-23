package conditions
fun main(args: Array<String>){
    var day = 3;
    when(day){
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Enter number between 1 and 7")
    }
}
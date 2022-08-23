package conditions

fun main(args: Array<String>){
    println("Enter Age: ")
    var age:Int = Integer.valueOf(readLine())
    if(age >=18) {
        println("Eligible to vote")

    }else{
        println("Not eligible to vote")
    }
}
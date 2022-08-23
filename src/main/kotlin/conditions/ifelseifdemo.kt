package conditions
fun main(args: Array<String>){
    println("Enter Percentage: ")
    var percentage:Int = Integer.valueOf(readLine())
    if (percentage >=85 && percentage <= 100) {
        println("distinction")
    } else if(percentage >=60 && percentage <85){
        println("first class")
    } else if(percentage >=35 && percentage <60){
        println("second class")
    } else if(percentage >=0 && percentage <35){
    println("fail")
    } else{
    println("Enter number between 1 and 100")
    }

    }
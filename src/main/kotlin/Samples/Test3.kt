fun main(args: Array<String>){
    addition()
    substraction(50,20)
    var res = mul(50,20)
    println("multiplication of two numbers is: " + res)
    division()
}
fun addition(){
    var num1:Int =30;
    var num2:Int = 60;
    var res:Int = num1 + num2
    println("Sum of two numbers are : "+ res)
}

fun substraction(num1:Int,num2:Int){
    var res = num1 - num2;
    println("diff of two numbers is : " + res)
}

fun mul(num1:Int,num2:Int):Int{
    var res = num1 * num2
    return res
}
fun division(){
    var num1:Int = 60;
    var num2:Int = 30;
    var res:Int = num1/num2
    println("div of two numbers are : " + res)
}
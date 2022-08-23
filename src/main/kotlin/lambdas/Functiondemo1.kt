package lambdas
  fun main(args: Array<String>){
      val myLambda: (Int) -> Unit = {sum : Int -> println(sum)}
      val product :(Int,Int) -> Unit = {x:Int,y:Int -> println(x * y)}
      val display:(String) -> Unit = {msg: String -> println("welcome to chennai   ${msg}")}
      val add:(Int,Int) -> Int = add@ {x:Int,y:Int -> return@add x+y}
      //var greet:()->String = display@{return@display "Hello everyone"}
      addNumber(30,30,myLambda)
      product(20,30)
      display("Learning kotlin")
      val res = add(50,50)
      println("Number is: " + res)
  }
fun addNumber(num1:Int,num2:Int,myLambda: (Int) -> Unit){
    val add = num1 + num2
    myLambda(add)
}
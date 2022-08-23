class Employee( val company:String){
    var country:String = " "
    constructor(emp_name:String,emp_id:Int):this(company = "TCS"){
        //this is secondary constructor referring to primary constructor class employee
        println("Name is : ${emp_name} , Id is :${emp_id} and company is : ${company}")
    }
    init {
        println("welcome to chennai")
        country = "India"
        println("country is ${country} ")
    }
}

fun main(args: Array<String>){
    val emp = Employee("john", 101)

}
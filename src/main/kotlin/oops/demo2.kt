class Person(val pname:String,var page:Int){
    fun get_info(){
        println("Name is: ${pname} and Age is : ${page}")
    }
}
fun main(args: Array<String>){
    var p1 = Person( "sri",23)
    p1.get_info()
}
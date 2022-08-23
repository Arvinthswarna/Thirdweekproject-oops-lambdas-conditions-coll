fun List<String>.getShortWordsTo(shortWords:MutableList<String>,maxLength: Int){
    this.filterTo(shortWords){it.length <= maxLength}
    val articles = setOf("a","A","an","the","The")
    shortWords -= articles
}
fun main(args: Array<String>){
    val words = "i am learning web app development".split(" ")
    val shortWords = mutableListOf<String>()
    words.getShortWordsTo(shortWords,12)
    println(shortWords)
}
fun main(){
    countries()
    city()
    number()
    add("Rita","Mercy","Abi")


}
fun countries(){
    var detail = arrayOf("Nairobi","Kampala","Kigali","Burindi")
    println(detail.contentToString())
}
fun city(){
    var cities = arrayOf("harare","mumbai","dodoma","jarkata")
    var firstAlphabet=println(cities.map {it.capitalize()})


}
fun number(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = numbers[2] + numbers[5]
    println(sum)
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())



}
fun add(tag1:String,tag2:String,tag3:String):Array<String>{
     return arrayOf(tag1,tag2,tag3)
}




































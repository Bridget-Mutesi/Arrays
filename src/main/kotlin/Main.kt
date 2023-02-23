fun main(){
    countries("Nairobi","Kampala","Kigali","Burindi")
    city()
    number()
    add("Rita","Mercy","Abi")


}
fun countries(nam1:String,nam2:String,nam3:String,nam4:String){
    var detail = arrayOf(nam1,nam2,nam3,nam4)
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
fun add(tag1:String,tag2:String,tag3:String):String{
     var names = arrayOf(tag1,tag2,tag3)
    return names.contentToString()
}




































import java.util.* //requiered import
fun feedTheFish() {
    val day = randomDay()
    val food = "pellets"
    println ("Today is $day and the fish eat $food")
}

fun randomDay(): String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun main(args: Array<String>) {
    feedTheFish()
}
//Step 2 : USE A WHEN EXPRESSION
fun fishFood (day: String) : String {
    // var food = "String"
    return when (day) {
        "Monday" -> "flakes" // "food"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" ->  "granules"
        "Friday" ->  "mosquitos"
        //"Saturday" ->  "lettuce"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
    //return food
    // --> 1. Answer is "Today is Thuesday and the fish eat pellets
    // --> 2. Answer is jika var food = "String" maka hasilnya "Today is Sunday and the fish eat pellets
    // --> 3. Answer is jika when (day) ditambahkan return dan foodnya di hilangkan maka hasil nya "Today is Saturday and the fish eat pellets"
    // --> 4. Answer is
}


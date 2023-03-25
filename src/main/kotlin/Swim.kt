fun main(args: Array<String>){
    swim() // uses default speed

    swim("slow")// positional argument

    swim(speed="turtle-like") // named parameter

    feedTheFish2()
}
// Step 1 : Create a default value for a parameter
fun swim(speed: String = "fast"){
    println("Swimming $speed")
}
// Step 2 : Add requird parameters
fun shouldChangeWater (day:String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
        //temperature > 30 -> true
        //dirty > 30 -> false
        //day == "Sunday" -> true
        //else -> false
    }
}
fun feedTheFish2() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}
// Answer is

// Step 3 : Make Compact functions
fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"
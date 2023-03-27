
//Step : 1.Create Filters
//Step 2: Compare eager and lazy filters
val decorations =  listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

fun main(args: Array<String>) {
    println(decorations.filter { it[0] == 'p' })

    // eager, creates a new list
    val eager = decorations.filter { it[0] == 'p' }
    println("eager: $eager")

    //2. lazy, will wait untul asked to evaluate
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")

    //3. force evaluation of the lazy list
    val newList = filtered.toList()
    println("new list: $newList")

    val lazymap = decorations.asSequence().map {
        println("access: $it")
        it
    }
// Hasilnya :
//eager: [pagoda, plastic plant]
//filtered: kotlin.sequences.FilteringSequence@26a1ab54
//new list: [pagoda, plastic plant]
// 5.
    println("lazy: $lazymap")
    println("-----")
    println("first: ${lazymap.first()}")
    println("-----")
    println("all: ${lazymap.toList()}")
}
//Hasilnya :
//[pagoda, plastic plant]
//eager: [pagoda, plastic plant]
//filtered: kotlin.sequences.FilteringSequence@26a1ab54
//new list: [pagoda, plastic plant]
//lazy: kotlin.sequences.TransformingSequence@2b71fc7e
//-----
//access: rock
//first: rock
//-----
//access: rock
//access: pagoda
//access: plastic plant
//access: alligator
//access: flowerpot
//all: [rock, pagoda, plastic plant, alligator, flowerpot]

    val lazymap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
        println("access: $it")
        println("-----")
        println("filtered: " + lazymap2.toList())
        it
    }

//
//        val mysports = listOf("basketball", "fishing", "running")
//        val myplayers = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
//        val mycities = listOf("Los Angeles", "Chicago", "Jamaica")
//        val mylist = listOf(mysports, myplayers, mycities) // list of lists
//
//        println("-----")
//        println("Flat: ${mylist.flatten()}")

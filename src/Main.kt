import kotlin.random.Random


fun main() {
    println(compareAll(getOptions()))
}


    fun getOptions(): List<String> {
        println("Insert your options. \nType 'done' when you are finished:")
        val options = mutableListOf<String>()

        // Gets all options from the user
        println("Insert an option:")
        while(true) {
            val option = readlnOrNull()
            if (option?.lowercase() == "done") {
                break
            }
            if (option != null) {
                options.add(option)
            }
        }
        return options
    }


    // Takes a list of options and returns one option
    fun compareAll(options: List<String>): String {
        val mutableOptions = options.toMutableList()

        while (mutableOptions.size > 1) {
            val winner = comparePair(mutableOptions.removeAt(0), mutableOptions.removeAt(0))
            mutableOptions.add(winner)
        }

        return mutableOptions[0]
    }


    // Returns one of the two arguments
    fun comparePair(option1: String, option2: String): String {
        return if (Random.nextFloat() < 0.5) option1 else option2
    }

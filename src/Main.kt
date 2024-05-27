fun main() {

    println(compare_all(get_options()))

    fun get_options(): List<String> {
        println("Insert your options. \nType 'done' when you are finished:")
        val options = mutableListOf<String>()

        // Gets all options from the user
        while(true) {
            println("Insert an option:")
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
    fun compare_all(options: List<String>) {
        while (options.size > 1) {
            val winner = compare_pair(options.pop(0), options.pop(0))
            options.append(winner)
        }

        return options[0]
    }


    // Returns one of the two arguments
    fun compare_pair(option1: String, option2: String) {
        return option1 if random.random() < 0.5 else option2
    }
}
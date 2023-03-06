/**
 * Commercial Class
 * @author Jonathan Kearns
 * date: 2/28/23
 *
 * @param
 * choice = user's menu choice

 */

fun main(args: Array<String>?) {

    var choice = ""


    // print out menu

    println("---- Customers -----")
    println("1: Residential")
    println("2: Commercial")
    println("3: Exit")
    println("Choose customer type or exit: ")


    // User's input in a try/catch - 3.06.23 - Jonathan K.
    try {
        var choice = readln().toString()

        when (choice) {
            "1" -> {
                for (i in residentialArray) {
                    i.weeklyCharges()
                }
            }

            "2" -> {
                for (i in commercialArray) {
                    i.weeklyCharges()
                }
            }

            "3" -> println("Goodbye")

            // if choice not on menu
            else -> {
                println("invalid Choice. Choose again: ")
                main(null)
            }

        }

    } catch (e: Exception) {
        print("Error with user's input")

    }

    // switch to handle user's choice



}
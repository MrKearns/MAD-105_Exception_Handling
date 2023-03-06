/**
 * Commercial Class
 * @author Jonathan Kearns
 * date: 2/28/23
 *
 * @param
 * name = contact name
 * phoneNumber = phone #
 * address = customer address
 * squareFootage = how many square feet property is
 */


open class Customer (name: String, phoneNumber: String, address: String, squareFootage: Double){

    var name: String = ""
    var address: String = ""
    var phoneNumber: String = ""
    var squareFootage = 0.0

    init{
        this.name = name
        this.address = address
        this.phoneNumber = phoneNumber
        this.squareFootage = squareFootage
    }

// ---- function to print out all customer details ----

    fun displayInfo(){
        println(name)
        println(address)
        println(phoneNumber)
        println(squareFootage)
    }

}
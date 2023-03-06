/**
 * Residental Class
 * @author Jonathan Kearns
 * date: 2/28/23
 *
 * @param
 * rate = charge per squarefoot
 * senior = if discount or not
 * name = customer name
 * phoneNumber = phone #
 * address = customer address
 */


import java.text.DecimalFormat
class Residential(val rate: Double = 0.006, senior: Boolean, name: String, address: String, phoneNumber: String, squareFootage: Double)
    : Customer(name, address, phoneNumber, squareFootage) {


    var senior: Boolean

    init {

        this.senior = senior
    }

    // ---- func that calculates weekly charges and prints out all details ----

    fun weeklyCharges(): Int {

        var total = 0
        var totalFormat = DecimalFormat("\u0024###,###.00")

        println("-- Residental Customer --")
        println("Name: $name")
        println("Address: $address")
        println("Phone Number: $phoneNumber")
        println("Senior Discount: $senior")
        println("Total Square Footage: $squareFootage")

        when (senior){
            true -> {
                total = (rate * squareFootage).toInt()
                var discountTotal  = total - (total * .15)
                total = discountTotal.toInt()
                println("Weekly Charges: ${totalFormat.format(total)}\n")
                return total
            }

            false -> {
                total = (rate * squareFootage).toInt()
                println("Weekly Charges:  ${totalFormat.format(total)}\n")
                return total
            }
        }




    }
}


// customers
var customer1 = Residential(0.006,true, "Joe N.", "1234 Street. City, IL", "1234567", 5000.0)
var customer2 = Residential( senior = false, name = "Samantha Smith", address = "7897 Road, Town, IL", phoneNumber = "0197777", squareFootage = 4750.00)
var customer3 = Residential(0.006, false, "Rodg Rodger", "67 This Street, IL", "8184556", squareFootage = 25000.00)

// array of above customers
var residentialArray = arrayOf(customer1, customer2, customer3)
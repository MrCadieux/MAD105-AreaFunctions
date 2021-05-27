fun main() {
    var shapeChoice: Int

    do{
        println("\nWhat shape do you want to find the area of?")
        println("1: Square")
        println("2: Rectangle")
        println("3: Triangle")
        println("4: Trapezoid")
        println("9: Exit")
        print("Please enter one of the choices above: ")
        shapeChoice = readLine()!!.toInt()

        when(shapeChoice){
            1 -> rectangle()
            2 -> rectangle()
            3 -> triangle()
            4 -> trapezoid()
            9 -> break
            !in 1..4 -> println("Not a choice!!! \n")
        }

    }while(shapeChoice!=9)

    println("\nThank you!")

}

fun trapezoid(){
    print("Enter Height: ")
    var height = readLine()!!.toDouble()
    print("Enter Length of Base1: ")
    var base1 = readLine()!!.toDouble()
    print("Enter Length of Base2: ")
    var base2 = readLine()!!.toDouble()

    println("The area of the Trapezoid is: " + (height*(base1+base2)/2))

}

fun rectangle(){
    print("Enter Length: ")
    var length = readLine()!!.toDouble()
    print("Enter Width: ")
    var width = readLine()!!.toDouble()

    if (length == width){
        square(length)
    }
    else {
        println("The area of the Rectangle is: " + (length*width))
    }


}

fun square(sideLength: Double){
    println("The area of the Square is: " + (sideLength*sideLength))
}

fun triangle(){
    print("Enter Height: ")
    var height = readLine()!!.toDouble()
    print("Enter Length of Base: ")
    var base = readLine()!!.toDouble()

    println("The area of the Triangle is: " + ((base*height)/2))
}
fun main() {
    println("Hello World!")

    // variables

    // use of var and val
    var userName : String = "Kamlesh"
    userName = "Visnu" // change value store in userName because
    var age : Int = 21
    println("My name is $userName and I am $age years old")

    val color : String = "red"
//    color = "Black" // give error because
    println("My favorite color is $color")

    // Strings
    println("My name is $userName\nMy favorite color is $color")
    println("hello\bworld") // hellworld
    println("hello\tworld") // hello    world



    val miniMumVal : Int = Int.MIN_VALUE
    val maxiMumVal : Int = Int.MAX_VALUE
    println("Maximum Value of Integer in Kotlin is $maxiMumVal") // 2147483647
    println("Maximum Value of Integer in Kotlin is $miniMumVal") // -2147483648
}

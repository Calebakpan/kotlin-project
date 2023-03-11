fun main() {
    print("Enter a number: ")
    val num = readln().toInt()

    if (isPrime(num)) {
        println("$num is a prime number.")
    } else {
        println("$num is not a prime number.")
    }
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) {
        return false
    }

    for (i in 2..num / 2) {
        if (num % i == 0) {
            return false
        }
    }

    return true
}

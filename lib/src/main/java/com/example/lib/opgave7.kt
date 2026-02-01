fun main() {

    print("Please enter your numerical grade: ")
    val gradeInput = readln().toInt()

    val result = gradeFormatter(gradeInput)
    println("Your letter grade is: $result")
}

fun gradeFormatter(grade: Int): String {
    if (grade >= 90) {
        return "A"
    } else if (grade >= 80) {
        return "B"
    } else if (grade >= 70) {
        return "C"
    } else if (grade >= 60) {
        return "D"
    } else {
        return "F"
    }
}
import java.lang.IllegalArgumentException

fun main(){
    println("Enter an arithmetic problem")
    var input: String? = readLine()
    while (input != null && input.isNotBlank()) {
        var values = input.split(' ')
        if(values.size < 3){
            println("Invalid Input.")
        }else{
            val value1 = values[0].toDoubleOrNull() ?: throw IllegalArgumentException("Invalid Input")
            val value2 = values[2].toDoubleOrNull() ?: throw IllegalArgumentException("Invalid Input")
            val operator = values[1]
            val result = when(operator){
                "+" -> value1 + value2
                "-" -> value1 - value2
                "*" -> value1 * value2
                "/" -> value1 / value2
                else -> throw IllegalArgumentException("Invalid Operator $operator")
            }
            println("Result = $result " )
        }
        input = readLine()
    }
}
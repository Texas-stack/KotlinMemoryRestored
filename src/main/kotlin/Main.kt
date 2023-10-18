fun main() {
    println("Hello World!")
    while (true){
        val input = readln()
        when(input.toIntOrNull()){
            0 ->{break}
            1 ->{
                println("Решение Артёма:")
                println(Watch().execute())
            }
            2 ->{
                println("Решение Лёши")
            }
        }
    }

}
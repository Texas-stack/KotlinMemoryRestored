class Watch() {
    // Пользователь задает время в часах, минутах и секундах, например, 8:20:35.
    // Рассчитать время в секундах, прошедшее с начала суток (30035 в данном случае), вернуть значение типа Int
    // Дополнительно: вернуть также оставшееся время до конца суток в секундах


    fun execute():String {
        var list = emptyList<String>()
        while(true){
            println("Введите время (в формате hh:mm:ss)")
            val time = readln()

            val del = ":"

            list = time.split(del)

            println(list)    // [A, B, C]

            if(list[1].toInt() >= 60){
                println("Неверно введённое время (минуты)")
            }
            else{
                if(list[2].toInt() >= 60){
                    println("Неверно введённое время (секунды)")
                }
                else{
                    break
                }

            }
        }

        val answer1:Int = list[2].toInt() + (list[1].toInt() * 60) + (list[0].toInt() * 3600)

        val answer2:Int = 86400 - answer1

        return "С начала суток прошло: $answer1 секунд\nДо конца суток осталось: $answer2 секунд"
    }

}
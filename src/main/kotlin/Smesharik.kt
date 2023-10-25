class Smesharik:SmesharikRepository {
    var answer: String = readln()
    var color:String = ""
    fun krosh():String {
        answer = ""
        println("Какого цвета твой Крош?\n" +
                "1. Розовый\n" +
                "2. Синий\n" +
                "3. Чёрный\n")
        answer = readln()
        when (answer) {
            "1" -> {
                color = "Розового"
            }
            "2" -> {
                color = "Синего"
            }
            "3" -> {
                color = "Чёрного"
            }
        }
        answer = ""
        return "Ты выбрал $color Кроша"
    }

    fun nyusha():String {
        answer = ""
        println("Какого цвета твоя Нюша?\n" +
                "1. Серая\n" +
                "2. Голубая\n" +
                "3. Коричневая\n")
        answer = readln()
        when (answer) {
            "1" -> {
                color = "Серую"
            }
            "2" -> {
                color = "Голубую"
            }
            "3" -> {
                color = "Коричневую"
            }
        }
        answer = ""
        return "Ты выбрал $color Нюшу"
    }

    fun kopatich():String {
        answer = ""
        println("Какого цвета твой Копатыч?\n" +
                "1. Пурпурный\n" +
                "2. Розовый\n" +
                "3. Зелёный\n")
        answer = readln()
        when (answer) {
            "1" -> {
                color = "Пурпурного"
            }
            "2" -> {
                color = "Розового"
            }
            "3" -> {
                color = "Зелёного"
            }
        }
        answer = ""
        return "Ты выбрал $color Копатыча"

    }
    override fun execute(){
        while(true) {
            println(
                "Какой ты смешарик?\n" +
                        "1. Крош\n" +
                        "2. Нюша\n" +
                        "3. Копатыч\n"
            )

            when (answer){
                "1" -> {
                    krosh()
                    break
                }
                "2" -> {
                    nyusha()
                    break
                }
                "3" -> {
                    kopatich()
                    break
                }
            }
        }
    }
}
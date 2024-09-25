package org.example.lesson5

fun main() {
    val guestInputName: String
    val guestInputPassword: String
    val registeredUserName = "Zaphod"
    val registeredUserPassword = "PanGalactic"
    val marvinGreeting = """
        Внимание, пассажир. 
        Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля "Heart of Gold". 
        [вздыхает...] Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа. 
        Я всегда готов служить, хотя это не приносит мне радости... 
        но вы, наверное, об этом не заботитесь. [вздыхает ещё глубже...] 
        Да, вперед, пожалуйста, вводите свои данные...""".trimIndent()
    val marvinAcceptUserMessage = """
        [вздыхает...] 
        Ваши данные проверены, и о, чудо, они верны... Пользователь "Zaphod", 
        вам разрешено входить на борт корабля "Heart of Gold". Хотя мне всё равно... 
        Ну вперед, войдите... Если вам так уж надо, в конце концов... 
        [меланхолический вздох...]
        Надеюсь, вам понравится пребывание здесь больше, чем мне.
        """.trimIndent()
    val badPasswordMessage = "немерный пароль."

    println(marvinGreeting)
    print("введи имя: ")
    guestInputName = readln()

    if (guestInputName.lowercase() == registeredUserName.lowercase()) {
        print("введи пароль: ")
        guestInputPassword = readln()
        if (guestInputPassword == registeredUserPassword) {
            println(marvinAcceptUserMessage)
        } else {
            println(badPasswordMessage)
        }
    } else {
        println("Нет такого пользователя в системе. Зарегистрируйтесь пожалуйста.")
    }
}
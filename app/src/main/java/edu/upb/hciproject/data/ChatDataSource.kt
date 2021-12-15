package edu.upb.hciproject.data

import edu.upb.hciproject.model.Chat

object ChatDataSource {
    val chatList = mutableListOf<Chat>(
        Chat(
            from = "SHEIN",
            message = "Gracias",
            date = "15:54",
            imageUrl = "https://todolujo.com/wp-content/uploads/2020/05/Shein_logo.jpg"
        ),
        Chat(
            from = "Bershka",
            message = "Direccion",
            date = "12:00",
            imageUrl = "https://i.pinimg.com/originals/bc/70/6a/bc706aa74ca2a861b80d9cdc1c07cf07.jpg"
        ),
        Chat(
            from = "ZARA",
            message = "Le mando los modelos",
            date = "13:21",
            imageUrl = "https://logos-marcas.com/wp-content/uploads/2020/05/Zara-Logo.png"
        ),
        Chat(
            from = "Liliana Castellano",
            message = "Tutorial para medir",
            date = "19:54",
            imageUrl = "https://i.pinimg.com/originals/80/a9/3f/80a93fa61614b42d8ecf573b380f208e.jpg"
        ),
        Chat(
            from = "Papingo Maminga",
            message = "Mensaje de shein",
            date = "08:10",
            imageUrl = "https://yellow.place/file/image/thumb/0/0/1064/vcuduyrnryztpscl.jpg"
        ),
        Chat(
            from = "FOREVER 21",
            message = "No me llego el paquete",
            date = "07:54",
            imageUrl = "https://www.talkwalker.com/Pictures/Brands/small/csm-talkwalker-forever21-ef22ae7ff4..jpg"
        ),
        Chat(
            from = "MANGO",
            message = "Queria preguntar sobre...",
            date = "16:03",
            imageUrl = "https://1000marcas.net/wp-content/uploads/2020/10/Mango-Logo.jpg"
        )
    )
}
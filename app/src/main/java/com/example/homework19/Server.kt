package com.example.homework19

object Server {
    fun getFilms(): List<Film> = listOf(
        Film(
            1,
            "https://www.kinopoisk.ru/images/sm_film/535341.jpg",
            "1+1",
            8.8,
            false
        ),
        Film(
            2,
            "https://avatars.mds.yandex.net/get-kinopoisk-image/1599028/637271d5-61b4-4e46-ac83-6d07494c7645/72x108",
            "Джентльмены ",
            8.5,
            false
        ),
        Film(
            3,
            "https://avatars.mds.yandex.net/get-kinopoisk-image/1599028/4adf61aa-3cb7-4381-9245-523971e5b4c8/72x108",
            "Аватар",
            8.0,
            false
        ),
        Film(
            4,
            "https://avatars.mds.yandex.net/get-kinopoisk-image/1599028/4057c4b8-8208-4a04-b169-26b0661453e3/72x108",
            "Зеленая миля",
            9.1,
            true
        ),
        Film(
            5,
            "https://avatars.mds.yandex.net/get-kinopoisk-image/1900788/87b5659d-a159-4224-9bff-d5a5d109a53b/72x108",
            "Криминальное чтиво",
            8.6,
            false
        ),
        Film(
            6,
            "https://avatars.mds.yandex.net/get-kinopoisk-image/6201401/1e1ac6d9-c658-4f5f-937e-d080bca0d893/72x108",
            "Список Шиндлера",
            8.8,
            true
        )
    )
}
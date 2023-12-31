package com.example.hungryist.network

class Currencies {
    private val client = OkHttpClient()

    private val request = Request.Builder()
        .url("https://restaurants222.p.rapidapi.com/currencies")
        .get()
        .addHeader("X-RapidAPI-Key", "c9c4e1b99dmsh446d9f65664ddc7p1b6c0ajsn7320c4dff434")
        .addHeader("X-RapidAPI-Host", "restaurants222.p.rapidapi.com")
        .build()

    val response = client.newCall(request).execute()
}
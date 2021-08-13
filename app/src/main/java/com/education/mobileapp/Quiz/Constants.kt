package com.education.mobileapp.Quiz

// Holder of questions
object Constants {

    // Function returning array list of question sets
    fun getQuestions(): ArrayList<QuestionAdapter> {
        val questionsList = ArrayList<QuestionAdapter>()

        // 1
        val que1 = QuestionAdapter (
            1,
            "Sa pangungusap na, “Minsan tayo ay nagbubulagan-bulagan sa katotohanan na ang Diyos ang siyang ating sandigan sa kabila ng kumakalat na sakit sa mundo,” ang gamit ng pandiwa ay __________.",
            "Aksiyon, kilos o galaw", "Karanasan", "Pangyayari", "Kaganapan", 2
                )

        questionsList.add(que1)
        // 2
        val que2 = QuestionAdapter (
            2,
            "Sa pangungusap na, “Ang vaccine para sa COVID-19 ay kasalukuyang pinag-aaralan,” ang pokus ng pandiwang ginamit ay __________.",
            "Tagaganap", "Tagatanggap", "Layon", "Kagamitan", 3
        )

        questionsList.add(que2)
        // 3
        val que3 = QuestionAdapter (
            3,
            "Sa pangungusap na “Ang tamang dispilina sa sarili ay ipanlalaban natin sa sakit na kumakalat sa mundo,” ang pandiwang ginamit na nagbibigay-tuon sa paksa ay __________.",
            "Kumakalat", "Ipanlalaban ", "Disiplina ", "Mundo", 2
        )

        questionsList.add(que3)
        // 4
        val que4 = QuestionAdapter (
            4,
            "Ang pokus ng pandiwang ginamit sa bilang 3 ay __________.",
            "Layon", "Kagamitan ", "Tagaganap ", "Tagatanggap ", 2
        )

        questionsList.add(que4)
        // 5
        val que5 = QuestionAdapter (
            5,
            "Ang paksang tinutukoy sa bilang 3 ay __________.",
            "Tamang disiplina ", "Ipanlalaban", "Sakit", "Mundo", 1
        )

        questionsList.add(que5)
        // 6
        val que6 = QuestionAdapter (
            6,
            "Ang ____________ ay tumutukoy sa relasyong pansemantika ng pandiwa sa paksa ng pangungusap.",
            "Komplemento ng pandiwa ", "Pokus ng pandiwa ", "Antas ng pang-uri ", "Gamit ng pandiwa ", 2
        )

        questionsList.add(que6)

        // 7
        val que7 = QuestionAdapter (
            7,
            "Naipakikita ang pokus ng pandiwa sa pamamagitan ng taglay na __________ ng pandiwa.",
            "Kayarian", "Panlapi", "Salitang-ugat", "Gamit", 2
        )

        questionsList.add(que7)
        // 8
        val que8 = QuestionAdapter (
            8,
            "Sa pagtiyak ng pokus ng pandiwa na ginamit sa pangungusap, mahalagang tukuyin ang ginamit na __________ at pandiwa.",
            "Panag-uri", "Pang-uri", "Sugnay", "Paksa", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = QuestionAdapter (
            9,
            "Tandaan na ang __________ ay ang pinag-uusapan sa pangungusap.",
            "Panlapi", "Panag-uri", "Paksa", "Salita", 3
        )

        questionsList.add(que9)

        // 10
        val que10 = QuestionAdapter (
            10,
            "Ang __________ naman ay laging nagsasaad ng kilos na taglay ang mga panlapi sa kayarian ng salita.",
            "Pandiwa", "Paksa", "Sugnay", "Panag-uri", 1
        )

        questionsList.add(que10)

        return questionsList


    }
}
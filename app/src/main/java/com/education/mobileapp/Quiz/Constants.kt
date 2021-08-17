package com.education.mobileapp.Quiz

// Holder of questions
object Constants {

    const val CORRECT_ANSWERS: String = "correct_answers"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val IS_ANSWERED: Int = 0
    const val KWARTER: String = "Ika-unang Kwarter"
    const val SUPLEMENTAL: Int = 1
    const val PAGSASANAY: Int = 1

    // Function returning array list of question sets
    fun getQuestions(): ArrayList<QuestionModel> {
        val questionsList = ArrayList<QuestionModel>()
        val que1 = QuestionModel (
            1,
            "Sa pangungusap na, “Minsan tayo ay nagbubulagan-bulagan sa katotohanan na ang Diyos ang siyang ating sandigan sa kabila ng kumakalat na sakit sa mundo,” ang gamit ng pandiwa ay __________.",
            "Aksiyon, kilos o galaw", "Karanasan", "Pangyayari", "Kaganapan", 2
                )

        questionsList.add(que1)

        val que2 = QuestionModel (
            2,
            "Sa pangungusap na, “Ang vaccine para sa COVID-19 ay kasalukuyang pinag-aaralan,” ang pokus ng pandiwang ginamit ay __________.",
            "Tagaganap", "Tagatanggap", "Layon", "Kagamitan", 3
        )

        questionsList.add(que2)

        val que3 = QuestionModel (
            3,
            "Sa pangungusap na “Ang tamang dispilina sa sarili ay ipanlalaban natin sa sakit na kumakalat sa mundo,” ang pandiwang ginamit na nagbibigay-tuon sa paksa ay __________.",
            "Kumakalat", "Ipanlalaban ", "Disiplina ", "Mundo", 2
        )

        questionsList.add(que3)

        val que4 = QuestionModel (
            4,
            "Ang pokus ng pandiwang ginamit sa bilang 3 ay __________.",
            "Layon", "Kagamitan ", "Tagaganap ", "Tagatanggap ", 2
        )

        questionsList.add(que4)

        val que5 = QuestionModel (
            5,
            "Ang paksang tinutukoy sa bilang 3 ay __________.",
            "Tamang disiplina ", "Ipanlalaban", "Sakit", "Mundo", 1
        )

        questionsList.add(que5)

        val que6 = QuestionModel (
            6,
            "Ang ____________ ay tumutukoy sa relasyong pansemantika ng pandiwa sa paksa ng pangungusap.",
            "Komplemento ng pandiwa ", "Pokus ng pandiwa ", "Antas ng pang-uri ", "Gamit ng pandiwa ", 2
        )

        questionsList.add(que6)

        val que7 = QuestionModel (
            7,
            "Naipakikita ang pokus ng pandiwa sa pamamagitan ng taglay na __________ ng pandiwa.",
            "Kayarian", "Panlapi", "Salitang-ugat", "Gamit", 2
        )

        questionsList.add(que7)

        val que8 = QuestionModel (
            8,
            "Sa pagtiyak ng pokus ng pandiwa na ginamit sa pangungusap, mahalagang tukuyin ang ginamit na __________ at pandiwa.",
            "Panag-uri", "Pang-uri", "Sugnay", "Paksa", 4
        )

        questionsList.add(que8)

        val que9 = QuestionModel (
            9,
            "Tandaan na ang __________ ay ang pinag-uusapan sa pangungusap.",
            "Panlapi", "Panag-uri", "Paksa", "Salita", 3
        )

        questionsList.add(que9)

        val que10 = QuestionModel (
            10,
            "Ang __________ naman ay laging nagsasaad ng kilos na taglay ang mga panlapi sa kayarian ng salita.",
            "Pandiwa", "Paksa", "Sugnay", "Panag-uri", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}

object Constants2 {

    const val CORRECT_ANSWERS: String = "correct_answers"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val OVERALL_QUESTION: String = "May nagsumbong sa isang taong mayaman na nilulustay ng kaniyang katiwala ang kaniyang ari – arian 1. (kaya’t, saka) ipinatawag niya ang katiwala at tinanong. 2. (Unang, Pagkatapos) tinawag ng katiwala ang may utang na isandaang tapayang langis. 3. (Saka, Pati) pinaupo at pinapalitan ng limampu ang kasulatan. 4. (Gayon din, dahil sa) ang ginawa sa isa pa. Ginawang walumpung kabang trigo mula sa isandaang trigo. 5. (Dahil sa, upang) katalinuhan ng katiwala, pinuri ng amo ang tusong katiwala."


    fun getQuestion(): ArrayList<QuestionModel2> {
        val questionsList = ArrayList<QuestionModel2>()

        val que1 = QuestionModel2(
            1, OVERALL_QUESTION, "kaya't", "saka", 1
        )
        questionsList.add(que1)

        val que2 = QuestionModel2(
            1, OVERALL_QUESTION, "Unang", "Pagkatapos", 1
        )
        questionsList.add(que2)

        val que3 = QuestionModel2(
            1, OVERALL_QUESTION, "Saka", "Pati", 1
        )
        questionsList.add(que3)

        val que4 = QuestionModel2(
            1, OVERALL_QUESTION, "Gayon din", "dahil sa", 1
        )
        questionsList.add(que4)

        val que5 = QuestionModel2(
            1, OVERALL_QUESTION, "Dahil sa", "upang", 1
        )
        questionsList.add(que5)

        return questionsList
    }
}
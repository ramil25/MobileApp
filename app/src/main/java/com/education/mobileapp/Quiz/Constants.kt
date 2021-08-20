package com.education.mobileapp.Quiz

// global variables
const val CORRECT_ANSWERS: String = "correct_answers"
const val TOTAL_QUESTIONS: String = "total_questions"
const val IS_ANSWERED: String = ""
const val KWARTER: String = "kwarter_num"
const val SUPLEMENTAL: String = "supl_num"
const val PAGSASANAY: String = "pagsasanay_num"

// value for hiding next quiz button
const val IS_HIDE: String = "no"

// Holder of questions
object Constants {

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

    fun getQuestion(): ArrayList<QuestionModel2> {
        val questionsList = ArrayList<QuestionModel2>()

        val que1 = QuestionModel2(
            1, "May nagsumbong sa isang taong mayaman na nilulustay ng kaniyang katiwala ang kaniyang ari – arian 1. (kaya’t, saka) ipinatawag niya ang katiwala at tinanong. 2. _____ tinawag ng katiwala ang may utang na isandaang tapayang langis. 3. _____ pinaupo at pinapalitan ng limampu ang kasulatan. 4. _____ ang ginawa sa isa pa. Ginawang walumpung kabang trigo mula sa isandaang trigo. 5. _____ katalinuhan ng katiwala, pinuri ng amo ang tusong katiwala.", "kaya't", "saka", 1
        )
        questionsList.add(que1)

        val que2 = QuestionModel2(
            2, "May nagsumbong sa isang taong mayaman na nilulustay ng kaniyang katiwala ang kaniyang ari – arian kaya’t ipinatawag niya ang katiwala at tinanong. 2. (Unang, Pagkatapos) tinawag ng katiwala ang may utang na isandaang tapayang langis. 3. _____ pinaupo at pinapalitan ng limampu ang kasulatan. 4. _____ ang ginawa sa isa pa. Ginawang walumpung kabang trigo mula sa isandaang trigo. 5. _____ katalinuhan ng katiwala, pinuri ng amo ang tusong katiwala.", "Unang", "Pagkatapos", 1
        )
        questionsList.add(que2)

        val que3 = QuestionModel2(
            3, "May nagsumbong sa isang taong mayaman na nilulustay ng kaniyang katiwala ang kaniyang ari – arian kaya’t ipinatawag niya ang katiwala at tinanong. Unang tinawag ng katiwala ang may utang na isandaang tapayang langis. 3. (Saka, Pati) pinaupo at pinapalitan ng limampu ang kasulatan. 4. _____ ang ginawa sa isa pa. Ginawang walumpung kabang trigo mula sa isandaang trigo. 5. _____ katalinuhan ng katiwala, pinuri ng amo ang tusong katiwala.", "Saka", "Pati", 1
        )
        questionsList.add(que3)

        val que4 = QuestionModel2(
            4, "May nagsumbong sa isang taong mayaman na nilulustay ng kaniyang katiwala ang kaniyang ari – arian kaya’t ipinatawag niya ang katiwala at tinanong. Unang tinawag ng katiwala ang may utang na isandaang tapayang langis. Saka pinaupo at pinapalitan ng limampu ang kasulatan. 4. (Gayon din, dahil sa) ang ginawa sa isa pa. Ginawang walumpung kabang trigo mula sa isandaang trigo. 5. _____ katalinuhan ng katiwala, pinuri ng amo ang tusong katiwala.", "Gayon din", "dahil sa", 1
        )
        questionsList.add(que4)

        val que5 = QuestionModel2(
            5, "May nagsumbong sa isang taong mayaman na nilulustay ng kaniyang katiwala ang kaniyang ari – arian kaya’t ipinatawag niya ang katiwala at tinanong. Unang tinawag ng katiwala ang may utang na isandaang tapayang langis. Saka pinaupo at pinapalitan ng limampu ang kasulatan. Gayon din ang ginawa sa isa pa. Ginawang walumpung kabang trigo mula sa isandaang trigo. 5. (Dahil sa, upang) katalinuhan ng katiwala, pinuri ng amo ang tusong katiwala.", "Dahil sa", "upang", 1
        )
        questionsList.add(que5)

        return questionsList
    }
}

object Constants3 {

    fun getQuestion(): ArrayList<QuestionModel3> {
        val questionsList = ArrayList<QuestionModel3>()

        val que1 = QuestionModel3(
            1,
            "Maiuugnay ang awiting ito sa naging serye ng buhay ng bawat mamamayan sa lahat ng dako ng mundo. 1. ________ pandemya bawal lumabas sa kani – kanilang tahanan ang mga tao kung walang mahalagang gagawin sa labas 2. _________ epektibong makontrol ang pagkalat ng nasabing sakit. 3. _______________, tiis – tiis muna sa init at pagkabagot sa loob ng tahanan. Isa pa, kung hindi magiging disiplinado ang mga tao ay baka mas malalang sitwasyon pa ang sapitin ng ating bansa. Marami ang natakot dahil sa bagsik ng virus na ito 4. ___________ istriktong nagpatupad ang pamahalaan ng mga patakaran. 5. ___________, ang ating mahigpit na pagsunod ang magiging daan tungo sa tuloy – tuloy na paggaling ng ating bayan mula sa sakit na ito.",
            "Dahil sa"
        )
        questionsList.add(que1)

        val que2 = QuestionModel3(
            2,
            "Maiuugnay ang awiting ito sa naging serye ng buhay ng bawat mamamayan sa lahat ng dako ng mundo. Dahil sa pandemya bawal lumabas sa kani – kanilang tahanan ang mga tao kung walang mahalagang gagawin sa labas 2. _________ epektibong makontrol ang pagkalat ng nasabing sakit. 3. _______________, tiis – tiis muna sa init at pagkabagot sa loob ng tahanan. Isa pa, kung hindi magiging disiplinado ang mga tao ay baka mas malalang sitwasyon pa ang sapitin ng ating bansa. Marami ang natakot dahil sa bagsik ng virus na ito 4. ___________ istriktong nagpatupad ang pamahalaan ng mga patakaran. 5. ___________, ang ating mahigpit na pagsunod ang magiging daan tungo sa tuloy – tuloy na paggaling ng ating bayan mula sa sakit na ito.",
            "upang"
        )
        questionsList.add(que2)

        val que3 = QuestionModel3(
            3,
            "Maiuugnay ang awiting ito sa naging serye ng buhay ng bawat mamamayan sa lahat ng dako ng mundo. Dahil sa pandemya bawal lumabas sa kani – kanilang tahanan ang mga tao kung walang mahalagang gagawin sa labas upang epektibong makontrol ang pagkalat ng nasabing sakit. 3. _______________, tiis – tiis muna sa init at pagkabagot sa loob ng tahanan. Isa pa, kung hindi magiging disiplinado ang mga tao ay baka mas malalang sitwasyon pa ang sapitin ng ating bansa. Marami ang natakot dahil sa bagsik ng virus na ito 4. ___________ istriktong nagpatupad ang pamahalaan ng mga patakaran. 5. ___________, ang ating mahigpit na pagsunod ang magiging daan tungo sa tuloy – tuloy na paggaling ng ating bayan mula sa sakit na ito.",
            "Sa madaling sabi"
        )
        questionsList.add(que3)

        val que4 = QuestionModel3(
            4,
            "Maiuugnay ang awiting ito sa naging serye ng buhay ng bawat mamamayan sa lahat ng dako ng mundo. Dahil sa pandemya bawal lumabas sa kani – kanilang tahanan ang mga tao kung walang mahalagang gagawin sa labas upang epektibong makontrol ang pagkalat ng nasabing sakit. Sa madaling sabi, tiis – tiis muna sa init at pagkabagot sa loob ng tahanan. Isa pa, kung hindi magiging disiplinado ang mga tao ay baka mas malalang sitwasyon pa ang sapitin ng ating bansa. Marami ang natakot dahil sa bagsik ng virus na ito 4. ___________ istriktong nagpatupad ang pamahalaan ng mga patakaran. 5. ___________, ang ating mahigpit na pagsunod ang magiging daan tungo sa tuloy – tuloy na paggaling ng ating bayan mula sa sakit na ito.",
            "kung kaya"
        )
        questionsList.add(que4)

        val que5 = QuestionModel3(
            5,
            "Maiuugnay ang awiting ito sa naging serye ng buhay ng bawat mamamayan sa lahat ng dako ng mundo. Dahil sa pandemya bawal lumabas sa kani – kanilang tahanan ang mga tao kung walang mahalagang gagawin sa labas upang epektibong makontrol ang pagkalat ng nasabing sakit. Sa madaling sabi, tiis – tiis muna sa init at pagkabagot sa loob ng tahanan. Isa pa, kung hindi magiging disiplinado ang mga tao ay baka mas malalang sitwasyon pa ang sapitin ng ating bansa. Marami ang natakot dahil sa bagsik ng virus na ito kung kaya istriktong nagpatupad ang pamahalaan ng mga patakaran. 5. ___________, ang ating mahigpit na pagsunod ang magiging daan tungo sa tuloy – tuloy na paggaling ng ating bayan mula sa sakit na ito.",
            "Sa dakong huli"
        )
        questionsList.add(que5)

        return questionsList
    }
}
package com.education.mobileapp.Quiz

// global variables
const val CORRECT_ANSWERS: String = "correct_answers"
const val TOTAL_QUESTIONS: String = "total_questions"
const val IS_ANSWERED: String = ""
const val KWARTER: String = "kwarter_num"
const val SUPLEMENTAL: String = "supl_num"
const val PAGSASANAY: String = "pagsasanay_num"

// value for hiding next quiz button
const val HAS_NEXT_QUIZ: String = "no"

// Holder of questions

// 1-kwarter suplemental 1 question
object Constants {

    // Function returning array list of question sets
    fun getQuestions(): ArrayList<QuestionModel> {
        val questionsList = ArrayList<QuestionModel>()
        val que1 = QuestionModel (
            1,
            "1. Sa pangungusap na, “Minsan tayo ay nagbubulagan-bulagan sa katotohanan na ang Diyos ang siyang ating sandigan sa kabila ng kumakalat na sakit sa mundo,” ang gamit ng pandiwa ay __________.",
            "Aksiyon, kilos o galaw", "Karanasan", "Pangyayari", "Kaganapan", 2
                )

        questionsList.add(que1)

        val que2 = QuestionModel (
            2,
            "2. Sa pangungusap na, “Ang vaccine para sa COVID-19 ay kasalukuyang pinag-aaralan,” ang pokus ng pandiwang ginamit ay __________.",
            "Tagaganap", "Tagatanggap", "Layon", "Kagamitan", 3
        )

        questionsList.add(que2)

        val que3 = QuestionModel (
            3,
            "3. Sa pangungusap na “Ang tamang dispilina sa sarili ay ipanlalaban natin sa sakit na kumakalat sa mundo,” ang pandiwang ginamit na nagbibigay-tuon sa paksa ay __________.",
            "Kumakalat", "Ipanlalaban ", "Disiplina ", "Mundo", 2
        )

        questionsList.add(que3)

        val que4 = QuestionModel (
            4,
            "4. Ang pokus ng pandiwang ginamit sa bilang 3 ay __________.",
            "Layon", "Kagamitan ", "Tagaganap ", "Tagatanggap ", 2
        )

        questionsList.add(que4)

        val que5 = QuestionModel (
            5,
            "5. Ang paksang tinutukoy sa bilang 3 ay __________.",
            "Tamang disiplina ", "Ipanlalaban", "Sakit", "Mundo", 1
        )

        questionsList.add(que5)

        val que6 = QuestionModel (
            6,
            "6. Ang ____________ ay tumutukoy sa relasyong pansemantika ng pandiwa sa paksa ng pangungusap.",
            "Komplemento ng pandiwa ", "Pokus ng pandiwa ", "Antas ng pang-uri ", "Gamit ng pandiwa ", 2
        )

        questionsList.add(que6)

        val que7 = QuestionModel (
            7,
            "7. Naipakikita ang pokus ng pandiwa sa pamamagitan ng taglay na __________ ng pandiwa.",
            "Kayarian", "Panlapi", "Salitang-ugat", "Gamit", 2
        )

        questionsList.add(que7)

        val que8 = QuestionModel (
            8,
            "8. Sa pagtiyak ng pokus ng pandiwa na ginamit sa pangungusap, mahalagang tukuyin ang ginamit na __________ at pandiwa.",
            "Panag-uri", "Pang-uri", "Sugnay", "Paksa", 4
        )

        questionsList.add(que8)

        val que9 = QuestionModel (
            9,
            "9. Tandaan na ang __________ ay ang pinag-uusapan sa pangungusap.",
            "Panlapi", "Panag-uri", "Paksa", "Salita", 3
        )

        questionsList.add(que9)

        val que10 = QuestionModel (
            10,
            "10. Ang __________ naman ay laging nagsasaad ng kilos na taglay ang mga panlapi sa kayarian ng salita.",
            "Pandiwa", "Paksa", "Sugnay", "Panag-uri", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}

// 1-kwarter suplemental 2 question
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

// 1-kwarter suplemental 3 question
object Constants4 {

    fun getQuestion(): ArrayList<QuestionModel4> {
        val questionsList = ArrayList<QuestionModel4>()

        val que1 = QuestionModel4(
            1, "1. _____________ tauhang si Psyche sa Mitolohiya, “kapag mahal mo ang isang nilalang, ipaglalaban mo ito.”","Ayon sa",
            "Alinsunod sa", "Ayon sa", "Sa kabilang banda", "Inaakala ng", "Sang-ayon sa ",
            "Samantala", "Sa paniniwala ko", "Sa tingin ko", "Sa kabilang dako", "Batay sa"
                )
        questionsList.add(que1)

        val que2 = QuestionModel4(
            2, "2. _____________ ordinansa, upang maiwasan ang pagkakalat-kalat ng mga alagang hayop, nagpanukala ang bayan na “Aso mo, itali mo.”","Alinsunod sa",
            "Alinsunod sa", "Ayon sa", "Sa kabilang banda", "Inaakala ng", "Sang-ayon sa ",
            "Samantala", "Sa paniniwala ko", "Sa tingin ko", "Sa kabilang dako", "Batay sa"
        )
        questionsList.add(que2)

        val que3 = QuestionModel4(
            3, "3. _____________, kahit maraming problema sa pamilya, hindi ito hadlang upang makamit niya ang tagumpay sa buhay.","Sa tingin ko",
            "Alinsunod sa", "Ayon sa", "Sa kabilang banda", "Inaakala ng", "Sang-ayon sa ",
            "Samantala", "Sa paniniwala ko", "Sa tingin ko", "Sa kabilang dako", "Batay sa"
        )
        questionsList.add(que3)

        val que4 = QuestionModel4(
            4, "4. _____________ maraming mag-aaral, ang tanging makapagpapaunlad sa kanilang pamumuhay ay ang makapagtapos ng pag-aaral.","Inaakala ng",
            "Alinsunod sa", "Ayon sa", "Sa kabilang banda", "Inaakala ng", "Sang-ayon sa ",
            "Samantala", "Sa paniniwala ko", "Sa tingin ko", "Sa kabilang dako", "Batay sa"
        )
        questionsList.add(que4)

        val que5 = QuestionModel4(
            5, "5. _____________, kailangan ang pagkakaisa ng mamamayan upang mapalago at mapaunlad ang pamumuhay ng indibidwal sa isang lipunang kinabibilangan.","Sa paniniwala ko",
            "Alinsunod sa", "Ayon sa", "Sa kabilang banda", "Inaakala ng", "Sang-ayon sa ",
            "Samantala", "Sa paniniwala ko", "Sa tingin ko", "Sa kabilang dako", "Batay sa"
        )
        questionsList.add(que5)

        val que6 = QuestionModel4(
            6, "6. _____________ Department of Social Welfare and Development, mapanganib sa mga bata ang labis na paglalaro at paggamit ng gadget lalo na kung nasa developmental stage pa lamang ito.","Ayon sa",
            "Alinsunod sa", "Ayon sa", "Sa kabilang banda", "Inaakala ng", "Sang-ayon sa ",
            "Samantala", "Sa paniniwala ko", "Sa tingin ko", "Sa kabilang dako", "Batay sa"
        )
        questionsList.add(que6)

        val que7 = QuestionModel4(
            7, "7. Matindi ang ang naging epekto ng pandemyang COVID-19 sa Pilipinas, _____________ mas pinagtibay nito ang bayanihan at pagtutulungan ng mga Pilipino.","Sa kabilang banda",
            "Alinsunod sa", "Ayon sa", "Sa kabilang banda", "Inaakala ng", "Sang-ayon sa ",
            "Samantala", "Sa paniniwala ko", "Sa tingin ko", "Sa kabilang dako", "Batay sa"
        )
        questionsList.add(que7)

        val que8 = QuestionModel4(
            8, "8. _____________ hindi na rin mapigilan ang paglobo ng populasyon sa lunsod dahil sa dami na rin ng dumarayo sa lugar mula mula sa mga karatig bayan upang makipagsapalaran sa para sa magandang kapalaran.","Samantala",
            "Alinsunod sa", "Ayon sa", "Sa kabilang banda", "Inaakala ng", "Sang-ayon sa ",
            "Samantala", "Sa paniniwala ko", "Sa tingin ko", "Sa kabilang dako", "Batay sa"
        )
        questionsList.add(que8)

        val que9 = QuestionModel4(
            9, "9. _____________, sa dami ng establisyemento na binuksan sa lunsod marami pa rin ang walang trabaho at mga batang lansangan na naglipana saan mang bahagi ng lunsod.","Sa kabilang banda",
            "Alinsunod sa", "Ayon sa", "Sa kabilang banda", "Inaakala ng", "Sang-ayon sa ",
            "Samantala", "Sa paniniwala ko", "Sa tingin ko", "Sa kabilang dako", "Batay sa"
        )
        questionsList.add(que9)

        val que10 = QuestionModel4(
            10, "10. _____________ Saligangbatas ng Pilipinas 1987, ang mga kuwalipikadong botante ay ang mga mamamayan sa Pilipinas na labingwalong taong gulang pataas, naninirahan sa Pilipinas ng kahit isang taon at sa lugar kung saan niya gustong bumoto nang hindi bababa sa 6 na buwan bago maghalalan.","Batay sa",
            "Alinsunod sa", "Ayon sa", "Sa kabilang banda", "Inaakala ng", "Sang-ayon sa ",
            "Samantala", "Sa paniniwala ko", "Sa tingin ko", "Sa kabilang dako", "Batay sa"
        )
        questionsList.add(que10)

        return questionsList
    }
}

// 1-kwarter suplemental 4
object Constants5 {
    fun getQuestion(): ArrayList<QuestionModel4> {
        val questionsList = ArrayList<QuestionModel4>()

        val que1 = QuestionModel4(
            1, "1. Naging  malinis  ang  Barangay Zone III _____________ pagtutulungan ng mga mamamayan.","dahil sa",
            "at saka", "at", "pero", "kung gayon", "tunay na",
            "kung", "subalit", "dahil sa", "Nang", "kaya"
        )
        questionsList.add(que1)

        val que2 = QuestionModel4(
            2, "1. Maganda ang aking kaibigan _____________ matalino pa.","at saka",
            "at saka", "at", "pero", "kung gayon", "tunay na",
            "kung", "subalit", "dahil sa", "Nang", "kaya"
        )
        questionsList.add(que2)

        val que3 = QuestionModel4(
            3, "1. Sanhi ng init ng panahon  _____________ siya ay nilagnat.","kaya",
            "at saka", "at", "pero", "kung gayon", "tunay na",
            "kung", "subalit", "dahil sa", "Nang", "kaya"
        )
        questionsList.add(que3)

        val que4 = QuestionModel4(
            4, "4. Nagkasundo  na ang aking  mga kaibigan, _____________ magkasama na silang muli sa pagpasok sa paaralan.","kung gayon",
            "at saka", "at", "pero", "kung gayon", "tunay na",
            "kung", "subalit", "dahil sa", "Nang", "kaya"
        )
        questionsList.add(que4)

        val que5 = QuestionModel4(
            5, "5. Masipag _____________ mabait ang aking mga kaibigan sa paaralan.","at",
            "at saka", "at", "pero", "kung gayon", "tunay na",
            "kung", "subalit", "dahil sa", "Nang", "kaya"
        )
        questionsList.add(que5)

        val que6 = QuestionModel4(
            6, "5. Aawit ako _____________ kung sasayaw ka.","kung",
            "at saka", "at", "pero", "kung gayon", "tunay na",
            "kung", "subalit", "dahil sa", "Nang", "kaya"
        )
        questionsList.add(que6)

        val que7 = QuestionModel4(
            7, "7. Bata pa si Noel _____________ siya’y maabilidad na.","subalit",
            "at saka", "at", "pero", "kung gayon", "tunay na",
            "kung", "subalit", "dahil sa", "Nang", "kaya"
        )
        questionsList.add(que7)

        val que8 = QuestionModel4(
            8, "8. _____________ umalis si Don ay biglang dumating si Jolle May.","Nang",
            "at saka", "at", "pero", "kung gayon", "tunay na",
            "kung", "subalit", "dahil sa", "Nang", "kaya"
        )
        questionsList.add(que8)

        val que9 = QuestionModel4(
            9, "9. Ang kuwento ni Adrian ay _____________ nangyari sa kanilang lugar.","tunay na",
            "at saka", "at", "pero", "kung gayon", "tunay na",
            "kung", "subalit", "dahil sa", "Nang", "kaya"
        )
        questionsList.add(que9)

        val que10 = QuestionModel4(
            10, "10. Naging maingat si Jason sa kaniyang sinabi _____________ nasaktan pa rin si Angeli.","pero",
            "at saka", "at", "pero", "kung gayon", "tunay na",
            "kung", "subalit", "dahil sa", "Nang", "kaya"
        )
        questionsList.add(que10)

        return questionsList
    }
}

// 1-Kwarter suplemental 5
object Constants6 {
    fun getQuestions(): ArrayList<QuestionModel> {
        val questionsList = ArrayList<QuestionModel>()

        val que1 = QuestionModel(
            1,
            "1. Ano ang tawag sa mga salitang ginagamit upang pagdugtungin o pag-ugnayin ang mga pangungusap?",
            "Kohesyong Gramatikal", "Mga Kohesyong Pahayag", "Kohesyong Reperens", "Gramatikal na Pahayag", 1
        )
        questionsList.add(que1)

        val que2 = QuestionModel(
            2,
            "2. Ito ay reperensiya na kadalasan ay panghalip na tumutukoy sa mga nabanggit na sa unahan ng teksto o pangungusap.",
            "Anapora", "Anapora at Katapora", "Katapora", "Kohesyon", 1
        )
        questionsList.add(que2)

        val que3 = QuestionModel(
            3,
            "3. Ito ay reperensiya na bumabanggit at tumutukoy sa mga bagay na nasa hulihan pa ng teksto o pangungusap.",
            "Anapora", "Anapora at Katapora", "Katapora", "Kohesyon", 3
        )
        questionsList.add(que3)

        val que4 = QuestionModel(
            4,
            "4. Sa pangungusap na “Sila ay sopistikado kung manamit. Ang mga taga-France ay masayahin at mahilig dumalo sa mga kasiyahan.” Aling salita ang tumutukoy sa panghalip na sila?",
            "Sopistikado", "France", "kasayahan", "Taga-France", 4
        )
        questionsList.add(que4)

        val que5 = QuestionModel(
            5,
            "5. Sa pangungusap na, Ang France ay galing sa salitang Francia. Noong panahon ng Iron Age at Roman era, ito ay tinawag na Gaul. Anong salita ang pinalitan ng nakasalungguhit sa pangungusap?",
            "Rhineland", "Gaul", "Iron Age ", "France", 4
        )
        questionsList.add(que5)

        val que6 = QuestionModel(
            6,
            "6. Alin sa mga sumusunod ang TOTOO sa Anapora?",
            "Panghalip sa unahang pangngalan tutukoy sa hulihan ng teksto.",
            "Panghalip sa hulihang pangngalan tumutukoy sa unahan ng teksto. ",
            "Panghalip sa hulihang pangngalan tutukoy sa hulihan ng teksto.",
            "Panghalip sa unahang pangngalan tumutukoy sa unahan ng teksto.",
            2
        )
        questionsList.add(que6)

        val que7 = QuestionModel(
            7,
            "7. “Siya ay isang mapanghalinang babae. Si Mathilde ay isinilang sa angkan ng mga manunulat.” Anong kohesiyong gramatikal ang nagamit sa pangungusap?",
            "Anapora", "Katapora", "Panghalip", "Pangngalan", 2
        )
        questionsList.add(que7)

        val que8 = QuestionModel(
            8,
            "8. “Si Mathilde ay nagtagumpay sa gabing iyon. Siya ay nagningning sa piging.” Anong kohesiyong gramatikal ang nagamit sa pangungusap?",
            "Anapora", "Katapora", "Panghalip", "Pangngalan", 1
        )
        questionsList.add(que8)

        val que9 = QuestionModel(
            9,
            "9. Anong panghalip ang angkop sa patlang ng pangungusap? _________ isa sa mga magaganda’t mapanghalinang babae na sa pagkakamali ng ay isinilang sa angkan ng mga tagasulat",
            "Ako'y", "Ika'y", "Kami'y", "Siya'y", 4
        )
        questionsList.add(que9)

        val que10 = QuestionModel(
            10,
            "10. Anong kohesiyong gramatikal ang ginamit sa pangungusap bilang 9?",
            "Anapora", "Katapora", "Panghalip", "Pangngalan", 2
        )
        questionsList.add(que10)

        return questionsList
    }
}
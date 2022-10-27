package com.codepalace.chatbot.utils

import com.codepalace.chatbot.utils.Constants.OPEN_GOOGLE
import com.codepalace.chatbot.utils.Constants.OPEN_SEARCH
import java.sql.Date
import java.sql.Timestamp
import java.text.SimpleDateFormat

object BotResponse {

    fun basicResponses(_message: String): String {

        val random = (0..2).random()
        val message =_message.toLowerCase()

        return when {

            //Flips a coin
            message.contains("flip") && message.contains("coin") -> {
                val r = (0..1).random()
                val result = if (r == 0) "heads" else "tails"

                "I flipped a coin and it landed on $result"
            }

            //Math calculations
            message.contains("solve") -> {
                val equation: String? = message.substringAfterLast("solve")
                return try {
                    val answer = SolveMath.solveMath(equation ?: "0")
                    "$answer"

                } catch (e: Exception) {
                    "Sorry, I can't solve that."
                }
            }

            //Hello
            message.contains("hello") -> {
                when (random) {
                    0 -> "Hello there!"

                    else -> "error" }
            }

            //How are you?
            message.contains("how are you") -> {
                when (random) {
                    0 -> "I'm doing fine, thanks!"
                    1 -> "I'm hungry..."
                    2 -> "Pretty good! How about you?"
                    else -> "error"
                }
            }


            message.contains("fever") -> {
                when (random) {
                    0 -> "Dolo 650"
                    1 -> "Paracetamol"
                    2 -> "Dolo 650"
                    else -> "Ask doctor"
                }
            }

            message.contains("headache") -> {
                when (random) {
                    0 -> "Antidepressants"
                    1 -> "Paracetamol"
                    2 -> "Botulinum toxin"
                    else -> "Ask doctor"
                }
            }

            message.contains("cold") -> {
                when (random) {
                    0 -> "dextromethorphan"
                    1 -> "Cough syrups"
                    2 -> "Cough syrups"
                    else -> "Ask doctor"
                }
            }

            message.contains("cough") -> {
                when (random) {
                    0 -> "benzonatate"
                    1 -> "Mucinex"
                    2 -> "Benadryl"
                    else -> "Ask doctor"
                }
            }

            message.contains("covid") -> {
                when (random) {
                    0 -> "Ask doctor"
                    1 -> "Ask doctor"
                    2 -> "Ask doctor"
                    else -> "error"
                }
            }

            message.contains("pediatrics") -> {
                when (random) {
                    0 -> "Ask doctor"
                    1 -> "Ask doctor"
                    2 -> "Ask doctor"
                    else -> "error"
                }
            }

            message.contains("gynecology") -> {
                when (random) {
                    0 -> "Ask doctor"
                    1 -> "Ask doctor"
                    2 -> "Ask doctor"
                    else -> "error"
                }
            }

            message.contains("urology") -> {
                when (random) {
                    0 -> "Ask doctor"
                    1 -> "Ask doctor"
                    2 -> "Ask doctor"
                    else -> "error"
                }
            }

            message.contains("ENT") -> {
                when (random) {
                    0 -> "Ask doctor"
                    1 -> "Ask doctor"
                    2 -> "Ask doctor"
                    else -> "error"
                }
            }

            message.contains("cardiology") -> {
                when (random) {
                    0 -> "Ask doctor"
                    1 -> "Ask doctor"
                    2 -> "Ask doctor"
                    else -> "error"
                }
            }





            message.contains("kalyani") -> {
                when (random) {
                    0 -> "How old are you"

                    else ->"How old are you"
                }
            }

            message.contains("subathra") -> {
                when (random) {
                    0 -> "How old are you"

                    else ->"How old are you"
                }
            }

            message.contains("aarthi") -> {
                when (random) {
                    0 -> "How old are you"

                    else ->"How old are you"
                }
            }

            message.contains("sankar") -> {
                when (random) {
                    0 -> "How old are you"

                    else ->"How old are you"
                }
            }

            message.contains("dinesh") -> {
                when (random) {
                    0 -> "How old are you"

                    else ->"How old are you"
                }
            }

            message.contains("dheenu") -> {
                when (random) {
                    0 -> "How old are you"

                    else ->"How old are you"
                }
            }

            message.contains("10") -> {
                when (random) {
                    0 -> "Are you male or female"

                    else ->"Are you male or female"
                }
            }

            message.contains("11") -> {
                when (random) {
                    0 -> "Are you male or female"

                    else ->"Are you male or female"
                }
            }

            message.contains("12") -> {
                when (random) {
                    0 -> "Are you male or female"

                    else ->"Are you male or female"
                }
            }

            message.contains("13") -> {
                when (random) {
                    0 -> "Are you male or female"

                    else ->"Are you male or female"
                }
            }

            message.contains("14") -> {
                when (random) {
                    0 -> "Are you male or female"

                    else ->"Are you male or female"
                }
            }

            message.contains("15") -> {
                when (random) {
                    0 -> "Are you male or female"

                    else ->"Are you male or female"
                }
            }

            message.contains("16") -> {
                when (random) {
                    0 -> "Are you male or female"

                    else ->"Are you male or female"
                }
            }

            message.contains("17") -> {
                when (random) {
                    0 -> "Are you male or female"

                    else ->"Are you male or female"
                }
            }

            message.contains("18") -> {
                when (random) {
                    0 -> "Are you male or female"

                    else ->"Are you male or female"
                }
            }

            message.contains("19") -> {
                when (random) {
                    0 -> "Are you male or female"

                    else ->"Are you male or female"
                }
            }

            message.contains("20") -> {
                when (random) {
                    0 -> "Are you male or female"

                    else ->"Are you male or female"
                }
            }

            message.contains("21") -> {
                when (random) {
                    0 -> "Are you male or female"

                    else ->"Are you male or female"
                }
            }

            message.contains("22") -> {
                when (random) {
                    0 -> "Are you male or female"

                    else ->"Are you male or female"
                }
            }

            message.contains("23") -> {
                when (random) {
                    0 -> "Are you male or female"

                    else ->"Are you male or female"
                }
            }

            message.contains("24") -> {
                when (random) {
                    0 -> "Are you male or female"

                    else ->"Are you male or female"
                }
            }

            message.contains("25") -> {
                when (random) {
                    0 -> "Are you male or female"

                    else ->"Are you male or female"
                }
            }

            message.contains("26") -> {
                when (random) {
                    0 -> "Are you male or female"

                    else ->"Are you male or female"
                }
            }

            message.contains("27") -> {
                when (random) {
                    0 -> "Are you male or female"

                    else ->"Are you male or female"
                }
            }

            message.contains("28") -> {
                when (random) {
                    0 -> "Are you male or female"

                    else ->"Are you male or female"
                }
            }

            message.contains("29") -> {
                when (random) {
                    0 -> "Are you male or female"

                    else ->"Are you male or female"
                }
            }

            message.contains("30") -> {
                when (random) {
                    0 -> "Are you male or female"

                    else ->"Are you male or female"
                }
            }

            message.contains("male") -> {
                when (random) {
                    0 -> "What concerns you most about your health? Please describe some symptoms"

                    else ->"What concerns you most about your health? Please describe some symptoms"
                }
            }

            message.contains("female") -> {
                when (random) {
                    0 -> "What concerns you most about your health? Please describe some symptoms"

                    else ->"What concerns you most about your health? Please describe some symptoms"
                }
            }

            //What time is it?
            message.contains("time") && message.contains("?")-> {
                val timeStamp = Timestamp(System.currentTimeMillis())
                val sdf = SimpleDateFormat("dd/MM/yyyy HH:mm")
                val date = sdf.format(Date(timeStamp.time))

                date.toString()
            }

            //Open Google
            message.contains("open") && message.contains("google")-> {
                OPEN_GOOGLE
            }

            //Search on the internet
            message.contains("search")-> {
                OPEN_SEARCH
            }

            //When the programme doesn't understand...
            else -> {
                when (random) {
                    0 -> "I don't understand..."
                    1 -> "Try asking me something different"
                    2 -> "Idk"
                    else -> "error"
                }
            }
        }
    }
}
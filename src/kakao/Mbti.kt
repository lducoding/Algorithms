package kakao

import java.lang.StringBuilder
import kotlin.math.abs

fun main() {
    val survey = arrayOf("AN", "CF", "MJ", "RT", "NA")
    val choices = intArrayOf(5, 3, 2, 7, 5)
//    val s = Solution(3, );
//    println( s.solution(survey, choices) )
}
class Solution(n: Int, arr: Array<IntArray>) {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var answer = StringBuilder()
        val map = mutableMapOf<Char, Int>(
            'R' to 0,
            'T' to 0,
            'C' to 0,
            'F' to 0,
            'J' to 0,
            'M' to 0,
            'A' to 0,
            'N' to 0,
        )

        for (i in survey.indices) {
            val chars: CharArray = survey[i].toCharArray()
            val score = choices[i] -4
            if(score > 0) {
                map.replace(chars[1], map[chars[1]]!! + score)
            } else {
                map.replace(chars[0], map[chars[0]]!! + abs(score))
            }
        }
        if(map['T']!! > map['R']!!) {
            answer.append('T')
        } else {
            answer.append('R')
        }
        if(map['F']!! > map['C']!!) {
            answer.append('F')
        } else {
            answer.append('C')
        }
        if(map['M']!! > map['J']!!) {
            answer.append('M')
        } else {
            answer.append('J')
        }
        if(map['N']!! > map['A']!!) {
            answer.append('N')
        } else {
            answer.append('A')
        }

        return answer.toString()
    }
}
package kakao

fun main() {
    val rr = ReportResult()
    val test = rr.solution(arrayOf("muzi", "frodo", "apeach", "neo"), arrayOf("muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"),2)
    println(test)
}

class ReportResult {

//    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray =
//        report.map { it.split(" ") }
//            .groupBy { it[1] }
//            .asSequence()
//            .map { it.value.distinct() }
//            .filter { it.size >= k }
//            .flatten()
//            .map { it[0] }
//            .groupingBy { it }
//            .eachCount()
//            .run { id_list.map { getOrDefault(it, 0) }.toIntArray() }

    fun solution(idList: Array<String>, report: Array<String>, k: Int): IntArray {
        val reportPairList = report.distinct().map { it.split(" ").let { (f, s) -> f to s } }
        val blackList = reportPairList.groupBy(Pair<String, String>::second)
            .filter { it.value.size >= k }
            .map { it.key }
        val mailCountMap = reportPairList.groupBy(Pair<String, String>::first)
            .map { it.key to it.value.map(Pair<String, String>::second).filter(blackList::contains).size }
            .toMap()
        return idList.map { mailCountMap[it] ?: 0 }.toIntArray()
    }
}

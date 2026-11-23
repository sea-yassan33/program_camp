package org.example.week01

fun main(){
    minPickUp()
    matchString("a","b")
    textConcat()
}

/**
 * リストから最小値を取り出す
 */
fun minPickUp(){
    val list = listOf("n_5", "n_1", "n_12", "n_3")

    //substringAfter("_")：_ より後ろの文字列を取り出す
    val numList = list.map{it.substringAfter("_").toInt()}

    // 最小値を返す
    val minNum = numList.min()
    println("最小値： $minNum")
}

/**
 * 文字列一致か
 */
fun matchString(a: String, b: String){
    if (a == b) {
        println("一致しています")
    } else {
        println("一致していません")
    }
}

/**
 * 文字連結
 */
fun textConcat(){
    val list = listOf("abc","example.com")
    println("${list[0]}@${list[1]}")
    println(list.joinToString("@"))
}
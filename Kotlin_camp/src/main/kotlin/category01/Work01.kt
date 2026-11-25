package org.example.category01

/**
 * Day01
 * - 算術演算
 */
fun main(){
    // 算術演算
    mathProgram()
    // List
    listProgram()
}

fun mathProgram(){
    val a = 7
    val b = 2

    // 足し算
    println(a + b)
    // 引き算
    println(a - b)
    // 掛け算
    println(a * b)
    // 割り算
    println(a / b)
    // 余り
    println(a % b)
    // 小数で割る
    println(a.toDouble() / b)

    // 配列から取り出して演算する方法
    val arr = arrayOf("10", "20", "30")
    val c = arr[0].toInt()
    val d = arr[1].toInt()
    println(a +b)
}

fun listProgram(){
    // 変更できないリスト
    val fruits = listOf("りんご", "みかん", "ぶどう")
    println(fruits[0])
    // 変更できるリスト（MutableList）
    val list = mutableListOf("A", "B")
    list.add("C")          // [A, B, C]  末尾に追加
    list.add(0, "Z")
    for ((index, list) in list.withIndex()) {
        println("$index: $list")
    }
}
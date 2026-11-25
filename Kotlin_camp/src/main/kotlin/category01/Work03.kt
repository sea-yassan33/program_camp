package org.example.category01

fun main(){
    mathProgram02()
    strProgram01()
}

fun mathProgram02() {
    val aStr = "7"
    val bStr = "2"
    val aInt = aStr.toInt()
    val bInt = bStr.toInt()
    println(aInt * bInt)
    println(30/bInt*aInt)
}

fun strProgram01(){
    val sampleStr = "base"
    println(sampleStr.takeLast(1))

    val sampleStr2 = "*"
    println(sampleStr2.repeat(5))
}
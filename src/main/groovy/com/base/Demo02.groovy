package com.base


class Demo02 {


    static void main(String[] args) {
        //List列表使用闭包
        def lst = [11,12,13,14]
       // lst.each {println(it)}
        //Map使用闭包
        def mp=["a":"1111","b":"2222"]
        //mp.each {println(it)}
        //mp.each {println"${it.key} maps to: ${it.value}" }

        def value
        value = lst.find{element -> element>12}
        println(value)

        value = lst.findAll{element -> element > 12}
        value.each {println it}

        // Is there any value above 2
        value = lst.any{element -> element > 12}
        println(value) //返回的是boolean值

        //使用collect闭包作为转换器
        def newlst = []
        newlst = lst.collect {element -> return element * element}
        println(newlst)

    }


}

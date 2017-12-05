package com.base

class HelloWorld {

    static void main(String[] args){
        showName()
        showNames("赵一","钱二","孙三")
        add(1,1)
        sum(4,10)
        sum2(4,10)
        println(returnSum(10,8))
    }

    static int returnSum(a,b){
        return a+b
    }

    static void sum(int a,int b=5){
        println(a+b)
    }
    static void sum2(int a,int b=5,int c){
        println(a+b+c)
    }

    static def showName(){
        println("zhangsan")
        println("lisi")
    }

    static def showNames(name1,name2,name3){
        println(name1+" "+name2+" "+name3)
    }
    static void add(int a, int b){ //这里可以不添加int,加了之后可以让人看的更清楚
        println(a+b)
    }


}

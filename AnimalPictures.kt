fun main(args:Array <String>) {
    do {

        println(" hey there would like to chose one of those ")
        println("1).Cat ")
        println("2).Dog ")
        println("3).Elephants ")
        println("4). Human ")
        println(" chose one ")
        var chose: Int = readLine()!!.toInt()
        when (chose) {
            1 -> {
                println(" ______________"   )
                println("|              |" )
                println("|              |"  )
                println("|     Cats     |" )
                println("|              |"  )
                println("|  Cats cat    |" )
                println("|              |" )
                println("| _____________|")
            }
            2 -> {
                println(" ______________"   )
                println("|              |" )
                println("|              |"  )
                println("|     Dogs     |" )
                println("|              |"  )
                println("|  Dogs Dogs   |" )
                println("|              |" )
                println("| _____________|")
            }
            3 -> {
                println(" ______________"   )
                println("|              |" )
                println("|              |"  )
                println("|   Elephants  |" )
                println("|              |"  )
                println("|  Elephants   |" )
                println("|              |" )
                println("| _____________|")
            }
            4 -> {
                println(" ______________"   )
                println("|              |" )
                println("|              |"  )
                println("|    Humans    |" )
                println("|              |"  )
                println("|  Humans      |" )
                println("|              |" )
                println("| _____________|")
            }
        }
    }while( chose < 5)
}
fun main(args: Array<String>) {

    var obj = CS()
    obj.total()
    obj.ave()
	
	println("CS: The max is " + obj.max(obj.java, obj.python, obj.web))
    var obj2 = EE()
    
    obj2.total()
    obj2.ave()
	println("EE: The min is " + obj2.min(obj2.listen, obj2.read, obj2.write))
}

interface Grade {     

     fun total()                  

     fun ave()
}

class CS: Grade {
		val web: Int = 10
        val python: Int = 20
        val java: Int = 30
        val sum = web + python + java
    override fun total(){

            println("CS: The total is: $sum")
	}

    override fun ave() {
			  	val numArray = arrayOf(10,20,30)
                var sum = 0.0

                for (num in numArray) {
                    sum += num
                }

                val average = sum / numArray.size
                println("CS: The average is: %.2f".format(average))
                }
    fun max(vararg score: Int): Int{
		var max: Int
		
		max = score[0]
		for(i in score){
			if(i > max) max = i
		}
		return max
	}
}

class EE: Grade {
		val listen: Int = 25
        val read: Int = 12
        val write: Int = 14
        val sum = listen + read + write
    override fun total(){

            println("EE: The total is: $sum")
	}

    override fun ave() {
			  	val numArray = arrayOf(25,12,14)
                var sum = 0.0

                for (num in numArray) {
                    sum += num
                }

                val average = sum / numArray.size
                println("EE: The average is: %.2f".format(average))
                }
    fun min(vararg score: Int): Int{
		var min: Int
		
		min = score[0]
		for(i in score){
			if(i < min) min = i
		}
		return min
	}
}
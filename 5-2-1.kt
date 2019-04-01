open class Grade{
	fun total(vararg score: Int): Int{
		var sum: Int

		sum = 0
		for(i in score){
			sum += i
		}
		return sum
	}

    fun ave(vararg score: Int): Int{
		var sum = 0

		for(i in score){
			sum += i
		}
		return sum/score.size
	}   
}
class CS(val java: Int, val python: Int, val web: Int): Grade(){

	fun max(vararg score: Int): Int{
		var max: Int

		max = score[0]
		for(i in score){
			if(i > max) max = i
		}
		return max
	}
}

class EE(val listening: Int, val writing: Int, val reading: Int): Grade(){

	fun min(vararg score: Int): Int{
		var min: Int

		min = score[0]
		for(i in score){
			if(i < min) min = i
		}
		return min
	}
}

fun main(){
	val cs = CS(10, 20, 30)
	val ee = EE(10,25,30)

	println(cs.max(cs.java, cs.python, cs.web))
	println(ee.min(ee.listening, ee.writing, ee.reading))
    
    
	println(cs.ave(cs.java, cs.python, cs.web))
	println(ee.ave(ee.listening, ee.writing, ee.reading))

    
	println(ee.total(ee.listening, ee.writing, ee.reading))
	println(cs.total(cs.java, cs.python, cs.web))

} 
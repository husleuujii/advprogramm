fun main(args: Array<String>) {

	
val superheroes = listOf("superman","spiderman","wonderwoman","thor","batman") 

 for(hero in superheroes)
    {
        println(hero) 
    }
  val myfav = superheroes.get(3)
    
    println("My favorite hero is $myfav")
}
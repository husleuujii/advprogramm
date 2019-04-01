fun main(args: Array<String>){  
  val hero:HashMap<String,String> = HashMap<String,String>()
    hero.put("name","batman")  
    hero.put("power","92")  
    hero.put("gender","M")  
    
   
    for(key in hero.keys){  
        println(" $key = ${hero[key]}")  
    }  
    val superhero:HashMap<String,String> = HashMap<String,String>()
    superhero.put("name","superman")  
    superhero.put("power","100")  
    superhero.put("gender","M")  
    
   
    for(key in superhero.keys){  
        println(" $key = ${superhero[key]}")  
    }  
}
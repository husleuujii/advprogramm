fun main(args: Array<String>){ 
    val superhero:HashMap<String,ArrayList<String>> = HashMap<String,ArrayList<String>>()
    
     val hero = ArrayList<String>()  
        hero.add("100")
        hero.add("m")
     val hero2 = ArrayList<String>()  
        hero.add("92")
        hero.add("m")
     val hero3 = ArrayList<String>()  
        hero.add("50")
        hero.add("m")
     
        superhero.put("Batman", hero);
    
        superhero.put("ironman", hero2);
    
        superhero.put("hulk", hero3);
      
    val keyList = ArrayList(superhero.keys)
    val valueList = ArrayList(superhero.values)

    
    for(key in superhero.keys){  
        println(" $key = ${superhero[key]}")  
    }  
    
}
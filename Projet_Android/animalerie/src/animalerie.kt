import java.util.*

/*Interface Animale*/


fun main()
{

}





interface Animal
{

    var parler : String
    var quisuisje : String

    fun parlerMethod() : String
    {
        return(parler)
        println(parler)
    }
    fun quisuisjeMethod() :String
    {
        return(parler)
        println(quisuisje)
    }

}



/*Les classes d'animaux qu'il faut*/

class chat
{
    var parler:String = "miaou"
    var quisuisje:String= "je suis un chat"
}

class chien
{
    var parler:String="wouf"
    var quisuisje:String = "je suis un chien"
}

class peroquet
{
    var parler:String="repeat"
    var quisuisje:String="je suis un peroquet"
}


/*Fonction main*/

fun animal()
{
    var scan = Scanner(System.`in`)
    println("Ajouter un animal :")

    var parler: String = scan.next()
    var quisuisje: String = scan.next()

    println("un animal a été ajouté !")
    print(parler)
    print(quisuisje)



}

/*Class Animalerie

class Animalerie : Animal
    {

    }

*/


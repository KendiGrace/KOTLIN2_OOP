
fun main() {
    val Mel=Person()
    Mel.intro("Melannie Tamara",3,22,"Rwandan","Durban")
    Mel.friends("Dylan Smith","Tiffany Mutheu")
    Mel.schools("Little Friends Academy","A")
    Mel.career("Radio presenter",5)
    Mel.food("Matoke","Biryani","pork","yoghurt")
    Mel.likes("singing","travelling","swimming","sleeping")

    val Mike=Person()
    Mike.food("Chiken","Chips","Pilau","Mango juice")
    Mike.schools("Chuka Boys High School","A")
    Mike.likes("dancing","eating","travelling","watching movies")
    Mike.career("Pilot",7)
    Mike.friends("Derick Imani","Eulinka Kanana")
    Mike.intro("Mike Allen",17,48,"Kenyan","Maldives")

}
interface PersonDetails{
    fun intro(name:String,age:Int,weight:Int,nationality:String,dream:String)
    fun food(food:String,food1:String,food2:String,drink:String)
    fun likes(like:String,like1:String,like2:String,love:String)
    fun friends(name1:String,name2:String)
    fun schools(school:String,pass:String)
    fun career(work:String,number:Int)
}
class Person:PersonDetails {
    override fun intro(name:String,age:Int,weight:Int,nationality:String,dream:String) {
println("My name is $name.I am $age years old and i am $weight Kgs.I am $nationality but i would love to travel to $dream some day.")
    }

    override fun food(food:String,food1:String,food2:String,drink:String) {
println("My favorite food is $food,$food1,$food2 and my best drink is $drink.")
    }

    override fun likes(like:String,like1:String,like2:String,love:String) {
        println("My hobbies are $like,$like1,$like2.I also love $love.")

    }

    override fun friends(name1:String,name2:String){
        println("My closest buddies are $name1 and my cousin-sister $name2.")


    }
    override fun career(work:String,number:Int){
        println("I am a $work and i have been in the industry for $number years now.")

    }
    override fun schools(school:String,pass:String){
println("I went to $school and i attained a $pass.")
    }
}
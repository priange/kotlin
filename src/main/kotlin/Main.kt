fun main() {
    var text = "Akirachix"
println(text[0]+""+text[3] +""+ text[4])
greetperson("Ityaku", 22)
strength("son")
var myname="ityaku Priscila"
    if (myname.equals("Ityaku"))
        println("that is me")
    else{
        println("I don't know who that is")
    }
}
fun greetperson(name:String, age:Int):String{
    var z = ("Hi my name is $name and I am $age years old")
    println(z)
    return z}
fun strength(w:String){
    w.length
    println(w.length)

}
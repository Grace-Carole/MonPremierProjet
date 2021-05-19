import Personne._

import java.text._
import java.util.Date
import java.util.Calendar
import scala.collection.immutable._
//import scala.collection.mutable._

object HelloWorld {

  val variable2 : String = ""

  def main(args: Array[String]): Unit = {

    val text : String = "Hello world, mon premier programme en scala"

    val text2 : String = text + variable2

     val test = println(text)

    val grace = Personne("Akanza", "Grace", 26, "Ivoirienne", Some(526345.25))
    val etudiant = Personne("Julie", "Grace", 26, "Ivoirienne", None)

    val age_personne = grace.age

    println("l'age de la perrsone est de " + age_personne)

    val somme = println("la somme est de " + calculSomme(3, 4))

    macollection()
    macol()

  }

  def calculSomme(a : Int, b : Int): Int = {

    var result = 0
    var i = 1
    if (a < 0 || b < 0) {
      print("valeurs d'argument incorrect")
    } else {
      result = a + b
    }

    for(i <- 1 to 10){
      println("couleur" + i)
    }

    while(i < 15){
      println("itération" + i)
      i = i+1
    }

    return result

  }
  /*def renvoiePersonne(datenaiss : String, nom: String, prenom : String, nationalite : String, salaire : Option[Double]): Personne = {
    val form1 = new SimpleDateFormat("dd-MM-yyyy")
  }*/

  def macollection(): Unit = {
    val maliste = List("Jvc", "jjj", "ecole","pays")
    val maliste2 : List[String] = List("julien")

    maliste.foreach(l => println(l.toUpperCase))

    val maliste3 : Seq[Int] = List(10, 20, 30, 70).toSeq

    val montuple = ("10",Personne("Ak","GCA",18,"IV",Some(10.2)),true)
    montuple._2.salaire

    val (a, b) = ("10",Personne("Ak","GCA",18,"IV",Some(10.2)))

    val monMap : Map[String, String] = Map(
      "cc" -> "cocody",
      "yy" -> "poy",
      "mar" -> "marcory"
    )
    monMap.toList
    monMap.values.foreach(l=>l)
    monMap.keys.map(l => l).toList

    val monTableau : Array[String] = Array("julien","juvenal")
    monTableau(0) = "jvc"

  }
  def macol(): Unit = {
    val maseq = Seq("Grace","Carole","Aya","Edwige","Ange","Anaelle","Heidi")
    val maseq2 : Seq[Int] = maseq.map(x => x.length())
    maseq2.foreach(x => println(x))

    val maseq3: Unit = maseq.filter(x => x.length()>5).foreach(x => println(x))
  }

}

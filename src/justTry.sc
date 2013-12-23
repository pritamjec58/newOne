/**
 * Created by gupt21 on 19/12/13.
 */
object obj{

  println("hello")
  println("now again")


  def lteqgt(values: Array[Int],v:Int):(Int , Int , Int)={

    val (le,egt) = values.partition(_ < v)
    val (gt,eq) = egt.partition(_>v)
    (le.length,eq.length,gt.length)
  }
//

  lteqgt(Array(10,30,50,70),30)
}
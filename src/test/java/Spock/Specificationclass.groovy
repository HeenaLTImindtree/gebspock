package Spock

import spock.lang.Shared
import spock.lang.*

class Specificationclass extends Specification{
    //instance fields
  def obj =new SumofTwoNumbers()
//@Shared obj =new SumofTwoNumbers()


    def "feature method one"(){
given:
def a=2
def b =4
       println "hello welcome"
        obj

    }
    def "feature method two"(){

given:
        obj

    }


}

package Spock

import spock.lang.Specification

import javax.swing.Renderer

class First extends Specification {


    def "length of the given string"() {
        given:
        def name = "heena"
        def length = 5;
        

        expect:
        name.size() == length
    }


    def "addition of nos"() {
        given:
        def obj = new SumofTwoNumbers()

        when: "we are going to add"
        def sum = obj.addition(2, 5)
        System.out.println("welcome");
        then:
        sum == 9
    }
        def "to handle the excpetion"() {

            when:
            def list = []
            list.add(2)
            list.add(3)
            println list.get(5)

            then:
           list.size() == 2
            thrown(IndexOutOfBoundsException)

        }

    def "length of Spock's and his friends' names"() {


        expect:
        name.size() == length

        where:
        name     | length
        "Spock"  | 5
        "Kirk"   | 8
        "Scotty" | 6


    }

    }


package org.example

import geb.spock.GebSpec
import pages.LoginPage

class WesternGebSpockCaseSpecificationClass  extends GebSpec{

    def "click on login and login with credentials"()
    {
        given:
        println("we are in given block")

        when:
        to LoginPage
        "clicking on login page"()
        "enter email"("heena231090@gmail.com")
        "enter pass"("Jalna@2024")
        "click on continue"


        then:
        println title
    }
}

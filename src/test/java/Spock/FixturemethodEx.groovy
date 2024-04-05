package Spock

import spock.lang.Ignore
import spock.lang.Specification

class FixturemethodEx extends Specification{

    def setupSpec()
    {
        println "we are in setupspec "
    }
    def setup()
    {
        println "we are in setup fixture"
    }
  @Ignore
    def "feature method one"()
    {
        given:
        println" we are in method one"
    }
    def "feature method two"()
    {
        given:
        println" we are in method two"
    }
    def cleanup()
    {
        println "we are in cleanup method"

    }
    def cleanupSpec()
    {
        println "we are in cleanup  spec method"

    }
}

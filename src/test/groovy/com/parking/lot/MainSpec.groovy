package com.parking.lot

import spock.lang.Specification

class MainSpec extends Specification {

    def main = new Main()

    def "should run and pass"() {
        given:"values are given"
        def value1=1, value2=2
        def result

        when:"should call getSum"
        result = main.getSum(value1, value2)

        then:"should match the result"
        assert result == 3
        //println result
    }
}

package org.example.lesson4

const val AVERAGE_WEIGHT_MIN_EXCL = 36
const val AVERAGE_WEIGHT_MAX_INCL = 100
const val AVERAGE_VOLUME_MAX_EXCL = 100


fun main() {
    var luggageWeight = 20
    var luggageVolume = 80

    println("Груз с весом $luggageWeight кг и объемом $luggageVolume л " +
            "соответствует категории 'Average': " +
            "${((luggageWeight > AVERAGE_WEIGHT_MIN_EXCL) and (luggageWeight <= AVERAGE_WEIGHT_MAX_INCL))
                    and (luggageVolume < AVERAGE_VOLUME_MAX_EXCL)}")

    luggageWeight = 50
    luggageVolume = 100

    println("Груз с весом $luggageWeight кг и объемом $luggageVolume л " +
            "соответствует категории 'Average': " +
            "${((luggageWeight > AVERAGE_WEIGHT_MIN_EXCL) and (luggageWeight <= AVERAGE_WEIGHT_MAX_INCL))
                    and (luggageVolume < AVERAGE_VOLUME_MAX_EXCL)}")
}
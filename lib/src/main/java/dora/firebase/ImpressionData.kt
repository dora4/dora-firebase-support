package dora.firebase

data class ImpressionData(var currency: String = "USD",
                     var revenue: Double = 0.0,
                     var networkName: String? = null,
                     var adUnitId: String? = null,
                     var format: Format? = null) {

    data class Format(var label: String? = null)
}
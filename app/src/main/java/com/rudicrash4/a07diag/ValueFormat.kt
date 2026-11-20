package com.rudicrash4.a07diag

/**
 * Pemformat nilai untuk laporan dan layar diagnostik.
 * Nilai yang tidak tersedia selalu menjadi "Unavailable", tidak pernah angka nol.
 */
object ValueFormat {

    const val UNAVAILABLE = "Unavailable"

    fun longOrUnavailable(value: Long?, unit: String = ""): String {
        if (value == null) return UNAVAILABLE
        return withUnit(value.toString(), unit)
    }

    fun doubleOrUnavailable(value: Double?, unit: String = ""): String {
        if (value == null || value.isNaN() || value.isInfinite()) return UNAVAILABLE
        return withUnit(value.toString(), unit)
    }

    private fun withUnit(text: String, unit: String): String {
        return if (unit.isEmpty()) text else "$text $unit"
    }
}

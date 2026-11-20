package com.rudicrash4.a07diag

import org.junit.Assert.assertEquals
import org.junit.Test

class ValueFormatTest {

    @Test
    fun nullLong_isUnavailable_notZero() {
        assertEquals("Unavailable", ValueFormat.longOrUnavailable(null))
    }

    @Test
    fun zeroLong_isMeasuredZero_notUnavailable() {
        assertEquals("0", ValueFormat.longOrUnavailable(0L))
    }

    @Test
    fun longWithUnit_isFormatted() {
        assertEquals("437 mA", ValueFormat.longOrUnavailable(437L, "mA"))
    }

    @Test
    fun nullDouble_isUnavailable() {
        assertEquals("Unavailable", ValueFormat.doubleOrUnavailable(null))
    }

    @Test
    fun nanDouble_isUnavailable() {
        assertEquals("Unavailable", ValueFormat.doubleOrUnavailable(Double.NaN))
    }

    @Test
    fun infiniteDouble_isUnavailable() {
        assertEquals("Unavailable", ValueFormat.doubleOrUnavailable(Double.POSITIVE_INFINITY))
    }

    @Test
    fun doubleWithUnit_isFormatted() {
        assertEquals("35.6 °C", ValueFormat.doubleOrUnavailable(35.6, "°C"))
    }
}

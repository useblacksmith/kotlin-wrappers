// Generated by Karakum - do not modify it manually!

package node.util.types

import js.typedarrays.Float64Array


@Suppress("NOTHING_TO_INLINE", "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isFloat64Array(`object`: Any?): Boolean /* object is Float64Array */ {
    kotlin.contracts.contract {
        returns(true) implies (`object` is Float64Array)
    }

    return isFloat64ArrayRaw(`object`)
}

// Generated by Karakum - do not modify it manually!

package node.util


@Suppress("NOTHING_TO_INLINE", "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isNull(`object`: Any?): Boolean /* object is null */ {
    kotlin.contracts.contract {
        returns(true) implies (`object` is Nothing?)
    }

    return isNullRaw(`object`)
}

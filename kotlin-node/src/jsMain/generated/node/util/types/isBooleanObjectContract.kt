// Generated by Karakum - do not modify it manually!

package node.util.types


@Suppress("NOTHING_TO_INLINE", "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isBooleanObject(`object`: Any?): Boolean /* object is Boolean */ {
    kotlin.contracts.contract {
        returns(true) implies (`object` is Boolean)
    }

    return isBooleanObjectRaw(`object`)
}

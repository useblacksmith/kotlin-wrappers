// Generated by Karakum - do not modify it manually!

package node.http

import seskar.js.JsNative


sealed external interface HttpStatusCodes {


    @JsNative
    operator fun get(key: Number): String?


    @JsNative
    operator fun set(key: Number, value: String?)


    @JsNative
    operator fun get(key: String): String?


    @JsNative
    operator fun set(key: String, value: String?)


}

// Generated by Karakum - do not modify it manually!

package electron.core


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface CookiesEvent : node.events.EventType {
    sealed interface CHANGED : CookiesEvent

    companion object {
        @seskar.js.JsValue("changed")
        val CHANGED: CHANGED
    }
}

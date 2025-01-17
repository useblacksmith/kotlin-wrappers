// Generated by Karakum - do not modify it manually!

package node.http2


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface ClientHttp2StreamEvent : node.events.EventType {
    sealed interface CONTINUE : ClientHttp2StreamEvent
    sealed interface HEADERS : ClientHttp2StreamEvent
    sealed interface PUSH : ClientHttp2StreamEvent
    sealed interface RESPONSE : ClientHttp2StreamEvent

    companion object {
        @seskar.js.JsValue("continue")
        val CONTINUE: CONTINUE

        @seskar.js.JsValue("headers")
        val HEADERS: HEADERS

        @seskar.js.JsValue("push")
        val PUSH: PUSH

        @seskar.js.JsValue("response")
        val RESPONSE: RESPONSE
    }
}

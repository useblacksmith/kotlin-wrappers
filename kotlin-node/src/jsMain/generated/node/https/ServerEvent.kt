// Generated by Karakum - do not modify it manually!

package node.https


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface ServerEvent : node.events.EventType {
    sealed interface KEYLOG : ServerEvent
    sealed interface NEWSESSION : ServerEvent
    sealed interface OCSPREQUEST : ServerEvent
    sealed interface RESUMESESSION : ServerEvent
    sealed interface SECURECONNECTION : ServerEvent
    sealed interface TLSCLIENTERROR : ServerEvent
    sealed interface CLOSE : ServerEvent
    sealed interface CONNECTION : ServerEvent
    sealed interface ERROR : ServerEvent
    sealed interface LISTENING : ServerEvent
    sealed interface CHECKCONTINUE : ServerEvent
    sealed interface CHECKEXPECTATION : ServerEvent
    sealed interface CLIENTERROR : ServerEvent
    sealed interface CONNECT : ServerEvent
    sealed interface REQUEST : ServerEvent
    sealed interface UPGRADE : ServerEvent

    companion object {
        @seskar.js.JsValue("keylog")
        val KEYLOG: KEYLOG

        @seskar.js.JsValue("newSession")
        val NEWSESSION: NEWSESSION

        @seskar.js.JsValue("OCSPRequest")
        val OCSPREQUEST: OCSPREQUEST

        @seskar.js.JsValue("resumeSession")
        val RESUMESESSION: RESUMESESSION

        @seskar.js.JsValue("secureConnection")
        val SECURECONNECTION: SECURECONNECTION

        @seskar.js.JsValue("tlsClientError")
        val TLSCLIENTERROR: TLSCLIENTERROR

        @seskar.js.JsValue("close")
        val CLOSE: CLOSE

        @seskar.js.JsValue("connection")
        val CONNECTION: CONNECTION

        @seskar.js.JsValue("error")
        val ERROR: ERROR

        @seskar.js.JsValue("listening")
        val LISTENING: LISTENING

        @seskar.js.JsValue("checkContinue")
        val CHECKCONTINUE: CHECKCONTINUE

        @seskar.js.JsValue("checkExpectation")
        val CHECKEXPECTATION: CHECKEXPECTATION

        @seskar.js.JsValue("clientError")
        val CLIENTERROR: CLIENTERROR

        @seskar.js.JsValue("connect")
        val CONNECT: CONNECT

        @seskar.js.JsValue("request")
        val REQUEST: REQUEST

        @seskar.js.JsValue("upgrade")
        val UPGRADE: UPGRADE
    }
}

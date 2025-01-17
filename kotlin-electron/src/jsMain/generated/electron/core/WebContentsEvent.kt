// Generated by Karakum - do not modify it manually!

package electron.core


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface WebContentsEvent : node.events.EventType {
    sealed interface BEFORE_INPUT_EVENT : WebContentsEvent
    sealed interface BLUR : WebContentsEvent
    sealed interface CERTIFICATE_ERROR : WebContentsEvent
    sealed interface CONSOLE_MESSAGE : WebContentsEvent
    sealed interface CONTENT_BOUNDS_UPDATED : WebContentsEvent
    sealed interface CONTEXT_MENU : WebContentsEvent
    sealed interface CRASHED : WebContentsEvent
    sealed interface CURSOR_CHANGED : WebContentsEvent
    sealed interface DESTROYED : WebContentsEvent
    sealed interface DEVTOOLS_CLOSED : WebContentsEvent
    sealed interface DEVTOOLS_FOCUSED : WebContentsEvent
    sealed interface DEVTOOLS_OPEN_URL : WebContentsEvent
    sealed interface DEVTOOLS_OPENED : WebContentsEvent
    sealed interface DEVTOOLS_RELOAD_PAGE : WebContentsEvent
    sealed interface DID_ATTACH_WEBVIEW : WebContentsEvent
    sealed interface DID_CHANGE_THEME_COLOR : WebContentsEvent
    sealed interface DID_CREATE_WINDOW : WebContentsEvent
    sealed interface DID_FAIL_LOAD : WebContentsEvent
    sealed interface DID_FAIL_PROVISIONAL_LOAD : WebContentsEvent
    sealed interface DID_FINISH_LOAD : WebContentsEvent
    sealed interface DID_FRAME_FINISH_LOAD : WebContentsEvent
    sealed interface DID_FRAME_NAVIGATE : WebContentsEvent
    sealed interface DID_NAVIGATE : WebContentsEvent
    sealed interface DID_NAVIGATE_IN_PAGE : WebContentsEvent
    sealed interface DID_REDIRECT_NAVIGATION : WebContentsEvent
    sealed interface DID_START_LOADING : WebContentsEvent
    sealed interface DID_START_NAVIGATION : WebContentsEvent
    sealed interface DID_STOP_LOADING : WebContentsEvent
    sealed interface DOM_READY : WebContentsEvent
    sealed interface ENTER_HTML_FULL_SCREEN : WebContentsEvent
    sealed interface FOCUS : WebContentsEvent
    sealed interface FOUND_IN_PAGE : WebContentsEvent
    sealed interface FRAME_CREATED : WebContentsEvent
    sealed interface INPUT_EVENT : WebContentsEvent
    sealed interface IPC_MESSAGE : WebContentsEvent
    sealed interface IPC_MESSAGE_SYNC : WebContentsEvent
    sealed interface LEAVE_HTML_FULL_SCREEN : WebContentsEvent
    sealed interface LOGIN : WebContentsEvent
    sealed interface MEDIA_PAUSED : WebContentsEvent
    sealed interface MEDIA_STARTED_PLAYING : WebContentsEvent
    sealed interface PAGE_FAVICON_UPDATED : WebContentsEvent
    sealed interface PAGE_TITLE_UPDATED : WebContentsEvent
    sealed interface PAINT : WebContentsEvent
    sealed interface PLUGIN_CRASHED : WebContentsEvent
    sealed interface PREFERRED_SIZE_CHANGED : WebContentsEvent
    sealed interface PRELOAD_ERROR : WebContentsEvent
    sealed interface RENDER_PROCESS_GONE : WebContentsEvent
    sealed interface RESPONSIVE : WebContentsEvent
    sealed interface SELECT_BLUETOOTH_DEVICE : WebContentsEvent
    sealed interface SELECT_CLIENT_CERTIFICATE : WebContentsEvent
    sealed interface UNRESPONSIVE : WebContentsEvent
    sealed interface UPDATE_TARGET_URL : WebContentsEvent
    sealed interface WILL_ATTACH_WEBVIEW : WebContentsEvent
    sealed interface WILL_NAVIGATE : WebContentsEvent
    sealed interface WILL_PREVENT_UNLOAD : WebContentsEvent
    sealed interface WILL_REDIRECT : WebContentsEvent
    sealed interface ZOOM_CHANGED : WebContentsEvent

    companion object {
        @seskar.js.JsValue("before-input-event")
        val BEFORE_INPUT_EVENT: BEFORE_INPUT_EVENT

        @seskar.js.JsValue("blur")
        val BLUR: BLUR

        @seskar.js.JsValue("certificate-error")
        val CERTIFICATE_ERROR: CERTIFICATE_ERROR

        @seskar.js.JsValue("console-message")
        val CONSOLE_MESSAGE: CONSOLE_MESSAGE

        @seskar.js.JsValue("content-bounds-updated")
        val CONTENT_BOUNDS_UPDATED: CONTENT_BOUNDS_UPDATED

        @seskar.js.JsValue("context-menu")
        val CONTEXT_MENU: CONTEXT_MENU

        @seskar.js.JsValue("crashed")
        val CRASHED: CRASHED

        @seskar.js.JsValue("cursor-changed")
        val CURSOR_CHANGED: CURSOR_CHANGED

        @seskar.js.JsValue("destroyed")
        val DESTROYED: DESTROYED

        @seskar.js.JsValue("devtools-closed")
        val DEVTOOLS_CLOSED: DEVTOOLS_CLOSED

        @seskar.js.JsValue("devtools-focused")
        val DEVTOOLS_FOCUSED: DEVTOOLS_FOCUSED

        @seskar.js.JsValue("devtools-open-url")
        val DEVTOOLS_OPEN_URL: DEVTOOLS_OPEN_URL

        @seskar.js.JsValue("devtools-opened")
        val DEVTOOLS_OPENED: DEVTOOLS_OPENED

        @seskar.js.JsValue("devtools-reload-page")
        val DEVTOOLS_RELOAD_PAGE: DEVTOOLS_RELOAD_PAGE

        @seskar.js.JsValue("did-attach-webview")
        val DID_ATTACH_WEBVIEW: DID_ATTACH_WEBVIEW

        @seskar.js.JsValue("did-change-theme-color")
        val DID_CHANGE_THEME_COLOR: DID_CHANGE_THEME_COLOR

        @seskar.js.JsValue("did-create-window")
        val DID_CREATE_WINDOW: DID_CREATE_WINDOW

        @seskar.js.JsValue("did-fail-load")
        val DID_FAIL_LOAD: DID_FAIL_LOAD

        @seskar.js.JsValue("did-fail-provisional-load")
        val DID_FAIL_PROVISIONAL_LOAD: DID_FAIL_PROVISIONAL_LOAD

        @seskar.js.JsValue("did-finish-load")
        val DID_FINISH_LOAD: DID_FINISH_LOAD

        @seskar.js.JsValue("did-frame-finish-load")
        val DID_FRAME_FINISH_LOAD: DID_FRAME_FINISH_LOAD

        @seskar.js.JsValue("did-frame-navigate")
        val DID_FRAME_NAVIGATE: DID_FRAME_NAVIGATE

        @seskar.js.JsValue("did-navigate")
        val DID_NAVIGATE: DID_NAVIGATE

        @seskar.js.JsValue("did-navigate-in-page")
        val DID_NAVIGATE_IN_PAGE: DID_NAVIGATE_IN_PAGE

        @seskar.js.JsValue("did-redirect-navigation")
        val DID_REDIRECT_NAVIGATION: DID_REDIRECT_NAVIGATION

        @seskar.js.JsValue("did-start-loading")
        val DID_START_LOADING: DID_START_LOADING

        @seskar.js.JsValue("did-start-navigation")
        val DID_START_NAVIGATION: DID_START_NAVIGATION

        @seskar.js.JsValue("did-stop-loading")
        val DID_STOP_LOADING: DID_STOP_LOADING

        @seskar.js.JsValue("dom-ready")
        val DOM_READY: DOM_READY

        @seskar.js.JsValue("enter-html-full-screen")
        val ENTER_HTML_FULL_SCREEN: ENTER_HTML_FULL_SCREEN

        @seskar.js.JsValue("focus")
        val FOCUS: FOCUS

        @seskar.js.JsValue("found-in-page")
        val FOUND_IN_PAGE: FOUND_IN_PAGE

        @seskar.js.JsValue("frame-created")
        val FRAME_CREATED: FRAME_CREATED

        @seskar.js.JsValue("input-event")
        val INPUT_EVENT: INPUT_EVENT

        @seskar.js.JsValue("ipc-message")
        val IPC_MESSAGE: IPC_MESSAGE

        @seskar.js.JsValue("ipc-message-sync")
        val IPC_MESSAGE_SYNC: IPC_MESSAGE_SYNC

        @seskar.js.JsValue("leave-html-full-screen")
        val LEAVE_HTML_FULL_SCREEN: LEAVE_HTML_FULL_SCREEN

        @seskar.js.JsValue("login")
        val LOGIN: LOGIN

        @seskar.js.JsValue("media-paused")
        val MEDIA_PAUSED: MEDIA_PAUSED

        @seskar.js.JsValue("media-started-playing")
        val MEDIA_STARTED_PLAYING: MEDIA_STARTED_PLAYING

        @seskar.js.JsValue("page-favicon-updated")
        val PAGE_FAVICON_UPDATED: PAGE_FAVICON_UPDATED

        @seskar.js.JsValue("page-title-updated")
        val PAGE_TITLE_UPDATED: PAGE_TITLE_UPDATED

        @seskar.js.JsValue("paint")
        val PAINT: PAINT

        @seskar.js.JsValue("plugin-crashed")
        val PLUGIN_CRASHED: PLUGIN_CRASHED

        @seskar.js.JsValue("preferred-size-changed")
        val PREFERRED_SIZE_CHANGED: PREFERRED_SIZE_CHANGED

        @seskar.js.JsValue("preload-error")
        val PRELOAD_ERROR: PRELOAD_ERROR

        @seskar.js.JsValue("render-process-gone")
        val RENDER_PROCESS_GONE: RENDER_PROCESS_GONE

        @seskar.js.JsValue("responsive")
        val RESPONSIVE: RESPONSIVE

        @seskar.js.JsValue("select-bluetooth-device")
        val SELECT_BLUETOOTH_DEVICE: SELECT_BLUETOOTH_DEVICE

        @seskar.js.JsValue("select-client-certificate")
        val SELECT_CLIENT_CERTIFICATE: SELECT_CLIENT_CERTIFICATE

        @seskar.js.JsValue("unresponsive")
        val UNRESPONSIVE: UNRESPONSIVE

        @seskar.js.JsValue("update-target-url")
        val UPDATE_TARGET_URL: UPDATE_TARGET_URL

        @seskar.js.JsValue("will-attach-webview")
        val WILL_ATTACH_WEBVIEW: WILL_ATTACH_WEBVIEW

        @seskar.js.JsValue("will-navigate")
        val WILL_NAVIGATE: WILL_NAVIGATE

        @seskar.js.JsValue("will-prevent-unload")
        val WILL_PREVENT_UNLOAD: WILL_PREVENT_UNLOAD

        @seskar.js.JsValue("will-redirect")
        val WILL_REDIRECT: WILL_REDIRECT

        @seskar.js.JsValue("zoom-changed")
        val ZOOM_CHANGED: ZOOM_CHANGED
    }
}

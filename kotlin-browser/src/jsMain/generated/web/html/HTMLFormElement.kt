// Automatically generated - do not modify!

package web.html

import js.core.ArrayLike
import js.core.JsIterable
import web.dom.DOMTokenList
import web.dom.Element
import web.window.WindowTarget

abstract external class HTMLFormElement :
    HTMLElement,
    ArrayLike<Element>,
    JsIterable<Element> {
    /**
     * Sets or retrieves a list of character encodings for input data that must be accepted by the server processing the form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/acceptCharset)
     */
    var acceptCharset: String

    /**
     * Sets or retrieves the URL to which the form content is sent for processing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/action)
     */
    var action: String

    /**
     * Specifies whether autocomplete is applied to an editable text field.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/autocomplete)
     */
    var autocomplete: AutoFillBase

    /**
     * Retrieves a collection, in source order, of all controls in a given form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/elements)
     */
    val elements: HTMLFormControlsCollection

    /**
     * Sets or retrieves the MIME encoding for the form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/encoding)
     */
    var encoding: String

    /**
     * Sets or retrieves the encoding type for the form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/enctype)
     */
    var enctype: String

    /**
     * Sets or retrieves how to send the form data to the server.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/method)
     */
    var method: String

    /**
     * Sets or retrieves the name of the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/name)
     */
    var name: String

    /**
     * Designates a form that is not validated when submitted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/noValidate)
     */
    var noValidate: Boolean
    var rel: String
    val relList: DOMTokenList

    /**
     * Sets or retrieves the window or frame at which to target content.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/target)
     */
    var target: WindowTarget

    /**
     * Returns whether a form will validate when it is submitted, without having to submit it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/checkValidity)
     */
    fun checkValidity(): Boolean
    fun reportValidity(): Boolean
    fun requestSubmit(submitter: HTMLElement? = definedExternally)

    /**
     * Fires when the user resets a form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/reset)
     */
    fun reset()

    /**
     * Fires when a FORM is about to be submitted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/submit)
     */
    fun submit()
    // [name: string]: any
}

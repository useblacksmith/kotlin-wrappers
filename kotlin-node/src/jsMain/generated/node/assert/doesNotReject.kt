// Generated by Karakum - do not modify it manually!

@file:JsModule("node:assert/strict")
@file:JsQualifier("assert")

package node.assert

import js.promise.Promise

/**
 * Awaits the `asyncFn` promise or, if `asyncFn` is a function, immediately
 * calls the function and awaits the returned promise to complete. It will then
 * check that the promise is not rejected.
 *
 * If `asyncFn` is a function and it throws an error synchronously,`assert.doesNotReject()` will return a rejected `Promise` with that error. If
 * the function does not return a promise, `assert.doesNotReject()` will return a
 * rejected `Promise` with an `ERR_INVALID_RETURN_VALUE` error. In both cases
 * the error handler is skipped.
 *
 * Using `assert.doesNotReject()` is actually not useful because there is little
 * benefit in catching a rejection and then rejecting it again. Instead, consider
 * adding a comment next to the specific code path that should not reject and keep
 * error messages as expressive as possible.
 *
 * If specified, `error` can be a [`Class`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Classes),
 * [`RegExp`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_Expressions), or a validation
 * function. See {@link throws} for more details.
 *
 * Besides the async nature to await the completion behaves identically to {@link doesNotThrow}.
 *
 * ```js
 * import assert from 'node:assert/strict';
 *
 * await assert.doesNotReject(
 *   async () => {
 *     throw new TypeError('Wrong value');
 *   },
 *   SyntaxError,
 * );
 * ```
 *
 * ```js
 * import assert from 'node:assert/strict';
 *
 * assert.doesNotReject(Promise.reject(new TypeError('Wrong value')))
 *   .then(() => {
 *     // ...
 *   });
 * ```
 * @since v10.0.0
 */

@JsName("doesNotReject")
external fun doesNotRejectAsync(block: () -> Promise<Any?>, message: String = definedExternally): Promise<Unit>


@JsName("doesNotReject")
external fun doesNotRejectAsync(
    block: () -> Promise<Any?>,
    message: Throwable /* JsError */ = definedExternally,
): Promise<Unit>


@JsName("doesNotReject")
external fun doesNotRejectAsync(block: Promise<Any?>, message: String = definedExternally): Promise<Unit>


@JsName("doesNotReject")
external fun doesNotRejectAsync(
    block: Promise<Any?>,
    message: Throwable /* JsError */ = definedExternally,
): Promise<Unit>


@JsName("doesNotReject")
external fun doesNotRejectAsync(
    block: () -> Promise<Any?>,
    error: AssertPredicate,
    message: String = definedExternally,
): Promise<Unit>


@JsName("doesNotReject")
external fun doesNotRejectAsync(
    block: () -> Promise<Any?>,
    error: AssertPredicate,
    message: Throwable /* JsError */ = definedExternally,
): Promise<Unit>


@JsName("doesNotReject")
external fun doesNotRejectAsync(
    block: Promise<Any?>,
    error: AssertPredicate,
    message: String = definedExternally,
): Promise<Unit>


@JsName("doesNotReject")
external fun doesNotRejectAsync(
    block: Promise<Any?>,
    error: AssertPredicate,
    message: Throwable /* JsError */ = definedExternally,
): Promise<Unit>

@file:JsModule("node:dns")

package node.dns


/**
 * Uses the DNS protocol to resolve pointer records (`PTR` records) for the`hostname`. The `addresses` argument passed to the `callback` function will
 * be an array of strings containing the reply records.
 * @since v6.0.0
 */
external fun resolvePtr(
    hostname: String,
    callback: (err: node.ErrnoException?, addresses: js.core.ReadonlyArray<String>) -> Unit,
): Unit
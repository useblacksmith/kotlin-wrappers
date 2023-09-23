@file:JsModule("node:buffer")

package node.buffer

import web.buffer.Blob

/**
 * Resolves a `'blob:nodedata:...'` an associated `Blob` object registered using
 * a prior call to `URL.createObjectURL()`.
 * @since v16.7.0
 * @experimental
 * @param id A `'blob:nodedata:...` URL string returned by a prior call to `URL.createObjectURL()`.
 */
external fun resolveObjectURL(id: String): Blob?
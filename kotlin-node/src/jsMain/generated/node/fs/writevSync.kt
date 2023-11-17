// Generated by Karakum - do not modify it manually!

@file:JsModule("node:fs")

package node.fs

import js.core.ReadonlyArray

/**
 * For detailed information, see the documentation of the asynchronous version of
 * this API: {@link writev}.
 * @since v12.9.0
 * @return The number of bytes written.
 */
external fun writevSync(fd: Number, buffers: ReadonlyArray<js.buffer.ArrayBufferView>, position: Number = definedExternally): Double

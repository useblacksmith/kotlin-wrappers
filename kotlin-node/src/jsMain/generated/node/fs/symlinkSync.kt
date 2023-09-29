@file:JsModule("node:fs")

package node.fs


/**
 * Returns `undefined`.
 *
 * For detailed information, see the documentation of the asynchronous version of
 * this API: {@link symlink}.
 * @since v0.1.31
 */
external fun symlinkSync(target: PathLike, path: PathLike, type: symlink.Type? = definedExternally): Unit
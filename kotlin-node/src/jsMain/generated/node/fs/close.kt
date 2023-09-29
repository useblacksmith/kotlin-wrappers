@file:JsModule("node:fs")

package node.fs


/**
 * Closes the file descriptor. No arguments other than a possible exception are
 * given to the completion callback.
 *
 * Calling `fs.close()` on any file descriptor (`fd`) that is currently in use
 * through any other `fs` operation may lead to undefined behavior.
 *
 * See the POSIX [`close(2)`](http://man7.org/linux/man-pages/man2/close.2.html) documentation for more detail.
 * @since v0.0.2
 */
external fun close(fd: Number, callback: NoParamCallback = definedExternally): Unit
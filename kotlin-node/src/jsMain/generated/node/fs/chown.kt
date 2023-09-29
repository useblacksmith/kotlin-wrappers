@file:JsModule("node:fs")

package node.fs


/**
 * Asynchronously changes owner and group of a file. No arguments other than a
 * possible exception are given to the completion callback.
 *
 * See the POSIX [`chown(2)`](http://man7.org/linux/man-pages/man2/chown.2.html) documentation for more detail.
 * @since v0.1.97
 */
external fun chown(path: PathLike, uid: Number, gid: Number, callback: NoParamCallback): Unit
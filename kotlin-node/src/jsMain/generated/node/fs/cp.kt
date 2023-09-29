@file:JsModule("node:fs")

package node.fs

import node.url.URL

/**
 * Asynchronously copies the entire directory structure from `src` to `dest`,
 * including subdirectories and files.
 *
 * When copying a directory to another directory, globs are not supported and
 * behavior is similar to `cp dir1/ dir2/`.
 * @since v16.7.0
 * @experimental
 * @param src source path to copy.
 * @param dest destination path to copy to.
 */
external fun cp(source: String, destination: String, callback: (err: node.ErrnoException?) -> Unit): Unit

external fun cp(source: String, destination: URL, callback: (err: node.ErrnoException?) -> Unit): Unit

external fun cp(source: URL, destination: String, callback: (err: node.ErrnoException?) -> Unit): Unit

external fun cp(source: URL, destination: URL, callback: (err: node.ErrnoException?) -> Unit): Unit

external fun cp(
    source: String,
    destination: String,
    opts: CopyOptions,
    callback: (err: node.ErrnoException?) -> Unit,
): Unit

external fun cp(
    source: String,
    destination: URL,
    opts: CopyOptions,
    callback: (err: node.ErrnoException?) -> Unit,
): Unit

external fun cp(
    source: URL,
    destination: String,
    opts: CopyOptions,
    callback: (err: node.ErrnoException?) -> Unit,
): Unit

external fun cp(source: URL, destination: URL, opts: CopyOptions, callback: (err: node.ErrnoException?) -> Unit): Unit
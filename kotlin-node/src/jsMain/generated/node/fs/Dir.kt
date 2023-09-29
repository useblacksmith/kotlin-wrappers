@file:JsModule("node:fs")

package node.fs

import js.iterable.AsyncIterable
import js.promise.Promise

/**
 * A class representing a directory stream.
 *
 * Created by {@link opendir}, {@link opendirSync}, or `fsPromises.opendir()`.
 *
 * ```js
 * import { opendir } from 'fs/promises';
 *
 * try {
 *   const dir = await opendir('./');
 *   for await (const dirent of dir)
 *     console.log(dirent.name);
 * } catch (err) {
 *   console.error(err);
 * }
 * ```
 *
 * When using the async iterator, the `fs.Dir` object will be automatically
 * closed after the iterator exits.
 * @since v12.12.0
 */

external class Dir : AsyncIterable<Dirent> {
    /**
     * The read-only path of this directory as was provided to {@link opendir},{@link opendirSync}, or `fsPromises.opendir()`.
     * @since v12.12.0
     */
    val path: String

    /**
     * Asynchronously close the directory's underlying resource handle.
     * Subsequent reads will result in errors.
     *
     * A promise is returned that will be resolved after the resource has been
     * closed.
     * @since v12.12.0
     */
    fun close(): Promise<Unit>
    fun close(cb: NoParamCallback): Unit

    /**
     * Synchronously close the directory's underlying resource handle.
     * Subsequent reads will result in errors.
     * @since v12.12.0
     */
    fun closeSync(): Unit

    /**
     * Asynchronously read the next directory entry via [`readdir(3)`](http://man7.org/linux/man-pages/man3/readdir.3.html) as an `fs.Dirent`.
     *
     * A promise is returned that will be resolved with an `fs.Dirent`, or `null`if there are no more directory entries to read.
     *
     * Directory entries returned by this function are in no particular order as
     * provided by the operating system's underlying directory mechanisms.
     * Entries added or removed while iterating over the directory might not be
     * included in the iteration results.
     * @since v12.12.0
     * @return containing {fs.Dirent|null}
     */
    fun read(): Promise<Dirent?>
    fun read(cb: (err: node.ErrnoException?, dirEnt: Dirent?) -> Unit): Unit

    /**
     * Synchronously read the next directory entry as an `fs.Dirent`. See the
     * POSIX [`readdir(3)`](http://man7.org/linux/man-pages/man3/readdir.3.html) documentation for more detail.
     *
     * If there are no more directory entries to read, `null` will be returned.
     *
     * Directory entries returned by this function are in no particular order as
     * provided by the operating system's underlying directory mechanisms.
     * Entries added or removed while iterating over the directory might not be
     * included in the iteration results.
     * @since v12.12.0
     */
    fun readSync(): Dirent?
}
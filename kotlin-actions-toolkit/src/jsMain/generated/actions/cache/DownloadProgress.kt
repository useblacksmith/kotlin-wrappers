// Automatically generated - do not modify!

@file:JsModule("@actions/cache")

package actions.cache

import js.promise.Promise
import js.promise.await
import js.collections.ReadonlyMap
import js.core.BigInt
import js.core.JsLong
import js.objects.Record
import js.array.ReadonlyArray
import js.core.Void
import js.errors.JsError
import node.buffer.Buffer
import node.http.IncomingHttpHeaders
import node.http.OutgoingHttpHeaders
import web.url.URL

import actions.http.client.HttpClient
import actions.http.client.HttpClientResponse

import seskar.js.JsIntValue
import seskar.js.JsVirtual
import seskar.js.JsValue

external class DownloadProgress {
var contentLength: Number
var segmentIndex: Number
var segmentSize: Number
var segmentOffset: Number
var receivedBytes: Number
var startTime: Number
var displayedComplete: Boolean
var timeoutHandle: web.timers.Timeout?
constructor(contentLength: Number)
/**
 * Progress to the next segment. Only call this method when the previous segment
 * is complete.
 *
 * @param segmentSize the length of the next segment
 */
fun nextSegment(segmentSize: Number)
/**
 * Sets the number of bytes received for the current segment.
 *
 * @param receivedBytes the number of bytes received
 */
fun setReceivedBytes(receivedBytes: Number)
/**
 * Returns the total number of bytes transferred.
 */
fun getTransferredBytes(): Number
/**
 * Returns true if the download is complete.
 */
fun isDone(): Boolean
/**
 * Prints the current download stats. Once the download completes, this will print one
 * last line and then stop.
 */
fun display()
/**
 * Returns a function used to handle TransferProgressEvents.
 */
fun onProgress(): (progress: TransferProgressEvent) -> Unit
/**
 * Starts the timer that displays the stats.
 *
 * @param delayInMs the delay between each write
 */
fun startDisplayTimer(delayInMs: Number = definedExternally)
/**
 * Stops the timer that displays the stats. As this typically indicates the download
 * is complete, this will display one last line, unless the last line has already
 * been written.
 */
fun stopDisplayTimer()
}

// Automatically generated - do not modify!

package actions.cache

import js.core.ReadonlyArray
import kotlinx.coroutines.await

suspend fun resolvePaths(
    patterns: ReadonlyArray<String>,
): ReadonlyArray<String> =
    resolvePathsAsync(
        patterns = patterns,
    ).await()
package node.fs


sealed external interface MkdirRecursiveAsyncOptions : MakeDirectoryOptions {
    @JsName("recursive")
    var requiredRecursive: Boolean
}

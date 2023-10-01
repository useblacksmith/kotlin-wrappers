package node.crypto


sealed external interface ED448KeyPairOptionsPrivateKeyEncoding<PrivF : KeyFormat> :
    BasePrivateKeyEncodingOptions<PrivF> {
    var type: String /* 'pkcs8' */
}

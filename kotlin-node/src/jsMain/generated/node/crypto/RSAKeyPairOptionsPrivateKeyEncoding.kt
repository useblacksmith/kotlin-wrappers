package node.crypto


sealed external interface RSAKeyPairOptionsPrivateKeyEncoding<PrivF : KeyFormat> :
    BasePrivateKeyEncodingOptions<PrivF> {
    var type: RSAKeyPairOptionsPrivateKeyEncodingType
}

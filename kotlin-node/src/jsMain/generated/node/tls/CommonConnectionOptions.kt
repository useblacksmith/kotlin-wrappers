package node.tls


sealed external interface CommonConnectionOptions {
    /**
     * An optional TLS context object from tls.createSecureContext()
     */
    var secureContext: SecureContext?

    /**
     * When enabled, TLS packet trace information is written to `stderr`. This can be
     * used to debug TLS connection problems.
     * @default false
     */
    var enableTrace: Boolean?

    /**
     * If true the server will request a certificate from clients that
     * connect and attempt to verify that certificate. Defaults to
     * false.
     */
    var requestCert: Boolean?

    /**
     * An array of strings or a Buffer naming possible ALPN protocols.
     * (Protocols should be ordered by their priority.)
     */
    var ALPNProtocols: (Any /* string[] | Uint8Array[] | Uint8Array | undefined */)?

    /**
     * SNICallback(servername, cb) <Function> A function that will be
     * called if the client supports SNI TLS extension. Two arguments
     * will be passed when called: servername and cb. SNICallback should
     * invoke cb(null, ctx), where ctx is a SecureContext instance.
     * (tls.createSecureContext(...) can be used to get a proper
     * SecureContext.) If SNICallback wasn't provided the default callback
     * with high-level API will be used (see below).
     */
    var SNICallback: ((servername: String, cb: (err: Throwable /* JsError */?, ctx: SecureContext? /* use undefined for default */) -> Unit) -> Unit)?

    /**
     * If true the server will reject any connection which is not
     * authorized with the list of supplied CAs. This option only has an
     * effect if requestCert is true.
     * @default true
     */
    var rejectUnauthorized: Boolean?
}
@file:JsModule("node:dns")

package node.dns

import js.core.ReadonlyArray

/**
 * Sets the IP address and port of servers to be used when performing DNS
 * resolution. The `servers` argument is an array of [RFC 5952](https://tools.ietf.org/html/rfc5952#section-6) formatted
 * addresses. If the port is the IANA default DNS port (53) it can be omitted.
 *
 * ```js
 * dns.setServers([
 *   '4.4.4.4',
 *   '[2001:4860:4860::8888]',
 *   '4.4.4.4:1053',
 *   '[2001:4860:4860::8888]:1053',
 * ]);
 * ```
 *
 * An error will be thrown if an invalid address is provided.
 *
 * The `dns.setServers()` method must not be called while a DNS query is in
 * progress.
 *
 * The {@link setServers} method affects only {@link resolve},`dns.resolve*()` and {@link reverse} (and specifically _not_ {@link lookup}).
 *
 * This method works much like [resolve.conf](https://man7.org/linux/man-pages/man5/resolv.conf.5.html).
 * That is, if attempting to resolve with the first server provided results in a`NOTFOUND` error, the `resolve()` method will _not_ attempt to resolve with
 * subsequent servers provided. Fallback DNS servers will only be used if the
 * earlier ones time out or result in some other error.
 * @since v0.11.3
 * @param servers array of `RFC 5952` formatted addresses
 */
external fun setServers(servers: ReadonlyArray<String>): Unit
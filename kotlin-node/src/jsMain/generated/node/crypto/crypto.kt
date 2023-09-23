@file:JsModule("node:crypto")

package node.crypto


/**
 * The `crypto` module provides cryptographic functionality that includes a set of
 * wrappers for OpenSSL's hash, HMAC, cipher, decipher, sign, and verify functions.
 *
 * ```js
 * const { createHmac } = await import('crypto');
 *
 * const secret = 'abcdefg';
 * const hash = createHmac('sha256', secret)
 *                .update('I love cupcakes')
 *                .digest('hex');
 * console.log(hash);
 * // Prints:
 * //   c0fa1bc00531bd78ef38c628449c5102aeabd49b5dc3a2a516ea6ea959d6658e
 * ```
 * @see [source](https://github.com/nodejs/node/blob/v18.0.0/lib/crypto.js)
 */
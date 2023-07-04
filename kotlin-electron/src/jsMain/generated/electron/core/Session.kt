@file:JsModule("INTERNAL_ENTITY")

package electron.core

import node.buffer.Buffer
import kotlin.js.Promise
import node.events.EventEmitter as NodeEventEmitter


external class Session : NodeEventEmitter {
    /**
     * Emitted after an extension is loaded. This occurs whenever an extension is added
     * to the "enabled" set of extensions. This includes:
     *
     * * Extensions being loaded from `Session.loadExtension`.
     * * Extensions being reloaded:
     *   * from a crash.
     *   * if the extension requested it (`chrome.runtime.reload()`).
     */
    fun on(event: SessionEvent.EXTENSION_LOADED, listener: (event: Event, extension: Extension) -> Unit): Unit /* this */

    /**
     * Emitted after an extension is loaded and all necessary browser state is
     * initialized to support the start of the extension's background page.
     */
    fun on(event: SessionEvent.EXTENSION_READY, listener: (event: Event, extension: Extension) -> Unit): Unit /* this */

    /**
     * Emitted after an extension is unloaded. This occurs when
     * `Session.removeExtension` is called.
     */
    fun on(event: SessionEvent.EXTENSION_UNLOADED, listener: (event: Event, extension: Extension) -> Unit): Unit /* this */

    /**
     * Emitted after `navigator.hid.requestDevice` has been called and
     * `select-hid-device` has fired if a new device becomes available before the
     * callback from `select-hid-device` is called.  This event is intended for use
     * when using a UI to ask users to pick a device so that the UI can be updated with
     * the newly added device.
     */
    fun on(event: SessionEvent.HID_DEVICE_ADDED, listener: (event: Event, details: HidDeviceAddedDetails) -> Unit): Unit /* this */

    /**
     * Emitted after `navigator.hid.requestDevice` has been called and
     * `select-hid-device` has fired if a device has been removed before the callback
     * from `select-hid-device` is called.  This event is intended for use when using a
     * UI to ask users to pick a device so that the UI can be updated to remove the
     * specified device.
     */
    fun on(event: SessionEvent.HID_DEVICE_REMOVED, listener: (event: Event, details: HidDeviceRemovedDetails) -> Unit): Unit /* this */

    /**
     * Emitted after `HIDDevice.forget()` has been called.  This event can be used to
     * help maintain persistent storage of permissions when
     * `setDevicePermissionHandler` is used.
     */
    fun on(event: SessionEvent.HID_DEVICE_REVOKED, listener: (event: Event, details: HidDeviceRevokedDetails) -> Unit): Unit /* this */

    /**
     * Emitted when a render process requests preconnection to a URL, generally due to
     * a resource hint.
     */
    fun on(
        event: SessionEvent.PRECONNECT, listener: (
            event: Event,
            /**
             * The URL being requested for preconnection by the renderer.
             */
            preconnectUrl: String,
            /**
             * True if the renderer is requesting that the connection include credentials (see
             * the spec for more details.)
             */
            allowCredentials: Boolean
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when a HID device needs to be selected when a call to
     * `navigator.hid.requestDevice` is made. `callback` should be called with
     * `deviceId` to be selected; passing no arguments to `callback` will cancel the
     * request.  Additionally, permissioning on `navigator.hid` can be further managed
     * by using `ses.setPermissionCheckHandler(handler)` and
     * `ses.setDevicePermissionHandler(handler)`.
     */
    fun on(event: SessionEvent.SELECT_HID_DEVICE, listener: (event: Event, details: SelectHidDeviceDetails, callback: (deviceId: Any /* (string) | (null) */) -> Unit) -> Unit): Unit /* this */

    /**
     * Emitted when a serial port needs to be selected when a call to
     * `navigator.serial.requestPort` is made. `callback` should be called with
     * `portId` to be selected, passing an empty string to `callback` will cancel the
     * request.  Additionally, permissioning on `navigator.serial` can be managed by
     * using ses.setPermissionCheckHandler(handler) with the `serial` permission.
     */
    fun on(
        event: SessionEvent.SELECT_SERIAL_PORT,
        listener: (event: Event, portList: js.core.ReadonlyArray<SerialPort>, webContents: WebContents, callback: (portId: String) -> Unit) -> Unit
    ): Unit /* this */

    /**
     * Emitted when a USB device needs to be selected when a call to
     * `navigator.usb.requestDevice` is made. `callback` should be called with
     * `deviceId` to be selected; passing no arguments to `callback` will cancel the
     * request.  Additionally, permissioning on `navigator.usb` can be further managed
     * by using `ses.setPermissionCheckHandler(handler)` and
     * `ses.setDevicePermissionHandler(handler)`.
     */
    fun on(
        event: SessionEvent.SELECT_USB_DEVICE,
        listener: (event: Event, details: SelectUsbDeviceDetails, callback: (deviceId: String? /* use undefined for default */) -> Unit) -> Unit
    ): Unit /* this */

    /**
     * Emitted after `navigator.serial.requestPort` has been called and
     * `select-serial-port` has fired if a new serial port becomes available before the
     * callback from `select-serial-port` is called.  This event is intended for use
     * when using a UI to ask users to pick a port so that the UI can be updated with
     * the newly added port.
     */
    fun on(event: SessionEvent.SERIAL_PORT_ADDED, listener: (event: Event, port: SerialPort, webContents: WebContents) -> Unit): Unit /* this */

    /**
     * Emitted after `navigator.serial.requestPort` has been called and
     * `select-serial-port` has fired if a serial port has been removed before the
     * callback from `select-serial-port` is called.  This event is intended for use
     * when using a UI to ask users to pick a port so that the UI can be updated to
     * remove the specified port.
     */
    fun on(event: SessionEvent.SERIAL_PORT_REMOVED, listener: (event: Event, port: SerialPort, webContents: WebContents) -> Unit): Unit /* this */

    /**
     * Emitted after `SerialPort.forget()` has been called.  This event can be used to
     * help maintain persistent storage of permissions when
     * `setDevicePermissionHandler` is used.
     */
    fun on(event: SessionEvent.SERIAL_PORT_REVOKED, listener: (event: Event, details: SerialPortRevokedDetails) -> Unit): Unit /* this */

    /**
     * Emitted when a hunspell dictionary file starts downloading
     */
    fun on(
        event: SessionEvent.SPELLCHECK_DICTIONARY_DOWNLOAD_BEGIN, listener: (
            event: Event,
            /**
             * The language code of the dictionary file
             */
            languageCode: String
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when a hunspell dictionary file download fails.  For details on the
     * failure you should collect a netlog and inspect the download request.
     */
    fun on(
        event: SessionEvent.SPELLCHECK_DICTIONARY_DOWNLOAD_FAILURE, listener: (
            event: Event,
            /**
             * The language code of the dictionary file
             */
            languageCode: String
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when a hunspell dictionary file has been successfully downloaded
     */
    fun on(
        event: SessionEvent.SPELLCHECK_DICTIONARY_DOWNLOAD_SUCCESS, listener: (
            event: Event,
            /**
             * The language code of the dictionary file
             */
            languageCode: String
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when a hunspell dictionary file has been successfully initialized. This
     * occurs after the file has been downloaded.
     */
    fun on(
        event: SessionEvent.SPELLCHECK_DICTIONARY_INITIALIZED, listener: (
            event: Event,
            /**
             * The language code of the dictionary file
             */
            languageCode: String
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted after `navigator.usb.requestDevice` has been called and
     * `select-usb-device` has fired if a new device becomes available before the
     * callback from `select-usb-device` is called.  This event is intended for use
     * when using a UI to ask users to pick a device so that the UI can be updated with
     * the newly added device.
     */
    fun on(event: SessionEvent.USB_DEVICE_ADDED, listener: (event: Event, details: UsbDeviceAddedDetails) -> Unit): Unit /* this */

    /**
     * Emitted after `navigator.usb.requestDevice` has been called and
     * `select-usb-device` has fired if a device has been removed before the callback
     * from `select-usb-device` is called.  This event is intended for use when using a
     * UI to ask users to pick a device so that the UI can be updated to remove the
     * specified device.
     */
    fun on(event: SessionEvent.USB_DEVICE_REMOVED, listener: (event: Event, details: UsbDeviceRemovedDetails) -> Unit): Unit /* this */

    /**
     * Emitted after `USBDevice.forget()` has been called.  This event can be used to
     * help maintain persistent storage of permissions when
     * `setDevicePermissionHandler` is used.
     */
    fun on(event: SessionEvent.USB_DEVICE_REVOKED, listener: (event: Event, details: UsbDeviceRevokedDetails) -> Unit): Unit /* this */

    /**
     * Emitted when Electron is about to download `item` in `webContents`.
     *
     * Calling `event.preventDefault()` will cancel the download and `item` will not be
     * available from next tick of the process.
     */
    fun on(event: SessionEvent.WILL_DOWNLOAD, listener: (event: Event, item: DownloadItem, webContents: WebContents) -> Unit): Unit /* this */
    fun once(event: SessionEvent.EXTENSION_LOADED, listener: (event: Event, extension: Extension) -> Unit): Unit /* this */
    fun once(event: SessionEvent.EXTENSION_READY, listener: (event: Event, extension: Extension) -> Unit): Unit /* this */
    fun once(event: SessionEvent.EXTENSION_UNLOADED, listener: (event: Event, extension: Extension) -> Unit): Unit /* this */
    fun once(event: SessionEvent.HID_DEVICE_ADDED, listener: (event: Event, details: HidDeviceAddedDetails) -> Unit): Unit /* this */
    fun once(event: SessionEvent.HID_DEVICE_REMOVED, listener: (event: Event, details: HidDeviceRemovedDetails) -> Unit): Unit /* this */
    fun once(event: SessionEvent.HID_DEVICE_REVOKED, listener: (event: Event, details: HidDeviceRevokedDetails) -> Unit): Unit /* this */
    fun once(
        event: SessionEvent.PRECONNECT, listener: (
            event: Event,
            /**
             * The URL being requested for preconnection by the renderer.
             */
            preconnectUrl: String,
            /**
             * True if the renderer is requesting that the connection include credentials (see
             * the spec for more details.)
             */
            allowCredentials: Boolean
        ) -> Unit
    ): Unit /* this */

    fun once(event: SessionEvent.SELECT_HID_DEVICE, listener: (event: Event, details: SelectHidDeviceDetails, callback: (deviceId: Any /* (string) | (null) */) -> Unit) -> Unit): Unit /* this */
    fun once(
        event: SessionEvent.SELECT_SERIAL_PORT,
        listener: (event: Event, portList: js.core.ReadonlyArray<SerialPort>, webContents: WebContents, callback: (portId: String) -> Unit) -> Unit
    ): Unit /* this */

    fun once(
        event: SessionEvent.SELECT_USB_DEVICE,
        listener: (event: Event, details: SelectUsbDeviceDetails, callback: (deviceId: String? /* use undefined for default */) -> Unit) -> Unit
    ): Unit /* this */

    fun once(event: SessionEvent.SERIAL_PORT_ADDED, listener: (event: Event, port: SerialPort, webContents: WebContents) -> Unit): Unit /* this */
    fun once(event: SessionEvent.SERIAL_PORT_REMOVED, listener: (event: Event, port: SerialPort, webContents: WebContents) -> Unit): Unit /* this */
    fun once(event: SessionEvent.SERIAL_PORT_REVOKED, listener: (event: Event, details: SerialPortRevokedDetails) -> Unit): Unit /* this */
    fun once(
        event: SessionEvent.SPELLCHECK_DICTIONARY_DOWNLOAD_BEGIN, listener: (
            event: Event,
            /**
             * The language code of the dictionary file
             */
            languageCode: String
        ) -> Unit
    ): Unit /* this */

    fun once(
        event: SessionEvent.SPELLCHECK_DICTIONARY_DOWNLOAD_FAILURE, listener: (
            event: Event,
            /**
             * The language code of the dictionary file
             */
            languageCode: String
        ) -> Unit
    ): Unit /* this */

    fun once(
        event: SessionEvent.SPELLCHECK_DICTIONARY_DOWNLOAD_SUCCESS, listener: (
            event: Event,
            /**
             * The language code of the dictionary file
             */
            languageCode: String
        ) -> Unit
    ): Unit /* this */

    fun once(
        event: SessionEvent.SPELLCHECK_DICTIONARY_INITIALIZED, listener: (
            event: Event,
            /**
             * The language code of the dictionary file
             */
            languageCode: String
        ) -> Unit
    ): Unit /* this */

    fun once(event: SessionEvent.USB_DEVICE_ADDED, listener: (event: Event, details: UsbDeviceAddedDetails) -> Unit): Unit /* this */
    fun once(event: SessionEvent.USB_DEVICE_REMOVED, listener: (event: Event, details: UsbDeviceRemovedDetails) -> Unit): Unit /* this */
    fun once(event: SessionEvent.USB_DEVICE_REVOKED, listener: (event: Event, details: UsbDeviceRevokedDetails) -> Unit): Unit /* this */
    fun once(event: SessionEvent.WILL_DOWNLOAD, listener: (event: Event, item: DownloadItem, webContents: WebContents) -> Unit): Unit /* this */
    fun addListener(event: SessionEvent.EXTENSION_LOADED, listener: (event: Event, extension: Extension) -> Unit): Unit /* this */
    fun addListener(event: SessionEvent.EXTENSION_READY, listener: (event: Event, extension: Extension) -> Unit): Unit /* this */
    fun addListener(event: SessionEvent.EXTENSION_UNLOADED, listener: (event: Event, extension: Extension) -> Unit): Unit /* this */
    fun addListener(event: SessionEvent.HID_DEVICE_ADDED, listener: (event: Event, details: HidDeviceAddedDetails) -> Unit): Unit /* this */
    fun addListener(event: SessionEvent.HID_DEVICE_REMOVED, listener: (event: Event, details: HidDeviceRemovedDetails) -> Unit): Unit /* this */
    fun addListener(event: SessionEvent.HID_DEVICE_REVOKED, listener: (event: Event, details: HidDeviceRevokedDetails) -> Unit): Unit /* this */
    fun addListener(
        event: SessionEvent.PRECONNECT, listener: (
            event: Event,
            /**
             * The URL being requested for preconnection by the renderer.
             */
            preconnectUrl: String,
            /**
             * True if the renderer is requesting that the connection include credentials (see
             * the spec for more details.)
             */
            allowCredentials: Boolean
        ) -> Unit
    ): Unit /* this */

    fun addListener(
        event: SessionEvent.SELECT_HID_DEVICE,
        listener: (event: Event, details: SelectHidDeviceDetails, callback: (deviceId: Any /* (string) | (null) */) -> Unit) -> Unit
    ): Unit /* this */

    fun addListener(
        event: SessionEvent.SELECT_SERIAL_PORT,
        listener: (event: Event, portList: js.core.ReadonlyArray<SerialPort>, webContents: WebContents, callback: (portId: String) -> Unit) -> Unit
    ): Unit /* this */

    fun addListener(
        event: SessionEvent.SELECT_USB_DEVICE,
        listener: (event: Event, details: SelectUsbDeviceDetails, callback: (deviceId: String? /* use undefined for default */) -> Unit) -> Unit
    ): Unit /* this */

    fun addListener(event: SessionEvent.SERIAL_PORT_ADDED, listener: (event: Event, port: SerialPort, webContents: WebContents) -> Unit): Unit /* this */
    fun addListener(event: SessionEvent.SERIAL_PORT_REMOVED, listener: (event: Event, port: SerialPort, webContents: WebContents) -> Unit): Unit /* this */
    fun addListener(event: SessionEvent.SERIAL_PORT_REVOKED, listener: (event: Event, details: SerialPortRevokedDetails) -> Unit): Unit /* this */
    fun addListener(
        event: SessionEvent.SPELLCHECK_DICTIONARY_DOWNLOAD_BEGIN, listener: (
            event: Event,
            /**
             * The language code of the dictionary file
             */
            languageCode: String
        ) -> Unit
    ): Unit /* this */

    fun addListener(
        event: SessionEvent.SPELLCHECK_DICTIONARY_DOWNLOAD_FAILURE, listener: (
            event: Event,
            /**
             * The language code of the dictionary file
             */
            languageCode: String
        ) -> Unit
    ): Unit /* this */

    fun addListener(
        event: SessionEvent.SPELLCHECK_DICTIONARY_DOWNLOAD_SUCCESS, listener: (
            event: Event,
            /**
             * The language code of the dictionary file
             */
            languageCode: String
        ) -> Unit
    ): Unit /* this */

    fun addListener(
        event: SessionEvent.SPELLCHECK_DICTIONARY_INITIALIZED, listener: (
            event: Event,
            /**
             * The language code of the dictionary file
             */
            languageCode: String
        ) -> Unit
    ): Unit /* this */

    fun addListener(event: SessionEvent.USB_DEVICE_ADDED, listener: (event: Event, details: UsbDeviceAddedDetails) -> Unit): Unit /* this */
    fun addListener(event: SessionEvent.USB_DEVICE_REMOVED, listener: (event: Event, details: UsbDeviceRemovedDetails) -> Unit): Unit /* this */
    fun addListener(event: SessionEvent.USB_DEVICE_REVOKED, listener: (event: Event, details: UsbDeviceRevokedDetails) -> Unit): Unit /* this */
    fun addListener(event: SessionEvent.WILL_DOWNLOAD, listener: (event: Event, item: DownloadItem, webContents: WebContents) -> Unit): Unit /* this */
    fun removeListener(event: SessionEvent.EXTENSION_LOADED, listener: (event: Event, extension: Extension) -> Unit): Unit /* this */
    fun removeListener(event: SessionEvent.EXTENSION_READY, listener: (event: Event, extension: Extension) -> Unit): Unit /* this */
    fun removeListener(event: SessionEvent.EXTENSION_UNLOADED, listener: (event: Event, extension: Extension) -> Unit): Unit /* this */
    fun removeListener(event: SessionEvent.HID_DEVICE_ADDED, listener: (event: Event, details: HidDeviceAddedDetails) -> Unit): Unit /* this */
    fun removeListener(event: SessionEvent.HID_DEVICE_REMOVED, listener: (event: Event, details: HidDeviceRemovedDetails) -> Unit): Unit /* this */
    fun removeListener(event: SessionEvent.HID_DEVICE_REVOKED, listener: (event: Event, details: HidDeviceRevokedDetails) -> Unit): Unit /* this */
    fun removeListener(
        event: SessionEvent.PRECONNECT, listener: (
            event: Event,
            /**
             * The URL being requested for preconnection by the renderer.
             */
            preconnectUrl: String,
            /**
             * True if the renderer is requesting that the connection include credentials (see
             * the spec for more details.)
             */
            allowCredentials: Boolean
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: SessionEvent.SELECT_HID_DEVICE,
        listener: (event: Event, details: SelectHidDeviceDetails, callback: (deviceId: Any /* (string) | (null) */) -> Unit) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: SessionEvent.SELECT_SERIAL_PORT,
        listener: (event: Event, portList: js.core.ReadonlyArray<SerialPort>, webContents: WebContents, callback: (portId: String) -> Unit) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: SessionEvent.SELECT_USB_DEVICE,
        listener: (event: Event, details: SelectUsbDeviceDetails, callback: (deviceId: String? /* use undefined for default */) -> Unit) -> Unit
    ): Unit /* this */

    fun removeListener(event: SessionEvent.SERIAL_PORT_ADDED, listener: (event: Event, port: SerialPort, webContents: WebContents) -> Unit): Unit /* this */
    fun removeListener(event: SessionEvent.SERIAL_PORT_REMOVED, listener: (event: Event, port: SerialPort, webContents: WebContents) -> Unit): Unit /* this */
    fun removeListener(event: SessionEvent.SERIAL_PORT_REVOKED, listener: (event: Event, details: SerialPortRevokedDetails) -> Unit): Unit /* this */
    fun removeListener(
        event: SessionEvent.SPELLCHECK_DICTIONARY_DOWNLOAD_BEGIN, listener: (
            event: Event,
            /**
             * The language code of the dictionary file
             */
            languageCode: String
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: SessionEvent.SPELLCHECK_DICTIONARY_DOWNLOAD_FAILURE, listener: (
            event: Event,
            /**
             * The language code of the dictionary file
             */
            languageCode: String
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: SessionEvent.SPELLCHECK_DICTIONARY_DOWNLOAD_SUCCESS, listener: (
            event: Event,
            /**
             * The language code of the dictionary file
             */
            languageCode: String
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: SessionEvent.SPELLCHECK_DICTIONARY_INITIALIZED, listener: (
            event: Event,
            /**
             * The language code of the dictionary file
             */
            languageCode: String
        ) -> Unit
    ): Unit /* this */

    fun removeListener(event: SessionEvent.USB_DEVICE_ADDED, listener: (event: Event, details: UsbDeviceAddedDetails) -> Unit): Unit /* this */
    fun removeListener(event: SessionEvent.USB_DEVICE_REMOVED, listener: (event: Event, details: UsbDeviceRemovedDetails) -> Unit): Unit /* this */
    fun removeListener(event: SessionEvent.USB_DEVICE_REVOKED, listener: (event: Event, details: UsbDeviceRevokedDetails) -> Unit): Unit /* this */
    fun removeListener(event: SessionEvent.WILL_DOWNLOAD, listener: (event: Event, item: DownloadItem, webContents: WebContents) -> Unit): Unit /* this */

    /**
     * Whether the word was successfully written to the custom dictionary. This API
     * will not work on non-persistent (in-memory) sessions.
     *
     * **Note:** On macOS and Windows 10 this word will be written to the OS custom
     * dictionary as well
     */
    fun addWordToSpellCheckerDictionary(word: String): Boolean

    /**
     * Dynamically sets whether to always send credentials for HTTP NTLM or Negotiate
     * authentication.
     */
    fun allowNTLMCredentialsForDomains(domains: String): Unit

    /**
     * resolves when the session’s HTTP authentication cache has been cleared.
     */
    fun clearAuthCache(): Promise<Unit>

    /**
     * resolves when the cache clear operation is complete.
     *
     * Clears the session’s HTTP cache.
     */
    fun clearCache(): Promise<Unit>

    /**
     * resolves when the code cache clear operation is complete.
     */
    fun clearCodeCaches(options: ClearCodeCachesOptions): Promise<Unit>

    /**
     * Resolves when the operation is complete.
     *
     * Clears the host resolver cache.
     */
    fun clearHostResolverCache(): Promise<Unit>

    /**
     * resolves when the storage data has been cleared.
     */
    fun clearStorageData(options: ClearStorageDataOptions = definedExternally): Promise<Unit>

    /**
     * Resolves when all connections are closed.
     *
     * **Note:** It will terminate / fail all requests currently in flight.
     */
    fun closeAllConnections(): Promise<Unit>

    /**
     * Allows resuming `cancelled` or `interrupted` downloads from previous `Session`.
     * The API will generate a DownloadItem that can be accessed with the will-download
     * event. The DownloadItem will not have any `WebContents` associated with it and
     * the initial state will be `interrupted`. The download will start only when the
     * `resume` API is called on the DownloadItem.
     */
    fun createInterruptedDownload(options: CreateInterruptedDownloadOptions): Unit

    /**
     * Disables any network emulation already active for the `session`. Resets to the
     * original network configuration.
     */
    fun disableNetworkEmulation(): Unit

    /**
     * Initiates a download of the resource at `url`. The API will generate a
     * DownloadItem that can be accessed with the will-download event.
     *
     * **Note:** This does not perform any security checks that relate to a page's
     * origin, unlike `webContents.downloadURL`.
     */
    fun downloadURL(url: String): Unit

    /**
     * Emulates network with the given configuration for the `session`.
     */
    fun enableNetworkEmulation(options: EnableNetworkEmulationOptions): Unit

    /**
     * Writes any unwritten DOMStorage data to disk.
     */
    fun flushStorageData(): Unit

    /**
     * Resolves when the all internal states of proxy service is reset and the latest
     * proxy configuration is reapplied if it's already available. The pac script will
     * be fetched from `pacScript` again if the proxy mode is `pac_script`.
     */
    fun forceReloadProxyConfig(): Promise<Unit>

    /**
     * A list of all loaded extensions.
     *
     * **Note:** This API cannot be called before the `ready` event of the `app` module
     * is emitted.
     */
    fun getAllExtensions(): js.core.ReadonlyArray<Extension>

    /**
     * resolves with blob data.
     */
    fun getBlobData(identifier: String): Promise<Buffer>

    /**
     * the session's current cache size, in bytes.
     */
    fun getCacheSize(): Promise<Double>

    /**
     * | `null` - The loaded extension with the given ID.
     *
     * **Note:** This API cannot be called before the `ready` event of the `app` module
     * is emitted.
     */
    fun getExtension(extensionId: String): Extension

    /**
     * an array of paths to preload scripts that have been registered.
     */
    fun getPreloads(): js.core.ReadonlyArray<String>

    /**
     * An array of language codes the spellchecker is enabled for.  If this list is
     * empty the spellchecker will fallback to using `en-US`.  By default on launch if
     * this setting is an empty list Electron will try to populate this setting with
     * the current OS locale.  This setting is persisted across restarts.
     *
     * **Note:** On macOS the OS spellchecker is used and has its own list of
     * languages. On macOS, this API will return whichever languages have been
     * configured by the OS.
     */
    fun getSpellCheckerLanguages(): js.core.ReadonlyArray<String>

    /**
     * The absolute file system path where data for this session is persisted on disk.
     * For in memory sessions this returns `null`.
     */
    fun getStoragePath(): Any /* (string) | (null) */

    /**
     * The user agent for this session.
     */
    fun getUserAgent(): String

    /**
     * Whether or not this session is a persistent one. The default `webContents`
     * session of a `BrowserWindow` is persistent. When creating a session from a
     * partition, session prefixed with `persist:` will be persistent, while others
     * will be temporary.
     */
    fun isPersistent(): Boolean

    /**
     * Whether the builtin spell checker is enabled.
     */
    fun isSpellCheckerEnabled(): Boolean

    /**
     * An array of all words in app's custom dictionary. Resolves when the full
     * dictionary is loaded from disk.
     */
    fun listWordsInSpellCheckerDictionary(): Promise<js.core.ReadonlyArray<String>>

    /**
     * resolves when the extension is loaded.
     *
     * This method will raise an exception if the extension could not be loaded. If
     * there are warnings when installing the extension (e.g. if the extension requests
     * an API that Electron does not support) then they will be logged to the console.
     *
     * Note that Electron does not support the full range of Chrome extensions APIs.
     * See Supported Extensions APIs for more details on what is supported.
     *
     * Note that in previous versions of Electron, extensions that were loaded would be
     * remembered for future runs of the application. This is no longer the case:
     * `loadExtension` must be called on every boot of your app if you want the
     * extension to be loaded.
     *
     * This API does not support loading packed (.crx) extensions.
     *
     * **Note:** This API cannot be called before the `ready` event of the `app` module
     * is emitted.
     *
     * **Note:** Loading extensions into in-memory (non-persistent) sessions is not
     * supported and will throw an error.
     */
    fun loadExtension(path: String, options: LoadExtensionOptions = definedExternally): Promise<Extension>

    /**
     * Preconnects the given number of sockets to an origin.
     */
    fun preconnect(options: PreconnectOptions): Unit

    /**
     * Unloads an extension.
     *
     * **Note:** This API cannot be called before the `ready` event of the `app` module
     * is emitted.
     */
    fun removeExtension(extensionId: String): Unit

    /**
     * Whether the word was successfully removed from the custom dictionary. This API
     * will not work on non-persistent (in-memory) sessions.
     *
     * **Note:** On macOS and Windows 10 this word will be removed from the OS custom
     * dictionary as well
     */
    fun removeWordFromSpellCheckerDictionary(word: String): Boolean

    /**
     * Resolves with the resolved IP addresses for the `host`.
     */
    fun resolveHost(host: String, options: ResolveHostOptions = definedExternally): Promise<ResolvedHost>

    /**
     * Resolves with the proxy information for `url`.
     */
    fun resolveProxy(url: String): Promise<String>

    /**
     * Sets a handler to respond to Bluetooth pairing requests. This handler allows
     * developers to handle devices that require additional validation before pairing.
     * When a handler is not defined, any pairing on Linux or Windows that requires
     * additional validation will be automatically cancelled. macOS does not require a
     * handler because macOS handles the pairing automatically.  To clear the handler,
     * call `setBluetoothPairingHandler(null)`.
     *
     * @platform win32,linux
     */
    fun setBluetoothPairingHandler(handler: ((details: BluetoothPairingHandlerHandlerDetails, callback: (response: Response) -> Unit) -> Unit)): Unit

    fun setBluetoothPairingHandler(handler: (Nothing?)): Unit

    /**
     * Sets the certificate verify proc for `session`, the `proc` will be called with
     * `proc(request, callback)` whenever a server certificate verification is
     * requested. Calling `callback(0)` accepts the certificate, calling `callback(-2)`
     * rejects it.
     *
     * Calling `setCertificateVerifyProc(null)` will revert back to default certificate
     * verify proc.
     *
     * > **NOTE:** The result of this procedure is cached by the network service.
     */
    fun setCertificateVerifyProc(proc: ((request: Request, callback: (verificationResult: Double) -> Unit) -> Unit)): Unit

    fun setCertificateVerifyProc(proc: (Nothing?)): Unit

    /**
     * Sets the directory to store the generated JS code cache for this session. The
     * directory is not required to be created by the user before this call, the
     * runtime will create if it does not exist otherwise will use the existing
     * directory. If directory cannot be created, then code cache will not be used and
     * all operations related to code cache will fail silently inside the runtime. By
     * default, the directory will be `Code Cache` under the respective user data
     * folder.
     */
    fun setCodeCachePath(path: String): Unit

    /**
     * Sets the handler which can be used to respond to device permission checks for
     * the `session`. Returning `true` will allow the device to be permitted and
     * `false` will reject it. To clear the handler, call
     * `setDevicePermissionHandler(null)`. This handler can be used to provide default
     * permissioning to devices without first calling for permission to devices (eg via
     * `navigator.hid.requestDevice`).  If this handler is not defined, the default
     * device permissions as granted through device selection (eg via
     * `navigator.hid.requestDevice`) will be used. Additionally, the default behavior
     * of Electron is to store granted device permision in memory. If longer term
     * storage is needed, a developer can store granted device permissions (eg when
     * handling the `select-hid-device` event) and then read from that storage with
     * `setDevicePermissionHandler`.
     */
    fun setDevicePermissionHandler(handler: ((details: DevicePermissionHandlerHandlerDetails) -> Boolean)): Unit

    fun setDevicePermissionHandler(handler: (Nothing?)): Unit

    /**
     * This handler will be called when web content requests access to display media
     * via the `navigator.mediaDevices.getDisplayMedia` API. Use the desktopCapturer
     * API to choose which stream(s) to grant access to.
     *
     * Passing a WebFrameMain object as a video or audio stream will capture the video
     * or audio stream from that frame.
     *
     * Passing `null` instead of a function resets the handler to its default state.
     */
    fun setDisplayMediaRequestHandler(handler: ((request: DisplayMediaRequestHandlerHandlerRequest, callback: (streams: Streams) -> Unit) -> Unit)): Unit

    fun setDisplayMediaRequestHandler(handler: (Nothing?)): Unit

    /**
     * Sets download saving directory. By default, the download directory will be the
     * `Downloads` under the respective app folder.
     */
    fun setDownloadPath(path: String): Unit

    /**
     * Sets the handler which can be used to respond to permission checks for the
     * `session`. Returning `true` will allow the permission and `false` will reject
     * it.  Please note that you must also implement `setPermissionRequestHandler` to
     * get complete permission handling. Most web APIs do a permission check and then
     * make a permission request if the check is denied. To clear the handler, call
     * `setPermissionCheckHandler(null)`.
     */
    fun setPermissionCheckHandler(handler: ((webContents: Any /* (WebContents) | (null) */, permission: String, requestingOrigin: String, details: PermissionCheckHandlerHandlerDetails) -> Boolean)): Unit

    fun setPermissionCheckHandler(handler: (Nothing?)): Unit

    /**
     * Sets the handler which can be used to respond to permission requests for the
     * `session`. Calling `callback(true)` will allow the permission and
     * `callback(false)` will reject it. To clear the handler, call
     * `setPermissionRequestHandler(null)`.  Please note that you must also implement
     * `setPermissionCheckHandler` to get complete permission handling. Most web APIs
     * do a permission check and then make a permission request if the check is denied.
     */
    fun setPermissionRequestHandler(handler: ((webContents: WebContents, permission: Temp1, callback: (permissionGranted: Boolean) -> Unit, details: PermissionRequestHandlerHandlerDetails) -> Unit)): Unit

    fun setPermissionRequestHandler(handler: (Nothing?)): Unit

    /**
     * Adds scripts that will be executed on ALL web contents that are associated with
     * this session just before normal `preload` scripts run.
     */
    fun setPreloads(preloads: js.core.ReadonlyArray<String>): Unit

    /**
     * Resolves when the proxy setting process is complete.
     *
     * Sets the proxy settings.
     *
     * When `mode` is unspecified, `pacScript` and `proxyRules` are provided together,
     * the `proxyRules` option is ignored and `pacScript` configuration is applied.
     *
     * You may need `ses.closeAllConnections` to close currently in flight connections
     * to prevent pooled sockets using previous proxy from being reused by future
     * requests.
     *
     * The `proxyRules` has to follow the rules below:
     *
     * For example:
     *
     * * `http=foopy:80;ftp=foopy2` - Use HTTP proxy `foopy:80` for `http://` URLs, and
     * HTTP proxy `foopy2:80` for `ftp://` URLs.
     * * `foopy:80` - Use HTTP proxy `foopy:80` for all URLs.
     * * `foopy:80,bar,direct://` - Use HTTP proxy `foopy:80` for all URLs, failing
     * over to `bar` if `foopy:80` is unavailable, and after that using no proxy.
     * * `socks4://foopy` - Use SOCKS v4 proxy `foopy:1080` for all URLs.
     * * `http=foopy,socks5://bar.com` - Use HTTP proxy `foopy` for http URLs, and fail
     * over to the SOCKS5 proxy `bar.com` if `foopy` is unavailable.
     * * `http=foopy,direct://` - Use HTTP proxy `foopy` for http URLs, and use no
     * proxy if `foopy` is unavailable.
     * * `http=foopy;socks=foopy2` - Use HTTP proxy `foopy` for http URLs, and use
     * `socks4://foopy2` for all other URLs.
     *
     * The `proxyBypassRules` is a comma separated list of rules described below:
     *
     * * `[ URL_SCHEME "://" ] HOSTNAME_PATTERN [ ":" <port> ]`
     *
     * Match all hostnames that match the pattern HOSTNAME_PATTERN.
     *
     * Examples: "foobar.com", "*foobar.com", "*.foobar.com", "*foobar.com:99",
     * "https://x.*.y.com:99"
     * * `"." HOSTNAME_SUFFIX_PATTERN [ ":" PORT ]`
     *
     * Match a particular domain suffix.
     *
     * Examples: ".google.com", ".com", "http://.google.com"
     * * `[ SCHEME "://" ] IP_LITERAL [ ":" PORT ]`
     *
     * Match URLs which are IP address literals.
     *
     * Examples: "127.0.1", "[0:0::1]", "[::1]", "http://[::1]:99"
     * * `IP_LITERAL "/" PREFIX_LENGTH_IN_BITS`
     *
     * Match any URL that is to an IP literal that falls between the given range. IP
     * range is specified using CIDR notation.
     *
     * Examples: "192.168.1.1/16", "fefe:13::abc/33".
     * * `<local>`
     *
     * Match local addresses. The meaning of `<local>` is whether the host matches one
     * of: "127.0.0.1", "::1", "localhost".
     */
    fun setProxy(config: Config): Promise<Unit>

    /**
     * By default Electron will download hunspell dictionaries from the Chromium CDN.
     * If you want to override this behavior you can use this API to point the
     * dictionary downloader at your own hosted version of the hunspell dictionaries.
     * We publish a `hunspell_dictionaries.zip` file with each release which contains
     * the files you need to host here.
     *
     * The file server must be **case insensitive**. If you cannot do this, you must
     * upload each file twice: once with the case it has in the ZIP file and once with
     * the filename as all lowercase.
     *
     * If the files present in `hunspell_dictionaries.zip` are available at
     * `https://example.com/dictionaries/language-code.bdic` then you should call this
     * api with
     * `ses.setSpellCheckerDictionaryDownloadURL('https://example.com/dictionaries/')`.
     *  Please note the trailing slash.  The URL to the dictionaries is formed as
     * `${url}${filename}`.
     *
     * **Note:** On macOS the OS spellchecker is used and therefore we do not download
     * any dictionary files.  This API is a no-op on macOS.
     */
    fun setSpellCheckerDictionaryDownloadURL(url: String): Unit

    /**
     * Sets whether to enable the builtin spell checker.
     */
    fun setSpellCheckerEnabled(enable: Boolean): Unit

    /**
     * The built in spellchecker does not automatically detect what language a user is
     * typing in.  In order for the spell checker to correctly check their words you
     * must call this API with an array of language codes.  You can get the list of
     * supported language codes with the `ses.availableSpellCheckerLanguages` property.
     *
     * **Note:** On macOS the OS spellchecker is used and will detect your language
     * automatically.  This API is a no-op on macOS.
     */
    fun setSpellCheckerLanguages(languages: js.core.ReadonlyArray<String>): Unit

    /**
     * Sets the SSL configuration for the session. All subsequent network requests will
     * use the new configuration. Existing network connections (such as WebSocket
     * connections) will not be terminated, but old sockets in the pool will not be
     * reused for new connections.
     */
    fun setSSLConfig(config: SSLConfigConfig): Unit

    /**
     * Sets the handler which can be used to override which USB classes are protected.
     * The return value for the handler is a string array of USB classes which should
     * be considered protected (eg not available in the renderer).  Valid values for
     * the array are:
     *
     * * `audio`
     * * `audio-video`
     * * `hid`
     * * `mass-storage`
     * * `smart-card`
     * * `video`
     * * `wireless`
     *
     * Returning an empty string array from the handler will allow all USB classes;
     * returning the passed in array will maintain the default list of protected USB
     * classes (this is also the default behavior if a handler is not defined). To
     * clear the handler, call `setUSBProtectedClassesHandler(null)`.
     */
    fun setUSBProtectedClassesHandler(handler: ((details: USBProtectedClassesHandlerHandlerDetails) -> js.core.ReadonlyArray<String>)): Unit

    fun setUSBProtectedClassesHandler(handler: (Nothing?)): Unit

    /**
     * Overrides the `userAgent` and `acceptLanguages` for this session.
     *
     * The `acceptLanguages` must a comma separated ordered list of language codes, for
     * example `"en-US,fr,de,ko,zh-CN,ja"`.
     *
     * This doesn't affect existing `WebContents`, and each `WebContents` can use
     * `webContents.setUserAgent` to override the session-wide user agent.
     */
    fun setUserAgent(userAgent: String, acceptLanguages: String = definedExternally): Unit

    /**
     * A `string[]` array which consists of all the known available spell checker
     * languages.  Providing a language code to the `setSpellCheckerLanguages` API that
     * isn't in this array will result in an error.
     *
     */
    val availableSpellCheckerLanguages: js.core.ReadonlyArray<String>

    /**
     * A `Cookies` object for this session.
     *
     */
    val cookies: Cookies

    /**
     * A `NetLog` object for this session.
     *
     */
    val netLog: NetLog

    /**
     * A `Protocol` object for this session.
     *
     */
    val protocol: Protocol

    /**
     * A `ServiceWorkers` object for this session.
     *
     */
    val serviceWorkers: ServiceWorkers

    /**
     * A `boolean` indicating whether builtin spell checker is enabled.
     */
    var spellCheckerEnabled: Boolean

    /**
     * A `string | null` indicating the absolute file system path where data for this
     * session is persisted on disk.  For in memory sessions this returns `null`.
     *
     */
    val storagePath: Any /* (string) | (null) */

    /**
     * A `WebRequest` object for this session.
     *
     */
    val webRequest: WebRequest

    companion object {
// Docs: https://electronjs.org/docs/api/session
        /**
         * A session instance from `partition` string. When there is an existing `Session`
         * with the same `partition`, it will be returned; otherwise a new `Session`
         * instance will be created with `options`.
         *
         * If `partition` starts with `persist:`, the page will use a persistent session
         * available to all pages in the app with the same `partition`. if there is no
         * `persist:` prefix, the page will use an in-memory session. If the `partition` is
         * empty then default session of the app will be returned.
         *
         * To create a `Session` with `options`, you have to ensure the `Session` with the
         * `partition` has never been used before. There is no way to change the `options`
         * of an existing `Session` object.
         */
        fun fromPartition(partition: String, options: FromPartitionOptions = definedExternally): Session

        /**
         * A `Session` object, the default session object of the app.
         */
        var defaultSession: Session
    }

}
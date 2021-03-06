package io.vertx.kotlin.ext.stomp

import io.vertx.ext.stomp.StompClientOptions
import io.vertx.core.net.JdkSSLEngineOptions
import io.vertx.core.net.JksOptions
import io.vertx.core.net.OpenSSLEngineOptions
import io.vertx.core.net.PemKeyCertOptions
import io.vertx.core.net.PemTrustOptions
import io.vertx.core.net.PfxOptions
import io.vertx.core.net.ProxyOptions

/**
 * A function providing a DSL for building [io.vertx.ext.stomp.StompClientOptions] objects.
 *
 * Options used to configure a STOMP client. As a STOMP client wraps a Net client, you can also configure the
 * underlying NET client.
 *
 * @param acceptedVersions  Sets the list of STOMP protocol versions accepted by the client. The list must be ordered from the lowest version to the highest. By default the following list is used: <code>1.0, 1.1, 1.2</code>
 * @param autoComputeContentLength  Sets whether or not the automatic computation of the <code>content-length</code> header is enabled. If enabled, the <code>content-length</code> header is set in all frame with a body that do not explicitly set the header. The option is enabled by default.
 * @param bypassHostHeader  Sets whether or not the <code>host</code> header must be dropped from the <code>CONNECT/STOMP</code> frame. Server may be picky about this header (such as RabbitMQ that does not support it). Options disabled by default.
 * @param connectTimeout 
 * @param crlPaths 
 * @param crlValues 
 * @param enabledCipherSuites 
 * @param enabledSecureTransportProtocols 
 * @param heartbeat  Sets the heartbeat configuration.
 * @param host  Sets the STOMP server host. <code>0.0.0.0</code> by default.
 * @param hostnameVerificationAlgorithm 
 * @param idleTimeout 
 * @param jdkSslEngineOptions 
 * @param keyStoreOptions 
 * @param localAddress 
 * @param logActivity 
 * @param login  Sets the login to use if the STOMP server is secured.
 * @param metricsName 
 * @param openSslEngineOptions 
 * @param passcode  Sets the passcode to use if the STOMP server is secured.
 * @param pemKeyCertOptions 
 * @param pemTrustOptions 
 * @param pfxKeyCertOptions 
 * @param pfxTrustOptions 
 * @param port  Sets the STOMP server port. <code>61613</code> by default.
 * @param proxyOptions 
 * @param receiveBufferSize 
 * @param reconnectAttempts 
 * @param reconnectInterval 
 * @param reuseAddress 
 * @param reusePort 
 * @param sendBufferSize 
 * @param soLinger 
 * @param ssl 
 * @param tcpCork 
 * @param tcpFastOpen 
 * @param tcpKeepAlive 
 * @param tcpNoDelay 
 * @param tcpQuickAck 
 * @param trafficClass 
 * @param trailingLine  Sets whether or not an empty line should be appended to the written STOMP frame. This option is disabled by default. This option is not compliant with the STOMP specification, and so is not documented on purpose.
 * @param trustAll 
 * @param trustStoreOptions 
 * @param useAlpn 
 * @param usePooledBuffers 
 * @param useStompFrame  Sets whether or not the connection is made using the <code>STOMP</code> command instead of the <code>CONNECT</code> command. The <code>STOMP</code> command has been introduced in the 1.2 version of the protocol to ease the network analysis (as <code>CONNECT</code> is also used by HTTP. To be compliant with server not implementing the 1.2 specification, this option should be disabled. This option is disabled by default.
 * @param virtualHost  Sets the virtual host that will be used as "host" header value in the `CONNECT` frame.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClientOptions original] using Vert.x codegen.
 */
fun StompClientOptions(
  acceptedVersions: Iterable<String>? = null,
  autoComputeContentLength: Boolean? = null,
  bypassHostHeader: Boolean? = null,
  connectTimeout: Int? = null,
  crlPaths: Iterable<String>? = null,
  crlValues: Iterable<io.vertx.core.buffer.Buffer>? = null,
  enabledCipherSuites: Iterable<String>? = null,
  enabledSecureTransportProtocols: Iterable<String>? = null,
  heartbeat: io.vertx.core.json.JsonObject? = null,
  host: String? = null,
  hostnameVerificationAlgorithm: String? = null,
  idleTimeout: Int? = null,
  jdkSslEngineOptions: io.vertx.core.net.JdkSSLEngineOptions? = null,
  keyStoreOptions: io.vertx.core.net.JksOptions? = null,
  localAddress: String? = null,
  logActivity: Boolean? = null,
  login: String? = null,
  metricsName: String? = null,
  openSslEngineOptions: io.vertx.core.net.OpenSSLEngineOptions? = null,
  passcode: String? = null,
  pemKeyCertOptions: io.vertx.core.net.PemKeyCertOptions? = null,
  pemTrustOptions: io.vertx.core.net.PemTrustOptions? = null,
  pfxKeyCertOptions: io.vertx.core.net.PfxOptions? = null,
  pfxTrustOptions: io.vertx.core.net.PfxOptions? = null,
  port: Int? = null,
  proxyOptions: io.vertx.core.net.ProxyOptions? = null,
  receiveBufferSize: Int? = null,
  reconnectAttempts: Int? = null,
  reconnectInterval: Long? = null,
  reuseAddress: Boolean? = null,
  reusePort: Boolean? = null,
  sendBufferSize: Int? = null,
  soLinger: Int? = null,
  ssl: Boolean? = null,
  tcpCork: Boolean? = null,
  tcpFastOpen: Boolean? = null,
  tcpKeepAlive: Boolean? = null,
  tcpNoDelay: Boolean? = null,
  tcpQuickAck: Boolean? = null,
  trafficClass: Int? = null,
  trailingLine: Boolean? = null,
  trustAll: Boolean? = null,
  trustStoreOptions: io.vertx.core.net.JksOptions? = null,
  useAlpn: Boolean? = null,
  usePooledBuffers: Boolean? = null,
  useStompFrame: Boolean? = null,
  virtualHost: String? = null): StompClientOptions = io.vertx.ext.stomp.StompClientOptions().apply {

  if (acceptedVersions != null) {
    this.setAcceptedVersions(acceptedVersions.toList())
  }
  if (autoComputeContentLength != null) {
    this.setAutoComputeContentLength(autoComputeContentLength)
  }
  if (bypassHostHeader != null) {
    this.setBypassHostHeader(bypassHostHeader)
  }
  if (connectTimeout != null) {
    this.setConnectTimeout(connectTimeout)
  }
  if (crlPaths != null) {
    for (item in crlPaths) {
      this.addCrlPath(item)
    }
  }
  if (crlValues != null) {
    for (item in crlValues) {
      this.addCrlValue(item)
    }
  }
  if (enabledCipherSuites != null) {
    for (item in enabledCipherSuites) {
      this.addEnabledCipherSuite(item)
    }
  }
  if (enabledSecureTransportProtocols != null) {
    for (item in enabledSecureTransportProtocols) {
      this.addEnabledSecureTransportProtocol(item)
    }
  }
  if (heartbeat != null) {
    this.setHeartbeat(heartbeat)
  }
  if (host != null) {
    this.setHost(host)
  }
  if (hostnameVerificationAlgorithm != null) {
    this.setHostnameVerificationAlgorithm(hostnameVerificationAlgorithm)
  }
  if (idleTimeout != null) {
    this.setIdleTimeout(idleTimeout)
  }
  if (jdkSslEngineOptions != null) {
    this.setJdkSslEngineOptions(jdkSslEngineOptions)
  }
  if (keyStoreOptions != null) {
    this.setKeyStoreOptions(keyStoreOptions)
  }
  if (localAddress != null) {
    this.setLocalAddress(localAddress)
  }
  if (logActivity != null) {
    this.setLogActivity(logActivity)
  }
  if (login != null) {
    this.setLogin(login)
  }
  if (metricsName != null) {
    this.setMetricsName(metricsName)
  }
  if (openSslEngineOptions != null) {
    this.setOpenSslEngineOptions(openSslEngineOptions)
  }
  if (passcode != null) {
    this.setPasscode(passcode)
  }
  if (pemKeyCertOptions != null) {
    this.setPemKeyCertOptions(pemKeyCertOptions)
  }
  if (pemTrustOptions != null) {
    this.setPemTrustOptions(pemTrustOptions)
  }
  if (pfxKeyCertOptions != null) {
    this.setPfxKeyCertOptions(pfxKeyCertOptions)
  }
  if (pfxTrustOptions != null) {
    this.setPfxTrustOptions(pfxTrustOptions)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (proxyOptions != null) {
    this.setProxyOptions(proxyOptions)
  }
  if (receiveBufferSize != null) {
    this.setReceiveBufferSize(receiveBufferSize)
  }
  if (reconnectAttempts != null) {
    this.setReconnectAttempts(reconnectAttempts)
  }
  if (reconnectInterval != null) {
    this.setReconnectInterval(reconnectInterval)
  }
  if (reuseAddress != null) {
    this.setReuseAddress(reuseAddress)
  }
  if (reusePort != null) {
    this.setReusePort(reusePort)
  }
  if (sendBufferSize != null) {
    this.setSendBufferSize(sendBufferSize)
  }
  if (soLinger != null) {
    this.setSoLinger(soLinger)
  }
  if (ssl != null) {
    this.setSsl(ssl)
  }
  if (tcpCork != null) {
    this.setTcpCork(tcpCork)
  }
  if (tcpFastOpen != null) {
    this.setTcpFastOpen(tcpFastOpen)
  }
  if (tcpKeepAlive != null) {
    this.setTcpKeepAlive(tcpKeepAlive)
  }
  if (tcpNoDelay != null) {
    this.setTcpNoDelay(tcpNoDelay)
  }
  if (tcpQuickAck != null) {
    this.setTcpQuickAck(tcpQuickAck)
  }
  if (trafficClass != null) {
    this.setTrafficClass(trafficClass)
  }
  if (trailingLine != null) {
    this.setTrailingLine(trailingLine)
  }
  if (trustAll != null) {
    this.setTrustAll(trustAll)
  }
  if (trustStoreOptions != null) {
    this.setTrustStoreOptions(trustStoreOptions)
  }
  if (useAlpn != null) {
    this.setUseAlpn(useAlpn)
  }
  if (usePooledBuffers != null) {
    this.setUsePooledBuffers(usePooledBuffers)
  }
  if (useStompFrame != null) {
    this.setUseStompFrame(useStompFrame)
  }
  if (virtualHost != null) {
    this.setVirtualHost(virtualHost)
  }
}


/* See LICENSE for licensing and NOTICE for copyright. */
package org.ldaptive.extended;

/**
 * Marker interface for ldap extended responses.
 *
 * @param  <T>  type of response value
 *
 * @author  Middleware Services
 */
public interface ExtendedResponse<T>
{


  /**
   * Returns the OID for this extended response. Response OIDs are optional and this value may be null.
   *
   * @return  oid
   */
  String getOID();


  /**
   * Initializes this response with the supplied BER encoded data.
   *
   * @param  encoded  BER encoded response
   */
  void decode(byte[] encoded);


  /**
   * Returns the response value associated with this extended operation or null if no value was generated by this
   * operation.
   *
   * @return  response value
   */
  T getValue();
}

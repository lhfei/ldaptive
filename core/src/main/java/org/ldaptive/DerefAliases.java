/*
  $Id$

  Copyright (C) 2003-2014 Virginia Tech.
  All rights reserved.

  SEE LICENSE FOR MORE INFORMATION

  Author:  Middleware Services
  Email:   middleware@vt.edu
  Version: $Revision$
  Updated: $Date$
*/
package org.ldaptive;

/**
 * Enum to define how aliases are dereferenced.
 *
 * @author  Middleware Services
 * @version  $Revision: 2885 $ $Date: 2014-02-05 16:28:49 -0500 (Wed, 05 Feb 2014) $
 */
public enum DerefAliases {

  /** never dereference aliases. */
  NEVER,

  /**
   * dereference when searching the entries beneath the starting point but not
   * when searching for the starting entry.
   */
  SEARCHING,

  /**
   * dereference when searching for the starting entry but not when searching
   * the entries beneath the starting point.
   */
  FINDING,

  /**
   * dereference when searching for the starting entry and when searching the
   * entries beneath the starting point.
   */
  ALWAYS
}
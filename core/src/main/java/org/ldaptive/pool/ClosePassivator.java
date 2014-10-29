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
package org.ldaptive.pool;

import org.ldaptive.Connection;

/**
 * Passivates a connection by attempting to close it.
 *
 * @author  Middleware Services
 * @version  $Revision: 2885 $ $Date: 2014-02-05 16:28:49 -0500 (Wed, 05 Feb 2014) $
 */
public class ClosePassivator implements Passivator<Connection>
{


  /** {@inheritDoc} */
  @Override
  public boolean passivate(final Connection c)
  {
    boolean success = false;
    if (c != null) {
      c.close();
      success = true;
    }
    return success;
  }
}
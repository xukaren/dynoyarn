/**
 * Copyright 2020 LinkedIn Corporation. All rights reserved. Licensed under the BSD-2 Clause license.
 * See LICENSE in the project root for license information.
 */
package com.linkedin.dynoyarn;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.security.UserGroupInformation;
import org.apache.hadoop.security.authorize.ImpersonationProvider;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * An impersonation provider which allows all impersonation. This is so the
 * user submitting the workload can impersonate fake users as specified in the
 * workload spec to submit apps to the fake RM as these users.
 */
public class AllowAllImpersonationProvider implements ImpersonationProvider {
  public static final Log LOG = LogFactory.getLog(AllowAllImpersonationProvider.class);

  @Override
  public void init(String configurationPrefix) {
    LOG.info("AllowAllImpersonationProvider init()");

  }

  @Override
  public void authorize(UserGroupInformation user, String remoteAddress) {
    LOG.info("AllowAllImpersonationProvider authorize() remoteaddress " + remoteAddress);
  }

  @Override
  public Configuration getConf() {
    return null;
  }

  @Override
  public void setConf(Configuration conf) {

  }
}

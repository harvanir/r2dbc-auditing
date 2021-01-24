package org.harvanir.r2dbc.auditing.support;

import java.time.temporal.TemporalAccessor;

/** @author Harvan Irsyadi */
public interface AuditableBeanWrapper {

  void setCreatedTime(TemporalAccessor time);

  void setUpdatedTime(TemporalAccessor time);
}

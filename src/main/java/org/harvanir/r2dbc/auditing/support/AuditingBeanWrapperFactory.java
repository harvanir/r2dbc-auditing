package org.harvanir.r2dbc.auditing.support;

import java.util.Optional;

/** @author Harvan Irsyadi */
class AuditingBeanWrapperFactory {

  public void populate(Class<?> clazz) {
    AnnotationAuditingMetadata.populate(clazz);
  }

  public Optional<AuditableBeanWrapper> getAuditableBeanWrapper(Object source) {
    AnnotationAuditingMetadata auditingBean =
        AnnotationAuditingMetadata.getMetadata(source.getClass());

    if (auditingBean != null) {
      return Optional.of(new ReflectionAuditingBeanWrapper(source, auditingBean));
    }

    return Optional.empty();
  }
}

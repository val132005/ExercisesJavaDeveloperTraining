package com.globant.training.sampledto.domain.mapper;

@FunctionalInterface
public interface EntityToDtoMapper<X,Y> {
  Y mapToDto(X x);
}

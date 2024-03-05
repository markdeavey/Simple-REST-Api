package com.mjdb.restful.service.impl;

import java.util.List;

import com.mjdb.restful.repo.IGenericRepo;
import com.mjdb.restful.service.ICRUD;

import lombok.NonNull;

public abstract class CRUDImpl<T, ID> implements ICRUD<T, ID> {

  protected abstract IGenericRepo<T, ID> getRepo();

  @Override
  public T create(@NonNull T t) throws Exception {
    return getRepo().save(t);
  }

  @Override
  public T update(@NonNull T t) throws Exception {
    return getRepo().save(t);
  }

  @Override
  public List<T> list() throws Exception {
    return getRepo().findAll();
  }

  @Override
  public T findById(@NonNull ID id) throws Exception {
    return getRepo().findById(id).orElse(null);
  }

  @Override
  public void delete(@NonNull ID id) throws Exception {
    getRepo().deleteById(id);
  }
}

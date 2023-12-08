
package com.walletstd22001.repository;

import com.walletstd22001.model.Transaction;

import java.util.List;

public interface CrudOperations<T, U> {
  void insert(T entity);

  List<T> getAll();

  T getById(U id);

  Transaction updateById(U id, T entityToUpdate);

  void updateById(String id, String password);
}

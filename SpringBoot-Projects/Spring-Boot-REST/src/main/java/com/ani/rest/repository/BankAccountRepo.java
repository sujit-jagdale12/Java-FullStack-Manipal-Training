package com.ani.rest.repository;

import java.util.Collection;

import com.ani.rest.domain.BankAccount;

public interface BankAccountRepo {
    BankAccount save(BankAccount account);

    Collection<BankAccount> findAll();

    void deleteId(Long id);

    void update(BankAccount domain);
}

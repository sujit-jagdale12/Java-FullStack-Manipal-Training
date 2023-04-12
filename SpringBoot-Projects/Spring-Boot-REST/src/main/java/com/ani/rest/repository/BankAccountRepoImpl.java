package com.ani.rest.repository;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.ani.rest.domain.BankAccount;

@Repository
public class BankAccountRepoImpl implements BankAccountRepo {
    private final HashMap<Long, BankAccount> accounts = new HashMap<>();
    
    @Override
    public BankAccount save(BankAccount account) {
        accounts.put(account.getId(), account);
        return accounts.get(account.getId());
    }

    @Override
    public Collection<BankAccount> findAll() {
       return accounts.values();
    }

    @Override
    public void deleteId(Long id) {
        accounts.remove(id);
    }

    @Override
    public void update(BankAccount domain) {
        accounts.put(domain.getId(), domain);
    }
}

package com.ani.rest.service;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ani.rest.dto.BankAccountDto;
import com.ani.rest.repository.BankAccountRepo;
import com.ani.rest.util.DmDtConverter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BankAccountServiceImpl implements BankAccountService{
    
    private final BankAccountRepo repository;
    private final DmDtConverter converter;

    @Override
    public Integer createNewAccount(BankAccountDto dto) {
        repository.save(converter.toDomain(dto));
        return 1;
    }

    @Override
    public Collection<BankAccountDto> listAllAccounts() {

        return repository.findAll()
                            .stream()
                            // .map(account -> converter.toDto(account))
                           .map(converter::toDto)
                           .collect(Collectors.toList());
    }

    @Override
    public Integer deleteAccount(Long id) {
        repository.deleteId(id);
        return 1;
    }

    @Override
    public Integer updateAccount(BankAccountDto requestDto) {
        repository.update(converter.toDomain(requestDto));
        return 1;
    }
}

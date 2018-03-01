package com.factura.luis.factura.models.dao;

import com.factura.luis.factura.models.entity.Cliente;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long> {

}

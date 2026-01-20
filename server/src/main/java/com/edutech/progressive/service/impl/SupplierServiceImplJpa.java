package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.edutech.progressive.entity.Supplier;
import com.edutech.progressive.repository.SupplierRepository;
import com.edutech.progressive.service.SupplierService;


public class SupplierServiceImplJpa implements SupplierService {

    // @Autowired
    // private SupplierRepository supplierRepository;



    public List<Supplier> getAllSuppliers() throws SQLException{
        return List.of();
    }

    public int addSupplier(Supplier supplier) throws SQLException{
        return -1;
    }

    public List<Supplier> getAllSuppliersSortedByName() throws SQLException{
                return List.of();

    }

    public void updateSupplier(Supplier supplier) throws SQLException{
    }

    public void deleteSupplier(int supplierId) throws SQLException{
    }

    public Supplier getSupplierById(int supplierId) throws SQLException{
        return null;
    }
}
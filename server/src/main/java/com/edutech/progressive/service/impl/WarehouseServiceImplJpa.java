package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.edutech.progressive.entity.Warehouse;
import com.edutech.progressive.service.WarehouseService;

public class WarehouseServiceImplJpa  implements WarehouseService{

    @Override
    public List<Warehouse> getAllWarehouses() throws SQLException {
                return List.of();

    }

    @Override
    public int addWarehouse(Warehouse warehouse) throws SQLException {
        return -1;
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() throws SQLException {
                return List.of();

    }


    public void updateWarehouse(Warehouse warehouse) throws SQLException{
    }

    public void deleteWarehouse(int warehouseId) throws SQLException{
    }

    public Warehouse getWarehouseById(int warehouseId) throws SQLException{
        return null;
    }

    //Do not implement these methods in WarehouseServiceImplArraylist.java and WarehouseServiceImplJdbc.java class
    public List<Warehouse> getWarehouseBySupplier(int supplierId) throws SQLException{
        return null;
    }
    

}
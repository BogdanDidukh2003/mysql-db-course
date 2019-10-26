package ua.lviv.iot.service;

import ua.lviv.iot.DAO.implementation.CityDAO;
import ua.lviv.iot.model.CityEntity;

import java.util.List;

public class CityService {
    public List<CityEntity> findAll() throws Exception {
        return new CityDAO().findAll();
    }

    public CityEntity findById(String id) throws Exception {
        return new CityDAO().findById(id);
    }

    public void create(CityEntity entity) throws Exception {
        new CityDAO().create(entity);
    }

    public void update(CityEntity entity) throws Exception {
        new CityDAO().update(entity);
    }

    public void delete(String id) throws Exception {
        new CityDAO().delete(id);
    }
}

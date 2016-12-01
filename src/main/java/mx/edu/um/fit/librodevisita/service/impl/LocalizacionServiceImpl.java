/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.um.fit.librodevisita.service.impl;

import java.util.List;
import mx.edu.um.fit.librodevisita.dao.LocalizacionDao;
import mx.edu.um.fit.librodevisita.model.Localizacion;
import mx.edu.um.fit.librodevisita.service.BaseService;
import mx.edu.um.fit.librodevisita.service.LocalizacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LidiaE_18
 */
@Service
public class LocalizacionServiceImpl extends BaseService implements LocalizacionService{
 
    @Autowired
    private LocalizacionDao localizacionDao;
    
    @Override
    public List<Localizacion> getAll(){
        return localizacionDao.getLocalizaciones(new Localizacion());
    }
    
    @Override
    public Localizacion getById(Long id){
        return localizacionDao.get(id);
    }
    
    @Override
    public Localizacion save(Localizacion localizacion){
        return localizacionDao.save(localizacion);
    }

    @Override
    public Localizacion update(Localizacion localizacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Localizacion delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

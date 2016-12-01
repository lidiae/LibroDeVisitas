/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.um.fit.librodevisita.dao.impl;

import java.util.List;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import mx.edu.um.fit.librodevisita.dao.BaseDao;
import mx.edu.um.fit.librodevisita.dao.LocalizacionDao;
import mx.edu.um.fit.librodevisita.model.Localizacion;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author LidiaE_18
 */
@Repository
@Transactional
public class LocalizacionDaoHibernate extends BaseDao implements LocalizacionDao{
    
    @Override
    public List<Localizacion> getLocalizaciones(Localizacion localizacion){
        CriteriaBuilder criteriaBuilder = currentSession().getCriteriaBuilder();
        CriteriaQuery<Localizacion> criteriaQuery= criteriaBuilder.createQuery(Localizacion.class);
        Root<Localizacion> localizacionRoot = criteriaQuery.from(Localizacion.class);
        criteriaQuery.select(localizacionRoot);
        TypedQuery<Localizacion> typedQuery = currentSession().createQuery(criteriaQuery);
        List<Localizacion> localizacionesList = typedQuery.getResultList();
        return localizacionesList;
    }
    
    @Override
    public Localizacion get(Long id){
        Localizacion localizacion = currentSession().get(Localizacion.class, id);
        return localizacion;
    }

    @Override
    public Localizacion save(Localizacion localizacion) {
        return localizacion; //To change body of generated methods, choose Tools | Templates.
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

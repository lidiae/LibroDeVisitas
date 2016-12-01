/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.um.fit.librodevisita.service;

import java.util.List;
import mx.edu.um.fit.librodevisita.model.Localizacion;

/**
 *
 * @author LidiaE_18
 */
public interface LocalizacionService {
    public List<Localizacion> getAll();
    public Localizacion getById(Long id);
    public Localizacion save(Localizacion localizacion);
    public Localizacion update(Localizacion localizacion);
    public Localizacion delete(Long id);
    
}

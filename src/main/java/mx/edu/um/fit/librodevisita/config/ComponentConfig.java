/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.um.fit.librodevisita.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @author LidiaE_18
 */
@Configuration
@ComponentScan(basePackages = "mx.edu.um.fit.librodevisita")
@PropertySource("file:${user.home}/.LibroDeVisita.properties")
public class ComponentConfig {
    
}

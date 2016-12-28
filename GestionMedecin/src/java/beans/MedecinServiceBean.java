/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import crud.MedecinService;
import entities.Medecin;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author maxim
 */
@Stateless
public class MedecinServiceBean{
    @PersistenceContext (unitName = "GestionMedecinPU")
    private EntityManager em;
    
    public void persist(Medecin medecin) {
        em.persist(medecin);
    }
    
}

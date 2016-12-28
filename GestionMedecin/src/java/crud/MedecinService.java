/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import entities.Medecin;
import javax.ejb.Local;

/**
 *
 * @author maxim
 */
@Local
public interface MedecinService {
    Medecin createOrUpdate(Medecin medecin);
}

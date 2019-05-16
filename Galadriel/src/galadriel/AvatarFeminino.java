/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galadriel;

/**
 *
 * @author Camil
 */
public class AvatarFeminino {
    private String nomeAvatar;
    private int idadeAvatar;
    private double alturaAvatar;
    private double pesoAvatar;
    
    public AvatarFeminino(String nomeAvatar, int idadeAvatar, double alturaAvatar, double pesoAvatar) {
        this.nomeAvatar = nomeAvatar;
        this.idadeAvatar = idadeAvatar;
        this.alturaAvatar = alturaAvatar;
        this.pesoAvatar = pesoAvatar;
    }
    
    public String getNomeAvatar() {
        return nomeAvatar;
    }
    
    public int getIdadeAvatr() {
        return idadeAvatar;
    }
    
    public double getAlturaAvatar() {
        return alturaAvatar;
    }
    
    public double getPesoAvatar() {
        return pesoAvatar;
    }

    @Override
    public String toString() {
        return "Nome: " + nomeAvatar
                + ", Idade: " + idadeAvatar 
                + ", Altura: " + alturaAvatar 
                + ", Peso: " + pesoAvatar;
    }
    
}

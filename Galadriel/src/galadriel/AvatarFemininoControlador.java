/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galadriel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Camil
 */
public class AvatarFemininoControlador {
    private AvatarFemininoView avatarFemininoView;
    private ArrayList<AvatarFeminino> listaAvatarFemininos;
    private AvatarFemininoBanco avatarFemininoBanco;
    
    protected class InserirBancoAvatarFemininoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            AvatarFeminino af = avatarFemininoView.obterAvatarFemininoDigitado();
            avatarFemininoBanco.inserirAvatarFeminino(af);
        }
    }
    protected class LimparAvatarFemininosListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            listaAvatarFemininos.clear();
            avatarFemininoView.limparLista();
        }
    }
    protected class CarregarAvatarFemininosListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            listaAvatarFemininos.clear();
            avatarFemininoBanco.recuperarAvatarFemininos(listaAvatarFemininos);
            avatarFemininoView.limparLista();
            Iterator<AvatarFeminino> it = listaAvatarFemininos.iterator();
            while(it.hasNext()) {
                AvatarFeminino af = it.next();
                avatarFemininoView.inserelista(af);
            }
        }
    }
    public void executar() {
        avatarFemininoView = new AvatarFemininoView();
        listaAvatarFemininos = new ArrayList<AvatarFeminino>();
        avatarFemininoBanco = new AvatarFemininoBanco();
        
        avatarFemininoView.addInserirBancoListener    (new InserirBancoAvatarFemininoListener());
        avatarFemininoView.addLimparListaListener     (new LimparAvatarFemininosListener());
        avatarFemininoView.addCarregarBancoListener   (new CarregarAvatarFemininosListener());
                
        avatarFemininoView.setVisible(true);
    }
}

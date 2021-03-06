/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokidix;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.io.FileNotFoundException;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.Scrollable;
import pokidix.models.Pokemon;

/**
 *
 * @author TOSHIBA
 */
public class evolutionPanel extends PokeGrid implements ListCellRenderer<Pokemon>, Scrollable {

    /**
     * Creates new form evolutionPanel
     *
     * @throws java.io.FileNotFoundException
     */
    public evolutionPanel() throws FileNotFoundException {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        artworkLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();

        nameLabel.setText("nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(artworkLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(artworkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel artworkLabel;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setPokemon(Pokemon pokemon) {
        artworkLabel.setIcon(pokemon.getArtwork());
        nameLabel.setText(pokemon.getName());
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Pokemon> jlist, Pokemon e, int i, boolean isSelected, boolean cellHasFocus) {
        setPokemon(e);
        return this;
    }

    @Override
    public Dimension getPreferredScrollableViewportSize() {
        System.out.println(super.getPreferredSize());
        return super.getPreferredSize();
    }

    @Override
    public int getScrollableUnitIncrement(Rectangle rctngl, int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getScrollableBlockIncrement(Rectangle rctngl, int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getScrollableTracksViewportWidth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getScrollableTracksViewportHeight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

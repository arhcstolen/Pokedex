/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokidix;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import pokidix.models.PokemonParser;
import pokidix.models.Pokemon;

/**
 *
 * @author TOSHIBA
 */
public class Pokedex extends javax.swing.JFrame {

    AbstractListModel listModel;
    
    ArrayList<pokidix.models.Pokemon> newPokemonList;

    /**
     * Creates new form Pokedex
     *
     * @throws java.io.FileNotFoundException
     */
    public Pokedex() throws FileNotFoundException {

        PokeGrid pokeGrid = new PokeGrid();

        try {
            initComponents();
        } catch (ClassCastException ex) {

        }
        
        newPokemonList = (ArrayList<pokidix.models.Pokemon>) PokemonParser.getAllPokemons();

        listModel = new javax.swing.AbstractListModel() {
            //ArrayList<Pokemon> data = new JsonToPokemon().crearPokemon();

            @Override
            public int getSize() {
                return newPokemonList.size();
            }

            @Override
            public Object getElementAt(int i) {
                return newPokemonList.get(i);
            }
        };

        pokemonList.setModel(listModel);
        pokemonList.setLayoutOrientation(0);
        pokemonList.setCellRenderer(new PokeView());
        pokemonList.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent lse) {
                pokeGrid.setPokemon((Pokemon) pokemonList.getSelectedValue());
            }
        });

        pokeGrid.setPokemon((pokidix.models.Pokemon) listModel.getElementAt(0));

        jScrollPane2.setViewportView(pokeGrid);
        jScrollPane2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        pokemonContainer = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pokemonList = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        titleLabel = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();

        jLabel9.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout pokemonContainerLayout = new javax.swing.GroupLayout(pokemonContainer);
        pokemonContainer.setLayout(pokemonContainerLayout);
        pokemonContainerLayout.setHorizontalGroup(
            pokemonContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        pokemonContainerLayout.setVerticalGroup(
            pokemonContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pokemonList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(pokemonList);

        titleLabel.setIcon(new ImageIcon(new File("resources/logo.png").getAbsolutePath()));

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(71, 71, 71)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pokemonContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(pokemonContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        try {
            pokemonList.setModel(createCurrentModel(searchField.getText()));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pokedex.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pokedex.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pokedex.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pokedex.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pokedex.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Pokedex().setVisible(true);

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Pokedex.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pokemonContainer;
    private javax.swing.JList pokemonList;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    public AbstractListModel createCurrentModel(String name) throws FileNotFoundException {
        AbstractListModel listModel2 = new javax.swing.AbstractListModel() {
            ArrayList<Pokemon> evoluciones = obtainPokemonByName(name);

            public ArrayList<Pokemon> obtainPokemonByName(String name) throws FileNotFoundException {
                //ArrayList<Pokemon> data = new JsonToPokemon().crearPokemon();
                ArrayList<pokidix.models.Pokemon> data = (ArrayList<pokidix.models.Pokemon>) PokemonParser.getAllPokemons();
                ArrayList<Pokemon> pokes = new ArrayList();

                for (Pokemon data1 : data) {
                    if (data1.getName().toLowerCase().contains(name.toLowerCase())) {
                        pokes.add(data1);
                    }
                }
                
                if (pokes.isEmpty()) {
                    JOptionPane.showMessageDialog(Pokedex.this, "No se encontraron resultados", "Resultados de la búsqueda", JOptionPane.PLAIN_MESSAGE);
                    return data;
                }

                return pokes;
            }

            @Override
            public int getSize() {
                return evoluciones.size();
            }

            @Override
            public Object getElementAt(int i) {
                return evoluciones.get(i);
            }
        };
        return listModel2;
    }
}

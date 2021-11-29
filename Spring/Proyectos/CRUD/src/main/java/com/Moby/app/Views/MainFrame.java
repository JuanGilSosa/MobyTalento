package com.Moby.app.Views;

import org.springframework.stereotype.Service;
import javax.swing.table.DefaultTableModel;

import com.Moby.app.Controller.ContextProvider;
import com.Moby.app.DAO.ClientFactory;
import com.Moby.app.Model.Client;

@Service()
public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        initDataJTable();
    }

    private void initDataJTable(){
        try{
            ClientFactory clnFactory = (ClientFactory)ContextProvider.GetBean("clientFactory");
            java.util.List<com.Moby.app.Model.Client> list = clnFactory.GetAll();
            list.forEach(
                c -> this.model.addRow(
                    new Object[]{
                        c.getId(), 
                        c.getName()
                    }
                )
            );
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        } 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonAdd = new javax.swing.JButton();
        jTextFieldName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldSearch = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldMid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldMname = new javax.swing.JTextField();
        jButtonUpd = new javax.swing.JButton();
        jButtonDel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldMid.setEnabled(false);

        jButtonAdd.setText("Agregar");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jLabel1.setText("NOMBRE:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] { },
            new String [] { "ID", "NOMBRE" }
        ));
        
        jScrollPane1.setViewportView(jTable1);
        
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });

        //Seteo de model acerca de mi tabla principal que contendra inforamcion relevante
        this.model = (DefaultTableModel)this.jTable1.getModel();

        jButtonSearch.setText("Buscar");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Perfil"));

        jLabel2.setText("ID:");

        jLabel3.setText("NOMBRE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldMid)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextFieldMname))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldMid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldMname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonUpd.setText("MODIFICAR");
        jButtonUpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdActionPerformed(evt);
            }
        });
        jButtonDel.setText("ELIMINAR");
        jButtonDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelActionPerformed(evt);
            }
        });
        jLabel4.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CRUD :: CLIENTE ::");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonUpd, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonDel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldName)
                            .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSearch))))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAdd)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonUpd)
                            .addComponent(jButtonDel)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        
    
    /**
     * <p> <b> Descripcion : </b> Una vez que obtiene el factory, se encarga de agregar 
     * al cliente. Procediendo a obtener el ID para ser agregado, con junto al nombre,
     * a la tabla 
     * @param evt 
    */
    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if(!this.jTextFieldName.getText().isEmpty()){
            try{
                ClientFactory clnFactory = (ClientFactory)ContextProvider.GetBean("clientFactory");
                
                Client client = new Client();
                client.setName(this.jTextFieldName.getText());
                
                int LAST_ID = clnFactory.Insert(client);
                if(LAST_ID != -1){
                    this.model.addRow(
                        new Object[]{
                            LAST_ID,
                            client.getName()
                        }
                    );
                }
            }catch(RuntimeException e){System.out.println(e.getMessage());}
            jTextFieldName.setText("");
        }
    }                                          
    /**
     * <p> <b> Descripcion : </b> Una vez que obtiene el factory, se encarga de modificar 
     * al cliente si hay modificaciones en su nombre.
     * Luego de eso, obtiene la row para hacer el cambio en la jTable que tiene los registros
     * Especifico que es 1 en setValueAt(c.getNombre(), row, 1);
     *                                                       ^<-Indicando que es la col{nombre}
     * @param evt 
    */
    private void jButtonUpdActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(!temp.isEmpty()){
            if(!jTextFieldMname.getText().equals(temp)){
                ClientFactory clnFactory = (ClientFactory)ContextProvider.GetBean("clientFactory");
                
                Client c = new Client();
                c.setName(jTextFieldMname.getText());
                c.setId(Integer.valueOf(jTextFieldMid.getText()));
                clnFactory.Modify(c);
                
                int row = jTable1.getSelectedRow();
                model.setValueAt(c.getName(), row, 1); 
            }
        }
    }                                        

    private void jButtonDelActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(!jTextFieldMid.getText().isEmpty()){
            int row = jTable1.getSelectedRow();

            ClientFactory clnFactory = (ClientFactory)ContextProvider.GetBean("clientFactory");
            clnFactory.Delete( Integer.valueOf(jTextFieldMid.getText()) );
            
            jTextFieldMid.setText("");
            jTextFieldMname.setText("");
            temp = "";

            model.removeRow(row);   
        }
    }                                        

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if(!jTextFieldSearch.getText().isEmpty()){
            String idTextField = jTextFieldSearch.getText();
            ClientFactory clnFactory = (ClientFactory)ContextProvider.GetBean("clientFactory");
            Client client = clnFactory.Consult(Integer.parseInt(idTextField));
            
            boolean flag = false;
            if(client != null){
                /*
                    Cumplo con esta regla, de resaltar la posicion de donde
                    esta mi cliente en la tabla para por si quiere ser 
                    eliminado, se pueda eliminar sobre la tabla o si es
                    modificado, se modifique los valores sobre la misma.
                */
                for(int row = 0; row<jTable1.getRowCount() && (!flag) ;row++){
                    if(jTable1.getValueAt(row, 0).toString().equals(String.valueOf(client.getId()))){
                        jTable1.getSelectionModel().setSelectionInterval(row, row);
                        jTextFieldMid.setText( String.valueOf( jTable1.getValueAt(row, 0) ) );
                        jTextFieldMname.setText( String.valueOf( jTable1.getValueAt(row, 1) ) );
                        flag = true;
                    }
                }
            }
        }
    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt){
        if(evt.getClickCount() == 1){
            int row = jTable1.getSelectedRow();
            if(row != -1){
                this.jTextFieldMid.setText(String.valueOf(jTable1.getValueAt(row, 0)) );
                this.jTextFieldMname.setText(String.valueOf(jTable1.getValueAt(row, 1)) );     
                this.temp = this.jTextFieldMname.getText();           
            }
        }
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonUpd;
    private javax.swing.JButton jButtonDel;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JTextField jTextFieldMid;
    private javax.swing.JTextField jTextFieldMname;
    // End of variables declaration                   
    private DefaultTableModel model;
    //Definida para mantener nuestro nombre del cliente en caso de ser modificada
    private String temp; 
}

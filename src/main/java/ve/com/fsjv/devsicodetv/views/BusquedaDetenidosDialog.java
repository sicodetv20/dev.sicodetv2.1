/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ve.com.fsjv.devsicodetv.views;

/**
 *
 * @author FAMILIA-SJ
 */
public class BusquedaDetenidosDialog extends javax.swing.JDialog {

    /**
     * Creates new form BusquedaDetenidosDialog
     */
    public BusquedaDetenidosDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        panOpcionesBusqueda = new javax.swing.JPanel();
        radCedulaIdentidad = new javax.swing.JRadioButton();
        radNombres = new javax.swing.JRadioButton();
        radApellidos = new javax.swing.JRadioButton();
        radNombresApellidos = new javax.swing.JRadioButton();
        radAlias = new javax.swing.JRadioButton();
        radPasaporte = new javax.swing.JRadioButton();
        radNroControl = new javax.swing.JRadioButton();
        radRasgoFisico = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtvalor = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        panResultados = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabResultados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panOpcionesBusqueda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccione el metodo de busqueda", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        buttonGroup1.add(radCedulaIdentidad);
        radCedulaIdentidad.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        radCedulaIdentidad.setText("Cedula de Identidad");

        buttonGroup1.add(radNombres);
        radNombres.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        radNombres.setText("Nombre(s)");

        buttonGroup1.add(radApellidos);
        radApellidos.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        radApellidos.setText("Apellido(s)");

        buttonGroup1.add(radNombresApellidos);
        radNombresApellidos.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        radNombresApellidos.setText("Nombre(s) y Apellido(s)");

        buttonGroup1.add(radAlias);
        radAlias.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        radAlias.setText("Alias");

        buttonGroup1.add(radPasaporte);
        radPasaporte.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        radPasaporte.setText("Nro. de Pasaporte");

        buttonGroup1.add(radNroControl);
        radNroControl.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        radNroControl.setText("Nro. de Control");

        buttonGroup1.add(radRasgoFisico);
        radRasgoFisico.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        radRasgoFisico.setText("Rasgo Fisico o Seña Particular");

        javax.swing.GroupLayout panOpcionesBusquedaLayout = new javax.swing.GroupLayout(panOpcionesBusqueda);
        panOpcionesBusqueda.setLayout(panOpcionesBusquedaLayout);
        panOpcionesBusquedaLayout.setHorizontalGroup(
            panOpcionesBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOpcionesBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panOpcionesBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radCedulaIdentidad)
                    .addComponent(radNombres)
                    .addComponent(radApellidos)
                    .addComponent(radNombresApellidos))
                .addGap(54, 54, 54)
                .addGroup(panOpcionesBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radRasgoFisico)
                    .addComponent(radNroControl)
                    .addComponent(radPasaporte)
                    .addComponent(radAlias))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panOpcionesBusquedaLayout.setVerticalGroup(
            panOpcionesBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOpcionesBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panOpcionesBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radCedulaIdentidad)
                    .addComponent(radAlias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panOpcionesBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radNombres)
                    .addComponent(radPasaporte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panOpcionesBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radApellidos)
                    .addComponent(radNroControl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panOpcionesBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radNombresApellidos)
                    .addComponent(radRasgoFisico))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel1.setText("Valor:");

        txtvalor.setEnabled(false);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ve/com/fsjv/devsicodetv/utilitarios/imgs/find_small.png"))); // NOI18N
        btnBuscar.setToolTipText("Iniciar Busqueda");
        btnBuscar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBuscar.setEnabled(false);

        btnReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ve/com/fsjv/devsicodetv/utilitarios/imgs/update_small.png"))); // NOI18N
        btnReiniciar.setToolTipText("Resetear Busqueda");
        btnReiniciar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReiniciar.setEnabled(false);

        panResultados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados de la Busqueda", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        tabResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Codigo Interno", "Cedula de Identidad", "Nombres y Apellidos", "Estatus de Control"
            }
        ));
        tabResultados.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tabResultados);
        tabResultados.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout panResultadosLayout = new javax.swing.GroupLayout(panResultados);
        panResultados.setLayout(panResultadosLayout);
        panResultadosLayout.setHorizontalGroup(
            panResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        panResultadosLayout.setVerticalGroup(
            panResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panOpcionesBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtvalor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panOpcionesBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtvalor, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                    .addComponent(btnReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panOpcionesBusqueda;
    private javax.swing.JPanel panResultados;
    private javax.swing.JRadioButton radAlias;
    private javax.swing.JRadioButton radApellidos;
    private javax.swing.JRadioButton radCedulaIdentidad;
    private javax.swing.JRadioButton radNombres;
    private javax.swing.JRadioButton radNombresApellidos;
    private javax.swing.JRadioButton radNroControl;
    private javax.swing.JRadioButton radPasaporte;
    private javax.swing.JRadioButton radRasgoFisico;
    private javax.swing.JTable tabResultados;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getBtnBuscar() {
        return btnBuscar;
    }

    public void setBtnBuscar(javax.swing.JButton btnBuscar) {
        this.btnBuscar = btnBuscar;
    }

    public javax.swing.JButton getBtnReiniciar() {
        return btnReiniciar;
    }

    public void setBtnReiniciar(javax.swing.JButton btnReiniciar) {
        this.btnReiniciar = btnReiniciar;
    }

    public javax.swing.ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public void setButtonGroup1(javax.swing.ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public javax.swing.JPanel getPanOpcionesBusqueda() {
        return panOpcionesBusqueda;
    }

    public void setPanOpcionesBusqueda(javax.swing.JPanel panOpcionesBusqueda) {
        this.panOpcionesBusqueda = panOpcionesBusqueda;
    }

    public javax.swing.JPanel getPanResultados() {
        return panResultados;
    }

    public void setPanResultados(javax.swing.JPanel panResultados) {
        this.panResultados = panResultados;
    }

    public javax.swing.JRadioButton getRadAlias() {
        return radAlias;
    }

    public void setRadAlias(javax.swing.JRadioButton radAlias) {
        this.radAlias = radAlias;
    }

    public javax.swing.JRadioButton getRadApellidos() {
        return radApellidos;
    }

    public void setRadApellidos(javax.swing.JRadioButton radApellidos) {
        this.radApellidos = radApellidos;
    }

    public javax.swing.JRadioButton getRadCedulaIdentidad() {
        return radCedulaIdentidad;
    }

    public void setRadCedulaIdentidad(javax.swing.JRadioButton radCedulaIdentidad) {
        this.radCedulaIdentidad = radCedulaIdentidad;
    }

    public javax.swing.JRadioButton getRadNombres() {
        return radNombres;
    }

    public void setRadNombres(javax.swing.JRadioButton radNombres) {
        this.radNombres = radNombres;
    }

    public javax.swing.JRadioButton getRadNombresApellidos() {
        return radNombresApellidos;
    }

    public void setRadNombresApellidos(javax.swing.JRadioButton radNombresApellidos) {
        this.radNombresApellidos = radNombresApellidos;
    }

    public javax.swing.JRadioButton getRadNroControl() {
        return radNroControl;
    }

    public void setRadNroControl(javax.swing.JRadioButton radNroControl) {
        this.radNroControl = radNroControl;
    }

    public javax.swing.JRadioButton getRadPasaporte() {
        return radPasaporte;
    }

    public void setRadPasaporte(javax.swing.JRadioButton radPasaporte) {
        this.radPasaporte = radPasaporte;
    }

    public javax.swing.JRadioButton getRadRasgoFisico() {
        return radRasgoFisico;
    }

    public void setRadRasgoFisico(javax.swing.JRadioButton radRasgoFisico) {
        this.radRasgoFisico = radRasgoFisico;
    }

    public javax.swing.JTable getTabResultados() {
        return tabResultados;
    }

    public void setTabResultados(javax.swing.JTable tabResultados) {
        this.tabResultados = tabResultados;
    }

    public javax.swing.JTextField getTxtvalor() {
        return txtvalor;
    }

    public void setTxtvalor(javax.swing.JTextField txtvalor) {
        this.txtvalor = txtvalor;
    }
}

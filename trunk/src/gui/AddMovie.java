package gui;

import domain.Movie;
import domain.controller.Controller;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AddMovie extends JFrame {
    private Controller _controller;
    private JFrame _parent;

    public AddMovie(Controller controller, JFrame parent) {
        this._controller = controller;
        this._parent = parent;
	initComponents();
        initId();
        validateFields();
    }
    @Override
    public void setVisible(boolean b){
        GeneralJFrame.setFrameAtCenter(this);
        super.setVisible(b);
    }
    
    private void initId(){
        int[] moviesId = _controller.getMoviesIds();
        if (moviesId.length == 0){
            this.jTextFieldID.setText("1");
        } else{
            int biggestId = moviesId[0];
            for (int i = 0; i < moviesId.length; i++) {
                if (moviesId[i] > biggestId){
                    biggestId = moviesId[i];
                }
            }
            biggestId += 1;
            this.jTextFieldID.setText("" + biggestId);
        }
    }
    
    private void validateFields(){
        int duration = getIdAsInteger();
        System.out.println("duration: "+duration);
        if ((!this.jTextFieldMovieName.getText().equals("")) &&
                (!this.jTextFieldDirector.getText().equals("")) &&
                (!this.jTextFieldCategory.getText().equals("")) &&
                (!this.jTextFieldActor1.getText().equals("")) &&
                (!this.jTextFieldActor2.getText().equals("")) &&
                (!this.jTextFieldActor3.getText().equals("")) &&
                (duration >= 0) && (duration <= 999)){
            enableSave(true);
        } else{
            enableSave(false);
        }
    }
    private int getIdAsInteger(){
        int duration = -1;
        try{
            System.out.println("jFormattedTextFieldDuration.getText() "+jFormattedTextFieldDuration.getText());
            duration = Integer.parseInt(this.jFormattedTextFieldDuration.getText());
        } catch (NumberFormatException e) {System.out.println("what???");}
        return duration;
    }

    private void enableSave(boolean b){
        this.jButtonSaveAndExit.setEnabled(b);
        this.jButtonSaveAndAddAnotherMovie.setEnabled(b);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelAddMovie = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldMovieName = new javax.swing.JTextField();
        jButtonSaveAndExit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxCountry = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldActor1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCategory = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jComboBoxYear = new javax.swing.JComboBox();
        jButtonSaveAndAddAnotherMovie = new javax.swing.JButton();
        jButtonExitNoSaving = new javax.swing.JButton();
        jTextFieldDirector = new javax.swing.JTextField();
        jTextFieldActor2 = new javax.swing.JTextField();
        jTextFieldActor3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextFieldDuration = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(gui.GeneralJFrame.backgroundColor);

        jPanel2.setBackground(GeneralJFrame.backgroundColor);
        jPanel2.setForeground(new java.awt.Color(212, 208, 200));

        jPanel1.setBackground(GeneralJFrame.backgroundColor);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabelAddMovie.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabelAddMovie.setForeground(GeneralJFrame.headerColor);
        jLabelAddMovie.setText("Add Movie");

        jLabel3.setForeground(GeneralJFrame.regularFontColor);
        jLabel3.setText("ID: *");

        jLabel4.setForeground(GeneralJFrame.regularFontColor);
        jLabel4.setText("Name: *");

        jTextFieldMovieName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMovieNameActionPerformed(evt);
            }
        });
        jTextFieldMovieName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMovieNameKeyReleased(evt);
            }
        });

        jButtonSaveAndExit.setText("Save & Exit");
        jButtonSaveAndExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveAndExitActionPerformed(evt);
            }
        });

        jLabel6.setForeground(GeneralJFrame.regularFontColor);
        jLabel6.setText("Country:");

        jLabel7.setForeground(GeneralJFrame.regularFontColor);
        jLabel7.setText("Year:");

        jComboBoxCountry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Israel", "Turkey", "Irak", "USA", "Russia" }));

        jLabel8.setForeground(GeneralJFrame.regularFontColor);
        jLabel8.setText("Actors: *");

        jLabel9.setForeground(GeneralJFrame.regularFontColor);
        jLabel9.setText("Category: *");

        jTextFieldActor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldActor1ActionPerformed(evt);
            }
        });
        jTextFieldActor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldActor1KeyReleased(evt);
            }
        });

        jLabel2.setForeground(GeneralJFrame.regularFontColor);
        jLabel2.setText("* Obligatory Field");

        jLabel5.setForeground(GeneralJFrame.regularFontColor);
        jLabel5.setText("Director: *");

        jTextFieldCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCategoryActionPerformed(evt);
            }
        });
        jTextFieldCategory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCategoryKeyReleased(evt);
            }
        });

        jLabel10.setForeground(GeneralJFrame.regularFontColor);
        jLabel10.setText("Duration: *");

        jTextFieldID.setEditable(false);

        jComboBoxYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));

        jButtonSaveAndAddAnotherMovie.setText("Save & Add Another Movie");
        jButtonSaveAndAddAnotherMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveAndAddAnotherMovieActionPerformed(evt);
            }
        });

        jButtonExitNoSaving.setText("Exit (No Saving)");
        jButtonExitNoSaving.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitNoSavingActionPerformed(evt);
            }
        });

        jTextFieldDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDirectorActionPerformed(evt);
            }
        });
        jTextFieldDirector.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDirectorKeyReleased(evt);
            }
        });

        jTextFieldActor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldActor2ActionPerformed(evt);
            }
        });
        jTextFieldActor2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldActor2KeyReleased(evt);
            }
        });

        jTextFieldActor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldActor3ActionPerformed(evt);
            }
        });
        jTextFieldActor3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldActor3KeyReleased(evt);
            }
        });

        jLabel1.setText("(in minutes with exactly 3 digits.");

        try {
            jFormattedTextFieldDuration.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDurationActionPerformed(evt);
            }
        });
        jFormattedTextFieldDuration.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFormattedTextFieldDurationKeyReleased(evt);
            }
        });

        jLabel11.setText("Example: 80 min = 080)");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(jLabelAddMovie))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel3)
                            .add(jLabel4)
                            .add(jLabel9)
                            .add(jLabel8)
                            .add(jLabel7)
                            .add(jLabel6)
                            .add(jLabel5))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jTextFieldMovieName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jTextFieldCategory, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                            .add(jTextFieldDirector, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createSequentialGroup()
                                .add(jTextFieldActor1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 104, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jTextFieldActor2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 104, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jTextFieldActor3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 104, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jTextFieldID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 213, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, jComboBoxYear, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, jComboBoxCountry, 0, 114, Short.MAX_VALUE))))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel2))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jButtonExitNoSaving)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 17, Short.MAX_VALUE)
                        .add(jButtonSaveAndAddAnotherMovie)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButtonSaveAndExit))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel10)
                        .add(8, 8, 8)
                        .add(jFormattedTextFieldDuration, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 113, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(14, 14, 14)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel11)
                            .add(jLabel1))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(new java.awt.Component[] {jTextFieldID, jTextFieldMovieName}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabelAddMovie)
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(jTextFieldID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(jTextFieldMovieName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(jTextFieldDirector, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel9)
                    .add(jTextFieldCategory, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel8)
                    .add(jTextFieldActor1)
                    .add(jTextFieldActor2)
                    .add(jTextFieldActor3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel7)
                    .add(jComboBoxYear, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(jComboBoxCountry, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jLabel10)
                    .add(jFormattedTextFieldDuration, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel11)
                .add(18, 18, 18)
                .add(jLabel2)
                .add(67, 67, 67)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonSaveAndExit)
                    .add(jButtonSaveAndAddAnotherMovie)
                    .add(jButtonExitNoSaving))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldMovieNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMovieNameActionPerformed

}//GEN-LAST:event_jTextFieldMovieNameActionPerformed


private void jButtonSaveAndExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveAndExitActionPerformed
    if (addMovie())
        exit();
}//GEN-LAST:event_jButtonSaveAndExitActionPerformed
private boolean addMovie(){
    if (fieldsValid()){
        System.out.println("addMovie");
        String _name = this.jTextFieldMovieName.getText();
        int _id = Integer.parseInt(this.jTextFieldID.getText());
        String _category = this.jTextFieldCategory.getText();
        Vector<String> _actors = new Vector<String>();
        int _year = Integer.parseInt((String)this.jComboBoxYear.getSelectedItem());
        String _country = (String)this.jComboBoxCountry.getSelectedItem();
        int _duration = Integer.parseInt(this.jFormattedTextFieldDuration.getText());
        String _director = this.jTextFieldDirector.getText();
        String actor1 = this.jTextFieldActor1.getText();
        String actor2 = this.jTextFieldActor2.getText();
        String actor3 = this.jTextFieldActor3.getText();
        if(!actor1.equals("")) _actors.addElement(actor1);
        if(!actor2.equals("")) _actors.addElement(actor2);
        if(!actor3.equals("")) _actors.addElement(actor3);
        Movie newMovie = new Movie(_name, _id, _category, _actors, _year, _country, _duration, _director);
        _controller.addMovie(newMovie);
        ((SystemManagement)_parent).setMoviesModel();
        return true;
    }
    else{
        JOptionPane.showMessageDialog(this, "Please enter all obligatory fields' details",
                "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}
private boolean fieldsValid(){
    return !(this.jTextFieldMovieName.getText().equals("") ||
            this.jTextFieldID.getText().equals("") ||
            this.jTextFieldCategory.getText().equals("") ||
            this.jFormattedTextFieldDuration.getText().equals("") ||
            this.jTextFieldDirector.getText().equals(""));
}
private void exit(){
    this._parent.setEnabled(true);
    this.setVisible(false);
}
private void jTextFieldActor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldActor1ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextFieldActor1ActionPerformed

private void jTextFieldCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCategoryActionPerformed
    
}//GEN-LAST:event_jTextFieldCategoryActionPerformed

private void jTextFieldDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDirectorActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextFieldDirectorActionPerformed

private void jTextFieldActor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldActor2ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextFieldActor2ActionPerformed

private void jTextFieldActor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldActor3ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextFieldActor3ActionPerformed

private void jButtonSaveAndAddAnotherMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveAndAddAnotherMovieActionPerformed
    if (addMovie()){
        this.setVisible(false);
        new AddMovie(_controller, _parent).setVisible(true);
    }
}//GEN-LAST:event_jButtonSaveAndAddAnotherMovieActionPerformed

private void jButtonExitNoSavingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitNoSavingActionPerformed
    exit();
}//GEN-LAST:event_jButtonExitNoSavingActionPerformed

private void jTextFieldMovieNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMovieNameKeyReleased
    validateFields();
}//GEN-LAST:event_jTextFieldMovieNameKeyReleased

private void jTextFieldDirectorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDirectorKeyReleased
    validateFields();
}//GEN-LAST:event_jTextFieldDirectorKeyReleased

private void jTextFieldCategoryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCategoryKeyReleased
    validateFields();
}//GEN-LAST:event_jTextFieldCategoryKeyReleased

private void jTextFieldActor1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldActor1KeyReleased
    validateFields();
}//GEN-LAST:event_jTextFieldActor1KeyReleased

private void jTextFieldActor2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldActor2KeyReleased
    validateFields();
}//GEN-LAST:event_jTextFieldActor2KeyReleased

private void jTextFieldActor3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldActor3KeyReleased
    validateFields();
}//GEN-LAST:event_jTextFieldActor3KeyReleased

private void jFormattedTextFieldDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDurationActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jFormattedTextFieldDurationActionPerformed

private void jFormattedTextFieldDurationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDurationKeyReleased
    validateFields();
}//GEN-LAST:event_jFormattedTextFieldDurationKeyReleased
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExitNoSaving;
    private javax.swing.JButton jButtonSaveAndAddAnotherMovie;
    private javax.swing.JButton jButtonSaveAndExit;
    private javax.swing.JComboBox jComboBoxCountry;
    private javax.swing.JComboBox jComboBoxYear;
    private javax.swing.JFormattedTextField jFormattedTextFieldDuration;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAddMovie;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldActor1;
    private javax.swing.JTextField jTextFieldActor2;
    private javax.swing.JTextField jTextFieldActor3;
    private javax.swing.JTextField jTextFieldCategory;
    private javax.swing.JTextField jTextFieldDirector;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldMovieName;
    // End of variables declaration//GEN-END:variables
    
}

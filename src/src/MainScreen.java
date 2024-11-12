package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DEVINDA
 */
public class MainScreen extends javax.swing.JFrame implements ActionListener{


    public MainScreen() {
        initComponents();
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        uppercaseCheckBox = new javax.swing.JCheckBox();
        lowercaseCheckBox = new javax.swing.JCheckBox();
        numbersCheckBox = new javax.swing.JCheckBox();
        symbolsCheckBox = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        passwordLength = new javax.swing.JLabel();
        jSlider = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        passwordText = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jPanel3.setBackground(new java.awt.Color(0, 51, 204));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Generate");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(118, 118, 118))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        uppercaseCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        uppercaseCheckBox.setForeground(new java.awt.Color(204, 204, 204));
        uppercaseCheckBox.setText("Include Uppercase Letters");

        lowercaseCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lowercaseCheckBox.setForeground(new java.awt.Color(204, 204, 204));
        lowercaseCheckBox.setText("Include Lowercase Letters");

        numbersCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        numbersCheckBox.setForeground(new java.awt.Color(204, 204, 204));
        numbersCheckBox.setText("Include Numbers");

        symbolsCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        symbolsCheckBox.setForeground(new java.awt.Color(204, 204, 204));
        symbolsCheckBox.setText("Include Symbols");

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STRENGTH");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("...............");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(33, 33, 33))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Character Length");

        passwordLength.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordLength.setForeground(new java.awt.Color(204, 204, 204));
        passwordLength.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLength.setText("8");

        jSlider.setMaximum(30);
        jSlider.setMinimum(8);
        jSlider.setValue(8);
        jSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(symbolsCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(178, 178, 178)
                                    .addComponent(passwordLength, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(numbersCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(uppercaseCheckBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                .addComponent(lowercaseCheckBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(17, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(passwordLength))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(uppercaseCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lowercaseCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numbersCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(symbolsCheckBox)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Password Generator");

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        passwordText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordText.setForeground(new java.awt.Color(255, 255, 255));
        passwordText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordText.setText("..................................");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Copy");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(passwordText, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(32, 32, 32))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordText)
                    .addComponent(jLabel8))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel3))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(165, 165, 165))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addGap(48, 48, 48)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
       
        int strCheck = 0;
        //int value = jSlider1.getValue();
        //String pass = "Hello";
        //passText.setText(pass);
        
        int len = jSlider.getValue();
        
        //int passwordlen = Integer.parseInt(lengths[len]);
        String ans="";
        if(symbolsCheckBox.isSelected() && !lowercaseCheckBox.isSelected() && !uppercaseCheckBox.isSelected() && !numbersCheckBox.isSelected()){
            ans = generateSymbols(len);
            strCheck = 1;
        }
        else if(lowercaseCheckBox.isSelected() && !uppercaseCheckBox.isSelected() && !numbersCheckBox.isSelected() && !symbolsCheckBox.isSelected()){
            ans = generateLCLetters(len);
            strCheck = 1;
        }   
        else if(uppercaseCheckBox.isSelected() && !lowercaseCheckBox.isSelected() && !numbersCheckBox.isSelected() && !symbolsCheckBox.isSelected()){
            ans = generateUCLetters(len);
            strCheck = 1;
        }
        else if(numbersCheckBox.isSelected() && !lowercaseCheckBox.isSelected() && !uppercaseCheckBox.isSelected() && !symbolsCheckBox.isSelected()){
            ans = generateNumbers(len);
            strCheck = 1;
        }
        else if(lowercaseCheckBox.isSelected() && uppercaseCheckBox.isSelected() && numbersCheckBox.isSelected() && symbolsCheckBox.isSelected()){
            ans = lowUpSymNum(len);
            strCheck = 3;
        }
        else if(lowercaseCheckBox.isSelected() && uppercaseCheckBox.isSelected() && !numbersCheckBox.isSelected() && !symbolsCheckBox.isSelected()){
            ans = twoChoices("LU",len);
            strCheck = 2;
        }
        else if(lowercaseCheckBox.isSelected() && !uppercaseCheckBox.isSelected() && !numbersCheckBox.isSelected() && symbolsCheckBox.isSelected()){
            ans = twoChoices("LS",len);
            strCheck = 2;
        }
        else if(lowercaseCheckBox.isSelected() && !uppercaseCheckBox.isSelected() && numbersCheckBox.isSelected() && !symbolsCheckBox.isSelected()){
            ans = twoChoices("LN",len);
            strCheck = 2;
        }
        else if(!lowercaseCheckBox.isSelected() && uppercaseCheckBox.isSelected() && numbersCheckBox.isSelected() && !symbolsCheckBox.isSelected()){
            ans = twoChoices("UN",len);
            strCheck = 2;
        }
        else if(!lowercaseCheckBox.isSelected() && uppercaseCheckBox.isSelected() && !numbersCheckBox.isSelected() && symbolsCheckBox.isSelected()){
            ans = twoChoices("SU",len);
            strCheck = 2;
        }
        else if(!lowercaseCheckBox.isSelected() && !uppercaseCheckBox.isSelected() && numbersCheckBox.isSelected() && symbolsCheckBox.isSelected()){
            ans = twoChoices("NS",len);
            strCheck = 2;
        }
        else if(lowercaseCheckBox.isSelected() && uppercaseCheckBox.isSelected() && numbersCheckBox.isSelected() && !symbolsCheckBox.isSelected()){
            ans = threeChoices("LUN",len);
            strCheck = 3;
        }
        else if(lowercaseCheckBox.isSelected() && uppercaseCheckBox.isSelected() && !numbersCheckBox.isSelected() && symbolsCheckBox.isSelected()){
            ans = threeChoices("LUS",len);
            strCheck = 3;
        }
        else if(lowercaseCheckBox.isSelected() && !uppercaseCheckBox.isSelected() && numbersCheckBox.isSelected() && symbolsCheckBox.isSelected()){
            ans = threeChoices("LNS",len);
            strCheck = 3;
        }
        else if(!lowercaseCheckBox.isSelected() && uppercaseCheckBox.isSelected() && numbersCheckBox.isSelected() && symbolsCheckBox.isSelected()){
            ans = threeChoices("UNS",len);
            strCheck = 3;
        }
        
        //ta.setFont(new Font("Serif",Font.PLAIN,20));
        passwordText.setText(ans);
        
        
        if((strCheck == 1) && (len>=8)) {
            jLabel4.setText("LOW");
        }
        else if((strCheck == 2) && (len>=8)) {
            jLabel4.setText("MEDIUM");
        }
        else if((strCheck == 3) && (len>=8)) {
            jLabel4.setText("HIGH");
        }
        else {
            jLabel4.setText("NULL");
        }
        
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderStateChanged
        passwordLength.setText(Integer.toString(jSlider.getValue()));
    }//GEN-LAST:event_jSliderStateChanged


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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
                
            }
        }); 
    }
    
       
    // Function to generate only lowercase letters of length specified in argument
    public static String generateLCLetters(int len){
        String lc="";
        for(int i=1;i<=len;i++){
            double d = (Math.random()*(122-97))+97;       // ASCII values between 97 to 122
            int num = (int)d;
            String s = Character.toString((char)num);
            lc += s;
        }
        return lc;
    }
    
    // Function to generate only uppercase letters of length specified in argument
    public String generateUCLetters(int len){
        String uc="";
        for(int i=1;i<=len;i++){
            double d = (Math.random()*(91-65))+65;      // ASCII values between 65 to 91
            int num = (int)d;
            String s = Character.toString((char)num);
            uc += s;
        }
        return uc;
    }
    
    // Function to generate only digits of length specified in argument
    public String generateNumbers(int len){
        String numletters="";
        for(int i=1;i<=len;i++){
            double d = (Math.random()*(57-48))+48;      // ASCII values between 48 to 57
            int num = (int)d;
            String s = Character.toString((char)num);
            numletters += s;
        }
        return numletters;
    }
    
    // Function to generate only symbols of length specified in argument
    public String generateSymbols(int len){
        String symbletters="";
        for(int i=1;i<=len;i++){
            double choice = (Math.random()*(5-1))+1;      // Random numbers between 1 to 4
            int choicenum = (int)choice;
            String symbolchoice="";
            double d=0;
            switch(choicenum){
                case 1:
                    d = (Math.random()*(47-33))+33;       // ASCII values between 33 to 47
                    break;
                case 2:
                    d = (Math.random()*(64-58))+58;       // ASCII values between 58 to 64
                    break;
                case 3:
                    d = (Math.random()*(95-91))+91;       // ASCII values between 91 to 95
                    break;
                case 4:
                    d = (Math.random()*(126-123))+123;    // ASCII values between 123 to 126
                    break;
                default:
                    break;
            }
            int num = (int)d;
            String s = Character.toString((char)num);
            symbletters += s;
        }
        return symbletters;
    }
    
    // When all checkboxes are selected
    public String lowUpSymNum(int len){
        String password = "";
        for(int i=0;i<len;i++){
            double d = (Math.random()*(5-1))+1;     // Random numbers between 1 to 4
            int num = (int)d;
            String choice = "";
            switch(num){ 
                case 1:
                    choice = generateLCLetters(1);
                    break;
                case 2:
                    choice = generateUCLetters(1);
                    break;
                case 3:
                    choice = generateSymbols(1);
                    break;
                case 4:
                    choice = generateNumbers(1);
                    break;
                default:
                    break;
            }
            password += choice;
        }
        return password;
    }
    
    public String twoChoices(String code,int len){
        String password = "";
        for(int i=0;i<len;i++){
            double binar = (Math.random()*(2-0))+0;     // Random number 1 or 2
            double one = (Math.random()*(2-1))+1;       // Random number 1
            double two = (Math.random()*(3-2))+2;       // Random number 2
            double three = (Math.random()*(4-3))+3;     // Random number 3
            double four = (Math.random()*(5-4))+4;      // Random number 4
            double finalans=0;
            //When lowercase letters checkbox & symbols checkbox are selected
            if(code.equals("LS")||code.equals("SL")){
                finalans = (int)binar==0?one:three;
            }
            // When lowercase letters checkbox & numbers checkbox are selected
            else if(code.equals("LN")||code.equals("NL")){
                finalans = (int)binar==0?one:four;
            }
            // When lowercase letters checkbox & uppercase letters checkbox are selected
            else if(code.equals("LU")||code.equals("UL")){
                finalans = (int)binar==0?one:two;
            }
            // When uppercase letters checkbox & numbers checkbox are selected
            else if(code.equals("UN")||code.equals("NU")){
                finalans = (int)binar==0?two:four;
            }
            // When symbols checkbox & uppercase letters checkbox are selected
            else if(code.equals("SU")||code.equals("US")){
                finalans = (int)binar==0?three:two;
            }
            // When numbers checkbox & symbols checkbox are selected
            else if(code.equals("NS")||code.equals("SN")){
                finalans = (int)binar==0?four:three;
            }
            int num = (int)finalans;
            String choice = "";
            switch(num){ 
                case 1:
                    choice = generateLCLetters(1);    // Generate any one lowercase letter
                    break;
                case 2:
                    choice = generateUCLetters(1);    // Generate any one uppercase letter
                    break;
                case 3:
                    choice = generateSymbols(1);      // Generate any one symbol
                    break;
                case 4:
                    choice = generateNumbers(1);      // Generate any one digit
                    break;
                default:
                    break;
            }
            password += choice;
        }
        return password;
    }
    
    public String threeChoices(String code,int len){
        String password = "";
        for(int i=0;i<len;i++){
            double trio = (Math.random()*(3-0))+0;
            double one = (Math.random()*(2-1))+1;
            double two = (Math.random()*(3-2))+2;
            double three = (Math.random()*(4-3))+3;
            double four = (Math.random()*(5-4))+4;
            double finalans=0;
            if(code.equals("LUN")||code.equals("ULN")||code.equals("NLU")){
                if((int)trio%2==0){
                    finalans = (int)trio==0?one:two;
                } else{
                    finalans = (int)trio==0?one:four;
                }
            }
            else if(code.equals("LUS")||code.equals("USL")||code.equals("SLU")){
                if((int)trio%2==0){
                    finalans = (int)trio==0?one:two;
                } else{
                    finalans = (int)trio==0?one:three;
                }
            }
            else if(code.equals("LNS")||code.equals("NLS")||code.equals("SNL")){
                if((int)trio%2==0){
                    finalans = (int)trio==0?one:three;
                } else{
                    finalans = (int)trio==0?one:four;
                }
            }
            else if(code.equals("UNS")||code.equals("SUN")||code.equals("NUS")){
                if((int)trio%2==0){
                    finalans = (int)trio==0?two:three;
                } else{
                    finalans = (int)trio==0?three:four;
                }
            }
            int num = (int)finalans;
            String choice = "";
            switch(num){ 
                case 1:
                    choice = generateLCLetters(1);
                    break;
                case 2:
                    choice = generateUCLetters(1);
                    break;
                case 3:
                    choice = generateSymbols(1);
                    break;
                case 4:
                    choice = generateNumbers(1);
                    break;
                default:
                    break;
            }
            password += choice;
        }
        return password;
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSlider jSlider;
    private javax.swing.JCheckBox lowercaseCheckBox;
    private javax.swing.JCheckBox numbersCheckBox;
    private javax.swing.JLabel passwordLength;
    private javax.swing.JLabel passwordText;
    private javax.swing.JCheckBox symbolsCheckBox;
    private javax.swing.JCheckBox uppercaseCheckBox;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

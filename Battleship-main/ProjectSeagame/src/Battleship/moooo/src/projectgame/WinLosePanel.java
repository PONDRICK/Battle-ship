package projectgame;

import javax.swing.ImageIcon;

/* หน้าเมื่อทราบผลแพ้/ชนะ หลังเล่นเกมส์จบ */
public class WinLosePanel extends javax.swing.JFrame {

    /**
     * Creates new form WinLosePanel
     */
    public WinLosePanel() {
        initComponents();
        this.setLocationRelativeTo(null);//ให้หน้าWindow อยู๋ตรงกลางจอ
        this.setIconImage(new ImageIcon(getClass().getResource("/projectgame/iconrps.png")).getImage()); //Set Icon ของ Program
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    //--method สำหรับการสร้างและปรับแต่งหน้า UI--//
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new Panel2.PanelGambar2();
        Textresult = new javax.swing.JLabel();
        Lpreminder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JangKenFight");
        setMinimumSize(new java.awt.Dimension(960, 540));
        setResizable(false);
        getContentPane().setLayout(null);

        Textresult.setBackground(new java.awt.Color(102, 102, 102));
        Textresult.setFont(new java.awt.Font("Old School Adventures", 1, 48)); // NOI18N
        Textresult.setForeground(new java.awt.Color(204, 0, 0));
        Textresult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Textresult.setText("You Win");

        Lpreminder.setBackground(new java.awt.Color(102, 102, 102));
        Lpreminder.setFont(new java.awt.Font("Old School Adventures", 1, 25)); // NOI18N
        Lpreminder.setForeground(new java.awt.Color(0, 0, 0));
        Lpreminder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lpreminder.setText("Lifepoint : 3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(Textresult, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(Lpreminder, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(330, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addComponent(Textresult, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Lpreminder, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(276, 276, 276))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 960, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Lpreminder;
    public javax.swing.JLabel Textresult;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

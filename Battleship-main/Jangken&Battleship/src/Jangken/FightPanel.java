package Jangken;

import java.util.TimerTask;
import java.util.Timer;
import javax.swing.ImageIcon;

/* หน้าเล่นเกมส์ */
public class FightPanel extends javax.swing.JFrame  {

    /**
     * Creates new form FightPanel
     */
    public FightPanel() {
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
        Playersprite = new javax.swing.JLabel();
        Rockbtn = new javax.swing.JLabel();
        Paperbtn = new javax.swing.JLabel();
        Scissorsbtn = new javax.swing.JLabel();
        Playertext = new javax.swing.JLabel();
        Bosstext = new javax.swing.JLabel();
        Iconheartp = new javax.swing.JLabel();
        Iconheartb = new javax.swing.JLabel();
        Lpplayer = new javax.swing.JLabel();
        Lpboss = new javax.swing.JLabel();
        Bosssprite = new javax.swing.JLabel();
        Showiconbch = new javax.swing.JLabel();
        Criticaltext = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JangKenFight");
        setMinimumSize(new java.awt.Dimension(960, 540));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(960, 540));
        jPanel1.setMinimumSize(new java.awt.Dimension(960, 540));

        Playersprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/knightidle.gif"))); // NOI18N

        Rockbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/Rock.png"))); // NOI18N
        Rockbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RockbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RockbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RockbtnMouseExited(evt);
            }
        });

        Paperbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/Paper.png"))); // NOI18N
        Paperbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaperbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PaperbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PaperbtnMouseExited(evt);
            }
        });

        Scissorsbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/Scissors.png"))); // NOI18N
        Scissorsbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ScissorsbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ScissorsbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ScissorsbtnMouseExited(evt);
            }
        });

        Playertext.setBackground(new java.awt.Color(255, 255, 255));
        Playertext.setFont(new java.awt.Font("Old School Adventures", 1, 28)); // NOI18N
        Playertext.setForeground(new java.awt.Color(255, 255, 255));

        Bosstext.setBackground(new java.awt.Color(255, 255, 255));
        Bosstext.setFont(new java.awt.Font("Old School Adventures", 1, 28)); // NOI18N
        Bosstext.setForeground(new java.awt.Color(255, 255, 255));

        Iconheartp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/Heart.png"))); // NOI18N

        Iconheartb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/Heart.png"))); // NOI18N

        Lpplayer.setBackground(new java.awt.Color(255, 255, 255));
        Lpplayer.setFont(new java.awt.Font("Old School Adventures", 1, 20)); // NOI18N
        Lpplayer.setForeground(new java.awt.Color(255, 255, 255));

        Lpboss.setBackground(new java.awt.Color(255, 255, 255));
        Lpboss.setFont(new java.awt.Font("Old School Adventures", 1, 20)); // NOI18N
        Lpboss.setForeground(new java.awt.Color(255, 255, 255));

        Bosssprite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bosssprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/widle.gif"))); // NOI18N

        Criticaltext.setFont(new java.awt.Font("Old School Adventures", 1, 18)); // NOI18N
        Criticaltext.setForeground(new java.awt.Color(208, 3, 3));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Playertext, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Iconheartp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Lpplayer, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Criticaltext, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addComponent(Showiconbch, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(345, 345, 345)
                                .addComponent(Paperbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Scissorsbtn)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Playersprite, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(Rockbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Bosstext, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Iconheartb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Lpboss)
                                .addGap(32, 32, 32))))
                    .addComponent(Bosssprite, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Bosstext, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Playertext, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Iconheartp)
                                    .addComponent(Lpplayer, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Iconheartb)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(Lpboss)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Playersprite)
                            .addComponent(Bosssprite, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Showiconbch, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Criticaltext, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Rockbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Paperbtn)
                            .addComponent(Scissorsbtn))
                        .addGap(85, 85, 85))))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 960, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

     //--method ที่รับ event เมื่อ mouse ทำการชี้ที่ปุ่ม Rock--//
    private void RockbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RockbtnMouseEntered
        Rockbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/Rockblack.png")));//เปลี่ยน Icon ปุ่ม เพื่อเปลี่ยนสี
    // TODO add your handling code here:
    }//GEN-LAST:event_RockbtnMouseEntered

     //--method ที่รับ event เมื่อ mouse ออกจากปุ่ม Rock--//
    private void RockbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RockbtnMouseExited
        Rockbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/Rock.png")));//เปลี่ยน Icon ปุ่มกลับ
    // TODO add your handling code here:
    }//GEN-LAST:event_RockbtnMouseExited

     //--method ที่รับ event เมื่อ mouse ทำการชี้ที่ปุ่ม Paper--//
    private void PaperbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaperbtnMouseEntered
        // TODO add your handling code here:
        Paperbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/Paperblack.png")));//เปลี่ยน Icon ปุ่ม เพื่อเปลี่ยนสี
    }//GEN-LAST:event_PaperbtnMouseEntered

     //--method ที่รับ event เมื่อ mouse ออกจากปุ่ม Paper--//
    private void PaperbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaperbtnMouseExited
        // TODO add your handling code here:
        Paperbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/Paper.png")));//เปลี่ยน Icon ปุ่มกลับ
    }//GEN-LAST:event_PaperbtnMouseExited

    //--method ที่รับ event เมื่อ mouse ทำการชี้ที่ปุ่ม Scissors--//
    private void ScissorsbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScissorsbtnMouseEntered
        // TODO add your handling code here:
        Scissorsbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/Scissorblack.png")));//เปลี่ยน Icon ปุ่ม เพื่อเปลี่ยนสี
    }//GEN-LAST:event_ScissorsbtnMouseEntered

     //--method ที่รับ event เมื่อ mouse ออกจากปุ่ม Scissors--//
    private void ScissorsbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScissorsbtnMouseExited
        // TODO add your handling code here:
        Scissorsbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/Scissors.png")));//เปลี่ยน Icon ปุ่มกลับ
    }//GEN-LAST:event_ScissorsbtnMouseExited

    //--method ที่รับ event เมื่อทำการ click ปุ่ม Rock เพื่อออกสิ่งที่เลือก--//
    private void RockbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RockbtnMouseClicked
        // TODO add your handling code here:
        gm.Choose(1);//ส่งค่า 1 (Rock) ที่เลือกไปยัง method Choose ใน Gamesystem
        Bshow();//show icon ที่ boss ทำการเลือกออกหน้าเกมส์
        Lpplayer.setText("x"+Integer.toString(gm.player.getLifepoint()));//แสดง Lifepoint ของ Player
        Lpboss.setText("x"+Integer.toString(gm.boss.getLifepoint()));//แสดง Lifepoint ของ Boss
        playanim();//เรียกใช้ method playanim
    }//GEN-LAST:event_RockbtnMouseClicked

    //--method ที่รับ event เมื่อทำการ click ปุ่ม Scissors เพื่อออกสิ่งที่เลือก--//
    private void ScissorsbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScissorsbtnMouseClicked
        // TODO add your handling code here:
        gm.Choose(3);//ส่งค่า 3 (Scissors) ที่เลือกไปยัง method Choose ใน Gamesystem
        Bshow();//show icon ที่ boss ทำการเลือกออกหน้าเกมส์
        Lpplayer.setText("x"+Integer.toString(gm.player.getLifepoint()));//แสดง Lifepoint ของ Player
        Lpboss.setText("x"+Integer.toString(gm.boss.getLifepoint()));//แสดง Lifepoint ของ Boss
        playanim();//เรียกใช้ method playanim
    }//GEN-LAST:event_ScissorsbtnMouseClicked

     //--method ที่รับ event เมื่อทำการ click ปุ่ม Paper เพื่อออกสิ่งที่เลือก--//
    private void PaperbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaperbtnMouseClicked
        // TODO add your handling code here:
        gm.Choose(2); //ส่งค่า 2 (Paper) ที่เลือกไปยัง method Choose ใน Gamesystem
        Bshow(); //show icon ที่ boss ทำการเลือกออกหน้าเกมส์
        Lpplayer.setText("x"+Integer.toString(gm.player.getLifepoint())); //แสดง Lifepoint ของ Player
        Lpboss.setText("x"+Integer.toString(gm.boss.getLifepoint())); //แสดง Lifepoint ของ Boss
        playanim(); //เรียกใช้ method playanim
    }//GEN-LAST:event_PaperbtnMouseClicked

    //--method ที่ทำการแสดง ที่ boss ทำการเลือก--//
    public void Bshow(){
        Timer timer = new Timer();//ทำการสร้าง Timer
        TimerTask task = new TimerTask(){//ทำการสั่งการทำงานของ timer ตามระยะเวลา
            private int i = 1;//ตั้ง i เป็นตัวเริ่มต้นการทำงาน
            @Override
            public void run(){//เริ่มต้นการทำงาน
                if (i == 1) {
                    i++;
                }
                else{//ถ้า i ไม่เท่ากับ 1 
                     Showiconbch.setIcon(null);//ทำการปิดการแสดง icon
                     cancel();//ทำการหยุด Timer
                }
            }
        };
        
        timer.scheduleAtFixedRate(task, 0,2000); //ตั้งเวลาการแสดงตัวเลือกของ Boss 2000 ms (2 s)
        if(gm.Bossch == 1){ //ถ้า boss เลือก 1(Rock)       
            Showiconbch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/Brock.png"))); //แสดงIcon Rock
        }
        else if(gm.Bossch == 2){ //ถ้า boss เลือก 2(Paper)        
            Showiconbch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/Bpaper.png"))); //แสดงIcon Paper
        }
        else if(gm.Bossch == 3){ //ถ้า boss เลือก 3(Scissors)    
            Showiconbch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/Bscis.png"))); //แสดงIcon Scissors
        }
    }
    
    //--method ทำการเล่นAnimation ตามลักษณะพฤติกรรมที่โดน--//
    public void playanim(){
        
        if(gm.player.getLifepoint() > 0 && gm.boss.getLifepoint() > 0){ //กรณีLifepoint ของทั้งสองยังไม่เป็น0
            
            if(gm.result==1){ //ถ้าผลลัพธ์ออกชนะ(1) Boss
                if(gm.critical<=35){
                    Criticaltext.setText("Critical Damage!!");
                }
                Playersprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/knightatk.gif"))); //Set Animation Player ให้โจมตี
                Bosssprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/whurt.gif"))); //Set Animation Boss โดนโจมตี
                afiteranim(); //เรียกใช้ method afteranim
            }
            
           else if(gm.result == 2){ //ถ้าผลลัพธ์ออกแพ้(2) Boss
                Playersprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/knighthurt.gif"))); //Set Animation Player โดนโจมตี
                Bosssprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/watk.gif"))); //Set Animation Boss ให้โจมตี
                afiteranim(); //เรียกใช้ method afteranim
            }
           
            else if(gm.result == 0 ){ //ถ้าผลลัพธ์ออกเสมอ(0) ฺBoss
                Playersprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/knightatk.gif"))); //Set Animation Player ให้โจมตี
                Bosssprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/watk.gif"))); //Set Animation Boss ให้โจมตี
                afiteranim(); //เรียกใช้ method afteranim
            }
        }
        
        else if(gm.player.getLifepoint() <= 0){ //กรณีLifepoint ของ Player เหลือ 0
            Bosssprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/watk.gif"))); //Set Animation Boss ให้โจมตี
            Playersprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/knightdeath.gif"))); //Set Animation Player ให้ตาย     
            wl.Textresult.setText("You Lose");  //set ข้อความผล แพ้/ชนะ ไปยังหน้าผล แพ้/ชนะ
            wl.Lpreminder.setText("Lifepoint : "+gm.player.getLifepoint()); //ส่งค่า Lifepoint ที่เหลือ ของ Player ไปยังหน้าผล แพ้/ชนะ
            Lpplayer.setText("Died"); //set ข้อความ Lifepoint ของ Player
            Lpboss.setText("Win"); //set ข้อความ Lifepoint ของ Boss
            afiteranim(); //เรียกใช้ method afteranim
        }
        
        else if(gm.boss.getLifepoint() <= 0){ //กรณีLifepoint ของ Boss เหลือ 0
            Playersprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/knightatk.gif"))); //Set Animation Player ให้โจมตี
            Bosssprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/wizdeath.gif"))); //Set Boss Player ให้ตาย 
            wl.Textresult.setText("You Win"); //set ข้อความผล แพ้/ชนะ ไปยังหน้าผล แพ้/ชนะ
            wl.Lpreminder.setText("Lifepoint : "+gm.player.getLifepoint());  //ส่งค่า Lifepoint ที่เหลือ ของ Player ไปยังหน้าผล แพ้/ชนะ
            Lpplayer.setText("Win"); //set ข้อความ Lifepoint ของ Player
            Lpboss.setText("Died"); //set ข้อความ Lifepoint ของ Boss
            afiteranim(); //เรียกใช้ method afteranim
        }
    }
    
    //--method ที่จะแสดงหลังจากเล่น Animation--//
    public void afiteranim(){
        Timer timer = new Timer(); //ทำการสร้าง Timer 
        TimerTask task = new TimerTask(){ //ทำการสั่งการทำงานของ timer
            private int i = 1; //ตั้งเวลาการแสดงตัวเลือกของ i
            @Override
            public void run(){ //เริ่มต้นการทำงาน 
                if (i == 1) {
                    i++;
                }
                else if(gm.player.getLifepoint() <= 0){ //กรณีLifepoint ของ Player เหลือ 0
                    wl.show(); //แสดงหน้าผล แพ้/ชนะ
                    dispose(); //ปิดหน้าเกมส์
                    cancel(); //ทำการหยุด timer
                }
                else if(gm.boss.getLifepoint() <= 0){ //กรณีLifepoint ของ Boss เหลือ 0
                    wl.show(); //แสดงหน้าผล แพ้/ชนะ
                    dispose(); //ปิดหน้าเกมส์
                    cancel(); //ทำการหยุด timer
                }
                else{ //ถ้า i ไม่เท่ากับ 1
                     Playersprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/knightidle.gif"))); //Set Animation Player กลับค่าเริ่มต้น
                     Bosssprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/widle.gif"))); //Set Animation Boss กลับค่าเริ่มต้น
                     Criticaltext.setText("");//ปิดการแสดงผลข้อความ Critical
                     cancel(); //ทำการหยุด timer
                }
            }
        };
        
        timer.scheduleAtFixedRate(task, 0,2000); //ตั้งเวลา Delay 2000 ms (2 s)
        
    }
    
    Gamesystem gm = new Gamesystem(); //ทำการสร้าง Object ของ Gamesystem
    WinLosePanel wl = new WinLosePanel(); //สร้างสร้าง Object ของ หน้าผล แพ้/ชนะ
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Bosssprite;
    public javax.swing.JLabel Bosstext;
    public javax.swing.JLabel Criticaltext;
    private javax.swing.JLabel Iconheartb;
    private javax.swing.JLabel Iconheartp;
    public javax.swing.JLabel Lpboss;
    public javax.swing.JLabel Lpplayer;
    private javax.swing.JLabel Paperbtn;
    public javax.swing.JLabel Playersprite;
    public javax.swing.JLabel Playertext;
    private javax.swing.JLabel Rockbtn;
    private javax.swing.JLabel Scissorsbtn;
    public javax.swing.JLabel Showiconbch;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

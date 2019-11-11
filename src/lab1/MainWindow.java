/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.io.IOException;
import lab1.listeners.AddingMessage;
import lab1.listeners.AddingUser;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;


/**
 *
 * @author fredriksellgren
 */
public class MainWindow extends javax.swing.JFrame implements AddingUser, AddingMessage{

    /**
     * Creates new form MainWindow
     */
    ArrayList<String> publicMsgList = new ArrayList<>();
    FriendList friendListan = new FriendList();
    AddFriendForm theForm = new AddFriendForm();
    MessageList messageListan = new MessageList();
    
    
    
    public MainWindow() {
        
        initComponents();
        theForm.setListener(this);
        privateChatCheckBox.setSelected(false);
        listOfFriends.setEnabled(false);
        messageListan.MsgList = publicMsgList;
        
        
        
    }
    
    public FriendList getModel()
    {
        return new FriendList();
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        chatMessage = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listOfFriends = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        sendButton = new javax.swing.JButton();
        messageText = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        ShowMenu = new javax.swing.JMenu();
        privateChatCheckBox = new javax.swing.JCheckBoxMenuItem();
        publicChatCheckBox = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ChattWindow");

        jScrollPane1.setViewportView(chatMessage);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Friends list ");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setMaximumSize(new java.awt.Dimension(4, 4));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(2, 2));

        listOfFriends.setModel(friendListan);
        listOfFriends.setAutoscrolls(false);
        listOfFriends.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listOfFriendsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listOfFriends);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Chat history");

        addButton.setText("Add Friend");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        sendButton.setText("Send");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        messageText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageTextActionPerformed(evt);
            }
        });

        fileMenu.setText("File");

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        jMenuBar1.add(fileMenu);

        ShowMenu.setText("Show");
        ShowMenu.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                ShowMenuMenuSelected(evt);
            }
        });

        privateChatCheckBox.setText("Private chat");
        privateChatCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                privateChatCheckBoxActionPerformed(evt);
            }
        });
        ShowMenu.add(privateChatCheckBox);

        publicChatCheckBox.setSelected(true);
        publicChatCheckBox.setText("Public chat");
        publicChatCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publicChatCheckBoxActionPerformed(evt);
            }
        });
        ShowMenu.add(publicChatCheckBox);

        jMenuBar1.add(ShowMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(messageText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sendButton)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addButton)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendButton)
                    .addComponent(addButton))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowMenuMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_ShowMenuMenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_ShowMenuMenuSelected

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void privateChatCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_privateChatCheckBoxActionPerformed
        // TODO add your handling code here:
        if(privateChatCheckBox.isSelected()){
            publicChatCheckBox.setSelected(false);
            listOfFriends.setEnabled(true);
            jLabel2.setText("Chat history : "+ "Private Select User");
        }
        refreshMsgList();
        
    }//GEN-LAST:event_privateChatCheckBoxActionPerformed

    private void publicChatCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publicChatCheckBoxActionPerformed
        // TODO add your handling code here:
        publicChatCheckBox.setSelected(true);
        if(publicChatCheckBox.isSelected()){
            privateChatCheckBox.setSelected(false);
            listOfFriends.setEnabled(false);
            listOfFriends.clearSelection();
            jLabel2.setText("Chat history : "+ "Public");
            messageListan.MsgList = publicMsgList;
            refreshMsgList();
        }
        
    }//GEN-LAST:event_publicChatCheckBoxActionPerformed
    public void refreshList()
    {
        int widthSize = 4;
        DefaultListModel dlm = new DefaultListModel();
        this.friendListan.friendList.forEach((Friends user) -> {
            dlm.addElement(user);
        });
        listOfFriends.setModel(dlm);
        
        for(int i = 0; i < friendListan.getSize(); i++)
        {
            int temp = friendListan.friendList.get(i).getName().length();
            if(widthSize < temp)
                widthSize = temp;
        }
            System.out.println(widthSize);
        
        this.setExtendedState(this.getExtendedState());
        jScrollPane2.setSize(widthSize*9, jScrollPane1.getSize().height);
        
        
    }
    
    public void refreshMsgList()
    {
        DefaultListModel dlm = new DefaultListModel();
        this.messageListan.MsgList.forEach((msg) -> {
            dlm.addElement(msg);
        });
        
        chatMessage.setModel(dlm);
    }
    
    @Override
    public void onAddingUser(String user) {
       Friends tmp = new Friends(user);
       this.friendListan.addUser(tmp);
       this.setVisible(true);
       theForm.setVisible(false);
       refreshList();
    }
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        this.setVisible(false);
        theForm.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        //this.addingmessage.onAddingMessage("Test",messageText.getText());
        if(messageText.getText().contentEquals("/temp"))
        {
            try {
                this.messageListan.addMessage(Temperature.temperature());
            } catch (IOException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParserConfigurationException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SAXException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            refreshMsgList();
        
        }
        else{
            this.messageListan.addMessage(messageText.getText());
            refreshMsgList();
            this.messageText.setText(null);
        }
        
    }//GEN-LAST:event_sendButtonActionPerformed

    private void messageTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageTextActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_messageTextActionPerformed

    private void listOfFriendsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listOfFriendsMouseClicked
        JList list = (JList)evt.getSource();
        if(privateChatCheckBox.isSelected())
        {
            int index = list.locationToIndex(evt.getPoint());
            jLabel2.setText("Chat history : "+ friendListan.friendList.get(index).getName());
            messageListan.MsgList = friendListan.friendList.get(index).messagesToUser;
            refreshMsgList();
            

        }

        refreshMsgList();
    }//GEN-LAST:event_listOfFriendsMouseClicked

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ShowMenu;
    private javax.swing.JButton addButton;
    private javax.swing.JList<String> chatMessage;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listOfFriends;
    private javax.swing.JTextField messageText;
    private javax.swing.JCheckBoxMenuItem privateChatCheckBox;
    private javax.swing.JCheckBoxMenuItem publicChatCheckBox;
    private javax.swing.JButton sendButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onAddingMessage(String user, String msg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headon;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author fredriksellgren
 */
public class MessageList extends AbstractListModel<String>{
    ArrayList<String> MsgList = new ArrayList<>();

    public MessageList()
    {}
    @Override
    public int getSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getElementAt(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void addMessage(String msg)
    {
        this.MsgList.add("< me > : "+ msg);
    }
}

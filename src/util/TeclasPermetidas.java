/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author victor
 */
public class TeclasPermetidas extends PlainDocument{
    @Override
     public void insertString(int offs, String str, AttributeSet a) throws BadLocationException{
        super.insertString(offs, str.replaceAll("[^a-z|^A-Z|^ ]",""), a);
     }
    
     public void replace(int offs, String str, AttributeSet a) throws BadLocationException{
        super.insertString(offs, str.replaceAll("[^a-z|^A-Z|^ ]",""), a);
     }
    
}

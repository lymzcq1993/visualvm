/*
 * Copyright (c) 2007, 2011, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package org.graalvm.visualvm.modules.startup;

import java.awt.Font;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import java.util.logging.Logger;
import javax.swing.UIManager;
import org.openide.util.NbBundle;

/**
 * This class displays license during first start of IDE.
 *
 * @author  Marek Slama
 */
final class LicensePanel extends javax.swing.JPanel {
    private final static Logger LOGGER = Logger.getLogger(LicensePanel.class.getName());
    
    /** Creates new form LicensePanel */
    public LicensePanel(URL url) {
        this.url = url;
        initComponents();
        initAccessibility();
        try {
            jEditorPane1.setPage(url);
        } catch (IOException exc) {
            //Problem with locating file
            LOGGER.throwing(LicensePanel.class.getName(), "<init>", exc); //NOI18N
        }
    }
    
    private void initAccessibility() {
        this.getAccessibleContext().setAccessibleName
        (bundle.getString("ACSN_LicensePanel"));
        this.getAccessibleContext().setAccessibleDescription
        (bundle.getString("ACSD_LicensePanel"));
        
        jEditorPane1.getAccessibleContext().setAccessibleName
        (bundle.getString("ACSN_EditorPane"));
        jEditorPane1.getAccessibleContext().setAccessibleDescription
        (bundle.getString("ACSD_EditorPane"));
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextAreaTop = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jTextAreaBottom = new javax.swing.JTextArea();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 12, 0, 11));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jTextAreaTop.setBackground(getBackground());
        jTextAreaTop.setColumns(20);
        jTextAreaTop.setEditable(false);
        jTextAreaTop.setFont(UIManager.getFont("Label.font").deriveFont(Font.BOLD));
        jTextAreaTop.setLineWrap(true);
        jTextAreaTop.setRows(1);
        jTextAreaTop.setText(bundle.getString("MSG_LicenseDlgLabelTop"));
        jTextAreaTop.setWrapStyleWord(true);
        jTextAreaTop.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 3, 0));
        jTextAreaTop.setFocusable(false);
        jTextAreaTop.setMargin(new java.awt.Insets(0, 0, 2, 0));
        jTextAreaTop.setOpaque(false);
        jTextAreaTop.setRequestFocusEnabled(false);
        add(jTextAreaTop);

        jEditorPane1.setBackground(UIManager.getDefaults().getColor("Tree.textBackground"));
        jEditorPane1.setEditable(false);
        jEditorPane1.setForeground(UIManager.getDefaults().getColor("Tree.textForeground"));
        jEditorPane1.setPreferredSize(new java.awt.Dimension(500, 500));
        jScrollPane1.setViewportView(jEditorPane1);

        add(jScrollPane1);

        jTextAreaBottom.setBackground(getBackground());
        jTextAreaBottom.setColumns(20);
        jTextAreaBottom.setEditable(false);
        jTextAreaBottom.setFont(UIManager.getFont("Label.font").deriveFont(Font.BOLD));
        jTextAreaBottom.setLineWrap(true);
        jTextAreaBottom.setRows(2);
        jTextAreaBottom.setText(bundle.getString("MSG_LicenseDlgLabelBottom"));
        jTextAreaBottom.setWrapStyleWord(true);
        jTextAreaBottom.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 0, 0, 0));
        jTextAreaBottom.setFocusable(false);
        jTextAreaBottom.setOpaque(false);
        jTextAreaBottom.setRequestFocusEnabled(false);
        add(jTextAreaBottom);
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaBottom;
    private javax.swing.JTextArea jTextAreaTop;
    // End of variables declaration//GEN-END:variables
    private URL url;
    private static final ResourceBundle bundle = NbBundle.getBundle(LicensePanel.class);
}

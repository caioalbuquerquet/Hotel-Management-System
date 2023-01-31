
package I3.UI;

import I3.TableModel.BookingTableModel;
import I3.TableModel.CustomCellRenderer;
import java.awt.Color;
import java.util.Date;
import javax.swing.table.TableCellEditor;
import org.joda.time.DateTime;

/*
 * @author Caio Albuquerque
 * ID: 17923
 * Computer Engineering 
 */
public class testing extends javax.swing.JFrame {

    /**
     * Creates new form testing
     */
    Date first,last;
    public testing() {
        initComponents();
        first = new Date();
        DateTime dt = new DateTime(first);
        Date last = dt.plusDays(9).toDate();
        System.out.println(first.toString()+" wwwwwwwwwwwww "+ last.toString());
        table_model.setBackground(Color.LIGHT_GRAY);
        table_model.setModel(new BookingTableModel(first.getTime()/1000, last.getTime()/1000));
        table_model.setDefaultRenderer(Object.class, new CustomCellRenderer());
        
    }

    
    @SuppressWarnings("unchecked")
    //begin initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_model = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_model.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table_model);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButton1)))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }//end initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//event_jButton1ActionPerformed
        first = new DateTime(last).toDate();
        last = new DateTime(first).plusDays(9).toDate();
        System.out.println(first.toString()+" ......x............  "+ last.toString());
        //table_model.setModel(new BookingTableModel(first.getTime()/1000, last.getTime()/1000));
    }//event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(testing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify - begin variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_model;
    // End of variables declaration - end variables
}

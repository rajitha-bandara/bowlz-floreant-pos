/*
 * ManagerDialog.java
 *
 * Created on September 2, 2006, 1:27 AM
 */

package com.floreantpos.ui.dialog;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

import org.jdesktop.swingx.JXDatePicker;

import com.floreantpos.main.Application;
import com.floreantpos.model.TipsCashoutReport;
import com.floreantpos.model.User;
import com.floreantpos.model.dao.GratuityDAO;
import com.floreantpos.model.dao.UserDAO;
import com.floreantpos.swing.GlassPane;
import com.floreantpos.swing.ListComboBoxModel;
import com.floreantpos.ui.util.UiUtil;

import foxtrot.Job;
import foxtrot.Worker;
import java.awt.event.ActionEvent;

/**
 *
 * @author  MShahriar
 */
public class ManagerDialog extends JFrame {
	private GlassPane glassPane;
	
    public static void main (String[] args)
    {
        ManagerDialog d = new ManagerDialog();
                d.open();
    }
    /** Creates new form ManagerDialog */
    public ManagerDialog() {
        super();
        initComponents();
        
        setIconImage(Application.getPosWindow().getIconImage());
        setTitle(Application.getTitle() + ": Manager Functions");
        
        glassPane = new GlassPane();
		setGlassPane(glassPane);
    }
    
    public void setGlassPaneVisible(boolean b) {
		glassPane.setVisible(b);
	}
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePanel1 = new com.floreantpos.ui.TitlePanel();
        transparentPanel4 = new com.floreantpos.swing.TransparentPanel();
        transparentPanel2 = new com.floreantpos.swing.TransparentPanel();
        transparentPanel3 = new com.floreantpos.swing.TransparentPanel();
        btnResetDrawer = new com.floreantpos.swing.PosButton();
        btnCashDrawerReport = new com.floreantpos.swing.PosButton();
        posButton1 = new com.floreantpos.swing.PosButton();
        btnOpenTickets = new com.floreantpos.swing.PosButton();
        btnCashDrops = new com.floreantpos.swing.PosButton();
        posButton2 = new com.floreantpos.swing.PosButton();
        transparentPanel1 = new com.floreantpos.swing.TransparentPanel();
        btnFinish = new com.floreantpos.swing.PosButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titlePanel1.setTitle("MANAGER FUNCTION");
        getContentPane().add(titlePanel1, java.awt.BorderLayout.NORTH);

        transparentPanel4.setOpaque(true);
        transparentPanel4.setLayout(new java.awt.BorderLayout());

        transparentPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        transparentPanel2.setLayout(new java.awt.GridBagLayout());

        transparentPanel3.setLayout(new java.awt.GridLayout(2, 2, 5, 5));

        btnResetDrawer.setText("<HTML>DRAWER PULL <BR> REPORT </HTML>");
        btnResetDrawer.setPreferredSize(new java.awt.Dimension(120, 60));
        btnResetDrawer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetDrawerActionPerformed(evt);
            }
        });
        transparentPanel3.add(btnResetDrawer);

        btnCashDrawerReport.setText("<HTML>CASH DRAWER <BR> REPORT</HTML>");
        btnCashDrawerReport.setPreferredSize(new java.awt.Dimension(120, 60));
        btnCashDrawerReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCashDrawerReportActionPerformed(evt);
            }
        });
        transparentPanel3.add(btnCashDrawerReport);

        posButton1.setText("OPEN DRAWER");
        posButton1.setPreferredSize(new java.awt.Dimension(120, 60));
        posButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posButton1ActionPerformed(evt);
            }
        });
        transparentPanel3.add(posButton1);

        btnOpenTickets.setText("OPEN TICKETS");
        btnOpenTickets.setPreferredSize(new java.awt.Dimension(120, 60));
        btnOpenTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenTicketsActionPerformed(evt);
            }
        });
        transparentPanel3.add(btnOpenTickets);

        btnCashDrops.setText("DRAWER BLEED");
        btnCashDrops.setPreferredSize(new java.awt.Dimension(120, 60));
        btnCashDrops.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCashDropsActionPerformed(evt);
            }
        });
        transparentPanel3.add(btnCashDrops);

        posButton2.setText("SERVER TIPS");
        posButton2.setPreferredSize(new java.awt.Dimension(120, 60));
        posButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posButton2ActionPerformed(evt);
            }
        });
        transparentPanel3.add(posButton2);

        transparentPanel2.add(transparentPanel3, new java.awt.GridBagConstraints());

        transparentPanel4.add(transparentPanel2, java.awt.BorderLayout.CENTER);

        transparentPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnFinish.setText("FINISH");
        btnFinish.setPreferredSize(new java.awt.Dimension(120, 60));
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });
        transparentPanel1.add(btnFinish);

        transparentPanel4.add(transparentPanel1, java.awt.BorderLayout.SOUTH);

        getContentPane().add(transparentPanel4, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
    	dispose();
    }//GEN-LAST:event_btnFinishActionPerformed

    private void btnCashDropsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCashDropsActionPerformed
    	Job job = new Job() {
			@Override
			public Object run() {
				try {
					setGlassPaneVisible(true);
					CashDropDialog dialog = new CashDropDialog(ManagerDialog.this);
					dialog.initDate();
					dialog.open();
				} catch (Exception e) {
					POSMessageDialog.showError(com.floreantpos.POSConstants.ERROR_MESSAGE, e);
				} finally {
					setGlassPaneVisible(false);
				}
				return null;
			}
    	};
    	Worker.post(job);
    }//GEN-LAST:event_btnCashDropsActionPerformed

    private void btnOpenTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenTicketsActionPerformed
    	Job job = new Job() {
			@Override
			public Object run() {
				try {
					setGlassPaneVisible(true);
					OpenTicketsListDialog dialog = new OpenTicketsListDialog(ManagerDialog.this, true);
					dialog.open();
				} catch (Exception e) {
					POSMessageDialog.showError(com.floreantpos.POSConstants.ERROR_MESSAGE, e);
				} finally {
					setGlassPaneVisible(false);
				}
				return null;
			}
    	};
    	Worker.post(job);
    }//GEN-LAST:event_btnOpenTicketsActionPerformed
    
    private void btnCashDrawerReportActionPerformed(java.awt.event.ActionEvent evt)
    {
        Job job = new Job() {
			@Override
			public Object run() {
				try {
					setGlassPaneVisible(true);
					CashDrawerReportDialog dialog = new CashDrawerReportDialog(ManagerDialog.this, true);
					dialog.setTitle(com.floreantpos.POSConstants.DRAWER_PULL);
					dialog.initialize();
					//dialog.setSize(430, 500);
					//dialog.setResizable(false);
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.open();
				} catch (Exception e) {
					POSMessageDialog.showError(com.floreantpos.POSConstants.ERROR_MESSAGE, e);
				} finally {
					setGlassPaneVisible(false);
				}
				return null;
			}
    	};
    	Worker.post(job);
    }
    private void btnDrawerPullReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCashDrawerReportActionPerformed
    	showDrawerPullReport();
    }//GEN-LAST:event_btnCashDrawerReportActionPerformed

	private void showDrawerPullReport() {
		Job job = new Job() {
			@Override
			public Object run() {
				try {
					setGlassPaneVisible(true);
					DrawerPullReportDialog dialog = new DrawerPullReportDialog(ManagerDialog.this, true);
					dialog.setTitle(com.floreantpos.POSConstants.DRAWER_PULL);
					dialog.initialize();
					dialog.setSize(430, 500);
					dialog.setResizable(false);
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.open();
				} catch (Exception e) {
					POSMessageDialog.showError(com.floreantpos.POSConstants.ERROR_MESSAGE, e);
				} finally {
					setGlassPaneVisible(false);
				}
				return null;
			}
    	};
    	Worker.post(job);
	}
        
    private void btnResetDrawerActionPerformed(java.awt.event.ActionEvent evt)
    {
        showDrawerPullReport();
    }
    private void doShowServerTips(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetDrawerActionPerformed
    	
    	Job job = new Job() {
			@Override
			public Object run() {
				try {
					setGlassPaneVisible(true);
					
					JPanel panel = new JPanel(new MigLayout());
					List<User> users = UserDAO.getInstance().findAll();
					
					JXDatePicker fromDatePicker = UiUtil.getCurrentMonthStart();
					JXDatePicker toDatePicker = UiUtil.getCurrentMonthEnd();
					
					panel.add(new JLabel(com.floreantpos.POSConstants.SELECT_USER + ":"), "grow");
					JComboBox userCombo = new JComboBox(new ListComboBoxModel(users));
					panel.add(userCombo, "grow, wrap");
					panel.add(new JLabel(com.floreantpos.POSConstants.FROM + ":"), "grow");
					panel.add(fromDatePicker,"wrap");
					panel.add(new JLabel(com.floreantpos.POSConstants.TO_), "grow");
					panel.add(toDatePicker);
					
					int option = JOptionPane.showOptionDialog(ManagerDialog.this, panel, com.floreantpos.POSConstants.SELECT_CRIETERIA, JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
					if(option != JOptionPane.OK_OPTION) {
						return null;
					}
					
					
					
					GratuityDAO gratuityDAO = new GratuityDAO();
					TipsCashoutReport report = gratuityDAO.createReport(fromDatePicker.getDate(), toDatePicker.getDate(), (User) userCombo.getSelectedItem());
					
					TipsCashoutReportDialog dialog = new TipsCashoutReportDialog(report, ManagerDialog.this, true);
					dialog.setSize(400, 600);
					dialog.open();
				} catch (Exception e) {
					POSMessageDialog.showError(com.floreantpos.POSConstants.ERROR_MESSAGE, e);
				} finally {
					setGlassPaneVisible(false);
				}
				return null;
			}
    	};
    	Worker.post(job);
    }//GEN-LAST:event_btnResetDrawerActionPerformed

    private void posButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posButton2ActionPerformed
        doShowServerTips(evt);
    }//GEN-LAST:event_posButton2ActionPerformed

    private void posButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posButton1ActionPerformed
        com.floreantpos.print.PosPrintService.openDrawer();
    }//GEN-LAST:event_posButton1ActionPerformed
    
    public void open() {
    	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    	
    	int width = 800;
    	int height = 600;
    	
    	int x = (screenSize.width - 800) / 2; 
    	int y = (screenSize.height - 600) / 2; 
    	
    	setSize(width, height);
		
		setLocation(x, y);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.floreantpos.swing.PosButton btnCashDrawerReport;
    private com.floreantpos.swing.PosButton btnCashDrops;
    private com.floreantpos.swing.PosButton btnFinish;
    private com.floreantpos.swing.PosButton btnOpenTickets;
    private com.floreantpos.swing.PosButton btnResetDrawer;
    private com.floreantpos.swing.PosButton posButton1;
    private com.floreantpos.swing.PosButton posButton2;
    private com.floreantpos.ui.TitlePanel titlePanel1;
    private com.floreantpos.swing.TransparentPanel transparentPanel1;
    private com.floreantpos.swing.TransparentPanel transparentPanel2;
    private com.floreantpos.swing.TransparentPanel transparentPanel3;
    private com.floreantpos.swing.TransparentPanel transparentPanel4;
    // End of variables declaration//GEN-END:variables
    
}

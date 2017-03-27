/*
 * EVerifyUIControl.java
 *
 * Created on 09 July 2008, 13:47
 */

package com.daffodil.documentumie.iebusiness.export.view;

import com.daffodil.documentumie.iebusiness.AbstractUIControl;
import com.daffodil.documentumie.iebusiness.export.bean.ExportUIInfoBean;

/**
 *
 * @author  Administrator
 */
public class EVerifyUIControl extends AbstractUIControl{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = -9044720110036746606L;
	String imageLocation;
	String showMessage;
    /** Creates new form EVerifyUIControl */
    public EVerifyUIControl() {
        initComponents();
        initlizeUI();
//        showforVerify();
    }
    
    private void showforVerify() {
    	
    	String exportUIValues = null;
    	exportUIValues = " Repository: " +getExportUIInfoBean().getRepository()+" "+"\n";
    	exportUIValues +=  " User Name: " +getExportUIInfoBean().getUserName()+" "+"\n";
    	exportUIValues +=  " Domain: " +getExportUIInfoBean().getDomain()+" "+"\n";
    	exportUIValues += " Object Type: "+getExportUIInfoBean().getObjectType()+" "+"\n";
    	exportUIValues +=  " Report Type: " +getExportUIInfoBean().getReportType()+" "+"\n";
    	exportUIValues +=  " Export Type: " +getExportUIInfoBean().getExportType()+" "+"\n";
    	exportUIValues += " All Version: "+getExportUIInfoBean().isAllVersion()+" "+"\n";
    	exportUIValues += " Metadata Only: "+getExportUIInfoBean().isOnlyMetadata()+" "+"\n";
    	exportUIValues += " Export in Zip: "+getExportUIInfoBean().isExportIntoZIP()+" "+"\n";
    	exportUIValues += " Filter Criteria: "+getExportUIInfoBean().getDqlText()+" "+"\n";
    	// The below code is modified by Harsh for the implementation of FTP functionality on 12/29/2011
    	String exportToLoc = getExportUIInfoBean().getExportToLocation();
    	if(exportToLoc!=null)
    	{
    		if(exportToLoc.equalsIgnoreCase("file"))
    		{
    			exportUIValues += " Metadata File Path: "+getExportUIInfoBean().getMetaDataFilePath()+" "+"\n";
    	    	exportUIValues += " Output File name: "+getExportUIInfoBean().getOutPutFile()+" "+"\n";
    		}
    		else if(exportToLoc.equalsIgnoreCase("ftp")){
    			exportUIValues += " Metadata File Path: "+getExportUIInfoBean().getFtpMetadataFile()+" "+"\n";
    	    	exportUIValues += " Output File name: "+getExportUIInfoBean().getFtpOutputFile()+" "+"\n";
    		}
    	}
    	
    	
    	verifyExportInput.setText(exportUIValues);
    	verifyExportInput.setEditable(false);
	}
    
    
    @Override
	public String getImageLocation() {
    	//TODO Subject to change
		imageLocation = "/com/daffodil/documentumie/iebusiness/export/view/images/heading_e_complete.jpg";
		return imageLocation;
	}

	@Override
	public String getShowMessage() {
		showMessage = "Verify your choices made during export wizard.";
		return showMessage;
	}

	@Override
	protected void postInilize() {
		
	}

	@Override
	protected void preInilize() {
		showforVerify();
		
	}

	@Override
	protected StringBuffer validateUIInputs() {
		
		return null;
	}
    
	
	private ExportUIInfoBean getExportUIInfoBean(){
		return (ExportUIInfoBean)getUiInfoBean();
	}
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        verifyExportInput_JScrollPane = new javax.swing.JScrollPane();
        verifyExportInput = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(370, 355));
        setLayout(new java.awt.GridBagLayout());
        setOpaque(false);
        
        verifyExportInput_JScrollPane.setOpaque(false);
        verifyExportInput_JScrollPane.setPreferredSize(new java.awt.Dimension(250, 250));

//        verifyExportInput.setColumns(20);
//        verifyExportInput.setRows(5);
//        verifyExportInput.setPreferredSize(new java.awt.Dimension(250, 250));
        verifyExportInput_JScrollPane.setViewportView(verifyExportInput);

        add(verifyExportInput_JScrollPane, new java.awt.GridBagConstraints());
    }// </editor-fold>                        
    
    
    // Variables declaration - do not modify                     
    private javax.swing.JTextArea verifyExportInput;
    private javax.swing.JScrollPane verifyExportInput_JScrollPane;
    // End of variables declaration                   
	@Override
	protected StringBuffer errorMessage() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
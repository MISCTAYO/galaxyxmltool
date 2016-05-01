/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmltoolgui;

import metaiodao.ToolOutput;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

/**
 *
 * @author msproteo
 */
public class OutputTool extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form OutputTool
     */
    public OutputTool() {
        setTitle("Tool Outputs");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        this.getContentPane().setBackground(new Color(115, 115, 115));
        UIManager.put("ComboBox.background", new Color(150,148,13));
        UIManager.put("TextField.background", new Color(150,148,13));
        UIManager.put("TextField.foreground", new Color(255,255,255));
        UIManager.put("Button.background",new Color(43, 49, 67));
        UIManager.put("Button.background",new Color(43, 49, 67));
        UIManager.put("Label.foreground ",new Color(150,148,13));
        UIManager.put("TextArea.background", new Color(150,148,13));
        this.setAlwaysOnTop(true);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField1.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {
                String result = "";
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                //odd: the Object param of getContents is not currently used
                Transferable contents = clipboard.getContents(null);
                boolean hasTransferableText =
                        (contents != null) &&
                                contents.isDataFlavorSupported(DataFlavor.stringFlavor)
                        ;
                if (hasTransferableText) {
                    try {
                        result = (String)contents.getTransferData(DataFlavor.stringFlavor);
                    }
                    catch (UnsupportedFlavorException | IOException ex){
                        System.out.println(ex);
                        ex.printStackTrace();
                    }
                }
               
                jTextField1.setText(result);
            }

            public void mousePressed(MouseEvent e) {

            }

            public void mouseReleased(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {

            }

            public void mouseExited(MouseEvent e) {

            }

        });
        jTextField3.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {
                String result = "";
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                //odd: the Object param of getContents is not currently used
                Transferable contents = clipboard.getContents(null);
                boolean hasTransferableText =
                        (contents != null) &&
                                contents.isDataFlavorSupported(DataFlavor.stringFlavor)
                        ;
                if (hasTransferableText) {
                    try {
                        result = (String)contents.getTransferData(DataFlavor.stringFlavor);
                    }
                    catch (UnsupportedFlavorException | IOException ex){
                        System.out.println(ex);
                        ex.printStackTrace();
                    }
                }
               
                jTextField3.setText(result);
            }

            public void mousePressed(MouseEvent e) {

            }

            public void mouseReleased(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {

            }

            public void mouseExited(MouseEvent e) {

            }

        });
        jTextField4.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {
                String result = "";
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                //odd: the Object param of getContents is not currently used
                Transferable contents = clipboard.getContents(null);
                boolean hasTransferableText =
                        (contents != null) &&
                                contents.isDataFlavorSupported(DataFlavor.stringFlavor)
                        ;
                if (hasTransferableText) {
                    try {
                        result = (String)contents.getTransferData(DataFlavor.stringFlavor);
                    }
                    catch (UnsupportedFlavorException | IOException ex){
                        System.out.println(ex);
                        ex.printStackTrace();
                    }
                }
               
                jTextField4.setText(result);
            }

            public void mousePressed(MouseEvent e) {

            }

            public void mouseReleased(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {

            }

            public void mouseExited(MouseEvent e) {

            }

        });
        jTextField5.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {
                String result = "";
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                //odd: the Object param of getContents is not currently used
                Transferable contents = clipboard.getContents(null);
                boolean hasTransferableText =
                        (contents != null) &&
                                contents.isDataFlavorSupported(DataFlavor.stringFlavor)
                        ;
                if (hasTransferableText) {
                    try {
                        result = (String)contents.getTransferData(DataFlavor.stringFlavor);
                    }
                    catch (UnsupportedFlavorException | IOException ex){
                        System.out.println(ex);
                        ex.printStackTrace();
                    }
                }
               
                jTextField5.setText(result);
            }

            public void mousePressed(MouseEvent e) {

            }

            public void mouseReleased(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {

            }

            public void mouseExited(MouseEvent e) {

            }

        });
        jTextField6.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {
                String result = "";
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                //odd: the Object param of getContents is not currently used
                Transferable contents = clipboard.getContents(null);
                boolean hasTransferableText =
                        (contents != null) &&
                                contents.isDataFlavorSupported(DataFlavor.stringFlavor)
                        ;
                if (hasTransferableText) {
                    try {
                        result = (String)contents.getTransferData(DataFlavor.stringFlavor);
                    }
                    catch (UnsupportedFlavorException | IOException ex){
                        System.out.println(ex);
                        ex.printStackTrace();
                    }
                }
               
                jTextField6.setText(result);
            }

            public void mousePressed(MouseEvent e) {

            }

            public void mouseReleased(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {

            }

            public void mouseExited(MouseEvent e) {

            }

        });
        jComboBox1 = new JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel2.setText("Format");

        jLabel3.setText("Format Source");

        jLabel4.setText("Metadata Source");

        jLabel5.setText("Label");

        jLabel6.setText("From Work Dir");

        jLabel7.setText("Hidden");

        jTextField1.setText("name");

        jTextField3.setText("format source");

        jTextField4.setText("metadata source");

        jTextField5.setText("label");

        jTextField6.setText("from work dir");

        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "false", "true" }));

        jButton1.setText("Add Output");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"scidx", "ab1", "acedb", "affybatch", "afg", "arff", "asn1", "asn1-binary", "axt", "bam", "bcf", "bed", "bed12", "bed6", "bedgraph", "bedstrict", "bgzip", "bigbed", "bigwig", "bmp", "bowtie_base_index", "bowtie_color_index", "btwisted", "cai", "charge", "checktrans", "chips", "chrint", "cisml", "clustal", "codata", "codcmp", "coderet", "compseq", "connectivitytable", "consensusxml", "cpgplot", "cpgreport", "cps", "csfasta", "csv", "ct", "cusp", "customtrack", "cut", "cxb", "dan", "data", "data_manager_json", "dbmotif", "dbn", "dbnsfp.tabular", "diffseq", "digest", "dotbracket", "dreg", "eigenstratgeno", "eigenstratpca", "einverted", "eland", "elandmulti", "embl", "encodepeak", "epestfind", "eps", "equicktandem", "eset", "est2genome", "etandem", "excel", "fasta", "fastq", "fastqcssanger", "fastqillumina", "fastqsanger", "fastqsolexa", "feattable", "featurexml", "fitch", "fli", "fped", "fphe", "fqtoc", "freak", "fuzznuc", "fuzzpro", "fuzztran", "garnier", "gatk_dbsnp", "gatk_interval", "gatk_recal", "gatk_report", "gatk_tranche", "gcg", "geecee", "gemini.sqlite", "geminisqlite", "genbank", "genericxml", "genetrack", "gff", "gff3", "gg", "gif", "gmaj.zip", "gtf", "h5", "helixturnhelix", "hennig86", "hlf", "hmm2", "hmm3", "hmmer2", "hmmer3", "hmoment", "html", "idpdb", "idxml", "ig", "im", "interprophet_pepxml", "interval", "interval_index", "ipynb", "isochore", "jackknifer", "jackknifernon", "jpg", "json", "laj", "lav", "lav", "ldindep", "len", "linecount", "lped", "maf", "mafcustomtrack", "malist", "markx0", "markx1", "markx10", "markx2", "markx3", "mascotdat", "match", "mauvexmfa", "mega", "meganon", "memexml", "mgf", "motif", "ms2", "msp", "mz.sqlite", "mzid", "mzidentml", "mzml", "mzq", "mzquantml", "mzsqlite", "mzxml", "nametable", "ncbi", "needle", "newcpgreport", "newcpgseek", "newick", "nex", "nexus", "nexusnon", "nhx", "noreturn", "obo", "owl", "oxlicg", "oxlicountgraph", "oxligl", "oxligraphlabels", "oxling", "oxlinodegraph", "oxliss", "oxlist", "oxlistoptags", "oxlisubset", "oxlitagset", "oxlits", "pair", "palindrome", "pbed", "pbm", "pcd", "pcx", "pdf", "pepcoil", "pepinfo", "pepstats", "peptideprophet_pepxml", "peptideshaker_archive", "pepxml", "pepxml.tsv", "pgm", "pheno", "phylip", "phylipnon", "phyloxml", "picard_interval_list", "pileup", "pir", "png", "polydot", "pphe", "ppm", "preg", "prettyseq", "primersearch", "protxml", "protxml.tsv", "psd", "qcml", "qual", "qual454", "qualillumina", "qualityscore454", "qualityscoresolid", "qualsolexa", "qualsolid", "rast", "raw_pepxml", "rdata", "rdf", "regions", "rexpbase", "rgb", "rgenetics", "rna_eps", "rnadotplotmatrix", "roadmaps", "sam", "scf", "score", "searchgui_archive", "seqtable", "sequences", "sf3", "sff", "showfeat", "showorf", "sif", "simple", "sixpack", "snpeffdb", "snpmatrix", "snpsiftdbnsfp", "snptest", "splib", "splib_noindex", "sqlite", "sra", "srs", "srspair", "staden", "stockholm", "stockholm_1_0", "strider", "supermatcher", "svg", "swiss", "syco", "tabix", "table", "tabular", "tagseq", "tandem", "tandemxml", "taxonomy", "textsearch", "thermo.raw", "thermoraw", "tiff", "toolshed.gz", "trafoxml", "traml", "twobit", "txt", "vcf", "vcf_bgzip", "vectorstrip", "velvet", "wiff", "wig", "wiggle", "wobble", "wordcount", "xbm", "xgmml", "xls", "xlsx", "xmfa", "xml", "xpm"}));

        GroupLayout layout = new GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(24)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel1)
        						.addComponent(jLabel2)
        						.addComponent(jLabel3)
        						.addComponent(jLabel4)
        						.addComponent(jLabel5)
        						.addComponent(jLabel6)
        						.addComponent(jLabel7))
        					.addGap(57)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jTextField1)
        						.addComponent(jTextField3)
        						.addComponent(jTextField4, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        						.addComponent(jTextField5)
        						.addComponent(jTextField6)
        						.addComponent(jComboBox1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(107)
        					.addComponent(jButton1)))
        			.addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3)
        				.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4)
        				.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6)
        				.addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel7)
        				.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addComponent(jButton1)
        			.addContainerGap(24, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    	ToolOutput top=new ToolOutput(jTextField1.getText(),String.valueOf(jComboBox1.getSelectedItem()),jTextField3.getText(),jTextField4.getText(),jTextField5.getText(),jTextField6.getText(),String.valueOf(jComboBox1.getSelectedItem()));
    	GalaxyToolMain.tooloutput.add(top);
    	this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(OutputTool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OutputTool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OutputTool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OutputTool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OutputTool().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
}

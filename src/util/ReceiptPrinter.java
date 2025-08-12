package util;

import java.awt.*;
import java.awt.print.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class ReceiptPrinter implements Printable {

    // Receipt data - you can modify these or make them dynamic
    private static class ReceiptItem {

        String itemNo;
        String itemName;
        double weladapalaMila;  // Market price
        double apeMila;         // Our price
        double pramanaya;       // Quantity
        double muluMudala;      // Total amount

        ReceiptItem(String itemNo, String itemName, double weladapalaMila,
                double apeMila, double pramanaya, double muluMudala) {
            this.itemNo = itemNo;
            this.itemName = itemName;
            this.weladapalaMila = weladapalaMila;
            this.apeMila = apeMila;
            this.pramanaya = pramanaya;
            this.muluMudala = muluMudala;
        }
    }

    // Sample data - replace with your actual data
    private List<ReceiptItem> items = new ArrayList<>();
    private double grandTotal = 0.0;
    private double paidAmount = 0.0;
    private double balance = 0.0;
    private double customerDebt = 0.0;
    private String invoiceNumber = "INV-001";

    public ReceiptPrinter() {
        // Initialize with sample data - replace with your actual data
        items.add(new ReceiptItem("001", "බත්", 120.00, 115.00, 2.0, 230.00));
        items.add(new ReceiptItem("002", "පරිප්පු", 350.00, 340.00, 1.0, 340.00));
        items.add(new ReceiptItem("003", "සීනි", 180.00, 175.00, 1.5, 262.50));

        grandTotal = 832.50;
        paidAmount = 1000.00;
        balance = 167.50;
        customerDebt = 250.00;
    }

    public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
        if (page > 0) {
            return NO_SUCH_PAGE;
        }

        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());

        // Enable antialiasing for better text quality
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        int y = 20;
        int leftMargin = 10;
        int pageWidth = (int) pf.getImageableWidth();

        // Store name - Bold and larger (reduced size for 80mm)
        Font storeNameFont = new Font("Dialog", Font.BOLD, 14);
        g.setFont(storeNameFont);
        FontMetrics fm = g.getFontMetrics();
        String storeName = "ගුණරත්න සුපර්";
        int storeNameWidth = fm.stringWidth(storeName);
        g.drawString(storeName, (pageWidth - storeNameWidth) / 2, y);
        y += 20;

        // Address (reduced font size)
        Font addressFont = new Font("Dialog", Font.PLAIN, 10);
        g.setFont(addressFont);
        fm = g.getFontMetrics();
        String address = "අංක 123, ප්‍රධාන වීදිය, කොළඹ";
        int addressWidth = fm.stringWidth(address);
        g.drawString(address, (pageWidth - addressWidth) / 2, y);
        y += 12;

        String phone = "දුරකථන: 011-2345678";
        int phoneWidth = fm.stringWidth(phone);
        g.drawString(phone, (pageWidth - phoneWidth) / 2, y);
        y += 18;

        // Separator line
        g.drawLine(leftMargin, y, pageWidth - 10, y);
        y += 15;

        // Date, Time, Invoice Number
        Font infoFont = new Font("Dialog", Font.PLAIN, 10);
        g.setFont(infoFont);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        Date now = new Date();

        g.drawString("දිනය: " + dateFormat.format(now), leftMargin, y);
        g.drawString("වේලාව: " + timeFormat.format(now), pageWidth - 100, y);
        y += 12;
        g.drawString("ඉන්වොයිස් අංකය: " + invoiceNumber, leftMargin, y);
        y += 20;

        // Table header (reduced font size for 80mm)
        Font headerFont = new Font("Dialog", Font.BOLD, 8);
        g.setFont(headerFont);

        // Column positions - adjusted for 80mm width
        int availableWidth = (int) pf.getImageableWidth();
        int col1 = leftMargin;                    // Item No
        int col2 = col1 + 25;                     // Item Name (reduced width)
        int col3 = col2 + 65;                     // Weladapala Mila
        int col4 = col3 + 45;                     // Ape Mila
        int col5 = col4 + 35;                     // Pramanaya
        int col6 = col5 + 40;                     // Mulu Mudala

        // Header row
        g.drawString("අං", col1, y);
        g.drawString("භාණ්ඩය", col2, y);
        g.drawString("වෙළඳපල", col3, y);
        g.drawString("අපේ මිල", col4, y);
        g.drawString("ප්‍රමාණය", col5, y);
        g.drawString("මුළු මුදල", col6, y);
        y += 10;

        // Header separator
        g.drawLine(leftMargin, y, pageWidth - 10, y);
        y += 10;

        // Table content (reduced font size)
        Font contentFont = new Font("Dialog", Font.PLAIN, 8);
        g.setFont(contentFont);

        for (ReceiptItem item : items) {
            g.drawString(item.itemNo, col1, y);
            g.drawString(item.itemName, col2, y);
            g.drawString(String.format("%.0f", item.weladapalaMila), col3, y);
            g.drawString(String.format("%.0f", item.apeMila), col4, y);
            g.drawString(String.format("%.1f", item.pramanaya), col5, y);
            g.drawString(String.format("%.0f", item.muluMudala), col6, y);
            y += 10;
        }

        // Bottom separator
        y += 5;
        g.drawLine(leftMargin, y, pageWidth - 10, y);
        y += 15;

        // Grand Total
        Font totalFont = new Font("Dialog", Font.BOLD, 12);
        g.setFont(totalFont);
        g.drawString("මුළු එකතුව: රු. " + String.format("%.2f", grandTotal), leftMargin, y);
        y += 18;

        // Payment details
        Font paymentFont = new Font("Dialog", Font.PLAIN, 10);
        g.setFont(paymentFont);

        g.drawString("ගෙවන ලද මුදල: රු. " + String.format("%.2f", paidAmount), leftMargin, y);
        y += 12;
        g.drawString("ඉතිරි මුදල: රු. " + String.format("%.2f", balance), leftMargin, y);
        y += 12;

        // Customer debt (if any)
        if (customerDebt > 0) {
            Font debtFont = new Font("Dialog", Font.BOLD, 10);
            g.setFont(debtFont);
            g.drawString("පැරණි ණය: රු. " + String.format("%.2f", customerDebt), leftMargin, y);
            y += 15;
        }

        // Final separator
        y += 5;
        g.drawLine(leftMargin, y, pageWidth - 10, y);
        y += 15;

        // Thank you message
        Font thankYouFont = new Font("Dialog", Font.BOLD, 12);
        g.setFont(thankYouFont);
        fm = g.getFontMetrics();
        String thankYou = "ස්තූතියි! නැවත එන්න!";
        int thankYouWidth = fm.stringWidth(thankYou);
        g.drawString(thankYou, (pageWidth - thankYouWidth) / 2, y);
        y += 15;

        String visitAgain = "අපගේ සේවය ගැන සතුටුයි";
        fm = g.getFontMetrics();
        int visitAgainWidth = fm.stringWidth(visitAgain);
        Font smallFont = new Font("Dialog", Font.PLAIN, 10);
        g.setFont(smallFont);
        g.drawString(visitAgain, (pageWidth - visitAgainWidth) / 2, y);

        return PAGE_EXISTS;
    }

    // Method to update receipt data - call this before printing
    public void updateReceiptData(List<ReceiptItem> newItems, double total,
            double paid, double bal, double debt, String invNum) {
        this.items = newItems;
        this.grandTotal = total;
        this.paidAmount = paid;
        this.balance = bal;
        this.customerDebt = debt;
        this.invoiceNumber = invNum;
    }

    // Method to create custom page format for 80mm thermal printer
    private static PageFormat createThermalPageFormat(PrinterJob job) {
        PageFormat pageFormat = job.defaultPage();
        Paper paper = new Paper();

        // 80mm = 226.77 points (1mm = 2.834645669 points)
        // Height can be variable for thermal printers, setting to 11 inches for long receipts
        double width = 80 * 2.834645669;   // 80mm in points
        double height = 11 * 72;           // 11 inches in points (variable length)

        // Set paper size
        paper.setSize(width, height);

        // Set imageable area (printable area) - small margins
        double margin = 5.67; // 2mm margin in points
        paper.setImageableArea(margin, margin, width - 2 * margin, height - 2 * margin);

        pageFormat.setPaper(paper);
        pageFormat.setOrientation(PageFormat.PORTRAIT);

        return pageFormat;
    }

    public static void main(String[] args) {
        // Create printer job
        PrinterJob job = PrinterJob.getPrinterJob();
        ReceiptPrinter receiptPrinter = new ReceiptPrinter();

        // Set custom page format for 80mm thermal printer
        PageFormat pageFormat = createThermalPageFormat(job);
        job.setPrintable(receiptPrinter, pageFormat);

        // Show print dialog
        boolean doPrint = job.printDialog();

        if (doPrint) {
            try {
                job.print();
                System.out.println("බිල්පත මුද්‍රණය සාර්ථකයි!");
            } catch (PrinterException e) {
                System.err.println("මුද්‍රණ දෝෂයක්: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            System.out.println("මුද්‍රණය අවලංගු කරන ලදී.");
        }
    }
}

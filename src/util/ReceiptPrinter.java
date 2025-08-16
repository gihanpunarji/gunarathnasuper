package util;

import java.awt.*;
import java.awt.print.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReceiptPrinter implements Printable {

    // ======= Receipt Data Structures =======
    public static class ReceiptData {

        public String billNumber;
        public String customerName;
        public String date;
        public String time;
        public double totalAmount;
        public double paidAmount;
        public double balance;
        public int itemCount;
        public List<ReceiptItem> items;

        public ReceiptData() {
            this.items = new ArrayList<>();
        }
    }

    public static class ReceiptItem {

        public String itemNumber;
        public String itemName;
        public double quantity;
        public double marketPrice;
        public double ourPrice;
        public double total;

        public ReceiptItem(String itemNumber, String itemName, double quantity,
                double marketPrice, double ourPrice, double total) {
            this.itemNumber = itemNumber;
            this.itemName = itemName;
            this.quantity = quantity;
            this.marketPrice = marketPrice;
            this.ourPrice = ourPrice;
            this.total = total;
        }
    }

    // ======= Instance Fields =======
    private ReceiptData receiptData;
    private int extraFeedLinesAtEnd = 6;  // for tear-off

    // ======= Constructors =======
    public ReceiptPrinter(ReceiptData data) {
        this.receiptData = data;
    }

    // ======= Printable =======
    @Override
    public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
        if (page > 0) {
            return NO_SUCH_PAGE;
        }

        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        int y = 10;
        int leftMargin = 5;
        int pageWidth = (int) pf.getImageableWidth();
        int rightMargin = pageWidth - 5;

        // --- Store info ---
        Font storeNameFont = new Font("Dialog", Font.BOLD, 12);
        g.setFont(storeNameFont);
        FontMetrics fm = g.getFontMetrics();
        String storeName = "GUNARATHNA SUPER";
        g.drawString(storeName, (pageWidth - fm.stringWidth(storeName)) / 2, y);
        y += 15;

        Font addressFont = new Font("Dialog", Font.PLAIN, 9);
        g.setFont(addressFont);
        fm = g.getFontMetrics();
        String address = "Pannela North, Ampagala";
        g.drawString(address, (pageWidth - fm.stringWidth(address)) / 2, y);
        y += 12;

        String phone1 = "0711990567 / 0362249289";
        g.drawString(phone1, (pageWidth - fm.stringWidth(phone1)) / 2, y);
        y += 15;

        // --- Solid line below phone numbers ---
        g.setColor(Color.BLACK);
        g.drawLine(leftMargin, y, rightMargin, y);
        y += 10;

        // --- Bill details ---
        Font labelFont = new Font("Dialog", Font.PLAIN, 9);
        g.setFont(labelFont);
        g.drawString("බිල් අංකය :", leftMargin, y);
        g.drawString(receiptData.billNumber, rightMargin - g.getFontMetrics().stringWidth(receiptData.billNumber), y);
        y += 10;

        g.drawString("ගනුදෙනුකරු :", leftMargin, y);
        g.drawString(receiptData.customerName, rightMargin - g.getFontMetrics().stringWidth(receiptData.customerName), y);
        y += 10;

        g.drawString("දිනය සහ වේලාව :", leftMargin, y);
        String dateTimeValue = receiptData.date + " " + receiptData.time;
        g.drawString(dateTimeValue, rightMargin - g.getFontMetrics().stringWidth(dateTimeValue), y);
        y += 12;

        // --- Table header ---
        int headerHeight = 12;
        Font headerFont = new Font("Dialog", Font.BOLD, 9);
        g.setFont(headerFont);
        g.drawString("ප්‍රමාණය", leftMargin + 2, y);
        g.drawString("වෙ.මිල", leftMargin + 35, y);
        g.drawString("අපේ මිල", leftMargin + 60, y);
        g.drawString("එකතුව", rightMargin - g.getFontMetrics().stringWidth("එකතුව"), y);
        y += headerHeight;

        // --- Items ---
        Font itemFont = new Font("Dialog", Font.PLAIN, 9);
        g.setFont(itemFont);
        for (ReceiptItem item : receiptData.items) {
            String itemLine = item.itemNumber + ". " + item.itemName;
            if (itemLine.length() > 35) {
                itemLine = itemLine.substring(0, 32) + "...";
            }
            g.drawString(itemLine, leftMargin, y);
            y += 9;

            g.drawString(String.format("%.1f", item.quantity), leftMargin + 5, y);
            g.drawString(String.format("%.0f", item.marketPrice), leftMargin + 35, y);
            g.drawString(String.format("%.0f", item.ourPrice), leftMargin + 60, y);

            String totalStr = String.format("%.2f", item.total);
            g.drawString(totalStr, rightMargin - g.getFontMetrics().stringWidth(totalStr), y);
            y += 8;

            // Dotted line between items
            for (int i = leftMargin; i < rightMargin; i += 3) {
                g.drawLine(i, y, i + 1, y);
            }
            y += 6;
        }

        // Solid line below items
        g.drawLine(leftMargin, y, rightMargin, y);
        y += 10;

        // --- Totals ---
        Font totalFont = new Font("Dialog", Font.PLAIN, 8);
        g.setFont(totalFont);
        g.drawString("අයිතම් සංඛ්‍යාව : " + receiptData.itemCount, leftMargin, y);
        y += 12;

        Font boldTotalFont = new Font("Dialog", Font.BOLD, 11);
        g.setFont(boldTotalFont);
        g.drawString("මුළු මුදල", leftMargin, y);
        String totalAmountStr = String.format("%.2f", receiptData.totalAmount);
        g.drawString(totalAmountStr, rightMargin - g.getFontMetrics().stringWidth(totalAmountStr), y);
        y += 12;

        Font paymentFont = new Font("Dialog", Font.PLAIN, 10);
        g.setFont(paymentFont);
        g.drawString("මුළු එකතුව", leftMargin, y);
        g.drawString(totalAmountStr, rightMargin - g.getFontMetrics().stringWidth(totalAmountStr), y);
        y += 10;

        g.drawString("ගෙවීම්", leftMargin, y);
        String paidStr = String.format("%.2f", receiptData.paidAmount);
        g.drawString(paidStr, rightMargin - g.getFontMetrics().stringWidth(paidStr), y);
        y += 10;

        String balanceLabel = receiptData.balance < 0 ? "නව හිඟ මුදල" : "ඔබගේ ලාබය";
        String balanceStr = String.format("%.2f", Math.abs(receiptData.balance));
        g.drawString(balanceLabel, leftMargin, y);
        g.drawString(balanceStr, rightMargin - g.getFontMetrics().stringWidth(balanceStr), y);
        y += 15;

        // --- Solid line before notes ---
        g.drawLine(leftMargin, y, rightMargin, y);
        y += 10;

        Font noteFont = new Font("Dialog", Font.PLAIN, 9);
        g.setFont(noteFont);
        fm = g.getFontMetrics();
        String note1 = "භාණ්ඩ පරීක්ෂා කර බලා රැගෙන යන්න";
        g.drawString(note1, (pageWidth - fm.stringWidth(note1)) / 2, y);
        y += 10;

        String note2 = "ස්තූතියි නැවත එන්න";
        g.drawString(note2, (pageWidth - fm.stringWidth(note2)) / 2, y);
        y += 10;

        int lineHeight = g.getFontMetrics().getHeight();
        y += (extraFeedLinesAtEnd * lineHeight);

        return PAGE_EXISTS;
    }

    // ======= Public Print API =======
    public static void printReceipt(ReceiptData receiptData) {
        try {
            PrinterJob job = PrinterJob.getPrinterJob();
            ReceiptPrinter receiptPrinter = new ReceiptPrinter(receiptData);
            job.setPrintable(receiptPrinter, createThermalPageFormat(job));

            if (job.printDialog()) {
                job.print();
                System.out.println("බිල්පත මුද්‍රණය සාර්ථකයි!");
            } else {
                System.out.println("මුද්‍රණය අවලංගු කරන ලදී.");
            }
        } catch (PrinterException e) {
            e.printStackTrace();
        }
    }

    // ======= JSON / Map helper =======
    public static void printReceiptFromMap(Map<String, Object> dataMap) {
        ReceiptData data = new ReceiptData();
        data.billNumber = (String) dataMap.getOrDefault("billNumber", "");
        data.customerName = (String) dataMap.getOrDefault("customerName", "");
        data.date = (String) dataMap.getOrDefault("date", "");
        data.time = (String) dataMap.getOrDefault("time", "");
        data.totalAmount = toDouble(dataMap.get("totalAmount"));
        data.paidAmount = toDouble(dataMap.get("paidAmount"));
        data.balance = toDouble(dataMap.get("balance"));
        data.itemCount = toInt(dataMap.get("itemCount"));

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> itemMaps = (List<Map<String, Object>>) dataMap.get("items");
        if (itemMaps != null) {
            for (Map<String, Object> itemMap : itemMaps) {
                data.items.add(new ReceiptItem(
                        (String) itemMap.getOrDefault("itemNumber", ""),
                        (String) itemMap.getOrDefault("itemName", ""),
                        toDouble(itemMap.get("quantity")),
                        toDouble(itemMap.get("marketPrice")),
                        toDouble(itemMap.get("ourPrice")),
                        toDouble(itemMap.get("total"))
                ));
            }
        }

        printReceipt(data);
    }

    private static double toDouble(Object o) {
        if (o == null) {
            return 0.0;
        }
        if (o instanceof Number) {
            return ((Number) o).doubleValue();
        }
        try {
            return Double.parseDouble(String.valueOf(o));
        } catch (Exception e) {
            return 0.0;
        }
    }

    private static int toInt(Object o) {
        if (o == null) {
            return 0;
        }
        if (o instanceof Number) {
            return ((Number) o).intValue();
        }
        try {
            return Integer.parseInt(String.valueOf(o));
        } catch (Exception e) {
            return 0;
        }
    }

    // ======= Thermal Page Format =======
    private static PageFormat createThermalPageFormat(PrinterJob job) {
        PageFormat pageFormat = job.defaultPage();
        Paper paper = new Paper();
        double widthPt = 80 * 2.834645669; // 80mm thermal
        double heightPt = 11 * 72;
        paper.setSize(widthPt, heightPt);
        double margin = 2.0;
        paper.setImageableArea(margin, margin, widthPt - 2 * margin, heightPt - 2 * margin);
        pageFormat.setPaper(paper);
        pageFormat.setOrientation(PageFormat.PORTRAIT);
        return pageFormat;
    }

    // ======= Test main =======
    public static void main(String[] args) {
        ReceiptData data = new ReceiptData();
        data.billNumber = "IN-1-1-2";
        data.customerName = "I.M.D";
        data.date = "17/01/2025";
        data.time = "09:25 AM";
        data.totalAmount = 1350.06;
        data.paidAmount = 5000.00;
        data.balance = 3649.94;
        data.itemCount = 4;
        data.items.add(new ReceiptItem("1", "හාල්", 1.0, 455.00, 430.00, 430.00));
        data.items.add(new ReceiptItem("2", "පරිප්පු", 1.754, 320.00, 285.00, 500.00));
        data.items.add(new ReceiptItem("3", "ගුරු සිනි", 1.0, 300.00, 280.00, 280.00));
        data.items.add(new ReceiptItem("4", "සුදු සිනි", 0.596, 280.00, 235.00, 140.06));

        printReceipt(data);
    }
}

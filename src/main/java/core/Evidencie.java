package core;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

public class Evidencie extends BaseTest{

        private static Font fonteCabecalho = new Font(Font.FontFamily.COURIER, 18,
                Font.BOLD);
        private static Font fontePadrao = new Font(Font.FontFamily.TIMES_ROMAN, 12);
        private static Font fonteVermelha = new Font(Font.FontFamily.TIMES_ROMAN,
                12, Font.NORMAL, BaseColor.RED);
        private static Font negritoPequena = new Font(Font.FontFamily.HELVETICA,
                10, Font.BOLD);

        public static void main(String[] arq) {
            try {
                System.out.println("Início");
                Document documento = new Document();
                PdfWriter.getInstance(documento, Files.newOutputStream(Paths.get("C:/Users/irafi/Documents/IdeaProjects/autoPhp/target/report-html.html")));
                documento.open();
                documento.addTitle("Aqui está o título");
                documento.addSubject("Agora temos um assunto no arquivo!");
                documento.addKeywords("Java, PDF, iText");

                Paragraph conteudo = new Paragraph();
                conteudo.add(new Paragraph(" "));
//                Image image = Image.getInstance("/Users/allancaetano/Desktop/FrameWeb/FrameAutomation/target/banner.jpg");
                Image image = Image.getInstance("C:/Users/irafi/Documents/IdeaProjects/autoPhp/target/banner.jpg");
                image.scaleAbsolute(500, 150);
                documento.add(image);
                conteudo.add(new Paragraph(" "));

                conteudo.add(new Paragraph(" "));

                Anchor ancora = new Anchor("Sistema", fontePadrao);
                ancora.setName("Capitulo 1");
                Chapter capitulo = new Chapter(new Paragraph(ancora), 1);

                PdfPTable table = new PdfPTable(3);

                PdfPCell c1 = new PdfPCell(new Phrase("Sistema"));
                c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(c1);

                c1 = new PdfPCell(new Phrase("Status"));
                c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(c1);

                c1 = new PdfPCell(new Phrase("Resultado"));
                c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(c1);
                table.setHeaderRows(1);

                table.addCell("Cenario:");
                table.addCell("CT:");
                table.addCell("Executor");
                table.addCell("2.1");
                table.addCell("2.2");

                documento.add(conteudo);
                documento.add(table);

                documento.close();
                System.out.println("Fim");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}

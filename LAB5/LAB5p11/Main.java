package LAB5p11;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner input = new Scanner(System.in) ;
        //TextDocument1
        System.out.print("Enter title:" ) ;
        String titleText1 = input.nextLine() ;
        System.out.print("Enter word count:" ) ;
        int wordText1 = input.nextInt() ;
        input.nextLine() ;
        //PDFDocument1
        System.out.print("Enter title:" ) ;
        String titlePDF1 = input.nextLine() ;
        System.out.print("Enter pages count:" ) ;
        int wordPDF1 = input.nextInt() ;
        input.nextLine() ;
         //TextDocument2
        System.out.print("Enter title:" ) ;
        String titleText2 = input.nextLine() ;
        System.out.print("Enter word count:" ) ;
        int wordText2 = input.nextInt() ;
        input.nextLine() ;
        //PDFDocument2
        System.out.print("Enter title:" ) ;
        String titlePDF2 = input.nextLine() ;
        System.out.print("Enter pages count:" ) ;
        int wordPDF2 = input.nextInt() ;
        input.nextLine() ;
        //create obj 
        TextDocument TextDocument_1 = new TextDocument(titleText1, wordText1) ;
        PDFDocument PDFDocument_1 = new PDFDocument(titlePDF1, wordPDF1) ;
        TextDocument TextDocument_2 = new TextDocument(titleText2, wordText2) ;
        PDFDocument PDFDocument_2 = new PDFDocument(titlePDF2, wordPDF2) ;
        //arr
        Document [] documents = {TextDocument_1 , PDFDocument_1 , TextDocument_2 , PDFDocument_2} ;
        int TotalPages = 0 ;
        for (Document document : documents ) {
            if (document instanceof PDFDocument) {
                PDFDocument doc = (PDFDocument) document  ; //Downcasting
                TotalPages += doc.pageCount ;
            } 
        }
        for (Document document : documents ) {
            document.displayDetail();
        }
        System.out.println("Total Pages:" +  TotalPages) ;
        input.close() ;
    }
}


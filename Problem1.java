package Javaproblem1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.annotations.Test;

public class Problem1 {
	
	@Test
	public void ReadFile() throws IOException {
		File file=new File("________________.pdf");
		FileInputStream Fis= new FileInputStream(file);
		PDDocument doc= PDDocument.load(Fis);
		System.out.println(doc.getPages().getCount());
		PDFTextStripper pdfTextStripper =new PDFTextStripper();
		String docText=pdfTextStripper.getText(doc);
		//System.out.println(docText);
		//Assert.assertTrue(docText.contains("_______"));
		//doc.close()
	
	Scanner s = new Scanner(System.in);
	System.out.print("Enter no. of keywords in array:");
	int n = s.nextInt();
	String keywords[] = new String[n];
	System.out.println("Enter all the keywords:");
	for(int i = 0; i < n ; i++)
	{
	keywords[i] = s.next();
	}



	int index=0;
	double percentage=0, sum=0;



	for(index = 0; index < keywords.length ; index++) {
	if(docText.contains(keywords[index])) {
	System.out.println("keyword found");
	sum=sum+1;
	
	percentage=(sum/n)*100;
	//System.out.println("the match is "+ percentage+"%");
	}
	else {
	System.out.println("keyword notfound");
	}
	}
	System.out.println("the match is "+ percentage+"%");
	
	}
}

package leercsv;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;





public class Leercsv  {
 ArrayList<String> ArrayList = new ArrayList<>();
   ArrayList<String> ArrayList1 = new ArrayList<>();
    ArrayList<String> ArrayList2 = new ArrayList<>();
    ArrayList<String> ArrayList3 = new ArrayList<>();
          
         
  
        
    
  
     String Helium="";
     String Argon40="";
     String Argon36="";
     String Carbon_dioxide="";
     
     String Helium1="";
     String Argon401="";
     String Argon361="";
     String Carbon_dioxide1="";
     
     String Helium2 = "";
     String Argon402 = "";
     String Argon362 = "";
     String Carbon_dioxide2 = "";
     
      String Helium3 = "";
     String Argon403 = "";
     String Argon363 ="";
     String Carbon_dioxide3 = "";

     
     
     String strFile;
     String strFile1;
     String strFile2;
     String strFile3;
     
     
     //variables que recogen los resultados finales
     double resultadoHelio ;
     double resultadoArgon36 ;
     double resultadoArgon40;
     double resultadodobleCarbon_dioxide;
     
    
     

	public static void main(String[] args) throws InterruptedException, IOException {
            
      //creamos la ventana    
        ventana v = new  ventana();
        v.setVisible(true);
         v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
         v.setSize(500, 500); 
         v.setLocationRelativeTo(null);
         
        File directorio = new File("c:\\datos");
        directorio.mkdir(); //creamos la carpeta para guardar os archivos

        
        
        }
        
  

  public  void exportar_exel() throws IOException {
        
       /*JFrame frame = new JFrame("GUILLENEIZER");      
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        frame.setSize(300, 300);      
        frame.setVisible(true);   
         */
            
       
   
  
		try
		{
			//csv archivo que contiene los datos
			 strFile = "C:\\fichero\\airelab1View2.csv";
                         strFile1 = "C:\\fichero\\airelab2View2.csv";
                         strFile2 = "C:\\fichero\\airelab3View2.csv";
                         strFile3 = "C:\\fichero\\airelab4View2.csv";
			
			//create BufferedReader to read csv file
			BufferedReader br = new BufferedReader( new FileReader(strFile));
                        BufferedReader br1 = new BufferedReader( new FileReader(strFile1));
                        BufferedReader br2 = new BufferedReader( new FileReader(strFile2));
                        BufferedReader br3 = new BufferedReader( new FileReader(strFile3));
			String strLine = "";
                        String strLine1 = "";
                        String strLine2 = "";
                        String strLine3 = "";
                        
			StringTokenizer st = null;
                        StringTokenizer st1 = null;
                        StringTokenizer st2 = null;
                        StringTokenizer st3 = null;
			
                        
                  
                        
			
			
			while( (strLine = br.readLine()) != null )
			{
				
                                st = new StringTokenizer(strLine, ";");
              
				while(st.hasMoreTokens() )
				{					
			      
                                    ArrayList.add(st.nextToken());
                                    
                                    
                        for (int i = 0; i < ArrayList.size(); i++) {
			System.out.println(ArrayList.get(i)+"-----------"+i);
                        
                        
                     if(i==119){
                            
                            
                        Helium = ArrayList.get(118);
                            //System.out.println("Helium---------------------------------------"+Helium);
                        
                     }  
                     
                            
                         if(i==119){
                          
                              
                            Carbon_dioxide = ArrayList.get(119);
                         //   System.out.println("Carbon_dioxide--------------------------------"+Carbon_dioxide);
                        
                        }
                            if(i==120){
                                
                             Argon40 = ArrayList.get(120);
                                
                           // System.out.println("Argon40--------------------------------------"+Argon40);
                        
                        }
                            if(i==121){
                                        
                            Argon36 = ArrayList.get(121);
          
                          //  System.out.println("Argon36------------------------------------------"+Argon36);
                         
                        }
                                                  		
      }//cierre de bucle for
                                              	 
				}
               
			}
//                        
                        
//                      //lectura del segundo archivo  
                      
			//Lee linea a linea separado por ;
			while( (strLine1 = br1.readLine()) != null )
			{
				
                                st1 = new StringTokenizer(strLine1, ";");
              
				while(st1.hasMoreTokens() )
				{					//valores de csv
			      
                                    ArrayList1.add(st1.nextToken());
                                    
                                    
                        for (int i = 0; i < ArrayList1.size(); i++) {
			System.out.println(ArrayList1.get(i)+"-----------"+i);
                        
                        
                     if(i==119){
                            
                            
                        Helium1 = ArrayList1.get(118);
                            //System.out.println("Helium---------------------------------------"+Helium);
                        
                     }  
                     
                            
                         if(i==119){
                          
                              
                            Carbon_dioxide1 = ArrayList1.get(119);
                         //   System.out.println("Carbon_dioxide--------------------------------"+Carbon_dioxide);
                        
                        }
                            if(i==120){
                                
                             Argon401 = ArrayList1.get(120);
                                
                           // System.out.println("Argon40--------------------------------------"+Argon40);
                        
                        }
                            if(i==121){
                                        
                            Argon361 = ArrayList1.get(121);
          
                          //  System.out.println("Argon36------------------------------------------"+Argon36);
                         
                        }
                                                  		
      }//cierre de bucle for
                                              	 
				}
               
			}
                   
                        
                        
                        
                        
                        //lectura del tecer archivo  
                      
                      
			
			while( (strLine2 = br2.readLine()) != null )
			{
				
                                st2 = new StringTokenizer(strLine2, ";");
              
				while(st2.hasMoreTokens() )
				{					
			      
                                    ArrayList2.add(st2.nextToken());
                                    
                                    
                        for (int i = 0; i < ArrayList2.size(); i++) {
			System.out.println(ArrayList2.get(i)+"-----------"+i);
                        
                        
                     if(i==119){
                            
                            
                        Helium2 = ArrayList2.get(118);
                            //System.out.println("Helium---------------------------------------"+Helium);
                        
                     }  
                     
                            
                         if(i==119){
                          
                              
                            Carbon_dioxide2 = ArrayList2.get(119);
                         //   System.out.println("Carbon_dioxide--------------------------------"+Carbon_dioxide);
                        
                        }
                            if(i==120){
                                
                             Argon402 = ArrayList2.get(120);
                                
                           // System.out.println("Argon40--------------------------------------"+Argon40);
                        
                        }
                            if(i==121){
                                        
                            Argon362 = ArrayList2.get(121);
          
                          //  System.out.println("Argon36------------------------------------------"+Argon36);
                         
                        }
                                                  		
      }//cierre de bucle for
                                              	 
				}
               
			}
//			
//                        
//                     //lectura del cuarto archivo  
//                      
//                      
//                                             
//                      
			
			while( (strLine3 = br3.readLine()) != null )
			{
				
                                st3 = new StringTokenizer(strLine3, ";");
              
				while(st3.hasMoreTokens() )
				{					
			      
                                    ArrayList3.add(st3.nextToken());
                                    
                                    
                        for (int i = 0; i < ArrayList3.size(); i++) {
			System.out.println(ArrayList3.get(i)+"-----------"+i);
                        
                        
                     if(i==119){
                            
                            
                        Helium3 = ArrayList3.get(118);
                            //System.out.println("Helium---------------------------------------"+Helium);
                        
                     }  
                     
                            
                         if(i==119){
                          
                              
                            Carbon_dioxide3 = ArrayList3.get(119);
                         //   System.out.println("Carbon_dioxide--------------------------------"+Carbon_dioxide);
                        
                        }
                            if(i==120){
                                
                             Argon403 = ArrayList3.get(120);
                                
                           // System.out.println("Argon40--------------------------------------"+Argon40);
                        
                        }
                            if(i==121){
                                        
                            Argon363 = ArrayList3.get(121);
          
                          //  System.out.println("Argon36------------------------------------------"+Argon36);
                         
                        }
                                                  		
      }//cierre de bucle for
                                              	 
				}
               
			}
                }
                                       
                 
		catch(IOException e)
		{
			System.out.println("Exception while reading csv file: " + e);	
               JOptionPane.showMessageDialog(null, "El sistema no puede encontrar los archivos"+ '\n' + 
                       "Asegurese que la ruta de los archivos sea:" + '\n' + 
                       "C:\\ficheros\\airelab1View2.csv");
		}
                
                
                
            System.out.println("--------------------------------------"); 
            System.out.println("---------Datos--Obtenidos------");
            System.out.println("--------------------------------------"); 
            System.out.println("                                      ");
            
//            
//      int result = Integer.parseInt(Helium);
//	System.out.println(result+"*******************************************************************************");
//            
//            
             System.out.println("                                        ");   
              System.out.println("---------Archivo-1------");
              System.out.println("--------------------------------------");     
              System.out.println("                                      ");  
          double dobleHelium = Double.parseDouble(Helium);
            double dobleArgon36 = Double.parseDouble(Argon36); 
            double dobleArgon40 = Double.parseDouble(Argon40); 
            double dobleCarbon_dioxide = Double.parseDouble(Carbon_dioxide); 
            
            
            
            
            System.out.println("Helium----------------------------------------"+dobleHelium);     
            System.out.println("Argon36--------------------------------------"+dobleArgon36);          
            System.out.println("Argon40--------------------------------------"+Argon40); 
            System.out.println("CO2--------------------------------------"+ Carbon_dioxide); 
            
          
            
            
            
            double dobleHelium1 = Double.parseDouble(Helium1);
            double dobleArgon361 = Double.parseDouble(Argon361); 
            double dobleArgon401 = Double.parseDouble(Argon401); 
            double dobleCarbon_dioxide1 = Double.parseDouble(Carbon_dioxide1);  
            
            
            
              System.out.println("                                                ");   
              System.out.println("---------Archivo-2------");
              System.out.println("--------------------------------------");     
              System.out.println("                                      ");  
                
           System.out.println("Helium1--------------------------------------"+Helium1);     
           System.out.println("Argon361--------------------------------------"+Argon361);          
           System.out.println("Argon401--------------------------------------"+Argon401); 
           System.out.println("CO2-------------------------------------------"+ Carbon_dioxide1);     
                
           
           
           
           
           
           
           
           
           
           
            double dobleHelium2 = Double.parseDouble(Helium2);
            double dobleArgon362 = Double.parseDouble(Argon362); 
            double dobleArgon402 = Double.parseDouble(Argon402); 
            double dobleCarbon_dioxide2 = Double.parseDouble(Carbon_dioxide2); 
           
           
           
           
           
           
           
           
             
                System.out.println("--------------------------------------"); 
                System.out.println("---------Archivo-3------");  
                System.out.println("--------------------------------------"); 
                System.out.println("                                      ");
                
                
          System.out.println("Helium2--------------------------------------"+Helium2);     
          System.out.println("Argon362--------------------------------------"+Argon362);          
          System.out.println("Argon402--------------------------------------"+Argon402); 
          System.out.println("CO2_2--------------------------------------"+ Carbon_dioxide2);
          
           System.out.println("--------------------------------------");      
           System.out.println("---------Archivo-4------");      
           System.out.println("--------------------------------------");   
            System.out.println("                                      ");  
            
           
             double dobleHelium3 = Double.parseDouble(Helium3);
             double dobleArgon363 = Double.parseDouble(Argon363); 
             double dobleArgon403 = Double.parseDouble(Argon403); 
             double dobleCarbon_dioxide3 = Double.parseDouble(Carbon_dioxide3); 
            
            
            
             
              resultadoHelio = (dobleHelium+dobleHelium1+dobleHelium2+dobleHelium3)/4;
             resultadoArgon36 = (dobleArgon36+dobleArgon361+dobleArgon362+dobleArgon363)/4;
             resultadoArgon40 = (dobleArgon40+dobleArgon401+dobleArgon402+dobleArgon403)/4;
              resultadodobleCarbon_dioxide = (dobleCarbon_dioxide+dobleCarbon_dioxide1+dobleCarbon_dioxide2+dobleCarbon_dioxide3)/4;
             
            
            
         System.out.println("Helium3--------------------------------------"+Helium3);     
         System.out.println("Argon363--------------------------------------"+Argon363);          
         System.out.println("Argon403--------------------------------------"+Argon403); 
         System.out.println("CO2_3--------------------------------------"+ Carbon_dioxide3);
         System.out.println("Media de Helio    "+resultadoHelio);
         System.out.println("Media de Argon36    "+resultadoArgon36 );
         System.out.println("Media de Argon40    "+ resultadoArgon40);
         System.out.println("Media de Co2    "+resultadodobleCarbon_dioxide);
            
            
            
            // Se crea el libro
            
        HSSFWorkbook libro = new HSSFWorkbook();

        // Se crea una hoja dentro del libro
        HSSFSheet hoja = libro.createSheet();



        // Se crea una fila dentro de la hoja
        HSSFRow fila = hoja.createRow(0);
        HSSFRow fila2 = hoja.createRow(1);

        // Se crea una celda dentro de la fila
          HSSFCell celda0 = fila.createCell((short) 0);
          HSSFCell celda1 = fila.createCell((short) 1);
          HSSFCell celda2 = fila.createCell((short) 2);
          HSSFCell celda3 = fila.createCell((short) 3);
          
          
          
          
          //aque se va a crear la fila para los resultados  LA FILA 2
          
          HSSFCell celda1_fila2 = fila2.createCell((short) 0);
           HSSFCell celda2_fila2 = fila2.createCell((short) 1);
            HSSFCell celda3_fila2 = fila2.createCell((short) 2);
             HSSFCell celda4_fila2 = fila2.createCell((short) 3);
        
          
          
          

        // Se crea el contenido de la celda y se mete en ella.
        HSSFRichTextString texto = new HSSFRichTextString("Media de Helio");
        celda0.setCellValue(texto);
        
        
        HSSFRichTextString texto2 = new HSSFRichTextString("Media de Argon36 ");
        celda1.setCellValue(texto2);
         HSSFRichTextString texto3 = new HSSFRichTextString("Media de Argon40 ");
        celda2.setCellValue(texto3);
         HSSFRichTextString texto4 = new HSSFRichTextString("Media de Co2 ");
        celda3.setCellValue(texto4);
        
        
        
        //aqui se va a crear la fila para los resultados  LA FILA 2
          HSSFRichTextString helio = new HSSFRichTextString(" "+resultadoHelio);
          celda1_fila2 .setCellValue(helio);
        
      
         HSSFRichTextString argon36 = new HSSFRichTextString(" "+resultadoArgon36);
          celda2_fila2 .setCellValue(argon36);
          
          
          
           HSSFRichTextString argon40 = new HSSFRichTextString(" "+ resultadoArgon40);
          celda3_fila2 .setCellValue(argon40);
          
          
          
           HSSFRichTextString mresultadodobleCarbon_dioxide = new HSSFRichTextString(" "+resultadodobleCarbon_dioxide);
          celda4_fila2.setCellValue(mresultadodobleCarbon_dioxide);
        
        
        
        // Se salva el libro.
        try {
            
            
            try (FileOutputStream elFichero = new FileOutputStream("C:\\datos\\Leerxls.xls")) {
                libro.write(elFichero);
                
                JOptionPane.showMessageDialog(null, "Se ha guardado los archivos en formato"+'\n'+
                        "XLS y csv"+'\n'+"En C:\\datos");
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No se ha podido guardar el archivo");
            
            
        }  
            
            
   
            
            
           //escribir fichero
           
           
      
            
           
        String ruta = "C:\\datos\\Leercsv.csv";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(!archivo.exists()) {// si el archivo no existe lo crea con datos
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Media de Helio    "+resultadoHelio
            +"Media de Helio    "+resultadoHelio+
            "Media de Argon36    "+resultadoArgon36 +
            "Media de Argon40    "+ resultadoArgon40+
            "Media de Co2    "+resultadodobleCarbon_dioxide
            
                   
            
            );
        } else {// si ya existe reescribe
            bw = new BufferedWriter(new FileWriter(archivo));
             bw.write("Media de Helio    "+resultadoHelio
            +"Media de Helio    "+resultadoHelio+
            "Media de Argon36    "+resultadoArgon36 +
            "Media de Argon40    "+ resultadoArgon40+
            "Media de Co2    "+resultadodobleCarbon_dioxide  );
        }
        bw.close();
  
        
    
         
         

  
    }
  
  
  
  
   public  void carga_datos() throws IOException {
        
       /*JFrame frame = new JFrame("GUILLENEIZER");      
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        frame.setSize(300, 300);      
        frame.setVisible(true);   
         */
            
       
   
  
		try
		{
			//csv archivo que contiene los datos
			 strFile = "C:\\fichero\\airelab1View2.csv";
                         strFile1 = "C:\\fichero\\airelab2View2.csv";
                         strFile2 = "C:\\fichero\\airelab3View2.csv";
                         strFile3 = "C:\\fichero\\airelab4View2.csv";
			
			//create BufferedReader to read csv file
			BufferedReader br = new BufferedReader( new FileReader(strFile));
                        BufferedReader br1 = new BufferedReader( new FileReader(strFile1));
                        BufferedReader br2 = new BufferedReader( new FileReader(strFile2));
                        BufferedReader br3 = new BufferedReader( new FileReader(strFile3));
			String strLine = "";
                        String strLine1 = "";
                        String strLine2 = "";
                        String strLine3 = "";
                        
			StringTokenizer st = null;
                        StringTokenizer st1 = null;
                        StringTokenizer st2 = null;
                        StringTokenizer st3 = null;
			
                        
                  
                        
			
			
			while( (strLine = br.readLine()) != null )
			{
				
                                st = new StringTokenizer(strLine, ";");
              
				while(st.hasMoreTokens() )
				{					
			      
                                    ArrayList.add(st.nextToken());
                                    
                                    
                        for (int i = 0; i < ArrayList.size(); i++) {
			System.out.println(ArrayList.get(i)+"-----------"+i);
                        
                        
                     if(i==119){
                            
                            
                        Helium = ArrayList.get(118);
                            //System.out.println("Helium---------------------------------------"+Helium);
                        
                     }  
                     
                            
                         if(i==119){
                          
                              
                            Carbon_dioxide = ArrayList.get(119);
                         //   System.out.println("Carbon_dioxide--------------------------------"+Carbon_dioxide);
                        
                        }
                            if(i==120){
                                
                             Argon40 = ArrayList.get(120);
                                
                           // System.out.println("Argon40--------------------------------------"+Argon40);
                        
                        }
                            if(i==121){
                                        
                            Argon36 = ArrayList.get(121);
          
                          //  System.out.println("Argon36------------------------------------------"+Argon36);
                         
                        }
                                                  		
      }//cierre de bucle for
                                              	 
				}
               
			}
//                        
                        
//                      //lectura del segundo archivo  
                      
			//Lee linea a linea separado por ;
			while( (strLine1 = br1.readLine()) != null )
			{
				
                                st1 = new StringTokenizer(strLine1, ";");
              
				while(st1.hasMoreTokens() )
				{					//valores de csv
			      
                                    ArrayList1.add(st1.nextToken());
                                    
                                    
                        for (int i = 0; i < ArrayList1.size(); i++) {
			System.out.println(ArrayList1.get(i)+"-----------"+i);
                        
                        
                     if(i==119){
                            
                            
                        Helium1 = ArrayList1.get(118);
                            //System.out.println("Helium---------------------------------------"+Helium);
                        
                     }  
                     
                            
                         if(i==119){
                          
                              
                            Carbon_dioxide1 = ArrayList1.get(119);
                         //   System.out.println("Carbon_dioxide--------------------------------"+Carbon_dioxide);
                        
                        }
                            if(i==120){
                                
                             Argon401 = ArrayList1.get(120);
                                
                           // System.out.println("Argon40--------------------------------------"+Argon40);
                        
                        }
                            if(i==121){
                                        
                            Argon361 = ArrayList1.get(121);
          
                          //  System.out.println("Argon36------------------------------------------"+Argon36);
                         
                        }
                                                  		
      }//cierre de bucle for
                                              	 
				}
               
			}
                   
                        
                        
                        
                        
                        //lectura del tecer archivo  
                      
                      
			
			while( (strLine2 = br2.readLine()) != null )
			{
				
                                st2 = new StringTokenizer(strLine2, ";");
              
				while(st2.hasMoreTokens() )
				{					
			      
                                    ArrayList2.add(st2.nextToken());
                                    
                                    
                        for (int i = 0; i < ArrayList2.size(); i++) {
			System.out.println(ArrayList2.get(i)+"-----------"+i);
                        
                        
                     if(i==119){
                            
                            
                        Helium2 = ArrayList2.get(118);
                            //System.out.println("Helium---------------------------------------"+Helium);
                        
                     }  
                     
                            
                         if(i==119){
                          
                              
                            Carbon_dioxide2 = ArrayList2.get(119);
                         //   System.out.println("Carbon_dioxide--------------------------------"+Carbon_dioxide);
                        
                        }
                            if(i==120){
                                
                             Argon402 = ArrayList2.get(120);
                                
                           // System.out.println("Argon40--------------------------------------"+Argon40);
                        
                        }
                            if(i==121){
                                        
                            Argon362 = ArrayList2.get(121);
          
                          //  System.out.println("Argon36------------------------------------------"+Argon36);
                         
                        }
                                                  		
      }//cierre de bucle for
                                              	 
				}
               
			}
//			
//                        
//                     //lectura del cuarto archivo  
//                      
//                      
//                                             
//                      
			
			while( (strLine3 = br3.readLine()) != null )
			{
				
                                st3 = new StringTokenizer(strLine3, ";");
              
				while(st3.hasMoreTokens() )
				{					
			      
                                    ArrayList3.add(st3.nextToken());
                                    
                                    
                        for (int i = 0; i < ArrayList3.size(); i++) {
			System.out.println(ArrayList3.get(i)+"-----------"+i);
                        
                        
                     if(i==119){
                            
                            
                        Helium3 = ArrayList3.get(118);
                            //System.out.println("Helium---------------------------------------"+Helium);
                        
                     }  
                     
                            
                         if(i==119){
                          
                              
                            Carbon_dioxide3 = ArrayList3.get(119);
                         //   System.out.println("Carbon_dioxide--------------------------------"+Carbon_dioxide);
                        
                        }
                            if(i==120){
                                
                             Argon403 = ArrayList3.get(120);
                                
                           // System.out.println("Argon40--------------------------------------"+Argon40);
                        
                        }
                            if(i==121){
                                        
                            Argon363 = ArrayList3.get(121);
          
                          //  System.out.println("Argon36------------------------------------------"+Argon36);
                         
                        }
                                                  		
      }//cierre de bucle for
                                              	 
				}
               
			}
                }
                                       
                 
		catch(IOException e)
		{
			System.out.println("Exception while reading csv file: " + e);	
               JOptionPane.showMessageDialog(null, "El sistema no puede encontrar los archivos"+ '\n' + 
                       "Asegurese que la ruta de los archivos sea:" + '\n' + 
                       "C:\\ficheros\\airelab1View2.csv");
		}
                
                
                
            System.out.println("--------------------------------------"); 
            System.out.println("---------Datos--Obtenidos------");
            System.out.println("--------------------------------------"); 
            System.out.println("                                      ");
            
//            
//      int result = Integer.parseInt(Helium);
//	System.out.println(result+"*******************************************************************************");
//            
//            
             System.out.println("                                        ");   
              System.out.println("---------Archivo-1------");
              System.out.println("--------------------------------------");     
              System.out.println("                                      ");  
          double dobleHelium = Double.parseDouble(Helium);
            double dobleArgon36 = Double.parseDouble(Argon36); 
            double dobleArgon40 = Double.parseDouble(Argon40); 
            double dobleCarbon_dioxide = Double.parseDouble(Carbon_dioxide); 
            
            
            
            
            System.out.println("Helium----------------------------------------"+dobleHelium);     
            System.out.println("Argon36--------------------------------------"+dobleArgon36);          
            System.out.println("Argon40--------------------------------------"+Argon40); 
            System.out.println("CO2--------------------------------------"+ Carbon_dioxide); 
            
          
            
            
            
            double dobleHelium1 = Double.parseDouble(Helium1);
            double dobleArgon361 = Double.parseDouble(Argon361); 
            double dobleArgon401 = Double.parseDouble(Argon401); 
            double dobleCarbon_dioxide1 = Double.parseDouble(Carbon_dioxide1);  
            
            
            
              System.out.println("                                                ");   
              System.out.println("---------Archivo-2------");
              System.out.println("--------------------------------------");     
              System.out.println("                                      ");  
                
           System.out.println("Helium1--------------------------------------"+Helium1);     
           System.out.println("Argon361--------------------------------------"+Argon361);          
           System.out.println("Argon401--------------------------------------"+Argon401); 
           System.out.println("CO2-------------------------------------------"+ Carbon_dioxide1);     
                
           
           
           
           
           
           
           
           
           
           
            double dobleHelium2 = Double.parseDouble(Helium2);
            double dobleArgon362 = Double.parseDouble(Argon362); 
            double dobleArgon402 = Double.parseDouble(Argon402); 
            double dobleCarbon_dioxide2 = Double.parseDouble(Carbon_dioxide2); 
           
           
           
           
           
           
           
           
             
                System.out.println("--------------------------------------"); 
                System.out.println("---------Archivo-3------");  
                System.out.println("--------------------------------------"); 
                System.out.println("                                      ");
                
                
          System.out.println("Helium2--------------------------------------"+Helium2);     
          System.out.println("Argon362--------------------------------------"+Argon362);          
          System.out.println("Argon402--------------------------------------"+Argon402); 
          System.out.println("CO2_2--------------------------------------"+ Carbon_dioxide2);
          
           System.out.println("--------------------------------------");      
           System.out.println("---------Archivo-4------");      
           System.out.println("--------------------------------------");   
            System.out.println("                                      ");  
            
           
             double dobleHelium3 = Double.parseDouble(Helium3);
             double dobleArgon363 = Double.parseDouble(Argon363); 
             double dobleArgon403 = Double.parseDouble(Argon403); 
             double dobleCarbon_dioxide3 = Double.parseDouble(Carbon_dioxide3); 
            
            
            
             
              resultadoHelio = (dobleHelium+dobleHelium1+dobleHelium2+dobleHelium3)/4;
             resultadoArgon36 = (dobleArgon36+dobleArgon361+dobleArgon362+dobleArgon363)/4;
             resultadoArgon40 = (dobleArgon40+dobleArgon401+dobleArgon402+dobleArgon403)/4;
              resultadodobleCarbon_dioxide = (dobleCarbon_dioxide+dobleCarbon_dioxide1+dobleCarbon_dioxide2+dobleCarbon_dioxide3)/4;
             
            
            
         System.out.println("Helium3--------------------------------------"+Helium3);     
         System.out.println("Argon363--------------------------------------"+Argon363);          
         System.out.println("Argon403--------------------------------------"+Argon403); 
         System.out.println("CO2_3--------------------------------------"+ Carbon_dioxide3);
         System.out.println("Media de Helio    "+resultadoHelio);
         System.out.println("Media de Argon36    "+resultadoArgon36 );
         System.out.println("Media de Argon40    "+ resultadoArgon40);
         System.out.println("Media de Co2    "+resultadodobleCarbon_dioxide);
  
  
  
  
  
  
  
   }
  
  
  
  
  
  
  
  
}




   






    

    
    
    
        
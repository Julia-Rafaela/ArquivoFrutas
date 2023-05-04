package controller;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class ArquivosController implements Ifrutas{

	public ArquivosController() {
		super();
	}



	@Override

	public void ReadFile(String path) throws IOException {
		File arq = new File(path);
		 if (!arq.exists()) {
	            System.out.println("Arquivo não encontrado.");
	            return;
	        }

	        try (BufferedReader buffer = new BufferedReader(new FileReader(arq))) {
	        	 String Linha = buffer.readLine();
			
			System.out.println("FOOD NAME\t\tSCIENTIFIC NAME\t\tSUBGROUP");
            System.out.println("---------------------------------------------------------------------------------------");

			while((Linha = buffer.readLine())!=null) {
				  String [] fruta= Linha.split(",");
	                String foodName = fruta[0];
	                String scientificName = fruta[1];
	                String subgroup = fruta[3];

	                if(subgroup.equalsIgnoreCase("tropical fruits" )) {
	                    System.out.println(foodName+"\t\t"+scientificName+ "\t\t"+subgroup);
	                }
	            
			}

			
		}catch (IOException e) {
	            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
	        }
	}
}


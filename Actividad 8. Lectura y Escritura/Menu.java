package P1;

import java.io.*;

public class Menu {
	
	public int win, game;
	public File file;
	public String path;
	
	public Menu(String f) throws Exception {
		
		File dir = new File("src/P1/Usuarios");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		path = "src/P1/Usuarios/" + f;
		this.file = new File(path);
		
		if (this.file.exists()) {
			
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			
			String[] wins = bufferedReader.readLine().split(" ");
			String[] games = bufferedReader.readLine().split(" ");
			
			this.win = Integer.parseInt(wins[1]);
			this.game = Integer.parseInt(games[1]);
			
			bufferedReader.close();
			
		} else {
			try {
				this.file.createNewFile();
				this.win = 0;
				this.game = 0;
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void winner(int n) {
		this.win += n;
	}
	
	public void game() {
		this.game++;
	}
	
	public void save() {
		try {
			BufferedWriter fWriter = new BufferedWriter(new FileWriter(path));
			fWriter.write("Wins: " + this.win + "\n");
			fWriter.write("Games: " + this.game);

			fWriter.close();
		} catch (IOException e) {
			
		}
		 
	}
	
}

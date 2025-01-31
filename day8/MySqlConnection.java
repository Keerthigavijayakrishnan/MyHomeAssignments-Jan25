package week2.day4;

//Interface & Abstraction 3
public abstract class MySqlConnection implements DatabaseConnection {
	
	//Implemented Method
public void executeQuery1() {
	System.out.println("Query Executed from Abstract Class");
}

    //Unimplemented Method
public abstract void executeQuery2();

}

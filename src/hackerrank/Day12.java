import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;
    
    public Student(String firstName, String lastName, int identification,int scores[]) {
        super(firstName,lastName,identification);
        testScores = scores;
        
    }
    
    public char calculate () {
        int i=0,toplam=0;
        while(i<testScores.length) {
           toplam+=testScores[i]; 
           i++;
        }
        toplam=toplam/testScores.length;
        if(toplam>=90 && toplam<=100)
                return 'O';
        else if (toplam>=80)
                return 'E';
        else if (toplam>=70)
                return 'A';
        else if (toplam>=55)
                return 'P';
        else if (toplam>=40)
                return 'D';
        else if (toplam<40)
                return 'T';
        
        return '0';
    }
}

class Day12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}